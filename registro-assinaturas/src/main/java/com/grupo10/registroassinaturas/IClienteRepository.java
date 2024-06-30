package com.grupo10.registroassinaturas;

import java.util.List;

public interface IClienteRepository {
    List<ClienteModel> findAll();

    ClienteModel findById(Long codigoCliente);
}
