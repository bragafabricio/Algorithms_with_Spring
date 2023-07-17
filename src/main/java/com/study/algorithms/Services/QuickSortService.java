package com.study.algorithms.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuickSortService {
    @Autowired
    public QuickSortService() {
    }

    public ArrayList<Integer> quickSort(ArrayList<Integer> integerList, int p, int r) {
        if (p < r){
            int q = partition(integerList, p, r);
            quickSort(integerList, p, q-1);
            quickSort(integerList, q+1, r);
        }
        return integerList;
    }

    private int partition(ArrayList<Integer> integerList, int p, int r) {
        int x = integerList.get(r);
        int i = p-1;

        for (int j = p; j < r; j++){
            if (integerList.get(j) <= x){
                i += 1;
                exchange(integerList, i ,j);
            }
        }
        exchange(integerList, i+1, r);
        return i + 1;
    }

    private static void exchange(List<Integer> integerList, int pos1, int pos2 ) {
        int temp = integerList.get(pos1);
        integerList.set(pos1, integerList.get(pos2));
        integerList.set(pos2, temp);
    }
}
