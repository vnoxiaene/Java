public class Metodos {
    public static void criarConta() {
        System.out.println("Informe os dados do cliente: ");

        System.out.println("Nome do cliente: ");
        String nome = Banco.teclado.nextLine();

        System.out.println("E-mail do cliente: ");
        String email = Banco.teclado.nextLine();

        System.out.println("CPF do cliente: ");
        String cpf = Banco.teclado.nextLine();

        System.out.println("Data de nascimento do cliente: ");
        String data_nascimento = Banco.teclado.nextLine();

        Cliente cliente = new Cliente(nome, email, cpf, Utils.stringParaData(data_nascimento));

        Conta conta = new Conta(cliente);

        Banco.contas.add(conta);

        System.out.println("Conta criada com sucesso!");
        System.out.println("Dados da conta criada: ");
        System.out.println(conta);
        System.out.println();

        Utils.pausar(4);
        Banco.menu();
    }

    public static void efetuarSaque() {
        System.out.println("Informe o número da conta: ");
        int numero = Banco.teclado.nextInt();

        Conta conta = buscarContaPorNumero(numero);

        if(conta != null) {
            System.out.println("Informe o valor para saque: ");
            Double valor = Banco.teclado.nextDouble();

            conta.sacar(valor);
        }else {
            System.out.println("Não foi encontrada a conta número " + numero);
        }
        Utils.pausar(3);
        Banco.menu();
    }

    public static void efetuarDeposito() {
        System.out.println("Informe o número da conta: ");
        int numero = Banco.teclado.nextInt();

        Conta conta = buscarContaPorNumero(numero);

        if(conta != null) {
            System.out.println("Informe o valor de depósito: ");
            Double valor = Banco.teclado.nextDouble();

            conta.depositar(valor);
        }else {
            System.out.println("Não foi encontrada a conta número " + numero);
        }
        Utils.pausar(3);
        Banco.menu();
    }

    public static void efetuarTransferencia() {
        System.out.println("Informe o número da sua conta: ");
        int numero_o = Banco.teclado.nextInt();

        Conta conta_o = buscarContaPorNumero(numero_o);

        if(conta_o != null) {
            System.out.println("Informe o número da conta destino: ");
            int numero_d = Banco.teclado.nextInt();

            Conta conta_d = buscarContaPorNumero(numero_d);

            if(conta_d != null) {
                System.out.println("Informe o valor da transferência: ");
                Double valor = Banco.teclado.nextDouble();

                conta_o.transferir(conta_d, valor);
            }else {
                System.out.println("A conta destino número " + numero_d + " não foi encontrada.");
            }
        }else {
            System.out.println("Não foi encontrada a conta número " + numero_o);
        }
        Utils.pausar(3);
        Banco.menu();
    }

    public static void listarContas() {
        if(Banco.contas.size() > 0) {
            System.out.println("Listagem de contas");
            System.out.println();

            for(Conta conta : Banco.contas) {
                System.out.println(conta);
                System.out.println();
                Utils.pausar(1);
            }
            System.out.println();
        }else {
            System.out.println("Não existem contas cadastradas ainda.");
        }
        Utils.pausar(3);
        Banco.menu();
    }

    private static Conta buscarContaPorNumero(int numero) {
        Conta c = null;
        if(Banco.contas.size() > 0) {
            for(Conta conta : Banco.contas) {
                if(conta.getNumero() == numero) {
                    c = conta;
                }
            }
        }
        return c;
    }

}


