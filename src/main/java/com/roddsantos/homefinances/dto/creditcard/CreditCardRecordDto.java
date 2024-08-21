package com.roddsantos.homefinances.dto.creditcard;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record CreditCardRecordDto(
        @NotBlank @NotNull UUID id,
        @NotBlank @NotNull String name,
        @NotBlank @NotNull String description,
        @NotBlank @NotNull String color,
        @NotEmpty @NotNull Float limit,
        @NotEmpty @NotNull Float invoice,
        @NotEmpty @NotNull Number day,
        @NotEmpty @NotNull Number month,
        @NotEmpty @NotNull Number year,
        @NotNull Boolean isClosed,
        @NotNull String userId
) {
}
