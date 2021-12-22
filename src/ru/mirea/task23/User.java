package ru.mirea.task23;

public class User {
        String login;
        String password;
        public User(String login, String password){
            this.login = login;
            this.password = password;
        }
        public User(){
            int randNum = 0 + (int) (Math.random() * 4000); // Генерация 2-го числа

            this.login = "why"+randNum;
            this.login = "qwerty"+randNum;
        }
        public String getLogin(){
            return this.login;
        }
        public String getPassword() {return this.password;}
    }