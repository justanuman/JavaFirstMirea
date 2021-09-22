package ru.mirea.task5.dish;

public class Bowl extends Dish{
    int volume;
    boolean isbroken;
    Bowl(int volume, String color, boolean filled)
    {
        setVolume(volume);
        setColor(color);
        setFull(filled);
        this.isbroken=false;
    }
    public void shatter()
    {
        this.isbroken= true;
        setVolume(0);
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setIsbroken(boolean isbroken) {
        this.isbroken = isbroken;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public String getMaterial() {
        return "Ceramics";
    }

    @Override
    public String toString() {
        return getVolume()+" "+getMaterial()+this.color;
    }
}
