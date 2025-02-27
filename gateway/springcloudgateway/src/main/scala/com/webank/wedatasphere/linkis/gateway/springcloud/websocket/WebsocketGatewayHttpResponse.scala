/*
 * Copyright 2019 WeBank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webank.wedatasphere.linkis.gateway.springcloud.websocket

import com.webank.wedatasphere.linkis.gateway.http.GatewayHttpResponse
import javax.servlet.http.Cookie

/**
  * created by cooperyang on 2019/1/9.
  */
class WebsocketGatewayHttpResponse extends GatewayHttpResponse {
  private val cachedWebSocketResponseMsg = new StringBuilder
  override def addCookie(cookie: Cookie): Unit = {}
  override def setHeader(key: String, value: String): Unit = {}
  override def setStatus(status: Int): Unit = {}
  override def write(message: String): Unit = {}
  override def writeWebSocket(message: String): Unit = cachedWebSocketResponseMsg.append(message)
  override def sendResponse(): Unit = {}
  def getWebSocketMsg: String = cachedWebSocketResponseMsg.toString()
  override def isCommitted: Boolean = cachedWebSocketResponseMsg.nonEmpty
}
