package com.karohani.spring.expert;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;

@Component
public class Person {

    // Property
    // 이름에 의한 방법, 타입에 의한 방법 두 가지가 있음

    // @Qualifier, Person -> person
    // Hash -> Bean의 이름

    private String name;

    public Person(@Value("${name}")String name) {

        this.name = name;

    }

    @PostConstruct
    public void context() {

        System.out.println(this.name);

    }
}
