package com.jetpacker06.CreateBrokenBad.advancements;

import com.google.gson.JsonObject;
import com.jetpacker06.CreateBrokenBad.CreateBrokenBad;
import net.minecraft.advancements.critereon.AbstractCriterionTriggerInstance;
import net.minecraft.advancements.critereon.DeserializationContext;
import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.advancements.critereon.SimpleCriterionTrigger;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import org.jetbrains.annotations.NotNull;

import javax.annotation.ParametersAreNonnullByDefault;

public class BrassCallBellAdvancementTrigger extends SimpleCriterionTrigger<BrassCallBellAdvancementTrigger.TriggerInstance> {

    private static final ResourceLocation ID = new ResourceLocation(CreateBrokenBad.MOD_ID, "use_brass_call_bell");

    public @NotNull ResourceLocation getId() {
        return ID;
    }

    public void trigger(ServerPlayer player) {
        this.trigger(player, TriggerInstance::test);
    }

    @Override
    @ParametersAreNonnullByDefault
    protected @NotNull TriggerInstance createInstance(JsonObject json, EntityPredicate.Composite player, DeserializationContext conditionsParser) {
        return new TriggerInstance(player);
    }

    public static class TriggerInstance extends AbstractCriterionTriggerInstance
    {
        public TriggerInstance(EntityPredicate.Composite player) {
            super(BrassCallBellAdvancementTrigger.ID, player);
        }

        public boolean test() {
            return true;
        }
    }

}
