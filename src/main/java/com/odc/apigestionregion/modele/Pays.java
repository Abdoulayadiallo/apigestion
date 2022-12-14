package com.odc.apigestionregion.modele;

import jdk.jfr.StackTrace;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pays")
@Getter
@Setter
@NoArgsConstructor
public class Pays {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
}
