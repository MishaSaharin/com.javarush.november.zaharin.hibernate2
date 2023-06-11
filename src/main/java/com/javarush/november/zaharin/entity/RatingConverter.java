package com.javarush.november.zaharin.entity;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class RatingConverter implements AttributeConverter<Rating, String> {
    @Override
    public String convertToDatabaseColumn(Rating attribute) {
        return attribute.getValue();
    }

    @Override
    public Rating convertToEntityAttribute(String dbData) {
        Rating[] values = Rating.values();
        for (Rating rating : values) {
            if (dbData.equals(rating)) {
                return rating;
            }
        }
        return null;
    }
}
