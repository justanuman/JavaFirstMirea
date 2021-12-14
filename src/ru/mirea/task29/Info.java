package ru.mirea.task29;
import java.io.*;
public class Info implements Serializable {
        private static final long serialVersionUID = 1L;

        private double dollar;
        private double rouble;
        public Info(double dollar, double rouble){
            this.dollar = dollar;
            this.rouble = rouble;
        }

        public static long getSerialVersionUID() {
            return serialVersionUID;
        }

        public double getDollar() {
            return dollar;
        }

        public void setDollar(double dollar) {
            this.dollar = dollar;
        }

        public double getRouble() {
            return rouble;
        }

        public void setRouble(double euro) {
            this.rouble = rouble;
        }


        @Override
        public String toString() {
            return "CurrencyInfo{" +
                    "dollar=" + dollar + ", rouble=" + rouble + '}';
        }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        double dollar = 73.56;
        double rouble = 82.89;
        Info info = new Info(dollar, rouble);
        FileOutputStream outputStream = new FileOutputStream("out.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(info);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("out.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Info newInfo = (Info) objectInputStream.readObject();

        System.out.println(newInfo);
    }
    }
