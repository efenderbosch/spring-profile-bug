package net.fender;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("service")
public class ServiceProperties {

    private String blah;

    public String getBlah() {
        return blah;
    }

    public void setBlah(String blah) {
        this.blah = blah;
    }
}
