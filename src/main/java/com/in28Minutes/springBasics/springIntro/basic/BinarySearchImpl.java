package com.in28Minutes.springBasics.springIntro.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class BinarySearchImpl {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private SortAlgorithm sortAlgorithm;

    @Autowired
    private SortAlgorithm quickSortAlgorithm;

//    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }

    public int binarySearch(int[] arr, int numberToSearchFor){

        //implementing sorting logic
        //let;s say Bubble sort
        int[] sortedArr = sortAlgorithm.sort(arr);
        System.out.println(sortAlgorithm);
        System.out.println(quickSortAlgorithm);

        //searches the sortedArr and returns 3
        return 3;
    }

    @PostConstruct
    public void postConstruct(){
        LOGGER.info("postConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        LOGGER.info("preDestroy");
    }
}
