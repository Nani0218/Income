package org.example.javattd.service1;

import org.example.javattd.model1.Items;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IteamService {

    public List<MenuItem> menuItemList=new ArrayList<>();

    public MenuItem getIteam(String name){
        for (MenuItem item:menuItemList){
            if (Objects.equals(Items.itemname,name)){
                return item;
            }
        }
        return null;

    }
}
