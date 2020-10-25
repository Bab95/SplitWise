package com.company.Model;

import java.util.HashMap;
import java.util.Map;

public class User {
    int userId;
    String name;
    Map<User, Double> userExpenseSheet;
    double totalExpensesSoFar;
    Map<String,Map<User,Double>> groupsExpenses;
    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.userExpenseSheet = new HashMap<>();
        this.totalExpensesSoFar = 0;
    }
    void addToUserExpenseSheet(){
    }
    double getTotalExpensesSoFar(){
        return this.totalExpensesSoFar;
    }
    void getGroupExpenses(){
     //print total expenses of a group and then individual user's contribution to the group.....
    }
}
