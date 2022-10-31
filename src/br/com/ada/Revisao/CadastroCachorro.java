package br.com.ada.Revisao;

import java.util.Objects;

public class CadastroCachorro {

    private Cachorro[] cadastro = new Cachorro[10];

    public void cadastrar(Cachorro cachorro){
        for (int i = 0; i < cadastro.length; i++) {
            if(Objects.isNull(cadastro[i])){
                cadastro[i] = cachorro;
                break;
            }
        }
    }

    public void mostraCadastroCachorros(){
        System.out.println("-----------------CADASTRO DOGS--------------------");
        for (Cachorro cachorro: cadastro) {
            if (Objects.nonNull(cachorro)) {
                System.out.println(cachorro);
            }
        }
    }




}
