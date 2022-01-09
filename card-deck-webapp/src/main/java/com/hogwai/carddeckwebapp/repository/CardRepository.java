package com.hogwai.carddeckwebapp.repository;

import com.hogwai.carddeckwebapp.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Integer>  {

}
