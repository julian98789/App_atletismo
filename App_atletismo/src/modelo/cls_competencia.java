
package modelo;


public class cls_competencia {
    private float flt_step1;
    private float flt_step2;
    private float flt_step3;
    private float flt_step4;
    private float flt_step5;
    private float flt_total;
    private String str_id;
    
    public cls_competencia (float st1, float st2,float st3,float st4,float st5,String id ){
        this.flt_step1 = st1;
        this.flt_step2 = st2;
        this.flt_step3 = st3;
        this.flt_step4 = st4;
        this.flt_step5 = st5;
        this.str_id = id;
    }

    public float getFlt_step1() {
        return flt_step1;
    }

    public void setFlt_step1(float flt_step1) {
        this.flt_step1 = flt_step1;
    }

    public float getFlt_step2() {
        return flt_step2;
    }

    public void setFlt_step2(float flt_step2) {
        this.flt_step2 = flt_step2;
    }

    public float getFlt_step3() {
        return flt_step3;
    }

    public void setFlt_step3(float flt_step3) {
        this.flt_step3 = flt_step3;
    }

    public float getFlt_step4() {
        return flt_step4;
    }

    public void setFlt_step4(float flt_step4) {
        this.flt_step4 = flt_step4;
    }

    public float getFlt_step5() {
        return flt_step5;
    }

    public void setFlt_step5(float flt_step5) {
        this.flt_step5 = flt_step5;
    }

    public float getFlt_total() {
        return flt_total;
    }

    public void setFlt_total(float flt_total) {
        this.flt_total = flt_total;
    }

    public String getStr_id() {
        return str_id;
    }

    public void setStr_id(String str_id) {
        this.str_id = str_id;
    }
    
}
