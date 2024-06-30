package com.grupo10.api_gateway.main.java.com.grupo10.api_gateway;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {
  @PostMapping("/clean")
  public ResponseEntity<String> registroOrcamentosFallback() {
    return ResponseEntity
        .status(HttpStatus.SERVICE_UNAVAILABLE)
        .body(
            "O serviço de registro de assinaturas está indisponível no momento. Por favor, tente novamente mais tarde.");
  }

}
