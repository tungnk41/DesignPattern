public class Main {
    public static void main(String[] args) {
        ArrayData arrayData_sort = new ArrayData(new Sort());
        arrayData_sort.execute();

        ArrayData arrayData_reverse = new ArrayData(new Reverse());
        arrayData_reverse.execute();
    }
}
