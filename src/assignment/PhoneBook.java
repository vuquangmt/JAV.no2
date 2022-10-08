package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone{
    public ArrayList<PhoneNumber> PhoneList;

    public PhoneBook() {
        PhoneList = new ArrayList<>();
    }

    @Override
    void insertPhone(String name, String phone) {
        for(PhoneNumber p : PhoneList) {
            if(p.getName().equals(name)){
                if(p.getPhone().contains(phone)){
                    System.out.println("Liên lạc này đã tồn tại");
                    return;
                }
                // có tên nhưng chưa có số
                p.getPhone().add(phone);
                System.out.println("Đã thêm số "+phone+" vào liên lạc có sẵn");
                return;
            }
        }
        // neu ma ko co ten
        PhoneNumber pn = new PhoneNumber(name,phone);
        PhoneList.add(pn);
        System.out.println("Đã thêm "+name+" vào liên lạc");
    }

    @Override
    void removePhone(String name) {
        for(PhoneNumber p : PhoneList) {
            if(p.getName().equals(name)){
                PhoneList.remove(p);
            }
        }
//        for(int i=0;i<PhoneList.size();i++){
//            if(PhoneList.get(i).getName().equals(name)){
//                PhoneList.remove(i);
//            }
//        }
    }

    @Override
    void updatePhone(String name, String oldPhone, String newPhone) {
        for(PhoneNumber p : PhoneList) {
            if(p.getName().equals(name)){
                p.getPhone().remove(oldPhone);
                p.getPhone().add(newPhone);
            }
        }
    }

    @Override
    PhoneNumber searchPhone(String name) {
        for(PhoneNumber p : PhoneList) {
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }

    @Override
    void sort() {
        Collections.sort(PhoneList, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}