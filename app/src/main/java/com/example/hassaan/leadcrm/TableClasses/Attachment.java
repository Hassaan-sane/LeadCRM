package com.example.hassaan.leadcrm.TableClasses;

import java.util.Date;

public class Attachment {

    public static final String TABLE_NAME = "tbl_Attachment";
    public static final String KEY_ID = "ID";
    public static final String KEY_FILENAME = "FileName";
    public static final String KEY_ATTACHEDBY = "AttachedBy";
    public static final String KEY_DATEADDED = "DateAdded";
    public static final String KEY_SIZE = "Size";
    public static final String KEY_CREATEDDATE = "CreatedDate";
    public static final String KEY_MODIFIEDDATE = "ModifiedDate";
    public static final String KEY_FILEADDRESS = "FileAddress";
    public static final String KEY_LEADID = "LeadID";

    private Integer ID;
    private String FileName;
    private String AttachedBy;
    private Date DateAdded;
    private Integer Size;
    private Date CreatedDate;
    private Date ModifedDate;
    private String FileAddress;

    public Attachment(Integer ID, String fileName, String attachedBy, Date dateAdded, Integer size, Date createdDate, Date modifedDate, String fileAddress) {
        this.ID = ID;
        FileName = fileName;
        AttachedBy = attachedBy;
        DateAdded = dateAdded;
        Size = size;
        CreatedDate = createdDate;
        ModifedDate = modifedDate;
        FileAddress = fileAddress;

    }


    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String fileName) {
        FileName = fileName;
    }

    public String getAttachedBy() {
        return AttachedBy;
    }

    public void setAttachedBy(String attachedBy) {
        AttachedBy = attachedBy;
    }

    public Date getDateAdded() {
        return DateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        DateAdded = dateAdded;
    }

    public Integer getSize() {
        return Size;
    }

    public void setSize(Integer size) {
        Size = size;
    }

    public Date getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Date createdDate) {
        CreatedDate = createdDate;
    }

    public Date getModifedDate() {
        return ModifedDate;
    }

    public void setModifedDate(Date modifedDate) {
        ModifedDate = modifedDate;
    }

    public String getFileAddress() {
        return FileAddress;
    }

    public void setFileAddress(String fileAddress) {
        FileAddress = fileAddress;
    }
}
