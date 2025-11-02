package java.lang;

// simple string model class only to test
public final class String implements java.io.Serializable, Comparable<String>, CharSequence {
    
    private final char[] value;

    public String() {
        this.value = new char[0];
    }

    public String(String original) {
        this.value = original.value;
    }

    public String(char[] value) {
        this.value = new char[value.length];
        System.arraycopy(value, 0, this.value, 0, value.length);
    }

    @Override
    public int length() {
        return value.length;
    }

    @Override
    public char charAt(int index) {
        return value[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        char[] newValue = new char[end - start];
        System.arraycopy(value, start, newValue, 0, end - start);
        return new String(newValue);
    }

    @Override
    public String toString() {
        return this;
    }

    @Override
    public int compareTo(String other) {
        int len1 = value.length;
        int len2 = other.value.length;
        int lim = Math.min(len1, len2);
        for (int k = 0; k < lim; k++) {
            if (value[k] != other.value[k]) {
                return value[k] - other.value[k];
            }
        }
        return len1 - len2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof String) {
            String other = (String) obj;
            if (value.length != other.value.length) return false;
            for (int i = 0; i < value.length; i++) if (value[i] != other.value[i]) return false;
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h = 0;
        for (int i = 0; i < value.length; i++)h = 31 * h + value[i];
        return h;
    }


    public static String getModelInfo() {
        return "JPF String Model - Successfully Loaded";
    }
}
