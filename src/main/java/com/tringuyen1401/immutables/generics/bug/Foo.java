package com.tringuyen1401.immutables.generics.bug;

import java.util.Set;

public interface Foo {
  Set<ImmutableBarz<Integer>> getThing();
}
