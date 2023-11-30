package enummy;

public enum Weekdays {
    Monday("bad"),
    Tuesday("bad"),
    Wednesday("so-so"),
    Thursday("so-so"),
    Friday("fine"),
    Saturday("great"),
    Sunday("good");
    private String mood;

    Weekdays(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}
