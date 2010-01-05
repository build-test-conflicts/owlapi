package org.semanticweb.owlapi.model;

import java.util.ArrayList;
import java.util.List;
/*
 * Copyright (C) 2009, University of Manchester
 *
 * Modifications to the initial code base are copyright of their
 * respective authors, or their employers as appropriate.  Authorship
 * of the modifications may be determined from the ChangeLog placed at
 * the end of this file.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.

 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

/**
 * Author: Matthew Horridge<br>
 * The University of Manchester<br>
 * Information Management Group<br>
 * Date: 29-Dec-2009
 */
public class OWLOntologyChangeBuilder {

    private OWLOntologyManager manager;

    private List<OWLOntologyChange> changes = new ArrayList<OWLOntologyChange>();

    public OWLOntologyChangeBuilder(OWLOntologyManager manager) {
        this.manager = manager;
    }

    public void add(OWLOntologyChange change) {
        changes.add(change);
    }

    public List<OWLOntologyChange> getChanges() {
        return changes;
    }

    public void applyChanges() {
        manager.applyChanges(changes);
    }

}
