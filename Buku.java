public class Buku {
    private String idbuku ;
    private String namabuku ;

    public Buku(String idbuku, String namabuku){
        this.idbuku = idbuku;
        this.namabuku = namabuku;

    }

    protected String getidbuku(){
        return this.idbuku;
    }
    protected String getnamabuku(){
        return this.namabuku;
    }
}
