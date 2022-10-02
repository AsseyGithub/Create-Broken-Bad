package com.jetpacker06.CreateBrokenBad.register;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.SoundActions;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.jetpacker06.CreateBrokenBad.CreateBrokenBad.MOD_ID;

public class AllFluids {
    public static final ResourceLocation STILL = new ResourceLocation("block/water_still");
    public static final ResourceLocation FLOWING = new ResourceLocation("block/water_flow");
    public static final ResourceLocation OVERLAY = new ResourceLocation("block/water_overlay");
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, MOD_ID);
    private static final Supplier<? extends FluidType> fluid_properties = () -> new FluidType(FluidType.Properties.create()
            .temperature(300).sound(SoundActions.BUCKET_FILL, SoundEvents.BOTTLE_FILL).density(2).lightLevel(2).viscosity(5));

    //begin fluid 1
    public static final RegistryObject<FlowingFluid> LIQUID_METHAMPHETAMINE
            = FLUIDS.register("liquid_methamphetamine", () -> new ForgeFlowingFluid.Source(AllFluids.METHAMPHETAMINE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> METHAMPHETAMINE_FLOWING
            = FLUIDS.register("liquid_methamphetamine_flowing", () -> new ForgeFlowingFluid.Flowing(AllFluids.METHAMPHETAMINE_PROPERTIES));
    public static final RegistryObject<LiquidBlock> METHAMPHETAMINE_LIQUID_BLOCK = AllBlocks.BLOCKS.register("liquid_methamphetamine",
            () -> new LiquidBlock(() -> AllFluids.LIQUID_METHAMPHETAMINE.get(), BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100f).noLootTable()));
    public static final ForgeFlowingFluid.Properties METHAMPHETAMINE_PROPERTIES = new ForgeFlowingFluid.Properties(fluid_properties, () -> LIQUID_METHAMPHETAMINE.get(), () -> METHAMPHETAMINE_FLOWING.get());

    //begin fluid 2
    public static final RegistryObject<FlowingFluid> LIQUID_BLUE_METHAMPHETAMINE
            = FLUIDS.register("liquid_blue_methamphetamine", () -> new ForgeFlowingFluid.Source(AllFluids.BLUE_METHAMPHETAMINE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> BLUE_METHAMPHETAMINE_FLOWING
            = FLUIDS.register("liquid_blue_methamphetamine_flowing", () -> new ForgeFlowingFluid.Flowing(AllFluids.BLUE_METHAMPHETAMINE_PROPERTIES));
    public static final RegistryObject<LiquidBlock> BLUE_METHAMPHETAMINE_LIQUID_BLOCK = AllBlocks.BLOCKS.register("liquid_blue_methamphetamine",
            () -> new LiquidBlock(() -> AllFluids.LIQUID_BLUE_METHAMPHETAMINE.get(), BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100f).noLootTable()));
    public static final ForgeFlowingFluid.Properties BLUE_METHAMPHETAMINE_PROPERTIES = new ForgeFlowingFluid.Properties(fluid_properties, () -> LIQUID_BLUE_METHAMPHETAMINE.get(), () -> BLUE_METHAMPHETAMINE_FLOWING.get());

    //begin fluid 3
    public static final RegistryObject<FlowingFluid> METHYLAMINE
            = FLUIDS.register("methylamine", () -> new ForgeFlowingFluid.Source(AllFluids.METHYLAMINE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> METHYLAMINE_FLOWING
            = FLUIDS.register("methylamine_flowing", () -> new ForgeFlowingFluid.Flowing(AllFluids.METHYLAMINE_PROPERTIES));
    public static final RegistryObject<LiquidBlock> METHYLAMINE_LIQUID_BLOCK = AllBlocks.BLOCKS.register("methylamine",
            () -> new LiquidBlock(() -> AllFluids.METHYLAMINE.get(), BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100f).noLootTable()));
    public static final ForgeFlowingFluid.Properties METHYLAMINE_PROPERTIES  = new ForgeFlowingFluid.Properties(fluid_properties, () -> METHYLAMINE.get(), () -> METHYLAMINE_FLOWING.get());

    //begin fluid 4
    public static final RegistryObject<FlowingFluid> METHANOL
            = FLUIDS.register("methanol", () -> new ForgeFlowingFluid.Source(AllFluids.METHANOL_PROPERTIES));
    public static final RegistryObject<FlowingFluid> METHANOL_FLOWING
            = FLUIDS.register("methanol_flowing", () -> new ForgeFlowingFluid.Flowing(AllFluids.METHANOL_PROPERTIES));
    public static final RegistryObject<LiquidBlock> METHANOL_LIQUID_BLOCK = AllBlocks.BLOCKS.register("methanol",
            () -> new LiquidBlock(() -> AllFluids.METHANOL.get(), BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100f).noLootTable()));
    public static final ForgeFlowingFluid.Properties METHANOL_PROPERTIES = new ForgeFlowingFluid.Properties(fluid_properties, () -> METHANOL.get(), () -> METHANOL_FLOWING.get());

    //begin fluid 5
    public static final RegistryObject<FlowingFluid> HYDROGEN
            = FLUIDS.register("hydrogen", () -> new ForgeFlowingFluid.Source(AllFluids.HYDROGEN_PROPERTIES));
    public static final RegistryObject<FlowingFluid> HYDROGEN_FLOWING
            = FLUIDS.register("hydrogen_flowing", () -> new ForgeFlowingFluid.Flowing(AllFluids.HYDROGEN_PROPERTIES));
    public static final RegistryObject<LiquidBlock> HYDROGEN_LIQUID_BLOCK = AllBlocks.BLOCKS.register("hydrogen",
            () -> new LiquidBlock(() -> AllFluids.HYDROGEN.get(), BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100f).noLootTable()));
    public static final ForgeFlowingFluid.Properties HYDROGEN_PROPERTIES = new ForgeFlowingFluid.Properties(fluid_properties, () -> HYDROGEN.get(), () -> HYDROGEN_FLOWING.get());

    //begin fluid 6
    public static final RegistryObject<FlowingFluid> OXYGEN
            = FLUIDS.register("oxygen", () -> new ForgeFlowingFluid.Source(AllFluids.OXYGEN_PROPERTIES));
    public static final RegistryObject<FlowingFluid> OXYGEN_FLOWING
            = FLUIDS.register("oxygen_flowing", () -> new ForgeFlowingFluid.Flowing(AllFluids.OXYGEN_PROPERTIES));
    public static final RegistryObject<LiquidBlock> OXYGEN_LIQUID_BLOCK = AllBlocks.BLOCKS.register("oxygen",
            () -> new LiquidBlock(() -> AllFluids.OXYGEN.get(), BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100f).noLootTable()));
    public static final ForgeFlowingFluid.Properties OXYGEN_PROPERTIES = new ForgeFlowingFluid.Properties(fluid_properties, () -> OXYGEN.get(), () -> OXYGEN_FLOWING.get());

    //begin fluid 7
    public static final RegistryObject<FlowingFluid> AMMONIA
            = FLUIDS.register("ammonia", () -> new ForgeFlowingFluid.Source(AllFluids.AMMONIA_PROPERTIES));
    public static final RegistryObject<FlowingFluid> AMMONIA_FLOWING
            = FLUIDS.register("ammonia_flowing", () -> new ForgeFlowingFluid.Flowing(AllFluids.AMMONIA_PROPERTIES));
    public static final RegistryObject<LiquidBlock> AMMONIA_LIQUID_BLOCK = AllBlocks.BLOCKS.register("ammonia",
            () -> new LiquidBlock(() -> AllFluids.AMMONIA.get(), BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100f).noLootTable()));
    public static final ForgeFlowingFluid.Properties AMMONIA_PROPERTIES = new ForgeFlowingFluid.Properties(fluid_properties, () -> AMMONIA.get(), () -> AMMONIA_FLOWING.get());

    //begin fluid 8
    public static final RegistryObject<FlowingFluid> PHENYLACETIC_ACID
            = FLUIDS.register("phenylacetic_acid", () -> new ForgeFlowingFluid.Source(AllFluids.PHENYLACETIC_ACID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> PHENYLACETIC_ACID_FLOWING
            = FLUIDS.register("phenylacetic_acid_flowing", () -> new ForgeFlowingFluid.Flowing(AllFluids.PHENYLACETIC_ACID_PROPERTIES));
    public static final RegistryObject<LiquidBlock> PHENYLACETIC_ACID_LIQUID_BLOCK = AllBlocks.BLOCKS.register("phenylacitic_acid",
            () -> new LiquidBlock(() -> AllFluids.PHENYLACETIC_ACID.get(), BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100f).noLootTable()));
    public static final ForgeFlowingFluid.Properties PHENYLACETIC_ACID_PROPERTIES = new ForgeFlowingFluid.Properties(fluid_properties, () -> PHENYLACETIC_ACID.get(), () -> PHENYLACETIC_ACID_FLOWING.get());

    //begin fluid 9
    public static final RegistryObject<FlowingFluid> ACETIC_ANHYDRIDE
            = FLUIDS.register("acetic_anhydride", () -> new ForgeFlowingFluid.Source(AllFluids.ACETIC_ANHYDRIDE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> ACETIC_ANHYDRIDE_FLOWING
            = FLUIDS.register("acetic_anhydride_flowing", () -> new ForgeFlowingFluid.Flowing(AllFluids.ACETIC_ANHYDRIDE_PROPERTIES));
    public static final RegistryObject<LiquidBlock> ACETIC_ANHYDRIDE_LIQUID_BLOCK = AllBlocks.BLOCKS.register("acetic_anhydride",
            () -> new LiquidBlock(() -> AllFluids.ACETIC_ANHYDRIDE.get(), BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100f).noLootTable()));
    public static final ForgeFlowingFluid.Properties ACETIC_ANHYDRIDE_PROPERTIES = new ForgeFlowingFluid.Properties(fluid_properties, () -> ACETIC_ANHYDRIDE.get(), () -> ACETIC_ANHYDRIDE_FLOWING.get());

    //begin fluid 10
    public static final RegistryObject<FlowingFluid> PHENYLACETONE
            = FLUIDS.register("phenylacetone", () -> new ForgeFlowingFluid.Source(AllFluids.PHENYLACETONE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> PHENYLACETONE_FLOWING
            = FLUIDS.register("phenylacetone_flowing", () -> new ForgeFlowingFluid.Flowing(AllFluids.PHENYLACETONE_PROPERTIES));
    public static final RegistryObject<LiquidBlock> PHENYLACETONE_LIQUID_BLOCK = AllBlocks.BLOCKS.register("phenylacetone",
            () -> new LiquidBlock(() -> AllFluids.PHENYLACETONE.get(), BlockBehaviour.Properties.of(Material.WATER).noCollission().strength(100f).noLootTable()));
    public static final ForgeFlowingFluid.Properties PHENYLACETONE_PROPERTIES = new ForgeFlowingFluid.Properties(fluid_properties, () -> PHENYLACETONE.get(), () -> PHENYLACETONE_FLOWING.get());

    //end fluids
    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}