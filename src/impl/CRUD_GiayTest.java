package impl;

import model.Giay;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CRUD_GiayTest {
    CRUD_Giay Service = new CRUD_Giay();

    @Test
    public void TestAdd8() {
        Giay giay = new Giay();
        giay.setTenGiay("Giay test 1");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(2);
        giay.setIdChatLieu(3);
        giay.setIdKieuDe(4);
        giay.setIdKieuMui(4);
        giay.setIdLopLot(3);
        Service.create(giay);
        assertEquals(30,Service.getlist().size());
    }

    @Test (expected = NullPointerException.class)
    public void TestAdd9() {
        Giay giay = new Giay();
        giay.setTenGiay("Giay test 2 ");
        giay.setIdXuatXu(6);
        giay.setIdDanhMuc(2);
        giay.setIdChatLieu(2);
        giay.setIdKieuDe(2);
        giay.setIdKieuMui(2);
        giay.setIdLopLot(2);
        Service.create(giay);
    }
    @Test (expected = NullPointerException.class)
    public void TestAdd10() {
        Giay giay = new Giay();
        giay.setTenGiay("Giay test 0");
        giay.setIdXuatXu(0);
        giay.setIdDanhMuc(2);
        giay.setIdChatLieu(2);
        giay.setIdKieuDe(2);
        giay.setIdKieuMui(2);
        giay.setIdLopLot(2);
        Service.create(giay);
    }

    @Test (expected = NullPointerException.class)
    public void Test11() {
        Giay giay = new Giay();
        giay.setTenGiay(null);
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(2);
        giay.setIdChatLieu(2);
        giay.setIdKieuDe(2);
        giay.setIdKieuMui(2);
        giay.setIdLopLot(2);
        Service.create(giay);
        assertEquals(30,Service.getlist().size());
    }
    @Test (expected = NullPointerException.class)
    public void Test12() {
        Giay giay = new Giay();
        giay.setTenGiay("dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(2);
        giay.setIdChatLieu(2);
        giay.setIdKieuDe(2);
        giay.setIdKieuMui(2);
        giay.setIdLopLot(2);
        Service.create(giay);
        assertEquals(30,Service.getlist().size());
    }

    @Test (expected = NullPointerException.class)
    public void TestAdd13() {
        Giay giay = new Giay();
        giay.setTenGiay("Giay test 1 ");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(99);
        giay.setIdChatLieu(2);
        giay.setIdKieuDe(2);
        giay.setIdKieuMui(2);
        giay.setIdLopLot(2);
        Service.create(giay);
    }
    @Test (expected = NullPointerException.class)
    public void TestAdd14() {
        Giay giay = new Giay();
        giay.setTenGiay("Giay test 1 ");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(0);
        giay.setIdChatLieu(2);
        giay.setIdKieuDe(2);
        giay.setIdKieuMui(2);
        giay.setIdLopLot(2);
        Service.create(giay);
    }
    @Test (expected = NullPointerException.class)
    public void TestAdd15() {
        Giay giay = new Giay();
        giay.setTenGiay("Giay test 1 ");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(-1);
        giay.setIdChatLieu(2);
        giay.setIdKieuDe(2);
        giay.setIdKieuMui(2);
        giay.setIdLopLot(2);
        Service.create(giay);
    }

    @Test (expected = NullPointerException.class)
    public void TestAdd16() {
        Giay giay = new Giay();
        giay.setTenGiay("Giay test 1 ");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(-99);
        giay.setIdChatLieu(2);
        giay.setIdKieuDe(2);
        giay.setIdKieuMui(2);
        giay.setIdLopLot(2);
        Service.create(giay);
    }
    @Test (expected = NullPointerException.class)
    public void TestAdd17() {
        Giay giay = new Giay();
        giay.setTenGiay("Giay test 1 ");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(3);
        giay.setIdChatLieu(99);
        giay.setIdKieuDe(2);
        giay.setIdKieuMui(2);
        giay.setIdLopLot(2);
        Service.create(giay);
    }
    @Test (expected = NullPointerException.class)
    public void TestAdd18() {
        Giay giay = new Giay();
        giay.setTenGiay("Giay test 1 ");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(3);
        giay.setIdChatLieu(0);
        giay.setIdKieuDe(2);
        giay.setIdKieuMui(2);
        giay.setIdLopLot(2);
        Service.create(giay);
    }
    @Test (expected = NullPointerException.class)
    public void TestAdd19() {
        Giay giay = new Giay();
        giay.setTenGiay("Giay test 1 ");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(3);
        giay.setIdChatLieu(-1);
        giay.setIdKieuDe(2);
        giay.setIdKieuMui(2);
        giay.setIdLopLot(2);
        Service.create(giay);
    }

    @Test (expected = NullPointerException.class)
    public void TestAdd20() {
        Giay giay = new Giay();
        giay.setTenGiay("Giay test 1 ");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(3);
        giay.setIdChatLieu(-99);
        giay.setIdKieuDe(2);
        giay.setIdKieuMui(2);
        giay.setIdLopLot(2);
        Service.create(giay);
    }

    @Test (expected = NullPointerException.class)
    public void TestAdd21() {
        Giay giay = new Giay();
        giay.setTenGiay("Giay test 1 ");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(3);
        giay.setIdChatLieu(4);
        giay.setIdKieuDe(200);
        giay.setIdKieuMui(2);
        giay.setIdLopLot(2);
        Service.create(giay);
    }

    @Test (expected = NullPointerException.class)
    public void TestAdd22() {
        Giay giay = new Giay();
        giay.setTenGiay("Giay test 1 ");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(3);
        giay.setIdChatLieu(4);
        giay.setIdKieuDe(0);
        giay.setIdKieuMui(2);
        giay.setIdLopLot(2);
        Service.create(giay);
    }

    @Test (expected = NullPointerException.class)
    public void TestAdd23() {
        Giay giay = new Giay();
        giay.setTenGiay("Giay test 1 ");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(3);
        giay.setIdChatLieu(4);
        giay.setIdKieuDe(-1);
        giay.setIdKieuMui(2);
        giay.setIdLopLot(2);
        Service.create(giay);
    }


    @Test (expected = NullPointerException.class)
    public void TestAdd24() {
        Giay giay = new Giay();
        giay.setTenGiay("Giay test 1 ");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(3);
        giay.setIdChatLieu(4);
        giay.setIdKieuDe(-99);
        giay.setIdKieuMui(2);
        giay.setIdLopLot(2);
        Service.create(giay);
    }

    @Test
    public void TestUpdate24() {
        Giay giay = new Giay();
        giay.setIdGiay(1);

        giay.setTenGiay("hohoho");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(1);
        giay.setIdChatLieu(1);
        giay.setIdKieuDe(1);
        giay.setIdKieuMui(1);
        giay.setIdLopLot(1);
        giay.setIdXuatXu(1);
        giay.setIdKieuDe(1);

        Service.update(giay);
        Assert.assertEquals("hohoho", Service.getlist().get(0).getTenGiay());

    }

    @Test
    public void TestUpdate25() {
        Giay giay = new Giay();
        giay.setIdGiay(-1);

        giay.setTenGiay("hohoho");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(1);
        giay.setIdChatLieu(1);
        giay.setIdKieuDe(1);
        giay.setIdKieuMui(1);
        giay.setIdLopLot(1);
        giay.setIdXuatXu(1);
        giay.setIdKieuDe(1);

        Service.update(giay);
        Assert.assertFalse("ID khong ton tai", true);

    }

    @Test
    public void TestUpdate26() {
        Giay giay = new Giay();
        giay.setIdGiay(1000);

        giay.setTenGiay("hohoho");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(1);
        giay.setIdChatLieu(1);
        giay.setIdKieuDe(1);
        giay.setIdKieuMui(1);
        giay.setIdLopLot(1);
        giay.setIdXuatXu(1);
        giay.setIdKieuDe(1);
        Service.update(giay);
        Assert.assertFalse("ID khong ton tai", true);

    }
    @Test
    public void TestUpdate27() {
        Giay giay = new Giay();
        giay.setIdGiay(1);

        giay.setTenGiay("hohoho");
        giay.setIdXuatXu(90);
        giay.setIdDanhMuc(1);
        giay.setIdChatLieu(1);
        giay.setIdKieuDe(1);
        giay.setIdKieuMui(1);
        giay.setIdLopLot(1);
        giay.setIdXuatXu(1);
        giay.setIdKieuDe(1);
        Service.update(giay);
        Assert.assertEquals(false, Service.getlist().get(0).getIdXuatXu());

    }

    @Test
    public void TestUpdate28() {
        Giay giay = new Giay();
        giay.setIdGiay(1);

        giay.setTenGiay("hohoho");
        giay.setIdXuatXu(-10);
        giay.setIdDanhMuc(1);
        giay.setIdChatLieu(1);
        giay.setIdKieuDe(1);
        giay.setIdKieuMui(1);
        giay.setIdLopLot(1);
        giay.setIdXuatXu(1);
        giay.setIdKieuDe(1);
        Service.update(giay);
        Assert.assertEquals(false, Service.getlist().get(0).getIdXuatXu());

    }

    @Test
    public void TestUpdate29() {
        Giay giay = new Giay();
        giay.setIdGiay(1);

        giay.setTenGiay("hohoho");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(20);
        giay.setIdChatLieu(1);
        giay.setIdKieuDe(1);
        giay.setIdKieuMui(1);
        giay.setIdLopLot(1);
        giay.setIdXuatXu(1);
        giay.setIdKieuDe(1);
        Service.update(giay);
        Assert.assertEquals(false, Service.getlist().get(0).getIdDanhMuc());

    }

    @Test
    public void TestUpdate30() {
        Giay giay = new Giay();
        giay.setIdGiay(1);

        giay.setTenGiay("hohoho");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(-1);
        giay.setIdChatLieu(1);
        giay.setIdKieuDe(1);
        giay.setIdKieuMui(1);
        giay.setIdLopLot(1);
        giay.setIdXuatXu(1);
        giay.setIdKieuDe(1);
        Service.update(giay);
        Assert.assertEquals(false, Service.getlist().get(0).getIdDanhMuc());

    }

    @Test
    public void TestUpdate31() {
        Giay giay = new Giay();
        giay.setIdGiay(1);

        giay.setTenGiay("hohoho");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(100);
        giay.setIdChatLieu(1);
        giay.setIdKieuDe(1);
        giay.setIdKieuMui(1);
        giay.setIdLopLot(1);
        giay.setIdXuatXu(1);
        giay.setIdKieuDe(1);
        Service.update(giay);
        Assert.assertEquals(false, Service.getlist().get(1).getIdDanhMuc());

    }

    @Test
    public void TestUpdate32() {
        Giay giay = new Giay();
        giay.setIdGiay(1);

        giay.setTenGiay("hohoho");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(100);
        giay.setIdChatLieu(1);
        giay.setIdKieuDe(1);
        giay.setIdKieuMui(1);
        giay.setIdLopLot(1);
        giay.setIdXuatXu(1);
        giay.setIdKieuDe(1);
        Service.update(giay);
        Assert.assertEquals(false, Service.getlist().get(0).getIdDanhMuc());

    }

    @Test
    public void TestUpdate33() {
        Giay giay = new Giay();
        giay.setIdGiay(1);

        giay.setTenGiay("hohoho");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(15);
        giay.setIdChatLieu(1);
        giay.setIdKieuDe(1);
        giay.setIdKieuMui(1);
        giay.setIdLopLot(1);
        giay.setIdXuatXu(1);
        giay.setIdKieuDe(1);
        Service.update(giay);
        Assert.assertEquals(false, Service.getlist().get(0).getIdDanhMuc());

    }

    @Test
    public void TestUpdate34() {
        Giay giay = new Giay();
        giay.setIdGiay(1);

        giay.setTenGiay("hohoho");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(2);
        giay.setIdChatLieu(90);
        giay.setIdKieuDe(1);
        giay.setIdKieuMui(1);
        giay.setIdLopLot(1);
        giay.setIdXuatXu(1);
        giay.setIdKieuDe(1);
        Service.update(giay);
        Assert.assertEquals(false, Service.getlist().get(0).getIdChatLieu());

    }

    @Test
    public void TestUpdate35() {
        Giay giay = new Giay();
        giay.setIdGiay(1);

        giay.setTenGiay("hohoho");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(2);
        giay.setIdChatLieu(-1);
        giay.setIdKieuDe(1);
        giay.setIdKieuMui(1);
        giay.setIdLopLot(1);
        giay.setIdXuatXu(1);
        giay.setIdKieuDe(1);
        Service.update(giay);
        Assert.assertEquals(false, Service.getlist().get(0).getIdChatLieu());

    }

    @Test
    public void TestUpdate36() {
        Giay giay = new Giay();
        giay.setIdGiay(1);

        giay.setTenGiay("hohoho");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(2);
        giay.setIdChatLieu(9999999);
        giay.setIdKieuDe(1);
        giay.setIdKieuMui(1);
        giay.setIdLopLot(1);
        giay.setIdXuatXu(1);
        giay.setIdKieuDe(1);
        Service.update(giay);
        Assert.assertEquals(false, Service.getlist().get(0).getIdChatLieu());

    }

    @Test
    public void TestUpdate37() {
        Giay giay = new Giay();
        giay.setIdGiay(1);

        giay.setTenGiay("hohoho");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(2);
        giay.setIdChatLieu(2);
        giay.setIdKieuDe(-10);
        giay.setIdKieuMui(1);
        giay.setIdLopLot(1);
        giay.setIdXuatXu(1);
        giay.setIdKieuDe(1);
        Service.update(giay);
        Assert.assertEquals(false, Service.getlist().get(1).getIdKieuDe());

    }

    @Test
    public void TestUpdate38() {
        Giay giay = new Giay();
        giay.setIdGiay(1);

        giay.setTenGiay("hohoho");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(2);
        giay.setIdChatLieu(2);
        giay.setIdKieuDe(2);
        giay.setIdKieuMui(6);
        giay.setIdLopLot(1);
        giay.setIdXuatXu(1);
        giay.setIdKieuDe(1);
        Service.update(giay);
        Assert.assertEquals(false, Service.getlist().get(1).getIdKieuMui());

    }

    @Test
    public void TestUpdate39() {
        Giay giay = new Giay();
        giay.setIdGiay(1);

        giay.setTenGiay("hohoho");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(2);
        giay.setIdChatLieu(2);
        giay.setIdKieuDe(2);
        giay.setIdKieuMui(-1);
        giay.setIdLopLot(1);
        giay.setIdXuatXu(1);
        giay.setIdKieuDe(1);
        Service.update(giay);
        Assert.assertEquals(false, Service.getlist().get(1).getIdKieuMui());

    }
    @Test
    public void TestUpdate40() {
        Giay giay = new Giay();
        giay.setIdGiay(1);

        giay.setTenGiay("hohoho");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(2);
        giay.setIdChatLieu(2);
        giay.setIdKieuDe(2);
        giay.setIdKieuMui(-50);
        giay.setIdLopLot(1);
        giay.setIdXuatXu(1);
        giay.setIdKieuDe(1);
        Service.update(giay);
        Assert.assertEquals(false, Service.getlist().get(1).getIdKieuMui());

    }
    @Test
    public void TestUpdate41() {
        Giay giay = new Giay();
        giay.setIdGiay(1);

        giay.setTenGiay("hohoho");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(2);
        giay.setIdChatLieu(2);
        giay.setIdKieuDe(2);
        giay.setIdKieuMui(2);
        giay.setIdLopLot(-1);
        giay.setIdXuatXu(1);
        giay.setIdKieuDe(1);
        Service.update(giay);
        Assert.assertEquals(false, Service.getlist().get(1).getIdLopLot());

    }

    @Test
    public void TestUpdate42() {
        Giay giay = new Giay();
        giay.setIdGiay(1);

        giay.setTenGiay("hohoho");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(2);
        giay.setIdChatLieu(2);
        giay.setIdKieuDe(2);
        giay.setIdKieuMui(2);
        giay.setIdLopLot(90);
        giay.setIdXuatXu(1);
        giay.setIdKieuDe(1);
        Service.update(giay);
        Assert.assertEquals(false, Service.getlist().get(1).getIdLopLot());

    }

    @Test
    public void TestUpdate43() {
        Giay giay = new Giay();
        giay.setIdGiay(1);

        giay.setTenGiay("hohoho");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(2);
        giay.setIdChatLieu(2);
        giay.setIdKieuDe(2);
        giay.setIdKieuMui(2);
        giay.setIdLopLot(5);
        giay.setIdXuatXu(1);
        giay.setIdKieuDe(1);
        Service.update(giay);
        Assert.assertEquals(false, Service.getlist().get(1).getIdLopLot());

    }

    @Test
    public void TestUpdate44() {
        Giay giay = new Giay();
        giay.setIdGiay(2);

        giay.setTenGiay("id 2");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(2);
        giay.setIdChatLieu(2);
        giay.setIdKieuDe(2);
        giay.setIdKieuMui(2);
        giay.setIdLopLot(1);
        giay.setIdXuatXu(1);
        giay.setIdKieuDe(1);
        Service.update(giay);
        Assert.assertTrue(true);

    }
    @Test
    public void TestUpdate45() {
        Giay giay = new Giay();
        giay.setIdGiay(3);

        giay.setTenGiay("id 3");
        giay.setIdXuatXu(1);
        giay.setIdDanhMuc(2);
        giay.setIdChatLieu(2);
        giay.setIdKieuDe(2);
        giay.setIdKieuMui(2);
        giay.setIdLopLot(3);
        giay.setIdXuatXu(3);
        giay.setIdKieuDe(4);
        Service.update(giay);
        Assert.assertTrue(true);

    }


}