package projeto.actors;

public static class Actor{

    public static Cliente getClienteById(int id, Datasource source){
        if(source == null || source.getAll().size() == 0){
            return null;
        }

        Cliente cliente = null;
        for(int i = 0; i < source.getAll().size(); i++){
            Conta current = source.getAtIndex(i);
            if(current != null && current.getTitular() != null){
                Cliente currentClient = current.getTitular();

                if(currentClient.getID() == id){
                    return currentClient;
                }
            }
        }

        return null;
    }

    public static Conta getContaById(int id, Datasource source){
        //implementar

        return null;
    }
}