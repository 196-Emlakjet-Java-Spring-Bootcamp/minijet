package dev.patika.minijet.service;

import dev.patika.minijet.model.Property;

import java.util.List;


public interface PropertyService {

    Property save(Property property);

    List<Property> findAll();
}
