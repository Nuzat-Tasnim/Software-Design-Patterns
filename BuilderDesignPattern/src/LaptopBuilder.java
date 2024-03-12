public class LaptopBuilder {

    String company;
    String ram;
    String processor;
    String graphicscard;
    String harddrive;
    String port;

    public LaptopBuilder setCompany(String company) {
        this.company = company;
        return this;
    }

    public LaptopBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public LaptopBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public LaptopBuilder setGraphicscard(String graphicscard) {
        this.graphicscard = graphicscard;
        return this;
    }

    public LaptopBuilder setHarddrive(String harddrive) {
        this.harddrive = harddrive;
        return this;
    }

    public LaptopBuilder setPort(String port) {
        this.port = port;
        return this;
    }

    public Laptop build() {
        return new Laptop(company, ram, processor, graphicscard, harddrive, port);
    }

}
