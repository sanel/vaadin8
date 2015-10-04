/*
 * Copyright 2000-2014 Vaadin Ltd.
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
package com.vaadin.tests.contextclick;

import org.openqa.selenium.interactions.Actions;

public class TreeTableContextClickTest extends TableContextClickTest {

    @Override
    protected Class<?> getUIClass() {
        return TreeTableContextClick.class;
    }

    @Override
    protected void contextClick(org.openqa.selenium.WebElement e) {
        new Actions(getDriver()).moveToElement(e, 10, 10).contextClick()
                .perform();
    };
}