package com.heropmonkey.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pair<U,V>{
    private U first;
    private V second;
}
