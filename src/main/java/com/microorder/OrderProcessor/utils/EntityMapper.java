package com.microorder.OrderProcessor.utils;

import java.util.List;

public interface EntityMapper {
    <Source, Destination> Destination convert(Source source, Class<Destination> destinationClass);
    <Source, Destination> List<Destination> convertList(List<Source> sourceList, Class<Destination> destinationClass);
}
