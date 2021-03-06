package org.gridlab.gat.resources.cpi.zorilla;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.List;

import nl.vu.zorilla.zoni.ZoniProtocol;

import org.gridlab.gat.GATContext;
import org.gridlab.gat.GATInvocationException;
import org.gridlab.gat.Preferences;
import org.gridlab.gat.TimePeriod;
import org.gridlab.gat.resources.Job;
import org.gridlab.gat.resources.JobDescription;
import org.gridlab.gat.resources.Reservation;
import org.gridlab.gat.resources.Resource;
import org.gridlab.gat.resources.ResourceDescription;
import org.gridlab.gat.resources.SoftwareDescription;
import org.gridlab.gat.resources.cpi.ResourceBrokerCpi;

/**
 * 
 * @author ndrost
 *
 */
public class ZorillaResourceBrokerAdaptor extends ResourceBrokerCpi {

    private final InetSocketAddress nodeSocketAddress;

    private static int parsePort(String string) throws GATInvocationException {
        int port;
        try {
            port = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            throw new GATInvocationException("could not parse port", e);
        }

        if (port <= 0) {
            throw new GATInvocationException("invalid port "
                + "(must be non-zero positive number): " + string);
        }
        return port;
    }

    private static InetSocketAddress parseSocketAddress(String string)
        throws GATInvocationException {
        int port = ZoniProtocol.DEFAULT_PORT;

        String[] strings = string.split(":");

        if (strings.length > 2) {
            throw new GATInvocationException("illegal address format: "
                + string);
        } else if (strings.length == 2) {
            // format was "host:port, extract port number"
            port = parsePort(strings[1]);
        }

        InetAddress address = null;
        try {
            address = InetAddress.getByName(strings[0]);
        } catch (UnknownHostException e) {
            throw new GATInvocationException("invalid address: " + string
                + " exception: " + e);
        }

        return new InetSocketAddress(address, port);
    }

    /**
     * This method constructs a LocalResourceBrokerAdaptor instance
     * corresponding to the passed GATContext.
     * 
     * @param gatContext
     *            A GATContext which will be used to broker resources
     */
    public ZorillaResourceBrokerAdaptor(GATContext gatContext,
        Preferences preferences) throws Exception {
        super(gatContext, preferences);

        String addressString = (String) preferences.get("zorilla.node.address");

        if (addressString == null) {
            //localhost address on default port
            nodeSocketAddress = new InetSocketAddress(InetAddress
                .getByName(null), ZoniProtocol.DEFAULT_PORT);
        } else {
            nodeSocketAddress = parseSocketAddress(addressString);
        }

    }

    /**
     * This method attempts to reserve the specified hardware resource for the
     * specified time period. Upon reserving the specified hardware resource
     * this method returns a Reservation. Upon failing to reserve the specified
     * hardware resource this method returns an error.
     * 
     * @param resourceDescription
     *            A description, a HardwareResourceDescription, of the hardware
     *            resource to reserve
     * @param timePeriod
     *            The time period, a TimePeriod , for which to reserve the
     *            hardware resource
     */
    public Reservation reserveResource(ResourceDescription resourceDescription,
        TimePeriod timePeriod) {
        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * This method attempts to find one or more matching hardware resources.
     * Upon finding the specified hardware resource(s) this method returns a
     * java.util.List of HardwareResource instances. Upon failing to find the
     * specified hardware resource this method returns an error.
     * 
     * @param resourceDescription
     *            A description, a HardwareResoucreDescription, of the hardware
     *            resource(s) to find
     * @return java.util.List of HardwareResources upon success
     */
    public List findResources(ResourceDescription resourceDescription) {
        throw new UnsupportedOperationException("Not implemented");
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.gridlab.gat.resources.ResourceBroker#submitJob(org.gridlab.gat.resources.JobDescription)
     */
    public Job submitJob(JobDescription description)
        throws GATInvocationException {
        SoftwareDescription sd = description.getSoftwareDescription();

        if (sd == null) {
            throw new GATInvocationException(
                "The job description does not contain a software description");
        }

        String host = getHostname(description);

        if (host != null) {
            throw new GATInvocationException(
                "cannot specify host with the Zorilla adaptor");
        }

        return new ZorillaJob(gatContext, preferences, this, description);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.gridlab.gat.resources.ResourceBroker#reserveResource(org.gridlab.gat.resources.Resource,
     *      org.gridlab.gat.util.TimePeriod)
     */
    public Reservation reserveResource(Resource resource, TimePeriod timePeriod) {
        throw new UnsupportedOperationException("Not implemented");
    }

    InetSocketAddress getNodeSocketAddress() {
        return nodeSocketAddress;
    }
}
