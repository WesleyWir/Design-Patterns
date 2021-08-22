
package facade;

/**
 *
 * @author wesle
 */
public class InterpretarX {
    public String nomeDoArquivo;

    public String getNomeDoArquivo() {
        return nomeDoArquivo;
    }

    public void setNomeDoArquivo(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    public InterpretarX(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }
    
    public void interpretar()
    {
        // Scanner s = new Scanner(nomeDoArquivo);
        // Parser p = new Parser(s);
        // AST ast = p.parse();
        // CodeGenerator code = new CodeGenerator(ast);
        // code.eval()
        System.out.println(this.getNomeDoArquivo()+" Criado");
    }
}
