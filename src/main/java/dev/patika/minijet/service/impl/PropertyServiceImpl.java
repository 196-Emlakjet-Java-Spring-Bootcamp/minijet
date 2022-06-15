package dev.patika.minijet.service.impl;

import dev.patika.minijet.model.Property;
import dev.patika.minijet.repository.PropertyRepository;
import dev.patika.minijet.service.PropertyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PropertyServiceImpl implements PropertyService {

    private final PropertyRepository propertyRepository;

    @Override
    public Property save(Property property) {
       return propertyRepository.save(property);
    }

    @Override
    public List<Property> findAll() {
        return propertyRepository.findAll();
    }
}
