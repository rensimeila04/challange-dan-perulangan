package perulangan;

public class perulanganforeach {
    public static void main(String[] args) {
        
        // membuat array
        int angka[] = {3,1,42,24,12};
        
        //menggunakan perulangan for each untuk mnampilkan angka
        for( int x : angka) {
            System.out.println(x + " ");
        }
    }
    
}
