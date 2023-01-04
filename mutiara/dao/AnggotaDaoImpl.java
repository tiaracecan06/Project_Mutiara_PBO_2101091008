/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mutiara.dao;
import mutiara.model.Anggota;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Mutiara Maharani
 */
public class AnggotaDaoImpl implements AnggotaDao {
   List<Anggota> data = new ArrayList <>();
   
   public AnggotaDaoImpl(){
       data.add(new Anggota("1111","Ali","Padang"));
       data.add(new Anggota("1112","Mutiara","Padang panjang"));
       data.add(new Anggota("1113","Ani","Padang"));
   }
    
    @Override
    public Anggota save(Anggota anggota){
        data.add(anggota);
        return anggota;
    }
    
    public  Anggota update(int index,Anggota anggota){
        data.set(index , anggota);
        return anggota;
    }

    public Anggota delete(int index){
        return data.remove(index);
    }
    
    public Anggota getAnggota(int index){
         return data.get(index);
    }
    
    public  List<Anggota> getAllAnggota(){
        return data;
    }
}
