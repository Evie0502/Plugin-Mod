package KAMKEEL.PluginMod.Items.Weapons;

import KAMKEEL.PluginMod.Enum.Items.EnumToolMaterials;
import KAMKEEL.PluginMod.Items.PluginItemInterface;
import KAMKEEL.PluginMod.PluginMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;


public class ItemRotatedShield extends ItemShield{

	public ItemRotatedShield(int par1, EnumToolMaterials material) {
		super(par1,material);
	}

	@Override
	public void renderSpecial(){
		GL11.glScalef(0.6f, 0.6f,0.6f);
		GL11.glTranslatef(0.4f, 1f, -0.18f);
		GL11.glRotatef(-6, 0, 1, 0);
		GL11.glRotatef(120, 0, 0, 1);
	}
}

