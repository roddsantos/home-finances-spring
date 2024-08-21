package com.roddsantos.homefinances.dto.creditcard;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record CreditCardPatchDto(
        @NotBlank @NotNull UUID id,
        String name,
        String description,
        String color,
        Float limit,
        Float invoice,
        Number day,
        Number month,
        Number year,
        Boolean isClosed,
        @NotEmpty @NotNull String userId
) {
}
