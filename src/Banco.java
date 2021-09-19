public enum Banco {
    
    BRADESCO("Bradesco"),
    SANTANDER("Santander"),
    BRASIL("Banco do Brasil"),
    CAIXA("Caixa Economica");
    
    private String descricao;

    Banco(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
