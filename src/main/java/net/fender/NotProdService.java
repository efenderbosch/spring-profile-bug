package net.fender;

public class NotProdService implements Service {

    private final String profile;

    public NotProdService(String profile) {
        this.profile = profile;
    }

    public String foo() {
        return profile;
    }
}
