package com.grupo10.registroassinaturas;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Data
@Table(name = "clientes", uniqueConstraints = @UniqueConstraint(columnNames = { "id" }))
public class Cliente {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String email;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public static Cliente fromClienteModel(ClienteModel clienteModel) {
        return new Cliente(clienteModel.getId(), clienteModel.getNome(), clienteModel.getEmail());
    }

    public static ClienteModel toClienteModel(Cliente cliente) {
        return new ClienteModel(cliente.getId(), cliente.getNome(), cliente.getEmail());
    }

    public static ClienteDTO fromModelToDTO(ClienteModel clienteModel) {
        return new ClienteDTO(clienteModel.getId(), clienteModel.getNome(), clienteModel.getEmail());
    }
}
