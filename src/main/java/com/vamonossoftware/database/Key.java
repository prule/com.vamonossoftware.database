package com.vamonossoftware.database;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.Embeddable;
import java.util.UUID;

@Embeddable
@EqualsAndHashCode(of = {"key"})
public class Key {

    @Getter private String key;

    public Key() {
        key = clean(UUID.randomUUID().toString());
    }

    public Key(String key) {
        this.key = key;
    }

    private String clean(String key) {
        return key.replace("-", "");
    }

    @Override
    public String toString() {
        return key;
    }

    public static void main(String[] args) {
        System.out.println(new Key());
    }
}
