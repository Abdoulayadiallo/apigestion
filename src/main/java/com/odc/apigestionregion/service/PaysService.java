package com.odc.apigestionregion.service;

import com.odc.apigestionregion.modele.Pays;

public interface PaysService {
    Pays ajouter(Pays pays);
    Pays afficherbyId(Pays pays,Long Id);

    Pays modifier(Long id, Pays pays);

    String supprimer(Long id);
}
