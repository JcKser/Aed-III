import java.text.DecimalFormat;

public class Livro
{
    protected String idLivro;
    protected String titulo;
    protected String autor;
    protected float preco;
    DecimalFormat df = new DecimalFormat("#,##,0.00");
    
    
    public Livro(String idLivro, String titulo, String autor, float preco)
    {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String toString()
    {   
        return "ID: " + idLivro + "\n Título: " + titulo + "\n Autor: " + autor + "\n Preço: " + df.format( preco);

    }
    

}