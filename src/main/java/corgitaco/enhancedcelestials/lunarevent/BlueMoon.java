package corgitaco.enhancedcelestials.lunarevent;

import com.mojang.serialization.Codec;
import corgitaco.enhancedcelestials.api.lunarevent.LunarEvent;
import corgitaco.enhancedcelestials.api.lunarevent.client.LunarEventClientSettings;
import net.minecraft.entity.EntityClassification;

import java.util.Map;
import java.util.Set;

public class BlueMoon extends LunarEvent {

    public BlueMoon(LunarEventClientSettings clientSettings, boolean superMoon, int minNumberOfNightsBetween, double chance, Map<EntityClassification, Double> mobCategorySpawnMultiplier, Set<Integer> validMoonPhases) {
        super(clientSettings, superMoon, minNumberOfNightsBetween, chance, validMoonPhases);
    }

    @Override
    public Codec<? extends LunarEvent> codec() {
        return null;
    }
}
