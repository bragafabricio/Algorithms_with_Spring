package com.study.algorithms.Controllers;

import com.study.algorithms.Services.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/sort")
public class SortController {

    private final SortService sortService;
    @Autowired
    public SortController(SortService sortService) {
        this.sortService = sortService;
    }

    @GetMapping("/bubblesort")
    ArrayList<Integer> bubbleSort(@RequestBody ArrayList<Integer> unsortedList){
        return sortService.bubbleSort(unsortedList);
    }

}
