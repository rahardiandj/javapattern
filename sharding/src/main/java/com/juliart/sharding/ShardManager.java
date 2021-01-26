package com.juliart.sharding;

import java.util.HashMap;
import java.util.Map;

public abstract class ShardManager {

    protected Map<Integer, Shard> shardMap;

    public ShardManager() {
        shardMap = new HashMap<>();
    }

    public boolean addNewShard(Shard shard) {
        if (!shardMap.containsKey(shard.getId())) {
            shardMap.put(shard.getId(), shard);
            return true;
        }
        return false;
    }

    public boolean removeShard(Shard shard) {
        if (shardMap.containsKey(shard.getId())) {
            shardMap.remove(shard.getId());
            return false;
        }
        return true;
    }

    protected abstract int storeData(final Data data);

    protected abstract int allocateShard(final Data data);

}
