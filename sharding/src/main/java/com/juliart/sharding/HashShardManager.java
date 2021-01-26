package com.juliart.sharding;

public class HashShardManager extends ShardManager {

    @Override
    protected int storeData(Data data) {
        int shardId = allocateShard(data);

        Shard shard = shardMap.get(shardId);

        shard.storeData(data);

        return shardId;

    }

    @Override
    protected int allocateShard(final Data data){
        int shardCount = shardMap.size();
        var hash = data.getKey() % shardCount;

        return hash == 0 ? hash + shardCount : hash;
    }
}
