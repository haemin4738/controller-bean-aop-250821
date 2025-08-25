package com.back.domain.wisesaying.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class WiseSaying {
    private int id;
    private String content;
    private String author;
}