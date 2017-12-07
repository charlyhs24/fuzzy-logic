/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzy_logic;

/**
 *
 * @author charlyhsitumorang
 */
public class fungsi {
    double emosirendah=0;
    double emosisedang=0;
    double emositinggi=0;
    double tempya;
    double temptidak;
    
    double provokasirendah =0;
    double provokasisedang =0;
    double provokasitinggi =0;

    
    public void grafikemosi(int x){
//        System.out.println("nilai emosi rendah :"+emosirendah(x));
        emosirendah = emosirendah(x);
//        System.out.println("nilai emosi sedang :"+emosisedang(x));
        emosisedang = emosisedang(x);
//        System.out.println("nilai emosi tinggi :"+emositinggi(x));
        emositinggi = emositinggi(x);
    }
    public void grafikprovokasi(int x){
//        System.out.println("nilai provokasi rendah  : "+provokasirendah(x));
        provokasirendah = provokasirendah(x);
//        System.out.println("nilai provokasi sedang   : "+provokasisedang(x));
        provokasisedang = provokasisedang(x);
//        System.out.println("nilai provokasi tinggi  : "+provokasitinggi(x));
        provokasitinggi = provokasitinggi(x);
    }
    
    public double emosirendah(int x){
        //mengisi nilai grafik
        int c = 47;
        int d = 57;
        double result =0;
        if((c<x) && (x<=d)){
            result = (double) (d-x)/(d-c);
        }
        if((x<=c) && (x>0)){
            result = 1;
        }
        if(x>=d){
            result = 0;
        }
        
        return result;
    }
    
    public double emosisedang(int x){
        int a = 50;
        int b = 56;
        int c = 65;
        double result = 0;
        if((a<x)&& (x<=b)){
            result = (double) (x-a)/(b-a);
        }if((b<x) &&(x<=c)){
            result = (double) (c-x)/(c-b);
        }if((x<=a) &&(x>=c)){
            result = 0;
        }
        return result;
    }
    
    public double emositinggi(int x){
        int a = 67;
        int b = 84;
        double result = 0;
        if(x<=a){
            result = 0;
        }if((a<x) && (x<b)){
            result = (double) (x-a)/(b-a);
        }if(x>=b){
            result = 1;
        }
        return result;
    }
    
    public double provokasirendah(int x){
        int c =35;
        int d =46;
        double result=0;
        if((c<x) && (x<=d)){
            result = (double) (d-x)/(d-c);
        }
        if((x<=c) && (x>0)){
            result = 1;
        }
        if(x>=d){
            result = 0;
        }
        return result;
    }
    
    public double provokasisedang(int x){
        int a = 54;
        int b = 62;
        int c = 73;
        double result =0;
        if((a<x)&& (x<=b)){
            result = (double) (x-a)/(b-a);
        }if((b<x) &&(x<=c)){
            result = (double) (c-x)/(c-b);
        }if((x<=a) &&(x>=c)){
            result = 0;
        }
        return result;
    }
    
    public double provokasitinggi(int x){
        int a = 68;
        int b = 84;
        double result = 0;
        if(x<=a){
            result = 0;
        }if((a<x) &&(x<b)){
            result = (double) (x-a)/(b-a);
        }if(x>=b){
            result = 1;
        }
        return result;
    }
    
    public void nilaiya(){
        double tempya1 =0;
        double tempya2 =0;
        double tempya3 =0;
        double tempya4 =0;
      
        //jika emosi rendah provokasi tinggi maka ya
        if((emosirendah>0) && (provokasitinggi>0) ){
            if((emosirendah<provokasitinggi) || (emosirendah==provokasitinggi)){
           tempya1 = emosirendah;
//            System.out.println("ya"+tempya1);
        }else if(provokasitinggi<emosirendah){
           tempya1 = provokasitinggi;
//           System.out.println("ya"+tempya1);
            }
        }
        //jika emosi sedang provokasi tinggi maka ya
        if((emosisedang>0) && (provokasitinggi>0)){
            if((emosisedang<provokasitinggi) || (emosisedang==provokasitinggi)){
                tempya2 = emosisedang;
//                System.out.println("ya"+tempya2);
            }else if(provokasitinggi<emosisedang){
                tempya2 = provokasitinggi;
//                System.out.println("ya"+tempya2);
            }
        }
        //jika emosi tinggi provokasi tinggi maka ya
        if((emositinggi>0) && (provokasitinggi>0)){
            if((emositinggi<provokasitinggi) || (emositinggi==provokasitinggi)){
                tempya3 = emositinggi;
//                System.out.println("ya"+tempya3);
            }else if(provokasitinggi<emositinggi){
                tempya3 = provokasitinggi;
//                System.out.println("ya"+tempya3);
            }
        }
        //jika emosi tinggi provokasi sedang maka ya
        if((emositinggi>0)&& (provokasisedang>0)){
            if((emositinggi<provokasisedang) || (emositinggi==provokasisedang)){
                tempya4 = emositinggi;
//                System.out.println("yabangke"+tempya4);
            }else if(provokasisedang<emositinggi){
                tempya4 = provokasisedang;
//                System.out.println("ya"+tempya4);
            }
        }
        if((tempya1>=tempya2) && (tempya1>=tempya3) && (tempya1>=tempya4)){
            tempya = tempya1;
        }else if((tempya2>=tempya1) && (tempya2>=tempya3) && (tempya2>=tempya4)){
            tempya = tempya2;
        }else if((tempya3>=tempya1) && (tempya3>=tempya2) && (tempya3>=tempya4)){
            tempya = tempya3;
        }else if((tempya4>=tempya1) && (tempya4>=tempya2) && (tempya4>=tempya3)){
            tempya = tempya4;
        }
        
    }
    public void nilaitidak(){
        double temptidak1 =0;
        double temptidak2 =0;
        double temptidak3 =0;
        double temptidak4 =0;
        double temptidak5 =0;
        
        //JIKA EMOSI RENDAH PROVOKASI SEDANG MAKA TIDAK
        if((emosirendah>0)&& (provokasisedang>0)){
            if((emosirendah<provokasisedang) || (emosirendah == provokasitinggi)){
                temptidak1 = emosirendah;
//                System.out.println("tidak"+temptidak1);
            }else if(provokasisedang<emosirendah){
                temptidak1 = provokasisedang;
//                System.out.println("tidak"+temptidak1);
            }
        }
        
        //JIKA EMOSI SEDANG PROVOKASI SEDANG MAKA TIDAK
        if((emosisedang>0)&& (provokasisedang>0)){
            if((emosisedang<provokasisedang) || (emosisedang==provokasisedang)){
                temptidak2 = emosisedang;
//                System.out.println("tidak"+temptidak2);
            }else if(provokasisedang<emosisedang){
                temptidak2 = provokasisedang;
//                System.out.println("tidak"+temptidak2);
            }
        }
        
        //JIKA EMOSI RENDAH PROVOKASI RENDAH MAKA TIDAK/
        if((emosirendah>0)&& (provokasirendah>0)){
            if((emosirendah<provokasirendah)|| (emosirendah==provokasirendah)){
                temptidak3 = emosirendah;
//                System.out.println("tidak"+temptidak3);
            }else if(provokasirendah<emosirendah){
               temptidak3 = provokasirendah;
//                System.out.println("tidak"+temptidak3);
            }
        }
        
        //JIKA EMOSI SEDANG PROVOKASI RENDAH MAKA TIDAK/
        if((emosisedang>0)&& (provokasirendah>0)){
            if((emosisedang<provokasirendah)|| (emosisedang==provokasirendah)){
                temptidak4 = emosisedang;
//                System.out.println("tidak"+temptidak4);
            }else if(provokasirendah<emosisedang){
                temptidak4 = provokasirendah;
//                System.out.println("tidak"+temptidak4);
            }
        }
        
        //JIKA EMOSI TINGGI PROVOKASI RENDAH MAKA TIDAK/
        if((emositinggi>0) && (provokasirendah>0)){
            if((emositinggi<provokasirendah)|| (emositinggi==provokasirendah)){
                temptidak5 = emositinggi;
//                System.out.println("tidak"+temptidak5);
            }else if(provokasirendah<emositinggi){
                temptidak5 = provokasirendah;
//                System.out.println("tidak"+temptidak5);
            }
        }
        if((temptidak1>=temptidak2) && (temptidak1>=temptidak3) && (temptidak1>=temptidak4)&&(temptidak1>=temptidak5)){
            temptidak = temptidak1;
        }else if((temptidak2>=temptidak1) && (temptidak2>=temptidak3) && (temptidak2>=temptidak4)&&(temptidak2>=temptidak5)){
            temptidak = temptidak2;
        }else if((temptidak3>=temptidak1) && (temptidak3>=temptidak2) && (temptidak3>=temptidak4)&&(temptidak1>=temptidak5)){
            temptidak = temptidak3;
        }else if((temptidak4>=temptidak1) && (temptidak4>=temptidak2) && (temptidak4>=temptidak3)&&(temptidak4>=temptidak5)){
            temptidak = temptidak4;
        }else if((temptidak5>=temptidak1) && (temptidak5>=temptidak2) && (temptidak5>=temptidak3)&&(temptidak5>=temptidak4)){
            temptidak = temptidak5;
        }
    }
    
    public void inferensi(){
//        System.out.println("===========================================================");
//        System.out.println("===========================================================");
//        System.out.println("===================DATA INFERENSI==========================");
//        System.out.println("===========================================================");
//        System.out.println("");
//        
//        System.out.println("====================================");
//        System.out.println("==============NILAI TIDAK==========");
          nilaitidak();
//        System.out.println("====================================");
//        System.out.println("====================================");
//        System.out.println("");
//        
//        
//        System.out.println("====================================");
//        System.out.println("==============NILAI YA==============");
          nilaiya();
//        System.out.println("====================================");
//        System.out.println("====================================");
//        System.out.println("");
//        System.out.println("");
        
        
//        System.out.println("==============================================================");
//        System.out.println("=======================NILAI KELAYAKAN========================");
//        System.out.println("==============================================================");
//        System.out.println("ya ("+tempya+")");
//        System.out.println("tidak ("+temptidak+")");
//        System.out.println("");
        
        System.out.println("==============================================================");
        System.out.println("==============Defuzzyfication Weighted Average=================");
        System.out.println("==============================================================");
        defuzzyfication();
        System.out.println("===============================================================");
    }
    
    public void defuzzyfication(){
        double rumus1 = (temptidak*50)+(tempya*60);
        double rumus2 = (tempya+temptidak);
        double ystar = rumus1/rumus2;
        
        
        System.out.println("value YSTAR : "+ystar);
        //nilai batass ya atau tidak
        if(ystar>58){
            System.out.println("YA");
        }else if(ystar<=58){
            System.out.println("TIDAK");
        }
    }
    
    
    
    
    
    
    
    
}
