/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mutiara.dao;
import mutiara.model.Peminjaman;
import java.util.List;
import mutiara.dao.AnggotaDao;
import mutiara.dao.BukuDao;
/**
 *
 * @author Mutiara Maharani
 */
public interface PeminjamanDao {
    Peminjaman save (Peminjaman peminjaman);
    Peminjaman update (int index,Peminjaman peminjaman);
    Peminjaman delete (int index);
    Peminjaman getPeminjaman (int index);
    List <Peminjaman> getAllPeminjaman ();
}
