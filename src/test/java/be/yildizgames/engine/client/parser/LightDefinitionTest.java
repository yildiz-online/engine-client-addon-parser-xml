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
import be.yildizgames.common.geometry.Point3D;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author Grégory Van den Borre
 */
public class LightDefinitionTest {


    @Nested
    public class Constructor {

        @Test
        public void happyFlow() {
            LightDefinition ld = new LightDefinition();
            assertEquals("", ld.getName());
            assertEquals("point", ld.getType());
            assertEquals(Point3D.ZERO, ld.getPosition());
            assertEquals(Material.EMPTY_NAME, ld.getBurstMaterial());
            assertEquals(Material.EMPTY_NAME, ld.getHaloMaterial());
            assertEquals(Material.EMPTY_NAME, ld.getLightMaterial());
        }
    }

    @Nested
    public class SetName {

        @Test
        public void happyFlow() {
            LightDefinition ld = new LightDefinition();
            ld.setName("aName");
            assertEquals("aName", ld.getName());
        }

        @Test
        public void withNull() {
            LightDefinition ld = new LightDefinition();
            assertThrows(IllegalArgumentException.class, () -> ld.setName(null));
        }

        @Test
        public void empty() {
            LightDefinition ld = new LightDefinition();
            assertThrows(IllegalArgumentException.class, () -> ld.setName(""));
        }
    }

    @Nested
    public class SetType {

        @Test
        public void happyFlow() {
            LightDefinition ld = new LightDefinition();
            ld.setType("point");
            assertEquals("point", ld.getType());
        }

        @Test
        public void withNull() {
            LightDefinition ld = new LightDefinition();
            assertThrows(IllegalArgumentException.class, () -> ld.setType(null));
        }

        @Test
        public void withInvalidType() {
            LightDefinition ld = new LightDefinition();
            assertThrows(IllegalArgumentException.class, () -> ld.setType("any"));
        }
    }

    @Nested
    public class SetPosition {

        @Test
        public void happyFlow() {
            LightDefinition ld = new LightDefinition();
            ld.setX("5");
            ld.setY("3");
            ld.setZ("7");
            assertEquals(Point3D.valueOf(5,3,7), ld.getPosition());
        }

        @Test
        public void withNullX() {
            LightDefinition ld = new LightDefinition();
            assertThrows(IllegalArgumentException.class, () -> ld.setX(null));
        }

        @Test
        public void withNullY() {
            LightDefinition ld = new LightDefinition();
            assertThrows(IllegalArgumentException.class, () -> ld.setY(null));
        }

        @Test
        public void withNullZ() {
            LightDefinition ld = new LightDefinition();
            assertThrows(IllegalArgumentException.class, () -> ld.setZ(null));
        }

        @Test
        public void withInvalidX() {
            LightDefinition ld = new LightDefinition();
            assertThrows(IllegalArgumentException.class, () -> ld.setX("a"));
        }

        @Test
        public void withInvalidY() {
            LightDefinition ld = new LightDefinition();
            assertThrows(IllegalArgumentException.class, () -> ld.setY("a"));
        }

        @Test
        public void withInvalidZ() {
            LightDefinition ld = new LightDefinition();
            assertThrows(IllegalArgumentException.class, () -> ld.setZ("a"));
        }
    }

    @Nested
    public class SetLightMaterial {

        @Test
        public void happyFlow() {
            LightDefinition ld = new LightDefinition();
            ld.setLightMaterial("aLight");
            assertEquals("aLight", ld.getLightMaterial());
        }

        @Test
        public void withNull() {
            LightDefinition ld = new LightDefinition();
            assertThrows(IllegalArgumentException.class, () -> ld.setLightMaterial(null));
        }

        @Test
        public void empty() {
            LightDefinition ld = new LightDefinition();
            assertThrows(IllegalArgumentException.class, () -> ld.setLightMaterial(""));
        }
    }

    @Nested
    public class SetBurstMaterial {

        @Test
        public void happyFlow() {
            LightDefinition ld = new LightDefinition();
            ld.setBurstMaterial("burst");
            assertEquals("burst", ld.getBurstMaterial());
        }

        @Test
        public void withNull() {
            LightDefinition ld = new LightDefinition();
            assertThrows(IllegalArgumentException.class, () -> ld.setBurstMaterial(null));
        }

        @Test
        public void empty() {
            LightDefinition ld = new LightDefinition();
            assertThrows(IllegalArgumentException.class, () -> ld.setBurstMaterial(""));
        }
    }

    @Nested
    public class SetHaloMaterial {

        @Test
        public void happyFlow() {
            LightDefinition ld = new LightDefinition();
            ld.setHaloMaterial("halo");
            assertEquals("halo", ld.getHaloMaterial());
        }

        @Test
        public void withNull() {
            LightDefinition ld = new LightDefinition();
            assertThrows(IllegalArgumentException.class, () -> ld.setHaloMaterial(null));
        }

        @Test
        public void empty() {
            LightDefinition ld = new LightDefinition();
            assertThrows(IllegalArgumentException.class, () -> ld.setHaloMaterial(""));
        }
    }
}