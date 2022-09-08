package baitap.buoi6;

public class quanLyThuVien {
    private theMuonSach[] quanLyThuVienarr;

    public theMuonSach[] getQuanLyThuVienarr() {
        return quanLyThuVienarr;
    }

    public void setQuanLyThuVienarr(theMuonSach[] quanLyThuVienarr) {
        this.quanLyThuVienarr = quanLyThuVienarr;
    }

    private int coutthemuon =0;
    public quanLyThuVien(){
        this.quanLyThuVienarr = new theMuonSach[100];
    }
    public void muonSach(theMuonSach themuonsach){
        for(int i=0; i<=coutthemuon; i++){
            if(quanLyThuVienarr[i] == null){
                quanLyThuVienarr[i] = themuonsach;
                coutthemuon++;
                break;
            }
        }
    }



}
