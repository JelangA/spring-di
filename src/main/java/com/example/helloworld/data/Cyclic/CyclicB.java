package com.example.helloworld.data.Cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CyclicB {

    private CyclicC cyclicC;


}
