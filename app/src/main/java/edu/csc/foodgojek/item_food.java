package edu.csc.foodgojek;

import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

public class item_food {
    int money;
    String name_food;
    String img_food;

    public item_food(int money, String name_food, String img_food) {
        this.money = money;
        this.name_food = name_food;
        this.img_food = img_food;
    }


    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName_food() {
        return name_food;
    }

    public void setName_food(String name_food) {
        this.name_food = name_food;
    }

    public String getImg_food() {
        return img_food;
    }

    public void setImg_food(String img_food) {
        this.img_food = img_food;
    }

}
