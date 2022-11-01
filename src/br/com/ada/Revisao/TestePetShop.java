package br.com.ada.Revisao;

public class TestePetShop {

    public static void main(String[] args) {

    Endereço end1 = new Endereço("Rua Elvio","27","09861-690","Assunção",Estado.SãoPaulo);
    Endereço end2 = new Endereço("Rua Alarme","10","09861-000","Orquideas",Estado.SãoPaulo);
    Endereço end3 = new Endereço("Rua Floresta","30","09861-100","Centro",Estado.SãoPaulo);

    Dono dono1 = new Dono("Ana",end1);
    dono1.setCpf( "409.927.638-43");
    dono1.setEmail("anacarolina@gmail.com");

    Dono dono2 = new Dono("Ivan", end2);
    dono2.setCpf("398.927.638-00");
    dono2.setEmail("ivancardoso@gmail.com");

    Dono dono3 = new Dono("Lucia", end3);
    dono3.setCpf("999.927.638-85");
    dono3.setEmail("Luciaguimaraes@gmail.com");

    Cachorro dog1 = new Cachorro("LordJames","YorkShire",8,dono1);
    Cachorro dog2 = new Cachorro("Caramelo","Viralata",10,null);
    Cachorro dog3 = new Cachorro("Kripto", "Super", 10, dono3);

    CachorroRepository cadastro = new CachorroRepository();
    cadastro.cadastrar(dog1);
    cadastro.cadastrar(dog2);
    cadastro.cadastrar(dog3);

    cadastro.mostraCadastroCachorros();




    }


}
