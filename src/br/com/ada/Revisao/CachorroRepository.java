package br.com.ada.Revisao;

import java.util.Objects;

public class CachorroRepository {

    private static int qtd = Cachorro.getId();
    private static Cachorro[] cadastro = new Cachorro[qtd];

    public static void cadastrar(Cachorro cachorro) {
        if (cachorro.getDono() == null) {
            System.out.println("Existe um cachorro sem dono, não iremos incluir a lista.");
        } else {
            for (int i = 0; i < cadastro.length; i++) {
                if (Objects.isNull(cadastro[i])){
                cadastro[i] = cachorro;
                break;
            }
        }
    }}


    public void mostraCadastroCachorros() {
        System.out.println("-----------------CADASTRO DOGS--------------------");
        for (Cachorro cachorro : cadastro) {
            if (Objects.nonNull(cachorro)) {
                System.out.println(cachorro);
            }
        }
    }

}





