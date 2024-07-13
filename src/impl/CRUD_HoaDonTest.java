package impl;

import model.HoaDon_1;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class CRUD_HoaDonTest {
    CRUD_HoaDon crud_hoaDon = new CRUD_HoaDon();
    @Test
    public  void testHD1() {
        HoaDon_1 hoaDon_1 = new HoaDon_1();
        hoaDon_1.setNgayLap("4/04/2024");
        hoaDon_1.setIdNhanVien(1);
        hoaDon_1.setIdKhachHang(1);
        hoaDon_1.setIdPhieuGG(1);
        hoaDon_1.setIdDotGG(1);
        hoaDon_1.setIdPhuongThucTT(1);
        hoaDon_1.setTrangThai("Hoàn thành");
        hoaDon_1.setTongTien(500000);
        hoaDon_1.setSoTienGGCT(50000);
        hoaDon_1.setSoTienGGVC(100000);
        hoaDon_1.setThanhToan(450000);
        hoaDon_1.setTienKhachDua(450000);
        hoaDon_1.setTienThua(0);
        crud_hoaDon.create(hoaDon_1);
        assertEquals(38,crud_hoaDon.list().size());
    }

    @Test
    public  void testHD2() {
        HoaDon_1 hoaDon_1 = new HoaDon_1();

        hoaDon_1.setNgayLap("4/04/2024");
//        hoaDon_1.setIdNhanVien(1);
//        hoaDon_1.setIdKhachHang(1);
//        hoaDon_1.setIdPhieuGG(1);
//        hoaDon_1.setIdDotGG(1);
//        hoaDon_1.setIdPhuongThucTT(1);
        hoaDon_1.setTrangThai(null);
//        hoaDon_1.setTongTien(1);
//        hoaDon_1.setSoTienGGCT(1);
//        hoaDon_1.setSoTienGGVC(1);
//        hoaDon_1.setThanhToan(1);
//        hoaDon_1.setTienKhachDua(1);
//        hoaDon_1.setTienThua(0);
        crud_hoaDon.update(hoaDon_1);
        assertEquals(44,crud_hoaDon.list().size());
    }
    @Test
    public  void testHD12() {
        HoaDon_1 hoaDon_1 = new HoaDon_1();

        hoaDon_1.setNgayLap("06/04/2024");
        hoaDon_1.setIdNhanVien(-1);

        assertEquals(38,crud_hoaDon.list().size());
    }
    @Test
    public  void testHD222() {
        HoaDon_1 hoaDon_1 = new HoaDon_1();
        hoaDon_1.setIdHoaDon(1);

        hoaDon_1.setNgayLap("04-04-2024");
//        hoaDon_1.setIdNhanVien(1);
//        hoaDon_1.setIdKhachHang(1);
//        hoaDon_1.setIdPhieuGG(1);
//        hoaDon_1.setIdDotGG(1);
//        hoaDon_1.setIdPhuongThucTT(1);
//        hoaDon_1.setTrangThai("Hoàn thành");
//        hoaDon_1.setTongTien(500000);
//        hoaDon_1.setSoTienGGCT(50000);
//        hoaDon_1.setSoTienGGVC(100000);
//        hoaDon_1.setThanhToan(450000);
//        hoaDon_1.setTienKhachDua(450000);
//        hoaDon_1.setTienThua(0);
        crud_hoaDon.update(hoaDon_1);
        Assert.assertEquals("04/04/2024", crud_hoaDon.list().get(1).getNgayLap());
    }

    @Test
    public  void testHD22() {
        HoaDon_1 hoaDon_1 = new HoaDon_1();
        hoaDon_1.setIdHoaDon(-1);

        hoaDon_1.setGhiChi("hehehe");
//        hoaDon_1.setIdNhanVien(1);
//        hoaDon_1.setIdKhachHang(1);
//        hoaDon_1.setIdPhieuGG(1);
//        hoaDon_1.setIdDotGG(1);
//        hoaDon_1.setIdPhuongThucTT(1);
//        hoaDon_1.setTrangThai("Hoàn thành");
//        hoaDon_1.setTongTien(500000);
//        hoaDon_1.setSoTienGGCT(50000);
//        hoaDon_1.setSoTienGGVC(100000);
//        hoaDon_1.setThanhToan(450000);
//        hoaDon_1.setTienKhachDua(450000);
//        hoaDon_1.setTienThua(0);
        crud_hoaDon.update(hoaDon_1);
        Assert.assertEquals("hehehe", crud_hoaDon.list().get(0).getGhiChi());
    }
    @Test
    public  void testHD3() {
        HoaDon_1 hoaDon_1 = new HoaDon_1();
        hoaDon_1.setIdHoaDon(1);

        hoaDon_1.setIdNhanVien(2);
        crud_hoaDon.update(hoaDon_1);
        Assert.assertEquals("2", crud_hoaDon.list().get(1).getIdNhanVien());
    }
    @Test
    public  void testHD45() {
        HoaDon_1 hoaDon_1 = new HoaDon_1();
        hoaDon_1.setIdHoaDon(50);

        hoaDon_1.setNgayLap("4/04/2024");
        hoaDon_1.setIdNhanVien(2);
        hoaDon_1.setIdKhachHang(1);
        hoaDon_1.setIdPhieuGG(1);
        hoaDon_1.setIdDotGG(1);
        hoaDon_1.setIdPhuongThucTT(1);
        hoaDon_1.setTrangThai("Hoàn thành");
        hoaDon_1.setTongTien(500000);
        hoaDon_1.setSoTienGGCT(50000);
        hoaDon_1.setSoTienGGVC(100000);
        hoaDon_1.setThanhToan(450000);
        hoaDon_1.setTienKhachDua(450000);
        hoaDon_1.setTienThua(0);

        crud_hoaDon.update(hoaDon_1);
        Assert.assertEquals(0, crud_hoaDon.list().get(1).getIdNhanVien());
    }
    @Test
    public  void testHD4() {
        HoaDon_1 hoaDon_1 = new HoaDon_1();
        hoaDon_1.setIdHoaDon(1);

        hoaDon_1.setThanhToan(1);
        crud_hoaDon.update(hoaDon_1);
        Assert.assertEquals(0, crud_hoaDon.list().get(1).getIdPhuongThucTT());
    }


    @Test
    public  void testHD6() {
        HoaDon_1 hoaDon_1 = new HoaDon_1();
        hoaDon_1.setNgayLap("06/04/2024");
        hoaDon_1.setIdNhanVien(1);
        hoaDon_1.setIdKhachHang(1);
        hoaDon_1.setIdPhieuGG(1);
        hoaDon_1.setIdDotGG(1);
        hoaDon_1.setIdPhuongThucTT(333);
        hoaDon_1.setTrangThai("Hoàn thành");
        hoaDon_1.setTongTien(500000);
        hoaDon_1.setSoTienGGCT(50000);
        hoaDon_1.setSoTienGGVC(100000);
        hoaDon_1.setThanhToan(450000);
        hoaDon_1.setTienKhachDua(450000);
        hoaDon_1.setTienThua(0);
        crud_hoaDon.create(hoaDon_1);
        assertEquals(32,crud_hoaDon.list().size());
    }
    @Test
    public  void testHD66() {
        HoaDon_1 hoaDon_1 = new HoaDon_1();

        crud_hoaDon.update(hoaDon_1);
        assertEquals(32,crud_hoaDon.list().size());
    }
}