package dev.patika.minijet.controller;

import dev.patika.minijet.model.Property;
import dev.patika.minijet.service.PropertyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/property")
@RequiredArgsConstructor
public class PropertyController {

    private final PropertyService propertyService;

    @PostMapping
    public Property createProperty(@RequestBody Property property){
        return propertyService.save(property);
    }

    @GetMapping
    public List<Property> getProperties(){
        return propertyService.findAll();
    }

}
