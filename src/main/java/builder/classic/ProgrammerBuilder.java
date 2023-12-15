package builder.classic;

import java.util.List;

public class ProgrammerBuilder implements MyBuilder{
    private String firstName;
    private String lastName;
    private int age;
    private List<String> hardSkills;
    private List<String> softSkills;
    @Override
    public void setFirstName(String firstName) {
    this.firstName=firstName;
    }

    @Override
    public void setLastName(String lastName) {
    this.lastName=lastName;
    }

    @Override
    public void setAge(int age) {
    this.age=age;
    }

    @Override
    public void setHardSkills(List<String> hardSkills) {
    this.hardSkills=hardSkills;
    }

    @Override
    public void setSoftSkills(List<String> softSkills) {
    this.softSkills=softSkills;
    }

    @Override
    public Builder createBuilder() {
        return new Builder(firstName,lastName,age,hardSkills,softSkills);
    }
}
