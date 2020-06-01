package com.example.InneclassDemo;

class Car {
    String brandName;
    String modelName;

    public Car(String name, String type) {
        this.brandName = name;
        this.modelName = type;
    }

    private String getbrandName() {
        return this.brandName;
    }

// inner class
    class Engine {
        String engineType;
        void setEngine() {
        	
            if(Car.this.modelName.equals("BMW")){

                if(Car.this.getbrandName().equals("i8")) {
                    this.engineType = "Bigger";
                } else {
                    this.engineType = "Smaller";
                }

            }else{
                this.engineType = "Smaller";
            }
        }
        String getEngineType(){
            return this.engineType;
        }
    }
}