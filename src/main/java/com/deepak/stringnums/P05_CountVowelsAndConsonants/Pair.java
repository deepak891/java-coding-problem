package com.deepak.stringnums.P05_CountVowelsAndConsonants;

import java.util.Objects;

public final class Pair <V, C> {

    final V vowels;
    final C consonants;

    public Pair(V vowels, C consonants) {
        this.vowels = vowels;
        this.consonants = consonants;
    }

    public static <V, C>Pair<V,C> of(V v, C c) {
        return new Pair<>(v, c);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(vowels, pair.vowels) && Objects.equals(consonants, pair.consonants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vowels, consonants);
    }
}
