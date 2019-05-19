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

/**
 * Data definition to create a font from an external resource(i.e parsing a
 * script file).
 *
 * @author Grégory Van den Borre
 */
public final class FontDefinition {


    /**
     * Font height.
     */
    private int size;

    /**
     * Path to the font file.
     */
    private String path;

    /**
     * Internal font name, must be unique.
     */
    private String name;

    /**
     * Simple constructor, initialize with empty values.
     */
    FontDefinition() {
        super();
        this.path = "";
        this.name = "";
    }

    /**
     * @param newSize New value for the font height.
     */
    void setSize(final String newSize) {
        this.size = Integer.parseInt(newSize);
    }

    public int getSize() {
        return size;
    }

    public String getPath() {
        return path;
    }

    public String getName() {
        return name;
    }

    public void setPath(String path) {
        if(path == null) {
            throw new IllegalArgumentException("Path is mandatory");
        }
        this.path = path;
    }

    public void setName(String name) {
        if(name == null) {
            throw new IllegalArgumentException("Name is mandatory");
        }
        this.name = name;
    }
}
