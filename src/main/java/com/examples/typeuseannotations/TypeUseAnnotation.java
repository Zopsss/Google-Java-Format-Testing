package com.examples.typeuseannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * custom annotation for type use.
 */
@Target(ElementType.TYPE_USE)
public @interface TypeUseAnnotation {
}
