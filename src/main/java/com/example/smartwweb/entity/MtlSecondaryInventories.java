package com.example.smartwweb.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MTL_SECONDARY_INVENTORIES")
public class MtlSecondaryInventories {
    @Id
    @Column(name = "SECONDARY_INVENTORY_NAME")
    private String secondaryinventoryName;
    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "DISABLE_DATE")
    private Date disableDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
}
