/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mutiara.controller;
import mutiara.dao.PeminjamanDaoImpl;
import mutiara.dao.AnggotaDaoImpl;
import mutiara.dao.BukuDaoImpl;
import mutiara.dao.PeminjamanDao;
import mutiara.dao.AnggotaDao;
import mutiara.dao.BukuDao;
import mutiara.model.Peminjaman;
import mutiara.model.Anggota;
import mutiara.model.Buku;
import mutiara.view.FormPeminjaman;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Mutiara Maharani
 */
public class PeminjamanController {
     private FormPeminjaman formPeminjaman;
    private PeminjamanDao peminjamanDao;
    private Peminjaman peminjaman;
    private AnggotaDao anggotaDao;
    private BukuDao bukuDao;
    
    public PeminjamanController (FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        peminjamanDao = new PeminjamanDaoImpl();
        anggotaDao = new AnggotaDaoImpl();
        bukuDao = new BukuDaoImpl();
    }
    public void bersihForm(){
        
        formPeminjaman.getTxtTglpinjam().setText("");
        formPeminjaman.getTxtTglkembali().setText("");
        
    }
    
    public void setCboNobp(){
        
        formPeminjaman.getCboNobp().removeAllItems();
        List<Anggota> list = anggotaDao.getAllAnggota();
        for (Anggota anggota : list){
            formPeminjaman.getCboNobp().addItem(anggota.getNobp()+"-"+anggota.getNama());
            
        }
        
    }
    
    public void setCboBuku(){
        
        formPeminjaman.getCboBuku().removeAllItems();
        List<Buku> list = bukuDao.getAllBuku();
        for (Buku buku : list){
            formPeminjaman.getCboBuku().addItem(buku.getKodebuku());
            
        }
        
    }
    
    
    
    
    public void savePeminjaman(){
        peminjaman = new Peminjaman();
        peminjaman.setCboNobp( formPeminjaman.getCboNobp().getSelectedItem().toString().split("-")[0]);
        peminjaman.setCboKodebuku( formPeminjaman.getCboBuku().getSelectedItem().toString());
        peminjaman.setTglpinjam( formPeminjaman.getTxtTglpinjam().getText());
        peminjaman.setTglkembali( formPeminjaman.getTxtTglkembali().getText());
        peminjamanDao.save(peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman,"Entri Ok");
    }
    public void getPeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if (peminjaman != null){
            List<Anggota> listAnggota = anggotaDao.getAllAnggota();
            for (Anggota anggota:listAnggota){
                if (peminjaman.getCboNobp()== anggota.getNobp()){
                    formPeminjaman.getCboNobp().setSelectedItem(anggota.getNobp()+"-" +anggota.getNama());
                    break;
                }
            }
            formPeminjaman.getCboBuku().setSelectedItem(peminjaman.getCboKodebuku());
            formPeminjaman.getTxtTglpinjam().setText(peminjaman.getTglpinjam());
            formPeminjaman.getTxtTglkembali().setText(peminjaman.getTglkembali());
        }
    }
    public void updatePeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        peminjaman.setCboNobp( formPeminjaman.getCboNobp().getSelectedItem().toString().split("-")[0]);
        peminjaman.setCboKodebuku( formPeminjaman.getCboBuku().getSelectedItem().toString().split("-")[0]);
        peminjaman.setTglpinjam( formPeminjaman.getTxtTglpinjam().getText());
        peminjaman.setTglkembali( formPeminjaman.getTxtTglkembali().getText());
        peminjamanDao.update(index,peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman,"Update Ok");
    }
    public void deletePeminjaman(){
         int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
         peminjamanDao.delete(index);
         javax.swing.JOptionPane.showMessageDialog(formPeminjaman,"Delete Ok");
    }
    public void tampilData(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel)formPeminjaman.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Peminjaman> list = peminjamanDao.getAllPeminjaman();
        for (Peminjaman peminjaman : list){
            Object[] data = {
                peminjaman.getCboNobp(),
                peminjaman.getCboKodebuku(),
                peminjaman.getTglpinjam(),
                peminjaman.getTglkembali()
            };
            tabelModel.addRow(data);
        }
    }
}
