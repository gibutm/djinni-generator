/** Copyright 2014 Dropbox, Inc.
  *
  * Licensed under the Apache License, Version 2.0 (the "License"); you may not
  * use this file except in compliance with the License. You may obtain a copy
  * of the License at
  *
  * http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  * License for the specific language governing permissions and limitations
  * under the License.
  */

package djinni.syntax

import java.io.File

case class Loc(file: File, line: Int, col: Int) {
  override def toString() =
    file.getAbsolutePath() + " (" + line + "." + col + ")"
}

case class Error(loc: Loc, msg: String) {
  override def toString() = loc + ": " + msg
  def toException: Error.Exception = Error.Exception(this)
}

object Error {
  case class Exception(error: Error) extends java.lang.Exception(error.toString)
}
