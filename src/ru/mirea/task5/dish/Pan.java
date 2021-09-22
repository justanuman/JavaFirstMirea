package ru.mirea.task5.dish;

public class Pan extends Dish{
    int temp;
    int volume;
    Pan(int volume, String color, boolean filled, int temp)
    {
        setVolume(volume);
        setColor(color);
        setFull(filled);
        setTemp(temp);
    }
    public void heatup(){
        setTemp(100);
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public String getMaterial() {
        return "metal";
    }

    @Override
    public String toString() {
        return getVolume()+" "+getMaterial()+" "+getTemp() ;
    }
}
