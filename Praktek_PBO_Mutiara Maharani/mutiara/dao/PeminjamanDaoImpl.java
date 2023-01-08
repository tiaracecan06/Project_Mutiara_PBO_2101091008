/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mutiara.dao;
import mutiara.dao.PeminjamanDao;
import mutiara.model.Peminjaman;
import java.util.ArrayList;
import java.util.List;
import mutiara.dao.AnggotaDao;
import mutiara.dao.BukuDao;
/**
 *
 * @author Mutiara Maharani
 */
public class PeminjamanDaoImpl implements PeminjamanDao{
     List<Peminjaman> data = new ArrayList <>();

    public PeminjamanDaoImpl() {
        data.add(new Peminjaman("2101091001","1112","12 Januari 2022","20 Januari 2022"));
        data.add(new Peminjaman("2101091008","1113","12 Februari 2022","20 Februari 2022"));
        data.add(new Peminjaman("2101091007","1114","12 Maret 2022","20 Maret 2022"));
    }
    
    
    @Override
    public Peminjaman save(Peminjaman peminjaman){
        data.add(peminjaman);
        return peminjaman;
    }
    
    public  Peminjaman update(int index,Peminjaman peminjaman){
        data.set(index , peminjaman);
        return peminjaman;
    }
    
    public Peminjaman delete(int index){
        return data.remove(index);
    }
    
    public Peminjaman getPeminjaman(int index){
         return data.get(index);
    }
    
    public  List<Peminjaman> getAllPeminjaman(){
        return data;
    }
}
