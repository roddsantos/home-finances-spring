package com.roddsantos.homefinances.repositories;

import com.roddsantos.homefinances.models.CreditCardModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CreditCardRepository extends JpaRepository<CreditCardModel, UUID> {
}
