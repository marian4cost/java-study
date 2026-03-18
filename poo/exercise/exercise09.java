package poo.exercise;

class UsuarioSistema{
    String name;
    String email;

    public void fazerLogin(String email){
        System.out.println("o usuário " + email + " fez login");
    }
}

class Medico extends UsuarioSistema{
    String crm;

    public void Medico(String name, String email, String crm){
        this.name = name;
        this.email = email;
        this.crm = crm;
    }

    public void prescreverReceitas(String paciente, String name, String crm){
        System.out.println("receita gerada pelo médico " + name + " (CRM: " + crm + "), para o paciente " + paciente);
    }
}

class Administrador extends UsuarioSistema{
    int nivelAcesso;

    public void Administrador(String name, String email, int nivelAcesso){
        this.name = name;
        this.email = email;
        this.nivelAcesso = nivelAcesso;
    }

    public void gerarRelatorioAcesso(){
        System.out.println("gerando relatório de acesso...");
    }
}

public class exercise09 {
    public void main(String[] args){
        Medico medico = new Medico();
        Administrador adm = new Administrador();

        medico.fazerLogin("med01@gmail");
        medico.prescreverReceitas("paciente01", "med01", "123456");

        adm.fazerLogin("adm01@gmail");
        adm.gerarRelatorioAcesso();
    }
}
