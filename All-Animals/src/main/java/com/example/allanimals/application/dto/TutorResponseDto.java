package com.example.allanimals.application.dto;

import java.util.Date;
import java.util.UUID;

public record TutorResponseDto(

        UUID id,

        String name,

        String phone,

        Date birthday,

        String email
) {
}
