/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mutiara.dao;
import mutiara.model.Buku;
import java.util.ArrayList;
import java.util.List;
import mutiara.model.Anggota;
/**
 *
 * @author Mutiara Maharani
 */
public class BukuDaoImpl implements BukuDao{
    List<Buku> data = new ArrayList <>();
    
    public BukuDaoImpl(){
       data.add(new Buku("201","Filosofi hati","Khoirunnisa","Media utama"));
       data.add(new Buku("202","Cahaya ilahi","Annisa","Gramedia"));
       data.add(new Buku("203","Marahari","Boy candra","Sinar Dunia"));
   }
    
    @Override
    public Buku save(Buku buku){
        data.add(buku);
        return buku;
    }
    
    public void update(int index,Buku buku){
        data.set(index, buku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
         return data.get(index);
    }
    
    public  List<Buku> getAllBuku(){
        return data;
    }
}
