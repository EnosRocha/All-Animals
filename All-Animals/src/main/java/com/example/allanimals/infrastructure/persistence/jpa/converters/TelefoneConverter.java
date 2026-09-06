package com.example.allanimals.infrastructure.persistence.jpa.converters;

import com.example.allanimals.domain.model.objectValue.Telefone;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class TelefoneConverter implements AttributeConverter<Telefone, String> {

    @Override
    public String convertToDatabaseColumn(Telefone attribute) {
        return attribute == null ? null : attribute.getValor();
    }

    @Override
    public Telefone convertToEntityAttribute(String dbData) {
        return dbData == null ? null : new Telefone(dbData);
    }
}
