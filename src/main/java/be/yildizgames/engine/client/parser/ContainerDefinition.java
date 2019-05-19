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

import be.yildizgames.module.graphic.material.Material;
import be.yildizgames.module.window.ScreenSize;

import java.util.ArrayList;
import java.util.List;

/**
 * Data definition to create a GuiContainer widget from an external resource(i.e
 * parsing a script file).
 *
 * @author Grégory Van den Borre
 */
public final class ContainerDefinition extends GuiCommonDefinition {


    /**
     * List of children image widget.
     */
    private final List<ImageDefinition> imageList = new ArrayList<>();
    /**
     * List of children text line widget.
     */
    private final List<TextLineDefinition> textLineList = new ArrayList<>();
    /**
     * List of children button widget.
     */
    private final List<ButtonDefinition> buttonList = new ArrayList<>();
    /**
     * List of children input box widget.
     */
    private final List<InputBoxDefinition> inputBoxList = new ArrayList<>();
    /**
     * List of children text area widget.
     */
    private final List<TextAreaDefinition> textAreaList = new ArrayList<>();
    /**
     * Container background material.
     */
    private Material material = Material.empty();
    /**
     * Container depth value.
     */
    private int z;

    /**
     * Simple constructor, initialize with empty values.
     *
     * @param screen Screen size data.
     */
    ContainerDefinition(final ScreenSize screen) {
        super(screen);
    }

    /**
     * @param materialName Name of the material for the container background.
     */
    void setMaterial(final String materialName) {
        this.material = Material.get(materialName);
    }

    /**
     * @param zValue New container depth position value.
     */
    void setZ(final String zValue) {
        this.z = Integer.parseInt(zValue);
    }

    /**
     * @param imageDef Image definition to be used as child by the container.
     */
    void addImage(final ImageDefinition imageDef) {
        this.imageList.add(imageDef);
    }

    /**
     * @param textLineDef GuiTextLine definition to be used as child by the container.
     */
    void addTextLine(final TextLineDefinition textLineDef) {
        this.textLineList.add(textLineDef);
    }

    /**
     * @param buttonDef GuiButton definition to be used as child by the container.
     */
    void addButton(final ButtonDefinition buttonDef) {
        this.buttonList.add(buttonDef);
    }

    /**
     * @param inputDef InputBoxGui definition to be used as child by the container.
     */
    void addInputBox(final InputBoxDefinition inputDef) {
        this.inputBoxList.add(inputDef);
    }

    /**
     * @param textAreaDef TextAreaGui definition to be used as child by the container.
     */
    void addTextArea(final TextAreaDefinition textAreaDef) {
        this.textAreaList.add(textAreaDef);
    }

    public List<ImageDefinition> getImageList() {
        return imageList;
    }

    public List<TextLineDefinition> getTextLineList() {
        return textLineList;
    }

    public List<ButtonDefinition> getButtonList() {
        return buttonList;
    }

    public List<InputBoxDefinition> getInputBoxList() {
        return inputBoxList;
    }

    public List<TextAreaDefinition> getTextAreaList() {
        return textAreaList;
    }

    public Material getMaterial() {
        return material;
    }

    public int getZ() {
        return z;
    }
}
