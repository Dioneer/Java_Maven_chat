package builder.classic;

import java.util.List;

public interface MyBuilder {
    void setFirstName(String firstName);
    void setLastName(String lastName);
    void setAge(int age);
    void setHardSkills(List<String> hardSkills);
    void setSoftSkills(List<String> softSkills);
    Builder createBuilder();

}
