package projeto.dbo;

import java.util.ArrayList;
import java.util.List;

public class Datasource {
    private List<Conta> _contas = new ArrayList<>();

    public Datasource() {
        // vazio
    }

    public boolean addConta(Conta conta) {
        if (conta != null) {
            _contas.add(conta);
            return true;
        }
        return false;
    }

    public boolean removeAt(int index) {
        if (index >= 0 && index < _contas.size()) {
            _contas.remove(index);
            return true;
        }
        return false;
    }

    public boolean removeObject(Conta conta) {
        return _contas.remove(conta);
    }

    public List<Conta> getAll() {
        return new ArrayList<>(_contas);
    }

    public Conta getAtIndex(int index){
        if (index >= 0 && index < _contas.size()){
            return _contas[index];
        }

        return null;
    }
}
