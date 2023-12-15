package builder.classic;

import java.util.ArrayList;
import java.util.List;

public class Director {
    public MyBuilder createJunior(MyBuilder builder){
        List<String> hardSkills = new ArrayList<>();
        hardSkills.add("Java Core");
        hardSkills.add("OS Windows");
        hardSkills.add("Docker");
        builder.setHardSkills(hardSkills);
        List<String> softSkills = new ArrayList<>();
        softSkills.add("Worker");
        softSkills.add("Nice");
        softSkills.add("Clever");
        builder.setSoftSkills(softSkills);
        return builder;
    }
    public MyBuilder createMiddle(MyBuilder builder){
        List<String> hardSkills = new ArrayList<>();
        hardSkills.add("Java EE");
        hardSkills.add("OS Linux");
        hardSkills.add("Docker");
        builder.setHardSkills(hardSkills);
        List<String> softSkills = new ArrayList<>();
        softSkills.add("Worker");
        softSkills.add("Nice");
        softSkills.add("Clever");
        builder.setSoftSkills(softSkills);
        return builder;
    }
}
