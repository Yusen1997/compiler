package com.compiler.semantic.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Struct extends Type {
    private String name;
    private StructField fields;
}
