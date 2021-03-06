/*! ******************************************************************************
 *
 * Pentaho Data Integration
 *
 * Copyright (C) 2002-2016 by Pentaho : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.pentaho.di.job.entries.sql;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.pentaho.di.job.entry.loadSave.JobEntryLoadSaveTestSupport;

public class JobEntrySQLTest extends JobEntryLoadSaveTestSupport<JobEntrySQL> {

  @Override
  protected Class<JobEntrySQL> getJobEntryClass() {
    return JobEntrySQL.class;
  }

  @Override
  protected List<String> listCommonAttributes() {
    return Arrays.asList(
        "sql",
        "useVariableSubstitution",
        "sqlfromfile",
        "sqlfilename",
        "sendOneStatement",
        "database" );
  }

  @Override
  protected Map<String, String> createGettersMap() {
    return toMap(
        "sql", "getSQL",
        "useVariableSubstitution", "getUseVariableSubstitution",
        "sqlfromfile", "getSQLFromFile",
        "sqlfilename", "getSQLFilename",
        "sendOneStatement", "isSendOneStatement",
        "database", "getDatabase" );
  }

  @Override
  protected Map<String, String> createSettersMap() {
    return toMap(
        "sql", "setSQL",
        "useVariableSubstitution", "setUseVariableSubstitution",
        "sqlfromfile", "setSQLFromFile",
        "sqlfilename", "setSQLFilename",
        "sendOneStatement", "setSendOneStatement",
        "database", "setDatabase" );
  }

}
