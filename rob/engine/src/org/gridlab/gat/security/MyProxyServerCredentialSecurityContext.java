/*
 * Created on Jul 29, 2005
 */
package org.gridlab.gat.security;

/** This context is used if you have a credential stored in a myproxy server.
 * You need to specify a host, port, username and password to the myproxy server.
 *
 * @author rob
 *
 *
 */
public class MyProxyServerCredentialSecurityContext extends SecurityContext {
    /**
     * This member variables holds the username of the myproxy server
     */
    protected String username;

    /**
     * This member variables holds the password of the myproxy server
     */
    protected String password;

    /**
     * The hostname of the server
     *
     */
    protected String host;

    /**
     * the port where the server runs
     */
    protected int port;

    /**
     *
     * @param host the hostname of the myproxy server
     * @param port the port where the myproxy server runs, -1 for the default port
     * @param username the username to use to connect to the myproxy server
     * @param password the password to use to connect to the myproxy server
     */
    public MyProxyServerCredentialSecurityContext(String host, int port,
            String username, String password) {
        this.username = username;
        this.password = password;
        this.host = host;
        this.port = port;
    }

    public Object clone() throws CloneNotSupportedException {
        return new MyProxyServerCredentialSecurityContext(host, port, username,
            password);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MyProxyServerCredentialSecurityContext)) {
            return false;
        }

        MyProxyServerCredentialSecurityContext other = (MyProxyServerCredentialSecurityContext) obj;

        return other.username.equals(username)
            && other.password.equals(password) && other.host.equals(host)
            && (other.port == port);
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int hashCode() {
        return host.hashCode();
    }
}
