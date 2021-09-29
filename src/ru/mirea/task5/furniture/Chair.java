package ru.mirea.task5.furniture;

public class Chair extends Furniture{
    private String spineHard;
    Chair(String Size, String spineHard, String Mat){
        setSize(Size);
        setSpineHard(spineHard);
        setMat(Mat);
        setTip("Chair");
        setPrice(1000);
    }

    public void setSpineHard(String spineHard) {
        this.spineHard = spineHard;
    }

    @Override
    public String getMat() {
        return this.Mat;
    }

    @Override
    public int getPrice() {
        return 500;
    }

    @Override
    public String getSize() {
        return this.Size;
    }

    @Override
    public String getTip() {
        return this.Tip;
    }

    public String getSpineHard() {
        return spineHard;
    }

    @Override
    public String toString() {
        return "Type: " +getTip()+ " size: "+getSize()+" material: "+getMat()+" spine hardness: "+getSpineHard()+ " Price"+getPrice();
    }
}
