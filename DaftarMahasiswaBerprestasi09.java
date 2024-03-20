public class DaftarMahasiswaBerprestasi09 {
    Mahasiswa09 listMhs[] = new Mahasiswa09[5];
    int idx;

    //method tambah(),untuk menambahkan objek dari class mhs ke atribut list
    void tambah(Mahasiswa09 m){
        if (idx<listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }
    //method tampil(),untuk menampilkan semua data mhs yang ada dalam class tsb
    void tampil(){
        for (Mahasiswa09 m : listMhs) {
            m.tampil();
            System.out.println("---------------------");
        }
    }
    //untuk mengurutkan dari besar ke kecil 
    void bubbleSort(){
        for (int i=0; i<listMhs.length-1; i++) {
            for (int j=1; j<listMhs.length-i; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    //proses swap atau penukaran
                    Mahasiswa09 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
    //untuk mengurutkan dari kecil ke besar
    void selectionSort(){
        for(int i=0; i<listMhs.length-1; i++){
            int idxMin = i;
                for(int j=i+1; j<listMhs.length; j++){
                    if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                        idxMin=j;
                    }
                }
                //swap
                Mahasiswa09 tmp = listMhs[idxMin];
                listMhs[idxMin] = listMhs[i];
                listMhs[i] = tmp;
            }
        }
  
        void insertionSort(){
            for(int i = 1; i < listMhs.length; i++){
                Mahasiswa09 temp = listMhs[i];
                int j = i;
                //mengubah kondisi perbandingan untuk descending
                while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                    listMhs[j] = listMhs[j - 1];
                    j--;
                }
                listMhs[j] = temp;
            }
        }
    }
            

    
