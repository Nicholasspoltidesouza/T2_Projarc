package com.grupo10.registroassinaturas;

import org.springframework.stereotype.Component;

// import com.projarc.clean.domain.service.AssinaturaService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class ChecarSeAssinaturaEValidaUC {

    private final AssinaturaService assinaturaService;

    public boolean run(Long codigoAssinatura) {
        if (assinaturaService.checarSeAssinaturaEValida(codigoAssinatura)) {
            return true;
        } else {
            return false;
        }
    }
}
