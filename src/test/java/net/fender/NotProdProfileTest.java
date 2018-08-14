package net.fender;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.inject.Inject;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@ActiveProfiles("dev")
@TestPropertySource(properties = "service.blah=abc123")
@SpringJUnitConfig(TestConfiguration.class)
public class NotProdProfileTest {

    @Inject
    Service service;

    @Test
    public void testProfile() {
        assertThat(service.foo(), is("dev"));
    }
}
