package com.roddsantos.homefinances.dto.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserRecordDto(@NotBlank @NotNull String name,
                            @NotBlank @NotNull String surname,
                            @NotBlank @NotNull String username) {
}
