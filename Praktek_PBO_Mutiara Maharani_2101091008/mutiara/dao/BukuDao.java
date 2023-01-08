/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mutiara.dao;
import mutiara.model.Buku;
import java.util.List;
import mutiara.model.Buku;
/**
 *
 * @author Mutiara Maharani
 */
public interface BukuDao {
    Buku save (Buku buku);
    void update(int index,Buku buku);
    void delete (int index); 
    Buku getBuku (int index);
    List <Buku> getAllBuku ();
}
