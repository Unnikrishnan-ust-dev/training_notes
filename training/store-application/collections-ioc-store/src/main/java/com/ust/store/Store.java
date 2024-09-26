package com.ust.store;

import java.util.*;

public class Store {
    private ArrayList<Egg> eggs = new ArrayList<>();
    private HashSet<Milk> milks = new HashSet<>();
    private LinkedList<Chocolate> chocolates = new LinkedList<>();
    TreeSet<Apple> apples = new TreeSet<>();
    Queue<Bread> breads = new PriorityQueue<>();

    public Store(ArrayList<Egg> eggs, Queue<Bread> breads, TreeSet<Apple> apples, HashSet<Milk> milks, LinkedList<Chocolate> chocolates) {
        this.eggs = eggs;
        this.breads = breads;
        this.apples = apples;
        this.milks = milks;
        this.chocolates = chocolates;
    }

    public Store() {
    }

    public ArrayList<Egg> getEggs() {
        return eggs;
    }

    public void setEggs(ArrayList<Egg> eggs) {
        this.eggs = eggs;
    }

    public Queue<Bread> getBreads() {
        return breads;
    }

    public void setBreads(Queue<Bread> breads) {
        this.breads = breads;
    }

    public TreeSet<Apple> getApples() {
        return apples;
    }

    public void setApples(TreeSet<Apple> apples) {
        this.apples = apples;
    }

    public LinkedList<Chocolate> getChocolates() {
        return chocolates;
    }

    public void setChocolates(LinkedList<Chocolate> chocolates) {
        this.chocolates = chocolates;
    }

    public HashSet<Milk> getMilks() {
        return milks;
    }

    public void setMilks(HashSet<Milk> milks) {
        this.milks = milks;
    }

    @Override
    public String toString() {
        return "Store{" +
                "eggs=" + eggs +
                ", milks=" + milks +
                ", chocolates=" + chocolates +
                ", apples=" + apples +
                ", breads=" + breads +
                '}';
    }
}
