package com.roddsantos.homefinances.dto.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record UserPatchDto(@NotBlank @NotNull UUID id, String name, String surname,
                           String username) {
}
