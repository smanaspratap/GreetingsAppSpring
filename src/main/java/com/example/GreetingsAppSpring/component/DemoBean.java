package com.example.GreetingsAppSpring.component;

import org.springframework.stereotype.Component;

@Component
public class DemoBean {

    public String getMessage() {
        return "Hello from DemoBean!";
    }

    @Override
    public String toString() {
        return "DemoBean{}";
    }
}
