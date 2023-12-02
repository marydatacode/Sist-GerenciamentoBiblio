//livro

public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar() {
        this.emprestado = true;
    }

    public String toString() {
        return "Livro{" + 
        "titulo='" + titulo + '\'' +
        ", autor='" + autor + '\'' +
        ", emprestado=" + emprestado +
        '}';
    }
}