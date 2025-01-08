package com.example.helloworld.data.Cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CyclicA {

    private CyclicB cyclicB;

}
