import java.util.Scanner;
import domain.User;
import domain.city;
import domain.denuncia;


public class Main {
    public static void main(String[] args) {

        String textColor_RESET = "\u001B[0m";
        String textColor_colorizeB = "\u001B[40m";
        String textColor_colorizeG = "\u001B[32m";
        String textColor_colorizeR = "\u001B[31m";
        String textColor_colorizeY = "\u001B[33m";
        Scanner input = new Scanner(System.in);
        String nameUser, mailUser, cityUser, phoneUser, denunUser, denunUser1;
        System.out.println(textColor_colorizeB + "Bem vindo ao Aplicativo de Denuncias Ambientais"+textColor_RESET);
        System.out.println("Os seus dados" + textColor_colorizeY + " estarão protegidos de acordo com a Lei nº 13.709/2018 ");
        System.out.println(textColor_RESET + "Digite" + textColor_colorizeG + " OK " + textColor_RESET + "para continuar e concordar com os termos ou Digite"+ textColor_colorizeR+ " OFF" + textColor_RESET + " para sair do APP");
        Scanner termos = new Scanner (System.in);
        String termosUser;
        termosUser = termos.nextLine();
        if (!termosUser.equals("OK")){
            return;
        }
        else {
            Scanner anon = new Scanner(System.in);
            String  anonUser;
            System.out.println("Deseja realizar uma Denuncia Anonima ? Digite SIM ou NAO");
            anonUser = anon.nextLine();
            if (anonUser.equals("SIM")){

                System.out.println("Digite o " + textColor_colorizeB + textColor_colorizeY + "número" + textColor_RESET + " de acordo com a denúncia !");
                System.out.println(textColor_colorizeB + textColor_colorizeR + "1" + textColor_RESET +" Meio ambiente natural: água, solo, ar, flora, fauna, etc.");
                System.out.println(textColor_colorizeB + textColor_colorizeR + "2" + textColor_RESET +" Meio ambiente cultural: patrimônio artístico, histórico, turístico, paisagístico, arqueológico, etc.");
                System.out.println(textColor_colorizeB + textColor_colorizeR + "3" + textColor_RESET +" Meio ambiente artificial: espaço urbano, ruas, praças, calçadas, áreas verdes, etc.");
                Scanner denun = new Scanner(System.in);
                denunUser = denun.nextLine();
                Scanner denun1 = new Scanner(System.in);
                System.out.println("Escreva detalhes sobre a sua Denúncia");
                denunUser1 = denun1.nextLine();
                denuncia denuncia1 = new denuncia();
                denuncia1.setTipoDenuncia(denunUser);
                denuncia1.setDenuncia(denunUser1);
                denuncia1.setId(1l);
                System.out.println("A sua Denuncia foi registrada com sucesso");
                return;
            }

            else {
            System.out.println("Digite o seu nome");
            nameUser = input.nextLine();
            System.out.println("Digite o seu EMAIL");
            mailUser = input.nextLine();
            System.out.println("Digite a sua Cidade");
            cityUser = input.nextLine();
            System.out.println("Digite o seu Contato");
            phoneUser = input.nextLine();
        System.out.println("Digite o " + textColor_colorizeB + textColor_colorizeY + "número" + textColor_RESET + " de acordo com a denúncia !");
        System.out.println(textColor_colorizeB + textColor_colorizeR + "1" + textColor_RESET +" Meio ambiente natural: água, solo, ar, flora, fauna, etc.");
        System.out.println(textColor_colorizeB + textColor_colorizeR + "2" + textColor_RESET +" Meio ambiente cultural: patrimônio artístico, histórico, turístico, paisagístico, arqueológico, etc.");
        System.out.println(textColor_colorizeB + textColor_colorizeR + "3" + textColor_RESET +" Meio ambiente artificial: espaço urbano, ruas, praças, calçadas, áreas verdes, etc.");
        denunUser = input.nextLine();
        System.out.println("Escreva detalhes sobre a sua Denúncia");
        denunUser1 = input.nextLine();
        input.close();

            User usuario = new User();
            usuario.setNome(nameUser);
            usuario.setMail(mailUser);
            usuario.setCidade(cityUser);
            usuario.setContato(Long.valueOf(phoneUser));
            usuario.setId(1l);
            denuncia denuncia1 = new denuncia();
            denuncia1.setTipoDenuncia(denunUser);
            denuncia1.setDenuncia(denunUser1);
            denuncia1.setCidadao(nameUser);
            denuncia1.setId(1l);
            city city1 = new city ();
            city1.setName(cityUser);
            city1.setId(1l);
            System.out.println(usuario.getNome() + " a sua denúncia foi registrada com sucesso e uma cópia da denúncia foi enviado para " + usuario.getMail());
        return;
    }}}}


