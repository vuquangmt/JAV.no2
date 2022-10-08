package assignment;

public class PhanSo {
    public int tuSo;
    public int mauSo;

    public PhanSo() {
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public void inPhanSo(){
        System.out.println(tuSo+"/"+mauSo);
    }

    public void rutGon(){
        int ucln = 1;
        for(int i= Math.min(Math.abs(tuSo),Math.abs(mauSo));i>1;i--){
            if(tuSo%i==0&& mauSo%i==0){
                ucln = i;
                break;
            }
        }
        setTuSo(tuSo/ucln);
        setMauSo(mauSo/ucln);
    }

    public void nghichDao(){
        int tmp = tuSo;
        tuSo = mauSo;
        mauSo = tmp;
    }

    public PhanSo add(PhanSo f){
        PhanSo tong = new PhanSo();
        tong.tuSo = this.tuSo*f.mauSo+ this.mauSo*f.tuSo;
        tong.mauSo = this.mauSo*f.mauSo;
//        tong.rutGon();
        return tong;
    }

    public PhanSo sub(PhanSo f){
        PhanSo hieu = new PhanSo();
        hieu.setTuSo(this.tuSo*f.mauSo - this.mauSo*f.tuSo);
        hieu.setMauSo(this.mauSo*f.mauSo);
        return hieu;
    }

    public void mul(){

    }

    public void div(){

    }
}
