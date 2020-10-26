/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoumnot;

/**
 *
 * @author Rodrigo Luís Zimmermann
 */
public class PilhaVetor<T> implements Pilha<T> {

    private int tamanho = 0;
    private T[] vet;
    private final int limite;

    //Construtores
    public PilhaVetor(int limite) {
        this.limite = limite;
        vet = (T[]) new Object[this.limite];
    }

    //Métodos
    @Override
    public void push(T valor) throws Exception {
        if (tamanho == vet.length) {
            expande();
        }
        vet[tamanho] = valor;
        tamanho++;
    }

    private void expande() {
        T[] novoVetor = (T[]) new Object[vet.length + 1];
        for (int i = 0; i < vet.length; i++) {
            novoVetor[i] = vet[i];
        }
        vet = novoVetor;
    }

    @Override
    public T pop() throws Exception {
        if (this.estaVazia()) {
            throw new PilhaException("Não há nada na pilha para remover");
        } else {
            T retorno = vet[tamanho - 1];
            vet[tamanho - 1] = null;
            tamanho--;
            return retorno;
        }
    }

    @Override
    public T peek() {
        T retorno = null;
        if (this.estaVazia()) {
            retorno = (T) "Pilha Vazia";
        } else {
                retorno = vet[tamanho-1];
        }
        return retorno;
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public void libera() {
        if (this.estaVazia()) {
            throw new PilhaException("Não há nada na pilha para liberar");
        } else {
            vet[limite] = null;
            tamanho = 0;
        }
    }

}