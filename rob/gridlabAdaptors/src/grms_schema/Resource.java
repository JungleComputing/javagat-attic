/*
 * This class was automatically generated with
 * <a href="http://www.castor.org">Castor 0.9.6</a>, using an XML
 * Schema.
 * $Id$
 */
package grms_schema;

//---------------------------------/
//- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Resource requirement section
 *
 * @version $Revision: 1.9 $ $Date$
 */
public class Resource implements java.io.Serializable {
    //--------------------------/
    //- Class/Member Variables -/
    //--------------------------/

    /**
     * Operating sysem name
     */
    private java.lang.String _osname;

    /**
     * Operating system type
     */
    private java.lang.String _ostype;

    /**
     * Operating system version
     */
    private java.lang.String _osversion;

    /**
     * Operating system release
     */
    private java.lang.String _osrelease;

    /**
     * Host name
     */
    private java.lang.String _hostname;

    /**
     * Local resource management system name
     */
    private grms_schema.types.LocalrmnameType _localrmname;

    /**
     * Amount of memory required
     */
    private int _memory;

    /**
     * keeps track of state for field: _memory
     */
    private boolean _has_memory;

    /**
     * Number of cpus required
     */
    private int _cpucount;

    /**
     * keeps track of state for field: _cpucount
     */
    private boolean _has_cpucount;

    /**
     * Required cpu performace
     */
    private int _cpuspeed;

    /**
     * keeps track of state for field: _cpuspeed
     */
    private boolean _has_cpuspeed;

    /**
     * Field _maxtime
     */
    private int _maxtime;

    /**
     * keeps track of state for field: _maxtime
     */
    private boolean _has_maxtime;

    /**
     * Field _maxwalltime
     */
    private int _maxwalltime;

    /**
     * keeps track of state for field: _maxwalltime
     */
    private boolean _has_maxwalltime;

    /**
     * Field _maxcputime
     */
    private int _maxcputime;

    /**
     * keeps track of state for field: _maxcputime
     */
    private boolean _has_maxcputime;

    /**
     * Field _bandwidth
     */
    private grms_schema.Bandwidth _bandwidth;

    /**
     * Field _latency
     */
    private grms_schema.Latency _latency;

    /**
     * Field _capacity
     */
    private grms_schema.Capacity _capacity;

    /**
     * Field _applications
     */
    private grms_schema.Applications _applications;

    /**
     * Field _freememory
     */
    private int _freememory;

    /**
     * keeps track of state for field: _freememory
     */
    private boolean _has_freememory;

    /**
     * Field _diskspace
     */
    private int _diskspace;

    /**
     * keeps track of state for field: _diskspace
     */
    private boolean _has_diskspace;

    /**
     * Field _freediskspace
     */
    private int _freediskspace;

    /**
     * keeps track of state for field: _freediskspace
     */
    private boolean _has_freediskspace;

    /**
     * Field _queue
     */
    private java.lang.String _queue;

    /**
     * Field _freecpus
     */
    private int _freecpus;

    /**
     * keeps track of state for field: _freecpus
     */
    private boolean _has_freecpus;

    //----------------/
    //- Constructors -/
    //----------------/
    public Resource() {
        super();
    } //-- grms_schema.Resource()

    //-----------/
    //- Methods -/
    //-----------/

    /**
     * Method deleteCpucount
     *
     */
    public void deleteCpucount() {
        this._has_cpucount = false;
    } //-- void deleteCpucount() 

    /**
     * Method deleteCpuspeed
     *
     */
    public void deleteCpuspeed() {
        this._has_cpuspeed = false;
    } //-- void deleteCpuspeed() 

    /**
     * Method deleteDiskspace
     *
     */
    public void deleteDiskspace() {
        this._has_diskspace = false;
    } //-- void deleteDiskspace() 

    /**
     * Method deleteFreecpus
     *
     */
    public void deleteFreecpus() {
        this._has_freecpus = false;
    } //-- void deleteFreecpus() 

    /**
     * Method deleteFreediskspace
     *
     */
    public void deleteFreediskspace() {
        this._has_freediskspace = false;
    } //-- void deleteFreediskspace() 

    /**
     * Method deleteFreememory
     *
     */
    public void deleteFreememory() {
        this._has_freememory = false;
    } //-- void deleteFreememory() 

    /**
     * Method deleteMaxcputime
     *
     */
    public void deleteMaxcputime() {
        this._has_maxcputime = false;
    } //-- void deleteMaxcputime() 

    /**
     * Method deleteMaxtime
     *
     */
    public void deleteMaxtime() {
        this._has_maxtime = false;
    } //-- void deleteMaxtime() 

    /**
     * Method deleteMaxwalltime
     *
     */
    public void deleteMaxwalltime() {
        this._has_maxwalltime = false;
    } //-- void deleteMaxwalltime() 

    /**
     * Method deleteMemory
     *
     */
    public void deleteMemory() {
        this._has_memory = false;
    } //-- void deleteMemory() 

    /**
     * Returns the value of field 'applications'.
     *
     * @return Applications
     * @return the value of field 'applications'.
     */
    public grms_schema.Applications getApplications() {
        return this._applications;
    } //-- grms_schema.Applications getApplications() 

    /**
     * Returns the value of field 'bandwidth'.
     *
     * @return Bandwidth
     * @return the value of field 'bandwidth'.
     */
    public grms_schema.Bandwidth getBandwidth() {
        return this._bandwidth;
    } //-- grms_schema.Bandwidth getBandwidth() 

    /**
     * Returns the value of field 'capacity'.
     *
     * @return Capacity
     * @return the value of field 'capacity'.
     */
    public grms_schema.Capacity getCapacity() {
        return this._capacity;
    } //-- grms_schema.Capacity getCapacity() 

    /**
     * Returns the value of field 'cpucount'. The field 'cpucount'
     * has the following description: Number of cpus required
     *
     * @return int
     * @return the value of field 'cpucount'.
     */
    public int getCpucount() {
        return this._cpucount;
    } //-- int getCpucount() 

    /**
     * Returns the value of field 'cpuspeed'. The field 'cpuspeed'
     * has the following description: Required cpu performace
     *
     * @return int
     * @return the value of field 'cpuspeed'.
     */
    public int getCpuspeed() {
        return this._cpuspeed;
    } //-- int getCpuspeed() 

    /**
     * Returns the value of field 'diskspace'.
     *
     * @return int
     * @return the value of field 'diskspace'.
     */
    public int getDiskspace() {
        return this._diskspace;
    } //-- int getDiskspace() 

    /**
     * Returns the value of field 'freecpus'.
     *
     * @return int
     * @return the value of field 'freecpus'.
     */
    public int getFreecpus() {
        return this._freecpus;
    } //-- int getFreecpus() 

    /**
     * Returns the value of field 'freediskspace'.
     *
     * @return int
     * @return the value of field 'freediskspace'.
     */
    public int getFreediskspace() {
        return this._freediskspace;
    } //-- int getFreediskspace() 

    /**
     * Returns the value of field 'freememory'.
     *
     * @return int
     * @return the value of field 'freememory'.
     */
    public int getFreememory() {
        return this._freememory;
    } //-- int getFreememory() 

    /**
     * Returns the value of field 'hostname'. The field 'hostname'
     * has the following description: Host name
     *
     * @return String
     * @return the value of field 'hostname'.
     */
    public java.lang.String getHostname() {
        return this._hostname;
    } //-- java.lang.String getHostname() 

    /**
     * Returns the value of field 'latency'.
     *
     * @return Latency
     * @return the value of field 'latency'.
     */
    public grms_schema.Latency getLatency() {
        return this._latency;
    } //-- grms_schema.Latency getLatency() 

    /**
     * Returns the value of field 'localrmname'. The field
     * 'localrmname' has the following description: Local resource
     * management system name
     *
     * @return LocalrmnameType
     * @return the value of field 'localrmname'.
     */
    public grms_schema.types.LocalrmnameType getLocalrmname() {
        return this._localrmname;
    } //-- grms_schema.types.LocalrmnameType getLocalrmname() 

    /**
     * Returns the value of field 'maxcputime'.
     *
     * @return int
     * @return the value of field 'maxcputime'.
     */
    public int getMaxcputime() {
        return this._maxcputime;
    } //-- int getMaxcputime() 

    /**
     * Returns the value of field 'maxtime'.
     *
     * @return int
     * @return the value of field 'maxtime'.
     */
    public int getMaxtime() {
        return this._maxtime;
    } //-- int getMaxtime() 

    /**
     * Returns the value of field 'maxwalltime'.
     *
     * @return int
     * @return the value of field 'maxwalltime'.
     */
    public int getMaxwalltime() {
        return this._maxwalltime;
    } //-- int getMaxwalltime() 

    /**
     * Returns the value of field 'memory'. The field 'memory' has
     * the following description: Amount of memory required
     *
     * @return int
     * @return the value of field 'memory'.
     */
    public int getMemory() {
        return this._memory;
    } //-- int getMemory() 

    /**
     * Returns the value of field 'osname'. The field 'osname' has
     * the following description: Operating sysem name
     *
     * @return String
     * @return the value of field 'osname'.
     */
    public java.lang.String getOsname() {
        return this._osname;
    } //-- java.lang.String getOsname() 

    /**
     * Returns the value of field 'osrelease'. The field
     * 'osrelease' has the following description: Operating system
     * release
     *
     * @return String
     * @return the value of field 'osrelease'.
     */
    public java.lang.String getOsrelease() {
        return this._osrelease;
    } //-- java.lang.String getOsrelease() 

    /**
     * Returns the value of field 'ostype'. The field 'ostype' has
     * the following description: Operating system type
     *
     * @return String
     * @return the value of field 'ostype'.
     */
    public java.lang.String getOstype() {
        return this._ostype;
    } //-- java.lang.String getOstype() 

    /**
     * Returns the value of field 'osversion'. The field
     * 'osversion' has the following description: Operating system
     * version
     *
     * @return String
     * @return the value of field 'osversion'.
     */
    public java.lang.String getOsversion() {
        return this._osversion;
    } //-- java.lang.String getOsversion() 

    /**
     * Returns the value of field 'queue'.
     *
     * @return String
     * @return the value of field 'queue'.
     */
    public java.lang.String getQueue() {
        return this._queue;
    } //-- java.lang.String getQueue() 

    /**
     * Method hasCpucount
     *
     *
     *
     * @return boolean
     */
    public boolean hasCpucount() {
        return this._has_cpucount;
    } //-- boolean hasCpucount() 

    /**
     * Method hasCpuspeed
     *
     *
     *
     * @return boolean
     */
    public boolean hasCpuspeed() {
        return this._has_cpuspeed;
    } //-- boolean hasCpuspeed() 

    /**
     * Method hasDiskspace
     *
     *
     *
     * @return boolean
     */
    public boolean hasDiskspace() {
        return this._has_diskspace;
    } //-- boolean hasDiskspace() 

    /**
     * Method hasFreecpus
     *
     *
     *
     * @return boolean
     */
    public boolean hasFreecpus() {
        return this._has_freecpus;
    } //-- boolean hasFreecpus() 

    /**
     * Method hasFreediskspace
     *
     *
     *
     * @return boolean
     */
    public boolean hasFreediskspace() {
        return this._has_freediskspace;
    } //-- boolean hasFreediskspace() 

    /**
     * Method hasFreememory
     *
     *
     *
     * @return boolean
     */
    public boolean hasFreememory() {
        return this._has_freememory;
    } //-- boolean hasFreememory() 

    /**
     * Method hasMaxcputime
     *
     *
     *
     * @return boolean
     */
    public boolean hasMaxcputime() {
        return this._has_maxcputime;
    } //-- boolean hasMaxcputime() 

    /**
     * Method hasMaxtime
     *
     *
     *
     * @return boolean
     */
    public boolean hasMaxtime() {
        return this._has_maxtime;
    } //-- boolean hasMaxtime() 

    /**
     * Method hasMaxwalltime
     *
     *
     *
     * @return boolean
     */
    public boolean hasMaxwalltime() {
        return this._has_maxwalltime;
    } //-- boolean hasMaxwalltime() 

    /**
     * Method hasMemory
     *
     *
     *
     * @return boolean
     */
    public boolean hasMemory() {
        return this._has_memory;
    } //-- boolean hasMemory() 

    /**
     * Method isValid
     *
     *
     *
     * @return boolean
     */
    public boolean isValid() {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }

        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     *
     *
     *
     * @param out
     */
    public void marshal(java.io.Writer out)
            throws org.exolab.castor.xml.MarshalException,
            org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     *
     *
     *
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
            throws java.io.IOException, org.exolab.castor.xml.MarshalException,
            org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'applications'.
     *
     * @param applications the value of field 'applications'.
     */
    public void setApplications(grms_schema.Applications applications) {
        this._applications = applications;
    } //-- void setApplications(grms_schema.Applications) 

    /**
     * Sets the value of field 'bandwidth'.
     *
     * @param bandwidth the value of field 'bandwidth'.
     */
    public void setBandwidth(grms_schema.Bandwidth bandwidth) {
        this._bandwidth = bandwidth;
    } //-- void setBandwidth(grms_schema.Bandwidth) 

    /**
     * Sets the value of field 'capacity'.
     *
     * @param capacity the value of field 'capacity'.
     */
    public void setCapacity(grms_schema.Capacity capacity) {
        this._capacity = capacity;
    } //-- void setCapacity(grms_schema.Capacity) 

    /**
     * Sets the value of field 'cpucount'. The field 'cpucount' has
     * the following description: Number of cpus required
     *
     * @param cpucount the value of field 'cpucount'.
     */
    public void setCpucount(int cpucount) {
        this._cpucount = cpucount;
        this._has_cpucount = true;
    } //-- void setCpucount(int) 

    /**
     * Sets the value of field 'cpuspeed'. The field 'cpuspeed' has
     * the following description: Required cpu performace
     *
     * @param cpuspeed the value of field 'cpuspeed'.
     */
    public void setCpuspeed(int cpuspeed) {
        this._cpuspeed = cpuspeed;
        this._has_cpuspeed = true;
    } //-- void setCpuspeed(int) 

    /**
     * Sets the value of field 'diskspace'.
     *
     * @param diskspace the value of field 'diskspace'.
     */
    public void setDiskspace(int diskspace) {
        this._diskspace = diskspace;
        this._has_diskspace = true;
    } //-- void setDiskspace(int) 

    /**
     * Sets the value of field 'freecpus'.
     *
     * @param freecpus the value of field 'freecpus'.
     */
    public void setFreecpus(int freecpus) {
        this._freecpus = freecpus;
        this._has_freecpus = true;
    } //-- void setFreecpus(int) 

    /**
     * Sets the value of field 'freediskspace'.
     *
     * @param freediskspace the value of field 'freediskspace'.
     */
    public void setFreediskspace(int freediskspace) {
        this._freediskspace = freediskspace;
        this._has_freediskspace = true;
    } //-- void setFreediskspace(int) 

    /**
     * Sets the value of field 'freememory'.
     *
     * @param freememory the value of field 'freememory'.
     */
    public void setFreememory(int freememory) {
        this._freememory = freememory;
        this._has_freememory = true;
    } //-- void setFreememory(int) 

    /**
     * Sets the value of field 'hostname'. The field 'hostname' has
     * the following description: Host name
     *
     * @param hostname the value of field 'hostname'.
     */
    public void setHostname(java.lang.String hostname) {
        this._hostname = hostname;
    } //-- void setHostname(java.lang.String) 

    /**
     * Sets the value of field 'latency'.
     *
     * @param latency the value of field 'latency'.
     */
    public void setLatency(grms_schema.Latency latency) {
        this._latency = latency;
    } //-- void setLatency(grms_schema.Latency) 

    /**
     * Sets the value of field 'localrmname'. The field
     * 'localrmname' has the following description: Local resource
     * management system name
     *
     * @param localrmname the value of field 'localrmname'.
     */
    public void setLocalrmname(grms_schema.types.LocalrmnameType localrmname) {
        this._localrmname = localrmname;
    } //-- void setLocalrmname(grms_schema.types.LocalrmnameType) 

    /**
     * Sets the value of field 'maxcputime'.
     *
     * @param maxcputime the value of field 'maxcputime'.
     */
    public void setMaxcputime(int maxcputime) {
        this._maxcputime = maxcputime;
        this._has_maxcputime = true;
    } //-- void setMaxcputime(int) 

    /**
     * Sets the value of field 'maxtime'.
     *
     * @param maxtime the value of field 'maxtime'.
     */
    public void setMaxtime(int maxtime) {
        this._maxtime = maxtime;
        this._has_maxtime = true;
    } //-- void setMaxtime(int) 

    /**
     * Sets the value of field 'maxwalltime'.
     *
     * @param maxwalltime the value of field 'maxwalltime'.
     */
    public void setMaxwalltime(int maxwalltime) {
        this._maxwalltime = maxwalltime;
        this._has_maxwalltime = true;
    } //-- void setMaxwalltime(int) 

    /**
     * Sets the value of field 'memory'. The field 'memory' has the
     * following description: Amount of memory required
     *
     * @param memory the value of field 'memory'.
     */
    public void setMemory(int memory) {
        this._memory = memory;
        this._has_memory = true;
    } //-- void setMemory(int) 

    /**
     * Sets the value of field 'osname'. The field 'osname' has the
     * following description: Operating sysem name
     *
     * @param osname the value of field 'osname'.
     */
    public void setOsname(java.lang.String osname) {
        this._osname = osname;
    } //-- void setOsname(java.lang.String) 

    /**
     * Sets the value of field 'osrelease'. The field 'osrelease'
     * has the following description: Operating system release
     *
     * @param osrelease the value of field 'osrelease'.
     */
    public void setOsrelease(java.lang.String osrelease) {
        this._osrelease = osrelease;
    } //-- void setOsrelease(java.lang.String) 

    /**
     * Sets the value of field 'ostype'. The field 'ostype' has the
     * following description: Operating system type
     *
     * @param ostype the value of field 'ostype'.
     */
    public void setOstype(java.lang.String ostype) {
        this._ostype = ostype;
    } //-- void setOstype(java.lang.String) 

    /**
     * Sets the value of field 'osversion'. The field 'osversion'
     * has the following description: Operating system version
     *
     * @param osversion the value of field 'osversion'.
     */
    public void setOsversion(java.lang.String osversion) {
        this._osversion = osversion;
    } //-- void setOsversion(java.lang.String) 

    /**
     * Sets the value of field 'queue'.
     *
     * @param queue the value of field 'queue'.
     */
    public void setQueue(java.lang.String queue) {
        this._queue = queue;
    } //-- void setQueue(java.lang.String) 

    /**
     * Method unmarshal
     *
     *
     *
     * @param reader
     * @return Object
     */
    public static java.lang.Object unmarshal(java.io.Reader reader)
            throws org.exolab.castor.xml.MarshalException,
            org.exolab.castor.xml.ValidationException {
        return (grms_schema.Resource) Unmarshaller.unmarshal(
            grms_schema.Resource.class, reader);
    } //-- java.lang.Object unmarshal(java.io.Reader) 

    /**
     * Method validate
     *
     */
    public void validate() throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 
}
