package kiba.plasmids.proxy;

import kiba.plasmids.PPCreativeTab;
import kiba.plasmids.PracticalPlasmids;
import kiba.plasmids.registry.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	public static CreativeTabs CREATIVE_TAB;

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		CREATIVE_TAB = new PPCreativeTab();
	}
	
    @Override
    public void init(FMLPostInitializationEvent event){
        super.init(event);
    }
    @Override
    public void registerRenderers(PracticalPlasmids plasmids){
        ModItems.initModels();
    }

}


