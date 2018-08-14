package net.fender;

public class ProdService implements Service {

    private final ServiceProperties props;

    public ProdService(ServiceProperties props) {
        this.props = props;
    }

    public String foo() {
        return "prod";
    }
}
