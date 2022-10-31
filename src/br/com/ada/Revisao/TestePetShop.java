package br.com.ada.Revisao;

public class TestePetShop {

    public static void main(String[] args) {

    Endereço end1 = new Endereço("Rua Elvio","27","09861-690","Assunção",Estado.SãoPaulo);
    Endereço end2 = new Endereço("Rua Alarme","10","09861-000","Orquideas",Estado.SãoPaulo);
    Endereço end3 = new Endereço("Rua Floresta","30","09861-100","Centro",Estado.SãoPaulo);

    Dono dono1 = new Dono("Ana", "409.927.638-43","anacarolina@gmail.com",end1);
    Dono dono2 = new Dono("Ivan", "398.927.638-00","ivancardoso@gmail.com",end2);
    Dono dono3 = new Dono("Lucia", "999.927.638-85","Luciaguimaraes@gmail.com",end3);

    Cachorro dog1 = new Cachorro("LordJames","YorkShire",8,dono1);
    Cachorro dog2 = new Cachorro("Caramelo","Viralata",10,null);

    CadastroCachorro cadastro = new CadastroCachorro();
    cadastro.cadastrar(dog1);
    cadastro.cadastrar(dog2);

    cadastro.mostraCadastroCachorros();




    }


}
