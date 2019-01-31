package com.davidschrik;

public class Furnature {
    private boolean hasTv;
    private boolean hasCouch;
    private int chairCount;

    public Furnature(  int chairCount) {
        this.hasTv = false;
        this.hasCouch = false;
        this.chairCount = chairCount;
    }

    public void addTv(){
        this.hasTv = true;
        System.out.println("hasTv = " + isHasTv() );
    }

    public void addCouch(){
        this.hasCouch = true;
        System.out.println("couch added " + isHasCouch());
    }

    private boolean isHasTv() {
        System.out.println("in isHasTv");
        return this.hasTv;
    }

    private boolean isHasCouch() {
        System.out.println("in isHasCouch");
        return this.hasCouch;
    }

    public int getChairCount() {
        return chairCount;
    }
}
