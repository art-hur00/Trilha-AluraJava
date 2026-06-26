class Ex10Codigo {

    private int codigoAcessoNumerio = 2023;


    public void verificaAcesso(int codigoAcessoNumerioFornecido, int nivelDePermissaoNumerioFornecido){

        if(codigoAcessoNumerio == codigoAcessoNumerioFornecido &&  nivelDePermissaoNumerioFornecido == 1 || nivelDePermissaoNumerioFornecido == 2 || nivelDePermissaoNumerioFornecido == 3){
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");

        }else if(codigoAcessoNumerioFornecido != codigoAcessoNumerio){
            System.out.println("Acesso negado!\nCódigo de acesso inválido");

        }else{
            System.out.println("Acesso negado!\nNível de permissão inválido");
        }
    }
}
