package com.vamonossoftware.database;

import com.querydsl.core.types.Predicate;

@FunctionalInterface
public interface Expression {
    Predicate build();
}
