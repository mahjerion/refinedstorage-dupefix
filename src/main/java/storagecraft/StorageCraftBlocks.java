package storagecraft;

import storagecraft.block.BlockCable;
import storagecraft.block.BlockController;
import storagecraft.block.BlockDrive;
import storagecraft.block.BlockExporter;
import storagecraft.block.BlockGrid;
import storagecraft.block.BlockImporter;
import storagecraft.block.BlockStorageProxy;

public class StorageCraftBlocks {
	public static final BlockController CONTROLLER = new BlockController();
	public static final BlockCable CABLE = new BlockCable();
	public static final BlockGrid GRID = new BlockGrid();
	public static final BlockDrive DRIVE = new BlockDrive();
	public static final BlockStorageProxy STORAGE_PROXY = new BlockStorageProxy();
	public static final BlockImporter IMPORTER = new BlockImporter();
	public static final BlockExporter EXPORTER = new BlockExporter();
}
