package com.study.algorithms.Controllers;

import com.study.algorithms.Services.BubbleSortService;
import com.study.algorithms.Services.QuickSortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/sort")
public class SortController {

    private final BubbleSortService bubbleSortService;
    private final QuickSortService quickSortService;
    @Autowired
    public SortController(BubbleSortService bubbleSortService,
                            QuickSortService quickSortService
    ) {
        this.bubbleSortService = bubbleSortService;
        this.quickSortService = quickSortService;

    }

    @GetMapping("/bubblesort")
    ArrayList<Integer> bubbleSort(@RequestBody ArrayList<Integer> unsortedList){
        return bubbleSortService.bubbleSort(unsortedList);
    }
    @GetMapping("/quicksort")
    ArrayList<Integer> quickSort(@RequestBody ArrayList<Integer> unsortedList){
        return quickSortService.quickSort(unsortedList, 0, unsortedList.size()-1);
    }

}
