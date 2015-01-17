/*
 * Copyright (c) 2014 Thomas Kratz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.eiswind.magnolia.thymeleaf.dialect;

import de.eiswind.magnolia.thymeleaf.processor.CmsAreaElementProcessor;
import de.eiswind.magnolia.thymeleaf.processor.CmsComponentElementProcessor;
import de.eiswind.magnolia.thymeleaf.processor.CmsInitElementProcessor;
import org.thymeleaf.dialect.AbstractDialect;
import org.thymeleaf.processor.IProcessor;

import java.util.HashSet;
import java.util.Set;

/**
 * configures the mgnl processors.
 */
public final class MagnoliaDialect extends AbstractDialect {


    @Override
    public String getPrefix() {
        return "cms";
    }


    @Override
    public Set<IProcessor> getProcessors() {
        final Set<IProcessor> processors = new HashSet<IProcessor>();
        processors.add(new CmsInitElementProcessor());
        processors.add(new CmsAreaElementProcessor());
        processors.add(new CmsComponentElementProcessor());
        return processors;
    }


}
