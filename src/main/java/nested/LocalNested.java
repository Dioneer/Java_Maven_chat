package nested;

public class LocalNested {
    public void getResult(){
        class Division{
            private int divisible;
            private int divider;

            public int getDivisible() {
                return divisible;
            }

            public void setDivisible(int divisible) {
                this.divisible = divisible;
            }

            public int getDivider() {
                return divider;
            }

            public void setDivider(int divider) {
                this.divider = divider;
            }
            public int getResult(){
                return divisible/divider;
            }
        }
        Division division = new Division();
        division.setDivisible(12);
        division.setDivider(2);
        System.out.println("Result = " + division.getResult());
    }
}