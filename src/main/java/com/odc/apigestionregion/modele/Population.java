package com.odc.apigestionregion.modele;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Data
public class Population {
    @Id
    private int id_population;
    private String chiffre;
    private Date annee;
}
