package Seminar3.hw3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Items {
    private String nameTitle;
    private String secondName;
    private int price;
    private int age;
    private int volume;
}