package com.roddsantos.homefinances.dto.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record UserPatchDto(
        @NotBlank @NotNull UUID id,
        @NotEmpty @NotNull String name,
        @NotEmpty @NotNull String surname,
        @NotEmpty @NotNull String username
) {
}
