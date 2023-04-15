import java.util.Scanner;

public class FichaDeAnamnese {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ficha de Anamnese");
        System.out.println("-------------------");

        System.out.println("nome: ");
        String nome = leitor.nextLine();

        System.out.println("Data de Nascimento (dd/mm/aaaa): ");
        String dataNascimento = leitor.nextLine();

        System.out.println("Endereço: ");
        String endereco = leitor.nextLine();

        System.out.println("Telefone: ");
        String telefone = leitor.nextLine();

        System.out.println("E-mail: ");
        String email = leitor.nextLine();

        System.out.println("Profissão: ");
        String profissao = leitor.nextLine();

        System.out.println("\nAvaliação");
        System.out.println("-------------------------");

        System.out.print("É Lactante? ");
        String lactante = leitor.nextLine();

        System.out.print("É Gestante? ");
        String gestante = leitor.nextLine();

        System.out.print("Queda de Cabelo (Pouco, Media, Bastante) ? ");
        String quedaDeCabelo = leitor.nextLine();

        System.out.print("Possue Alergia a Henna ou algum cosmetico? ");
        String alergiaHennaOuCosmetico = leitor.nextLine();

        System.out.print("Possue Alergia a Chumbo? ");
        String alergiaChumbo = leitor.nextLine();

        System.out.print("Grau de Oleosidade da pele (pouco, Media, Bastante)? ");
        String oleosidadePele = leitor.nextLine();

        System.out.print("Grau de sensibilidade da pele (pouco, Media, Bastante)? ");
        String sensibilidadePele = leitor.nextLine();

        System.out.println("\nOBSERVACOES");
        System.out.println("------------");

        System.out.print("Existe Algum problema que Julgue ser necessario informar \" +\n" +
                "                \"ao profissional antes do Procedimento: ");
        String observacoes = leitor.nextLine();

        System.out.println("\nDESIGNER DE SOBRANCELHAS");
        System.out.println("\nFICHA DE ANAMNESE PREENCHIDA");
        System.out.println("----------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Endereco: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("Profissao: " + profissao);
        System.out.println("É Lactante: " + lactante);
        System.out.println("É Gestante: " + gestante);
        System.out.println("Queda de Cabelo: " + quedaDeCabelo);
        System.out.println("Possue Alergia a Henna ou algum cosmetico: " + alergiaHennaOuCosmetico);
        System.out.println("Possue Alergia a Chumbo: " + alergiaChumbo);
        System.out.println("Grau de Oleosidade da pele: " + oleosidadePele);
        System.out.println("Grau de sensibiliade da pele: " + sensibilidadePele);
        System.out.println("Existe Algum problema que Julgue ser necessario informar " +
                "ao profissional antes do Procedimento: " + observacoes);
        System.out.println("DATA ANAMNESE: Em:____/____/_____");
        System.out.println("Assinatura da Cliente: ASS______________________________________");

    }
}
