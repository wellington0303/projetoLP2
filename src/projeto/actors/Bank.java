package projeto.actors;


public static class Bank{

    public static boolean Pay(Datasource source, int paymentId, int reciverId){
        //Transgerir de paymmentId para reciverID se possível
        //retornar true/false se a transação for aceita
    }

    public static boolean Deposit(Datasource source, int clientId, double value){
        //Depositar o valor x na conta do cliente
        //retornar true/false se o depósito ocorrer com êxito
    }

    public static boolean Withdraw(Datasource source, int clientId, double value){
        //Remover o valor x da conta do cliente
        //retornar true/false se a retirada ocorrer com êxito
    }

    

}