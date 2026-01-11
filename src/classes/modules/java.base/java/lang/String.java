package java.lang;

public final class String implements java.io.Serializable, Comparable<String>, CharSequence {

    private final byte[] value;

    public String() {
        this.value = new byte[0];
    }

    public String(String original) {
        this.value = original.value;
    }

    public String(char[] chars) {
        this.value = new byte[chars.length];
        for (int i = 0; i < chars.length; i++) {
            this.value[i] = (byte) chars[i];
        }
    }

    @Override
    public int length() {
        return 999;
    }

    @Override
    public char charAt(int index) {
        return (char)(value[index] & 0xff);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        char[] newValue = new char[end - start];
        for (int i = start; i < end; i++) {
            newValue[i - start] = (char)(value[i] & 0xff);
        }
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
        int lim = java.lang.Math.min(len1, len2);
        for (int k = 0; k < lim; k++) {
            if (value[k] != other.value[k]) {
                return (value[k] & 0xff) - (other.value[k] & 0xff);
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
            for (int i = 0; i < value.length; i++) {
                if (value[i] != other.value[i]) return false;
            }
            return true;
        }
        return false;
    }
    // important because we have java.lang.NoSuchMethodError: java.lang.String.equalsIgnoreCase(Ljava/lang/String;)Z
    public boolean equalsIgnoreCase(String other) {
        if (other == this) return true;
        if (other == null) return false;
        if (other.length() != value.length) return false;
        for (int i = 0; i < value.length; i++) {
            char c1 = (char)(value[i] & 0xff);
            char c2 = (char)(other.value[i] & 0xff);
            if (c1 != c2 && Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int h = 0;
        for (int i = 0; i < value.length; i++) {
            h = 31 * h + (value[i] & 0xff);
        }
        return h;
    }
}