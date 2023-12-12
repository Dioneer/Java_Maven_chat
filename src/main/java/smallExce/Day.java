package smallExce;

public enum Day {
    Monday(true),
    Thuesday(true),
    Wednesday(true),
    Thursday(true),
    Friday(true),
    Saturday(false),
    Sunday(false);
    private boolean work;

    Day(boolean work) {
        this.work = work;
    }

    public boolean isWork() {
        return work;
    }
}
