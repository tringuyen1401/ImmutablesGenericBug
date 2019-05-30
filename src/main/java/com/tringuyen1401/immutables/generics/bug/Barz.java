package com.tringuyen1401.immutables.generics.bug;

import org.immutables.value.Value.Immutable;

@Immutable
public abstract class Barz<T> {
  public abstract T getOtherThing();
}
