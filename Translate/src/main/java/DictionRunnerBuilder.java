
import java.awt.Color;

public class DictionRunnerBuilder {
    /**
     * 采用的OCR
     */
    private final Ocr ocr;
    /**
     * 采用的翻译
     */
    private final Translator dic;
    /**
     * 延时
     */
    private final int delay;
    /**
     * 字幕透明度设置
     */
    private final boolean isTransparent;
    /**
     * 字幕颜色
     */
    private final Color color;
    /*
     * 构造函数初始化
     */
    DictionRunnerBuilder(Ocr ocr,Translator dic,int delay,boolean isTransparent,Color wordColor){
        this.ocr = ocr;
        this.dic = dic;
        this.delay = delay;
        this.isTransparent = isTransparent;
        this.color = wordColor;
    }

    public Runnable getRunnable() {
        ScreenShoter shoter = new ScreenShoter();
        shoter.check();
        return new DictionaryRunner(this.ocr,
                this.dic,
                shoter,
                this.delay,
                this.isTransparent,
                this.color) ;
    }
}
