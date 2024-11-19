package com.springdataneo4jcontainertest;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

@Node
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Label {
    @Id @GeneratedValue(UUIDStringGenerator.class)
    private String id;

    private String name;
    private Integer age;
}
