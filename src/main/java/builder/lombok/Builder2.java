package builder.lombok;

import lombok.Builder;

import java.util.List;
@Builder
public class Builder2 {
        private String firstName;
        private String lastName;
        private int age;
        private List<String> hardSkills;
        private List<String> softSkills;

        public Builder2(String firstName, String lastName, int age, List<String> hardSkills, List<String> softSkills) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hardSkills = hardSkills;
            this.softSkills = softSkills;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public List<String> getHardSkills() {
            return hardSkills;
        }

        public List<String> getSoftSkills() {
            return softSkills;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setHardSkills(List<String> hardSkills) {
            this.hardSkills = hardSkills;
        }

        public void setSoftSkills(List<String> softSkills) {
            this.softSkills = softSkills;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    ", hardSkills=" + hardSkills +
                    ", softSkills=" + softSkills +
                    '}';
        }
}
