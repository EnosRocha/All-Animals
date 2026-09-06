package com.example.allanimals.infrastructure.persistence.jpa.converters;

import com.example.allanimals.domain.model.objectValue.Email;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class EmailConverter implements AttributeConverter<Email, String> {


    @Override
    public String convertToDatabaseColumn(Email attribute) {
        return attribute == null ? null : attribute.getEmail();
    }

    @Override
    public Email convertToEntityAttribute(String dbData) {
        return dbData == null ? null : new Email(dbData);
    }
}
