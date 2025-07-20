package io.github.itsnuaz.tatbackport.block.entity;

import io.github.itsnuaz.tatbackport.mixin.SignTypeAccessor;
import net.minecraft.util.SignType;

public class ModSignTypes {
    public static final SignType BAMBOO = SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("bamboo"));
    public static final SignType CHERRY = SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("cherry"));
}
