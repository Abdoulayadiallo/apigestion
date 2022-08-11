package com.odc.apigestionregion.controller;

import com.odc.apigestionregion.modele.Region;
import com.odc.apigestionregion.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;

public class ControllerRegion {
    @Autowired
    RegionService regionService;
    public Region ajouter(Region region){
        return this.regionService.ajouter(region);

    }
}
