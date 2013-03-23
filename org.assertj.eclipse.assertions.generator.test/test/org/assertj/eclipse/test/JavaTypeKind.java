package org.assertj.eclipse.test;

public enum JavaTypeKind {

  CLASS, ENUM;

  String toJavaCode() {
    return name().toLowerCase();
  }
}
