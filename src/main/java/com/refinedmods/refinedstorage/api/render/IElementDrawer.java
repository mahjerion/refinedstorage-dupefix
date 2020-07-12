package com.refinedmods.refinedstorage.api.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.refinedmods.refinedstorage.api.autocrafting.craftingmonitor.ICraftingMonitorElement;
import com.refinedmods.refinedstorage.api.autocrafting.preview.ICraftingPreviewElement;

/**
 * This {@link FunctionalInterface} is used to define a draw/render function.
 * This function use x and y coords and the element to draw.
 * Usually packaged in a {@link IElementDrawers}.
 * Used in {@link ICraftingPreviewElement#draw(int, int, IElementDrawers)} and {@link ICraftingMonitorElement#draw(int, int, IElementDrawers)}.
 *
 * @param <T> the element to draw, usually {@link String}, {@link net.minecraft.item.ItemStack} or {@link net.minecraftforge.fluids.FluidStack}
 */
@FunctionalInterface
public interface IElementDrawer<T> {
    /**
     * @param matrixStack the matrix stack
     * @param x           the x axis
     * @param y           the y axis
     * @param element     the element type
     */
    void draw(MatrixStack matrixStack, int x, int y, T element);
}
