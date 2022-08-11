package com.odc.apigestionregion.repository;

import com.odc.apigestionregion.modele.Pays;
import com.odc.apigestionregion.modele.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaysRepository extends JpaRepository<Pays, Long> {
}
