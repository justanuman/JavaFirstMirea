package ru.mirea.task5.furniture;

public abstract class Furniture {
    protected String Size;
    protected String Tip;
    protected String Mat;
    protected int Price;
    public Furniture(String Tip,  String Size, String Mat){
        setSize(Size);
        setTip(Tip);
        setMat(Mat);
        setPrice(0);
    }

    protected Furniture() {
    }

    public void setMat(String mat) {
        Mat = mat;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public abstract String getMat() ;

    public abstract int getPrice();

    public abstract String getSize();

    public abstract String getTip() ;

    public void setTip(String tip) {
        Tip = tip;
    }
    public void setSize(String size) {
        Size = size;
    }
    public abstract String toString();
}
