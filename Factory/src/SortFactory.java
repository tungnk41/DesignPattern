public class SortFactory {

    public Sort getSort(String sortType){

        if(sortType == null){
            return null;
        }

        if(sortType.equalsIgnoreCase("BubbleSort")){
            return new BubbleSort();
        }

        if(sortType.equalsIgnoreCase("QuickSort")){
            return new QuickSort();
        }

        if(sortType.equalsIgnoreCase("MergeSort")){
            return new MergeSort();
        }

        return null;
    }
}
