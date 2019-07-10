package com.vamonossoftware.database;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;

public class PredicateBuilder {

    private BooleanBuilder builder;

    public PredicateBuilder() {
        builder = new BooleanBuilder();
    }

    public void and(boolean include, Expression expression) {
        if (include) {
            builder.and(expression.build());
        }
    }

    public void and(BooleanExpression expression) {
        builder.and(expression);
    }

    public Predicate toPredicate() {
        return builder;
    }

}
