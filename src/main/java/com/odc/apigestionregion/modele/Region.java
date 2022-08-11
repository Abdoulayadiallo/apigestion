package com.odc.apigestionregion.modele;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Region {
    @Id
    @GeneratedValue(strategy = AUTO)
    private String coderegion;
    private String nom;
    private String domaine_activite;
    private String superficie;
    private String langue;
}
