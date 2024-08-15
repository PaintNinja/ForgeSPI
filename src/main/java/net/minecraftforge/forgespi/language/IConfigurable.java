/*
 * Copyright (c) Forge Development LLC
 * SPDX-License-Identifier: LGPL-2.1-only
 */
package net.minecraftforge.forgespi.language;

import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * This is an interface for querying configuration elements
 */
public interface IConfigurable {
    default <T> Optional<T> getConfigElement(String key) {
        return getConfigElement(new String[] { key });
    }

    <T> Optional<T> getConfigElement(String... key);

    default <T> @Nullable T getNullableConfigElement(String key) {
        return this.<T>getConfigElement(key).orElse(null);
    }

    default <T> @Nullable T getNullableConfigElement(String... key) {
        return this.<T>getConfigElement(key).orElse(null);
    }

    default List<? extends IConfigurable> getConfigList(String key) {
        return getConfigList(new String[] { key });
    }

    default List<? extends IConfigurable> getConfigList(String... key) {
        return Collections.emptyList();
    }
}
