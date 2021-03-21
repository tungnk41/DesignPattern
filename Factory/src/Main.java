public class Main {
    public static void main(String[] args) {
        SortFactory sortFactory = new SortFactory();

        Sort bubbleSort = sortFactory.getSort("bubbleSort");
        bubbleSort.sort();

        Sort quickSort = sortFactory.getSort("quickSort");
        quickSort.sort();
    }
}
