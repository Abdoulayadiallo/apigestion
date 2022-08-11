package com.odc.apigestionregion.service.implementation;

import com.odc.apigestionregion.modele.Pays;
import com.odc.apigestionregion.repository.PaysRepository;
import com.odc.apigestionregion.service.PaysService;
import org.springframework.beans.factory.annotation.Autowired;

public class PaysServiceImpl implements PaysService {
    @Autowired
    PaysRepository paysRepository;
    @Override
    public Pays ajouter(Pays pays) {
        return null;
    }

    @Override
    public Pays afficherbyId(Pays pays, Long Id) {
        return null;
    }

    @Override
    public Pays modifier(Long id, Pays pays) {
        return null;
    }

    @Override
    public String supprimer(Long id) {
        return null;
    }
}
