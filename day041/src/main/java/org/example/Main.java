package org.example;

import org.example.app.data.CustDto;
import org.example.app.data.ItemDto;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        CustDto custDto = CustDto.builder().id("id01").pwd("pwd01").name("wdq").build();
        service.add(custDto)
        System.out.println(custDto);

        ItemDto itemDto = ItemDto.builder().id(5).name("BJH").price(10000000).build();
        System.out.println(itemDto);

    }
}