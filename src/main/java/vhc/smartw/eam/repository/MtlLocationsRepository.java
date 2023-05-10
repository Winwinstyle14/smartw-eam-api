package vhc.smartw.eam.repository;

import vhc.smartw.eam.entity.MtlLocations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MtlLocationsRepository extends JpaRepository<MtlLocations,Long> {
}
