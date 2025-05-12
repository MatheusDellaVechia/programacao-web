package com.example.programacao_web.shared;

import com.example.programacao_web.server.search.SearchRequest;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ApplicationTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public abstract class CrudControllerTest<D> {

    @Autowired
    protected TestRestTemplate testRestTemplate;

    protected abstract String getURL();
    protected abstract D createValidObject();
    protected abstract D createInvalidObject();
    protected abstract void onBeforeUpdate(D dto);

    protected SearchRequest createSearchRequest() {
        return new SearchRequest();
    }

    @Test
    @Order(1)
    protected void createValidRegister() {
        D entity = createValidObject();

        ResponseEntity<Object> response = testRestTemplate.postForEntity(getURL(), entity, Object.class);

        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertNotNull(response.getBody());
    }

    @Test
    @Order(2)
    protected void createInvalidRegister() {
        D entity = createInvalidObject();

        ResponseEntity<Object> response = testRestTemplate.postForEntity(getURL(), entity, Object.class);
        assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
    }

    @Test
    @Order(3)
    protected void updateValidRegister() {
        D dto = createValidObject();
        onBeforeUpdate(dto);

        HttpHeaders headers = new HttpHeaders();
        HttpEntity<D> requestEntity = new HttpEntity<>(dto, headers);
        ResponseEntity<Object> response = testRestTemplate.exchange(getURL() + "/" + 1L, HttpMethod.PUT, requestEntity, Object.class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    @Order(4)
    protected void findOneValid() {
        ResponseEntity<Object> response = testRestTemplate.getForEntity(getURL() + "/" + 1L, Object.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    @Order(5)
    protected void findOneNonExistent() {
        ResponseEntity<Object> response = testRestTemplate.getForEntity(getURL() + "/" + 999L, Object.class);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
    }

    @Test
    @Order(7)
    protected void searchEntries() {
        SearchRequest request = createSearchRequest();
        ResponseEntity<Object> response = testRestTemplate.postForEntity(getURL() + "/search", request, Object.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    @Order(99)
    protected void deleteValidRegister() {
        ResponseEntity<Void> response = testRestTemplate.exchange(getURL() + "/" + 1L, HttpMethod.DELETE, null, Void.class);
        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
    }

}