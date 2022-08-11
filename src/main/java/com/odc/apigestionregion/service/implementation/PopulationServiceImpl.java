package com.odc.apigestionregion.service.implementation;

import com.odc.apigestionregion.modele.Population;
import com.odc.apigestionregion.repository.PopulationRepository;
import com.odc.apigestionregion.service.PopulationService;
import org.springframework.beans.factory.annotation.Autowired;

public class PopulationServiceImpl implements PopulationService {
    @Autowired
    PopulationRepository populationRepository;
    @Override
    public Population ajouter(Population population) {
        return null;
    }
}
