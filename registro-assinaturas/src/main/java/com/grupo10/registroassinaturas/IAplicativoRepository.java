package com.grupo10.registroassinaturas;

import java.util.List;

public interface IAplicativoRepository {
    List<AplicativoModel> findAll();

    AplicativoModel findById(Long codigoAplicativo);

    AplicativoModel save(AplicativoModel aplicativo);
}
