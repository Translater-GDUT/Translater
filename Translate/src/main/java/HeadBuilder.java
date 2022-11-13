
/**
 * 字符串构造表单数据
 */
public class HeadBuilder {
    private final StringBuilder sb = new StringBuilder();
    public void add(String name, Object value) {
        sb.append("&");
        sb.append(name);
        sb.append("=");
        sb.append(value);
    }
    @Override
    public String toString() {
        return sb.toString();
    }
}
