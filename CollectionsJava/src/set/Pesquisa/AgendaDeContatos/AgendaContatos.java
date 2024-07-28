package set.Pesquisa.AgendaDeContatos;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        if(!contatoSet.isEmpty()){
            for (Contato c: contatoSet){
                if (c.getNome().startsWith(nome)){
                    contatosPorNome.add(c);
                }
            }
        }else {
            System.out.println("Agenda de contatos vazia");
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int numeroNovo){
        Contato contatoAtualizado = null;
        for (Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numeroNovo);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }


}
