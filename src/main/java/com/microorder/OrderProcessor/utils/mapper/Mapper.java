package com.microorder.OrderProcessor.utils.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microorder.OrderProcessor.utils.EntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class Mapper implements EntityMapper {
    private final ObjectMapper objectMapper;
    @Autowired
    public Mapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }
    @Override
    public <Source, Destination> Destination convert(Source source, Class<Destination> destinationClass) {
        Destination destination = objectMapper.convertValue(source, (Class<? extends Destination>) destinationClass);
        return destination;
    }
    @Override
    public <Source, Destination> List<Destination> convertList(List<Source> sourceList, Class<Destination> destinationClass) {
        return sourceList.stream()
                .map(source -> convert(source, destinationClass))
                .collect(Collectors.toList());
    }
}
