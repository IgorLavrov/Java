package ee.sda.javaee10.exercise18;

public class Computer {


    private String processor;
    private int ram;
    private String graphicsCard;
    private String company;
    private String model;

    public Computer(String processor, int ram, String graphicsCard, String company, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.company = company;
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Computer)) {
            return false;
        }

        Computer computer = (Computer) o;

        System.out.println(this.hashCode());
        System.out.println(computer.hashCode());

        if (this.hashCode() != computer.hashCode()) return false;

        if (this.company.equals(computer.getCompany())
                && this.graphicsCard.equals(computer.getGraphicsCard())
                && this.ram == computer.getRam()
                && this.model.equals(computer.getModel())
                && this.processor.equals(computer.getProcessor())) {

            return true;

        }

        return false;
    }

    @Override
    public int hashCode() {
        return 7 + (this.ram + this.model.length() + this.processor.length() + this.graphicsCard.length()) * 13;
    }


}
