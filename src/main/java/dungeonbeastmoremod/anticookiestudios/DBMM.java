package dungeonbeastmoremod.anticookiestudios;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DBMM implements ModInitializer {

    public static final Item bucket_of_blood = new Item(new FabricItemSettings().group(ItemGroup.MISC));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("dbmm", "bucket_of_blood"), bucket_of_blood);
    }
}
