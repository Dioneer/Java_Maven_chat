package algorithms.myLinkedOneLink;

import java.util.Comparator;

public class MyCompare implements Comparator<Employee> {
    private SortType sortType;
    public MyCompare(SortType sortType) {
        this.sortType = sortType;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        int result = sortType == SortType.ASCENDING ? o1.getName().compareTo(o2.getName()): o2.getName().compareTo(o1.getName());
        if(result == 0){
            result = sortType == SortType.ASCENDING ? Integer.compare(o1.getAge(), o2.getAge()) : Integer.compare(o2.getAge(), o1.getAge());
        }
        return result;
    }
}
