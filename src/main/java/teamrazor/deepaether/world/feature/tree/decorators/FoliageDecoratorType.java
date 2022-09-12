package teamrazor.deepaether.world.feature.tree.decorators;

import com.mojang.serialization.Codec;
import net.minecraft.world.level.levelgen.feature.treedecorators.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import teamrazor.deepaether.DeepAetherMod;

public class FoliageDecoratorType<P extends TreeDecorator> extends TreeDecoratorType{

    public static final DeferredRegister<TreeDecoratorType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.TREE_DECORATOR_TYPES, DeepAetherMod.MODID);

    public static final RegistryObject<TreeDecoratorType<FlowerDecorator>> FLOWERS = register("flowers", FlowerDecorator.CODEC);
    private final Codec<P> codec;

    private static <P extends TreeDecorator> RegistryObject<TreeDecoratorType<P>> register(String p_70053_, Codec<P> p_70054_) {
        return REGISTRY.register(p_70053_, () -> new TreeDecoratorType<>(p_70054_));
    }

    public FoliageDecoratorType(Codec<P> p_70050_) {
        super(p_70050_);
        this.codec = p_70050_;
    }

    public Codec<P> codec() {
        return this.codec;
    }
}