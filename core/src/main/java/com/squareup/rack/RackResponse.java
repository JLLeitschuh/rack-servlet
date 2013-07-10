/*
 * Copyright (C) 2013 Square, Inc.
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
package com.squareup.rack;

import java.util.Iterator;
import java.util.Map;

/**
 * The HTTP response generated by a {@link RackApplication}.
 */
public class RackResponse {
  private final int status;
  private final Map<String, String> headers;
  private final Iterator<byte[]> body;

  /**
   * Creates a {@link RackResponse} with the given contents.
   *
   * @param status the HTTP status code.
   * @param headers the HTTP response headers.
   * @param body the HTTP response body.
   */
  public RackResponse(int status, Map<String, String> headers, Iterator<byte[]> body) {
    this.status = status;
    this.headers = headers;
    this.body = body;
  }

  /**
   * @return the HTTP status code.
   */
  public int getStatus() {
    return status;
  }

  /**
   * @return the HTTP response headers.
   */
  public Map<String, String> getHeaders() {
    return headers;
  }

  /**
   * @return the HTTP response body.
   */
  public Iterator<byte[]> getBody() {
    return body;
  }
}
