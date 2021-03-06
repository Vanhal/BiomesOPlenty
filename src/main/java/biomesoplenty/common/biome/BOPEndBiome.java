package biomesoplenty.common.biome;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.world.biome.BiomeGenBase;
import biomesoplenty.api.biome.BOPBiome;
import biomesoplenty.common.biome.decoration.BOPEndBiomeDecorator;
import biomesoplenty.common.biome.decoration.BOPNetherBiomeDecorator;

public class BOPEndBiome extends BOPBiome<BOPEndBiomeDecorator>
{
    public BOPEndBiome(int id)
    {
        super(id, BOPEndBiomeDecorator.class);

        this.setDisableRain();
        this.setTemperatureRainfall(2.0F, 0.0F);

        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();

        this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityEnderman.class, 10, 4, 4));
    }
    
    @SideOnly(Side.CLIENT)
    public int getSkyColorByTemp(float p_76731_1_)
    {
        return 0;
    }
}
