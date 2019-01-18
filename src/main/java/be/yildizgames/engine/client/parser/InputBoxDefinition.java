/*
 * This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 *
 * Copyright (c) 2019 Grégory Van den Borre
 *
 * More infos available: https://engine.yildiz-games.be
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this
 * software and associated documentation files (the "Software"), to deal in the Software
 * without restriction, including without limitation the rights to use, copy, modify, merge,
 * publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons
 * to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS  OR COPYRIGHT  HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE  SOFTWARE.
 */

package be.yildizgames.engine.client.parser;

import be.yildizgames.module.graphic.Font;
import be.yildizgames.module.graphic.material.Material;
import be.yildizgames.module.window.ScreenSize;

/**
 * Data definition to create an InputBoxGui from an external resource(i.e parsing a
 * script file).
 *
 * @author Grégory Van Den Borre
 */
public final class InputBoxDefinition extends GuiCommonDefinition {

    /**
     * The input box background material.
     */
    private final Material material;

    /**
     * The input box background material when focused.
     */
    private final Material materialHighlight;

    /**
     * The font for the input box text.
     */
    private final Font font;

    /**
     * Simple constructor, initialize with empty values.
     *
     * @param background Box background material.
     * @param highlight  Box background material when focused.
     * @param boxFont    Font to use for caption and text.
     * @param screen     Screen size data.
     */
    InputBoxDefinition(final Material background, final Material highlight, final Font boxFont, final ScreenSize screen) {
        super(screen);
        this.material = background;
        this.materialHighlight = highlight;
        this.font = boxFont;
    }

    public Material getMaterialCursor() {
        // FIXME implements
        return null;
    }

    public Material getMaterial() {
        return material;
    }

    public Material getMaterialHighlight() {
        return materialHighlight;
    }

    public Font getFont() {
        return font;
    }
}
