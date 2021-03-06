/**
 * Copyright 2011 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.gwtplatform.mvp.client.proxy;

import com.google.gwt.event.shared.EventHandler;

/**
 * This is the handler interface for {@link RevealRootPopupContentEvent}. It is
 * used solely by {@link com.gwtplatform.mvp.client.RootPresenter}.
 */
public interface RevealRootPopupContentHandler extends EventHandler {

    /**
     * Called whenever a presenter wants to sets itself as a popup attached to
     * the root of the application.
     *
     * @param event The event containing the presenter that wants to bet set as
     *              root popup content.
     */
    void onRevealRootPopupContent(RevealRootPopupContentEvent event);

}
