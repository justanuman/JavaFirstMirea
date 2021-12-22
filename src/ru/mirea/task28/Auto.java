package ru.mirea.task28;

class Auto {
    String model;

    class Engine {
        private boolean working = false;

        public void work () {
            working = true;
            System.out.print("Двигатель запущен!");
        }
    }

    Engine en = new Engine();
}