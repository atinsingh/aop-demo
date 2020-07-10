package io.pragra.learning.aopdemo.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GuestList {

    @Value("#{ '${guests.names}'.split(',') }")
    private List<String> names;

    public GuestList() {
        this.names = new ArrayList<>();
    }

    public List<String> getNames() {
        return names;
    }
}
