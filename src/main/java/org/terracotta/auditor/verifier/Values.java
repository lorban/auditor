/*
 * Copyright Terracotta, Inc.
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
package org.terracotta.auditor.verifier;

import java.util.Set;

/**
 * @author Ludovic Orban
 */
public class Values {
  private final Set<RecordValue> committedValues;
  private final Set<RecordValue> intermediateValues;

  Values(Set<RecordValue> committedValues, Set<RecordValue> intermediateValues) {
    this.committedValues = committedValues;
    this.intermediateValues = intermediateValues;
  }

  public Set<RecordValue> getCommittedValues() {
    return committedValues;
  }

  public Set<RecordValue> getIntermediateValues() {
    return intermediateValues;
  }
}
