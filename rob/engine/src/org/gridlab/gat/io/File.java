/*
 * Created on Nov 3, 2006
 */
package org.gridlab.gat.io;

import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.gridlab.gat.GATInvocationException;
import org.gridlab.gat.URI;
import org.gridlab.gat.advert.Advertisable;
import org.gridlab.gat.engine.GATIOException;
import org.gridlab.gat.monitoring.Metric;
import org.gridlab.gat.monitoring.MetricDefinition;
import org.gridlab.gat.monitoring.MetricListener;
import org.gridlab.gat.monitoring.MetricValue;
import org.gridlab.gat.monitoring.Monitorable;

/**
 * @author rob
 */
/** An abstract representation of a physical file. (See java.io.file)
 * <p>
 * An instance of this class presents an abstract, system-independent view of a
 * physical file. User interfaces and operating systems use system-dependent
 * pathname strings to identify physical files. GAT, however, uses an operating
 * system independent pathname string to identify a physical file. A physical
 * file in GAT is identified by a URI.
 * <p>
 * An instance of this File class allows for various high-level operations to be
 * preformed on a physical file. For example, one can, with a single API call,
 * copy a physical file from one location to a second location, move a physical
 * file from one location to a second location, delete a physical file, and
 * preform various other operations on a physical file. The utility of this
 * high-level view of a physical file is multi-fold. The client of an instance
 * of this class does not have to concern themselves with the details of reading
 * every single byte of a physical file when all they wish to do is copy the
 * physical file to a new location. Similarly, a client does not have to deal
 * with all the various error states that can occur when moving a physical file.
 * Have all the various bytes been read correctly? Have all the various bytes
 * been saved correctly? Did the deletion of the original file proceed
 * correctly? The client simply has to call a single API call and the physical
 * file is moved.
 */
public class File extends java.io.File implements Monitorable, Serializable, Advertisable {
    org.gridlab.gat.io.FileInterface f;

    /** Do not use this constructur, it is for internal GAT use.
     */
    public File(org.gridlab.gat.io.FileInterface f) {
        super("dummy");
        this.f = f;
    }
    
    /**
     * This method copies the physical file represented by this File instance to
     * a physical file identified by the passed URI.
     *
     * @param loc
     *            The new location
     * @throws GATInvocationException
     *             Thrown upon problems accessing the remote instance
     * @throws java.io.IOException
     *             Upon non-remote IO problem
     */
    public void copy(URI loc) throws GATInvocationException {
        f.copy(loc);
    }

    /**
     * This method moves the physical file represented by this File instance to
     * a physical file identified by the passed URI.
     *
     * @param location
     *            The URI to which to move the physical file corresponding to
     *            this File instance
     * @throws GATInvocationException
     *             Thrown upon problems accessing the remote instance
     * @throws IOException
     *             Upon non-remote IO problem
     */
    public void move(URI location) throws GATInvocationException {
        f.move(location);
    }

    /**
     * @see java.io.File#canRead()
     */
    public boolean canRead() {
        try {
        return f.canRead();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * @see java.io.File#canWrite()
     */
    public boolean canWrite() {
        try {
        return f.canWrite();
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * @see java.io.File#compareTo(java.io.File)
     */
    public int compareTo(File pathname) {
        try {
        return f.compareTo(pathname);
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * @see java.io.File#createNewFile()
     */
    public boolean createNewFile() throws IOException {
        try {
        return f.createNewFile();
        } catch (GATInvocationException e) {
            throw new GATIOException(e);
        }
   }

    /**
     * @see java.io.File#delete()
     */
    public boolean delete() {
        try {
        return f.delete();
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * 
     * @see java.io.File#deleteOnExit()
     */
    public void deleteOnExit() {
        try {
        f.deleteOnExit();
        } catch (Exception e) {
            throw new Error(e);
        }
}

    /**
     * @see java.io.File#equals(java.lang.Object)
     */
    public boolean equals(Object obj) {
        try {
      return f.equals(obj);
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * @see java.io.File#exists()
     */
    public boolean exists() {
        try {
   return f.exists();
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * @see java.io.File#getAbsoluteFile()
     */
    public java.io.File getAbsoluteFile() {
        try {
            return f.getAbsoluteFile();
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * @see java.io.File#getAbsolutePath()
     */
    public String getAbsolutePath() {
        try {
       return f.getAbsolutePath();
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * @see java.io.File#getCanonicalFile()
     */
    public java.io.File getCanonicalFile() throws IOException {
        try {
      return f.getCanonicalFile();
        } catch (GATInvocationException e) {
            throw new GATIOException(e);
        }
    }

    /**
     * @see java.io.File#getCanonicalPath()
     */
    public String getCanonicalPath() throws IOException {
        try {
    return f.getCanonicalPath();
        } catch (GATInvocationException e) {
            throw new GATIOException(e);
        }
   }

    /**
     * @see java.io.File#getName()
     */
    public String getName() {
        try {
     return f.getName();
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * @see java.io.File#getParent()
     */
    public String getParent() {
        try {
     return f.getParent();
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * @return
     * @see java.io.File#getParentFile()
     */
    public java.io.File getParentFile() {
        try {
            return f.getParentFile();
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * @see java.io.File#getPath()
     */
    public String getPath() {
        try {
     return f.getPath();
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * @see java.io.File#hashCode()
     */
    public int hashCode() {
        try {
      return f.hashCode();
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * @see java.io.File#isAbsolute()
     */
    public boolean isAbsolute() {
        try {
     return f.isAbsolute();
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * @see java.io.File#isDirectory()
     */
    public boolean isDirectory() {
        try {
     return f.isDirectory();
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * @see java.io.File#isFile()
     */
    public boolean isFile() {
        try {
       return f.isFile();
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * @see java.io.File#isHidden()
     */
    public boolean isHidden() {
        try {
     return f.isHidden();
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * @see java.io.File#lastModified()
     */
    public long lastModified() {
        try {
   return f.lastModified();
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * @see java.io.File#length()
     */
    public long length() {
        try {
    return f.length();
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * @see java.io.File#list()
     */
    public String[] list() {
        try {
    return f.list();
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * @see java.io.File#list(java.io.FilenameFilter)
     */ 
    public String[] list(FilenameFilter filter) {
        try {
       return f.list(new FileNameFilterForwarder(filter));
        } catch (Exception e) {
            throw new Error(e);
        }
    }
    
    /**
     * @see java.io.File#listFiles()
     */
    public java.io.File[] listFiles() {
        try {
    return f.listFiles();
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * @see java.io.File#listFiles(java.io.FileFilter)
     */
    public java.io.File[] listFiles(FileFilter filter) {
        try {
      return f.listFiles(new FileFilterForwarder(filter));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * @see java.io.File#listFiles(java.io.FilenameFilter)
     */ 
    public java.io.File[] listFiles(FilenameFilter filter) {
        try {
            
      return f.listFiles(new FileNameFilterForwarder(filter));
        } catch (Exception e) {
            throw new Error(e);
        }
    }
    
    /**
     * @see java.io.File#mkdir()
     */
    public boolean mkdir() {
        try {
       return f.mkdir();
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * @see java.io.File#mkdirs()
     */
    public boolean mkdirs() {
        try {
      return f.mkdirs();
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * @see java.io.File#renameTo(java.io.File)
     */
    public boolean renameTo(java.io.File dest) {
        try {
            org.gridlab.gat.io.File a = (org.gridlab.gat.io.File) dest;
       return f.renameTo(a);
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * @see java.io.File#setLastModified(long)
     */
    public boolean setLastModified(long time) {
        try {
      return f.setLastModified(time);
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * @see java.io.File#setReadOnly()
     */
    public boolean setReadOnly() {
        try {
       return f.setReadOnly();
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * @see java.io.File#toString()
     */
    public String toString() {
        try {
      return f.toString();
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * @see java.io.File#toURI()
     */
    public java.net.URI toURI() {
        throw new Error("please use toGATURI to retreive a file's URI.");
    }

    /**
     * @see java.io.File#toURI()
     */
    public org.gridlab.gat.URI toGATURI() {
        try {
      return f.toURI();
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /**
     * @see java.io.File#toURL()
     */
    public URL toURL() throws MalformedURLException {
     return f.toURL();
    }

    /* (non-Javadoc)
     * @see org.gridlab.gat.advert.Advertisable#marshal()
     */
    public String marshal() {
        return f.marshal();
    }

    /* (non-Javadoc)
     * @see org.gridlab.gat.monitoring.Monitorable#addMetricListener(org.gridlab.gat.monitoring.MetricListener, org.gridlab.gat.monitoring.Metric)
     */
    public void addMetricListener(MetricListener metricListener, Metric metric) throws GATInvocationException {
        f.addMetricListener(metricListener, metric);
        
    }

    /* (non-Javadoc)
     * @see org.gridlab.gat.monitoring.Monitorable#getMeasurement(org.gridlab.gat.monitoring.Metric)
     */
    public MetricValue getMeasurement(Metric metric) throws GATInvocationException {
        return f.getMeasurement(metric);
    }

    /* (non-Javadoc)
     * @see org.gridlab.gat.monitoring.Monitorable#getMetricDefinitionByName(java.lang.String)
     */
    public MetricDefinition getMetricDefinitionByName(String name) throws GATInvocationException {
        return f.getMetricDefinitionByName(name);
    }

    /* (non-Javadoc)
     * @see org.gridlab.gat.monitoring.Monitorable#getMetricDefinitions()
     */
    public List getMetricDefinitions() throws GATInvocationException {
        return f.getMetricDefinitions();
    }

    /* (non-Javadoc)
     * @see org.gridlab.gat.monitoring.Monitorable#removeMetricListener(org.gridlab.gat.monitoring.MetricListener, org.gridlab.gat.monitoring.Metric)
     */
    public void removeMetricListener(MetricListener metricListener, Metric metric) throws GATInvocationException {
        f.removeMetricListener(metricListener, metric);
    }
}

class FileNameFilterForwarder implements org.gridlab.gat.io.cpi.FilenameFilter {
    java.io.FilenameFilter f;
    
    public FileNameFilterForwarder(java.io.FilenameFilter f) {
        this.f = f;
    }
    
    /* (non-Javadoc)
     * @see org.gridlab.gat.io.cpi.FilenameFilter#accept(org.gridlab.gat.io.File, java.lang.String)
     */
    public boolean accept(File dir, String name) {
        return f.accept(dir, name);
    }
}

class FileFilterForwarder implements org.gridlab.gat.io.cpi.FileFilter {
    java.io.FileFilter f;
    
    public FileFilterForwarder(java.io.FileFilter f) {
        this.f = f;
    }
    
    /* (non-Javadoc)
     * @see org.gridlab.gat.io.cpi.FileFilter#accept(org.gridlab.gat.io.File)
     */
    public boolean accept(File pathname) {
        return f.accept(pathname);
    }
}

