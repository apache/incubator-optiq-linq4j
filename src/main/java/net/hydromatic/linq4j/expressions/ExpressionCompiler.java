/*
// Licensed to Julian Hyde under one or more contributor license
// agreements. See the NOTICE file distributed with this work for
// additional information regarding copyright ownership.
//
// Julian Hyde licenses this file to you under the Apache License,
// Version 2.0 (the "License"); you may not use this file except in
// compliance with the License. You may obtain a copy of the License at:
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
*/
package net.hydromatic.linq4j.expressions;

import net.hydromatic.linq4j.function.DynamicFunction;
import net.hydromatic.linq4j.function.Function;

/**
 * Expression compiler.
 */
class ExpressionCompiler implements ExpressionVisitor {
    final DynamicFunction function = null;
    final StringBuilder buf = new StringBuilder();

    /**
     * Returns an invokable function that is the result of compilation.
     *
     * @return Invokable function
     */
    public DynamicFunction function() {
        return function;
    }

    public <T extends Function<?>> void visitLambda(
        FunctionExpression<T> expression)
    {
    }

    public void output(String s) {
        buf.append(s);
    }
}

// End ExpressionCompiler.java