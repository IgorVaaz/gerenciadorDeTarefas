package com.example.gerenciadorDeTarefas;

public record Todo(String id, String titulo, String descricao, boolean feito) {

    public Todo{
        if(titulo == null || titulo.length() < 3){
            throw new IllegalArgumentException("O título deve ter pelo menos 3 caracteres");
        }
    }
}
