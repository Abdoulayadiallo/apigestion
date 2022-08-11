package com.odc.apigestionregion.service.implementation;

import com.odc.apigestionregion.modele.Pays;
import com.odc.apigestionregion.modele.Region;
import com.odc.apigestionregion.repository.PaysRepository;
import com.odc.apigestionregion.repository.RegionRepository;
import com.odc.apigestionregion.service.RegionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RegionServiceImpl implements RegionService {
    @Autowired
    RegionRepository regionRepository;
    @Override
    public Region ajouter(Region region) {
        return null;
    }

    @Override
    public List<Region> Lister() {
        return null;
    }

    @Override
    public Region modifier(Long id, Region region) {
        return null;
    }

    @Override
    public String supprimer(Long id) {
        return null;
    }
}
