/**
 * Copyright 2012 Lyncode
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

package com.lyncode.xoai.dataprovider.data;

import java.io.File;

import com.lyncode.xoai.dataprovider.core.ConfigurableBundle;

/**
 * @author Development @ Lyncode <development@lyncode.com>
 * @version 2.2.9
 */
public class MetadataTransformer extends ConfigurableBundle {
	private File xsltFile;

	public MetadataTransformer() {
		xsltFile = null;
	}

	public MetadataTransformer(File xsltFile) {
		this.xsltFile = xsltFile;
	}

	public MetadataTransformer(String path) {
		this.xsltFile = new File(path);
	}

	public boolean hasTransformer() {
		return (this.xsltFile != null);
	}

	public File getXSLTFile() {
		return xsltFile;
	}
}
