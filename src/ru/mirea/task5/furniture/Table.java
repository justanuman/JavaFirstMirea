package ru.mirea.task5.furniture;

public class Table extends Furniture {
    private int legNumber;
    Table(String Size, int legNumber, String Mat){
        setSize(Size);
        setLegNumber(legNumber);
        setMat(Mat);
        setTip("Table");
        setPrice(2000);
    }
    public void setLegNumber(int legNumber) {
        this.legNumber = legNumber;
    }

    @Override
    public String getMat() {
        return this.Mat;
    }

    @Override
    public int getPrice() {
        return Price;
    }

    @Override
    public String getSize() {
        return this.Size;
    }

    @Override
    public String getTip() {
        return this.Tip;
    }

    public int getLegNumber() {
        return legNumber;
    }

    @Override
    public String toString() {
        return "Type: " +getTip()+ " size: "+getSize()+" material: "+getMat()+" leg number: "+getLegNumber() +" Price"+getPrice();
    }
}
