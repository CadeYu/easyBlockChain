public class Test {
    public static void main(String[] args) {
       Block genesisBlock = new Block("0","我是创世区块");
        System.out.println("第一个区块的哈希是->" + genesisBlock.getHash());

        Block secondBlock = new Block(genesisBlock.getHash(), "我是第二个区块");
        System.out.println("第2个区块的哈希是->" + secondBlock.getHash());

        Block thirdBlock = new Block(secondBlock.getHash(), "我是第三个区块");
        System.out.println("第一个区块的哈希是->" + thirdBlock.getHash());
    }
}
