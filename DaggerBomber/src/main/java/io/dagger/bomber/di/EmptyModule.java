package io.dagger.bomber.di;

import dagger.Module;
import dagger.multibindings.Multibinds;

import java.util.Set;

@Module
public abstract class EmptyModule {
    @Multibinds abstract Set<Integer> emptySet();
}
