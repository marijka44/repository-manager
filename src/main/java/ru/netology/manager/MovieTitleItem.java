package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public class MovieTitleItem {

        private int id;
        private int productId;
        private String productName;
    }
