package net.iskandar.examples.project_management.domain;

import java.io.InputStream;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "DOCUMENTS")
public class Document extends BaseEntity {

    @Column(name = "CONTENT_TYPE")
    private String contentType;

    @Column(name = "ORIGINAL_FILE_NAME")
    private String originalFileName;

    @Column(name = "INTERNAL_FILE_NAME")
    private String internalFileName;
    
    @Transient
    private InputStream inputStream;

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getOriginalFileName() {
        return originalFileName;
    }

    public void setOriginalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
    }

    public String getInternalFileName() {
        return internalFileName;
    }

    public void setInternalFileName(String internalFileName) {
        this.internalFileName = internalFileName;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

}
