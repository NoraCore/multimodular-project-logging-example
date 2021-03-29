package by.issoft.krivonos.algorithms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinarySearch {
    final static Logger logger = LoggerFactory.getLogger(BinarySearch.class);

    /**
     * Searches the specified array for the specified value using the recursive binary search algorithm.
     * The array must be sorted prior to making this call.
     * If it is not sorted, the results are undefined.
     * If the array contains multiple elements with the specified value, there is no guarantee which one will be found.
     *
     * @param sortedArray     – the array to be searched
     * @param elementToSearch – the value to be searched for
     * @return index of the search key, if it is contained in the array; otherwise, returns - 1.
     */
    public static int search(int[] sortedArray, int elementToSearch) {
        logger.debug("Element to search is {}. Length of array is {}", elementToSearch, sortedArray.length);
        return doRecursiveSearch(sortedArray, 0, sortedArray.length - 1, elementToSearch);
    }

    /**
     * @param sortedArray     – the array to be searched
     * @param firstIndex      – the index of the first element (inclusive) to be searched
     * @param lastIndex       – the index of the last element (exclusive) to be searched
     * @param elementToSearch - the value to be searched for
     * @return index of the search key, if it is contained in the array; otherwise, returns - 1.
     */
    private static int doRecursiveSearch(int[] sortedArray, int firstIndex, int lastIndex, int elementToSearch) {

        if (lastIndex >= firstIndex) {
            int middle = firstIndex + (lastIndex - firstIndex) / 2;

            logger.debug("Search in the range from {} to {} indexes, the middle element = {}", firstIndex, lastIndex, sortedArray[middle]);
            if (sortedArray[middle] == elementToSearch) {
                logger.debug("The end of algorithm. The middle element is {}, index of it is {}", sortedArray[middle], middle);
                return middle;
            }
            if (sortedArray[middle] > elementToSearch) {
                return doRecursiveSearch(sortedArray, firstIndex, middle - 1, elementToSearch);
            }
            return doRecursiveSearch(sortedArray, middle + 1, lastIndex, elementToSearch);
        }
        logger.debug("The {} not found. Return -1", elementToSearch);
        return -1;
    }
}
