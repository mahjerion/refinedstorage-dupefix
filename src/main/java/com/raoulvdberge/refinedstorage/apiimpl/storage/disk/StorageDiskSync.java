package com.raoulvdberge.refinedstorage.apiimpl.storage.disk;

import com.raoulvdberge.refinedstorage.api.storage.disk.IStorageDiskSync;
import com.raoulvdberge.refinedstorage.api.storage.disk.IStorageDiskSyncData;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class StorageDiskSync implements IStorageDiskSync {
    private static final int THROTTLE_MS = 500;

    private Map<UUID, IStorageDiskSyncData> data = new HashMap<>();
    private Map<UUID, Long> syncTime = new HashMap<>();

    @Nullable
    @Override
    public IStorageDiskSyncData getData(UUID id) {
        return data.get(id);
    }

    public void setData(UUID id, IStorageDiskSyncData data) {
        this.data.put(id, data);
    }

    @Override
    public void sendRequest(UUID id) {
        long lastSync = syncTime.getOrDefault(id, 0L);

        if (System.currentTimeMillis() - lastSync > THROTTLE_MS) {
            // TODO: Networking: RS.INSTANCE.network.sendToServer(new MessageStorageDiskSizeRequest(id));

            syncTime.put(id, System.currentTimeMillis());
        }
    }
}
