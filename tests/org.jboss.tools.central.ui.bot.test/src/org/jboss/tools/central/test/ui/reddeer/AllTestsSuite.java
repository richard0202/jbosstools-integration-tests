/*******************************************************************************
 * Copyright (c) 2017 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributor:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.central.test.ui.reddeer;

import org.eclipse.reddeer.junit.runner.RedDeerSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

/**
 * 
 * @author rhopp
 *
 */

@RunWith(RedDeerSuite.class)
@SuiteClasses({
	HTML5Parameterized.class, // does not have a test case now
	LauncherApplicationTest.class,
	BasicTests.class,
	InstallationDetailsTest.class
	})
public class AllTestsSuite {


}
