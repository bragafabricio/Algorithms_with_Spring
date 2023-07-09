package com.study.algorithms.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SortService {
    @Autowired
    public SortService() {
    }

    private static void swap(List<Integer> integerList, int position) {
        Integer temp = integerList.get(position + 1);
        integerList.set(position + 1, integerList.get(position));
        integerList.set(position, temp);
    }

    public ArrayList<Integer> bubbleSort(ArrayList<Integer> integerList) {
        for (int i = 0; i < integerList.size() - 1; i++){
            boolean swapped = false;
            for (int j = 0; j < integerList.size() - i - 1; j++){
                if(integerList.get(j) > integerList.get(j+1)){
                    swap(integerList, j);
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
        return integerList;
    }
}
