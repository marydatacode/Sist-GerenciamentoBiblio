//biblio

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        for (int i=0; i<livros.size(); i++) {
            System.out.println((i +1) + ". " + livros.get(i));
        }
    }

    public void emprestarLivro(int numeroLivro) {
        if (numeroLivro > 0 && numeroLivro <= livros.size()) {
            Livro livroSelecionado = livros.get(numeroLivro - 1);
            if (!livroSelecionado.isEmprestado()) {
                livroSelecionado.emprestar();
                System.out.println("Livro emprestado com sucesso!");
            } else {
                System.out.println("Livro já está emprestado. ");
            }
        } else {
            System.out.println("Número de livro inválido.");
        }
    }
}