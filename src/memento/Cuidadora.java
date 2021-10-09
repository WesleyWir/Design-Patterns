
package memento;

import java.util.Stack;
import javax.swing.JOptionPane;

public class Cuidadora {
    private Editor formulario;
    private Stack<Editor.Snapshot> historico = new Stack<>();
    public Cuidadora cuidadora;

    public Cuidadora(Editor formulario) {
        this.formulario = formulario;
        this.cuidadora = this;
    }    
    
    public void salvarBackup() {
        historico.add(formulario.criarSnapshot());
    }
    
    public void desfazer() {
        if (!historico.isEmpty()) {
            historico.pop().restore();
        } else {
            JOptionPane.showMessageDialog(formulario, "Nenhum histórico armazenado");
        }
    }
    
}