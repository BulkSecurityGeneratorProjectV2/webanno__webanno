/*
 * Copyright 2017
 * Ubiquitous Knowledge Processing (UKP) Lab and FG Language Technology
 * Technische Universität Darmstadt
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.tudarmstadt.ukp.clarin.webanno.api.annotation.rendering.model;

import de.tudarmstadt.ukp.clarin.webanno.api.annotation.model.VID;

public class VAnnotationMarker
    extends VMarker
{
    private final VID[] vid;
    private String type;
    
    public VAnnotationMarker(String aType, VID aVid)
    {
        this(null, aType, aVid);
    }

    public VAnnotationMarker(Object aSource, String aType, VID aVid)
    {
        super(aSource);
        vid = new VID[] { aVid };
        type = aType;
    }

    public VID getVid()
    {
        return vid[0];
    }
    
    @Override
    public String getType()
    {
        return type;
    }
}