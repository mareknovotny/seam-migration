/*
 * JBoss, Home of Professional Open Source
 * Copyright 2012, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the &quot;License&quot;);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an &quot;AS IS&quot; BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.open18.ui.converter;

import javax.faces.convert.EnumConverter;
import javax.faces.convert.FacesConverter;

import org.open18.model.enums.Weather;

/**
 *
 */
@FacesConverter(forClass = Weather.class, value = "weatherConverter")
public class WeatherConverter extends EnumConverter {
    public WeatherConverter() {
        super(Weather.class);
    }
}
