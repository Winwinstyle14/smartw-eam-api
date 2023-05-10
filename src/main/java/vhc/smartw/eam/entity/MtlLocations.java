package vhc.smartw.eam.entity;

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
@Table(name = "MTL_LOCATIONS")
public class MtlLocations {
    @Id
    @SequenceGenerator(
            name = "MTL_LOCATIONS_sequence",
            sequenceName = "MTL_LOCATIONS_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "MTL_LOCATIONS_sequence"
    )
    @Column(name = "LOCATION_ID")
    private Long locationId;
    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;
    @Column(name = "LOCATION_CODES")
    private String locationCodes;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdateBy;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
}
