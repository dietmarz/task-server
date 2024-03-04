package de.centronic.task.server.infrastructure;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

public class AuthorizationInterceptor implements ClientHttpRequestInterceptor {

    private final String token;

    public AuthorizationInterceptor(String token) {
        this.token = token;
    }

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        request.getHeaders().remove(HttpHeaders.AUTHORIZATION);
        request.getHeaders().add(HttpHeaders.AUTHORIZATION, "token " + token);
        return execution.execute(request, body);
    }
}
