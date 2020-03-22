package com.karohani.spring.expert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExpertApplication {

    public static void main(String[] args) {

        SpringApplication.run(ExpertApplication.class, args);

        /*
            XML 하...

            Class path를 기준으로 class loading
            class loading -> annotation

            Spring AnnotationProcessor ->

            @Component, @Repository, @Controller, @configuation...추출

            2가지 방법
            1. 기본생성자로 생성하고 Setter로 주입
            2. 생성자로 주입

            그냥 기본 생성자로 생기는 클래스들을 먼저 만들고 ->
            A -> B

            Container에 빈 등록 ->

            SpringMVC -> Controller 빈을 DispatcherServelet에 등록

            [Person, new Person]-> Bean 이라 불러요
         */

    }

}
