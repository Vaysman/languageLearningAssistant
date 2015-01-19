package model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="metadata")
public class Metadata {
    @Column(name="application_name")
    private String applicationName;
    @Column(name="application_version")
    private String applicationVersion;
    @Column(name="authors")
    private String authors;
    @Column(name="license")
    private String license;
    
    public String getApplicationName() {
        return applicationName;
    }
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    public String getApplicationVersion() {
        return applicationVersion;
    }
    public void setApplicationVersion(String applicationVersion) {
        this.applicationVersion = applicationVersion;
    }
    public String getAuthors() {
        return authors;
    }
    public void setAuthors(String authors) {
        this.authors = authors;
    }
    public String getLicense() {
        return license;
    }
    public void setLicense(String license) {
        this.license = license;
    }
}
