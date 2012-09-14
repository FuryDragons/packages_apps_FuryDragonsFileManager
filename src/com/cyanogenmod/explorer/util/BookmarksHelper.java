/*
 * Copyright (C) 2012 The CyanogenMod Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cyanogenmod.explorer.util;

import com.cyanogenmod.explorer.R;
import com.cyanogenmod.explorer.model.Bookmark;

/**
 * A helper class with useful methods for deal with bookmarks.
 */
public final class BookmarksHelper {

    /**
     * Constructor of <code>BookmarksHelper</code>.
     */
    private BookmarksHelper() {
        super();
    }

    /**
     * Method that returns the associated icon to the bookmark.
     *
     * @param bookmark The bookmark
     * @return The associated icon
     */
    public static int getIcon(Bookmark bookmark) {
        if (bookmark.getType().compareTo(Bookmark.BOOKMARK_TYPE.HOME) == 0) {
            return R.drawable.ic_holo_light_bookmarks_home;
        }
        if (bookmark.getType().compareTo(Bookmark.BOOKMARK_TYPE.FILESYSTEM) == 0) {
            return R.drawable.ic_holo_light_bookmarks_filesystem;
        }
        if (bookmark.getType().compareTo(Bookmark.BOOKMARK_TYPE.SDCARD) == 0) {
            return R.drawable.ic_holo_light_bookmarks_sdcard;
        }
        if (bookmark.getType().compareTo(Bookmark.BOOKMARK_TYPE.USB) == 0) {
            return R.drawable.ic_holo_light_bookmarks_usb;
        }
        //Bookmark add by the user
        return R.drawable.ic_holo_light_bookmarks_user_defined;
    }
}