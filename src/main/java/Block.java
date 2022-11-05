import java.util.Date;

/**
 * 区块对象，区块主要拥有4个字段
 * 自己的哈希值，前一个区块的哈希值，区块所存储的数据，以及时间戳
 */
public class Block {
    //区块自己的哈希
    private String hash;

    //前一个区块的哈希
    private String preHash;

    //区块所存储的数据
    private String data;
    //时间
    private long timeStamp;

    //计算哈希的方法,将前一个区块的哈希加上时间戳加上数据送往sha256函数之后计算自己的哈希
    public String calHash() {
        String hash = sha256Util.applySha256(
                preHash + Long.toString(timeStamp)+ data
        );
        return hash;
    }

    //构造方法

    public Block( String preHash, String data) {
        this.preHash = preHash;
        this.data = data;
        this.timeStamp = new Date().getTime();
        this.hash = calHash();
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getPreHash() {
        return preHash;
    }

    public void setPreHash(String preHash) {
        this.preHash = preHash;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
