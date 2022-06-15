package dev.patika.minijet.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String image;
    private String address;
    private String category;
    private String info;
    private String description;
    private String feature;
    private String nearestPlace;

}
