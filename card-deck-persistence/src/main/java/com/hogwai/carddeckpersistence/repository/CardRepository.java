package com.hogwai.carddeckpersistence.repository;

import com.hogwai.carddeckpersistence.model.Card;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CardRepository extends JpaRepository<Card, Integer>  {

}
