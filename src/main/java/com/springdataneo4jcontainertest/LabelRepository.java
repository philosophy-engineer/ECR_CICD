package com.springdataneo4jcontainertest;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LabelRepository extends Neo4jRepository<Label, String> {

}
