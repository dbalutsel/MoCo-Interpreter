package md.balutsel.mocointerpreter.engine.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class Lesson {
    private int number;
    private String name;
    private Set<Integer> requiredToAccess = new HashSet<>();
    private String information;
    private Test test;
}
