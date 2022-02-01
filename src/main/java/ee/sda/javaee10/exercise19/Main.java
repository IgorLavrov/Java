package ee.sda.javaee10.exercise19;

import ee.sda.javaee10.exercise18.Computer;


class Laptop extends Computer {
    private int BatteryMah;
    private String processor;
    private int ram;
    private String graphicsCard;
    private String company;
    private String model;

    public Laptop(String processor, int ram, String graphicsCard, String company, String model, int Battery) {
        super(processor, ram, graphicsCard, company, model);
        this.processor = processor;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.company = company;
        this.model = model;
        this.BatteryMah = Battery;

    }
    @Override
    public boolean equals(Object o) {

        if(!(o instanceof Laptop)){
            return false;
        }

        Laptop laptop = (Laptop) o;

        if(this.hashCode() != laptop.hashCode()){
            return false;
        }


        return this.ram == laptop.ram && processor.equals(laptop.processor) && graphicsCard.equals(laptop.graphicsCard) && company.equals(laptop.company) && model.equals(laptop.model);
    }

    @Override
    public int hashCode() {
        return 10+(this.company.length() + processor.length()*model.length()+ram*graphicsCard.hashCode())*3;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", Battery=" + BatteryMah +
                '}';
    }
}