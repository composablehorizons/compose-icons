package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Bookmark_add: ImageVector
    get() {
        if (_Bookmark_add != null) return _Bookmark_add!!
        
        _Bookmark_add = ImageVector.Builder(
            name = "bookmark_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 120f)
                horizontalLineToRelative(280f)
                quadToRelative(-20f, 30f, -30f, 57.5f)
                reflectiveQuadTo(520f, 240f)
                quadToRelative(0f, 72f, 45.5f, 127f)
                reflectiveQuadTo(680f, 436f)
                quadToRelative(23f, 3f, 40f, 3f)
                reflectiveQuadToRelative(40f, -3f)
                verticalLineToRelative(404f)
                lineTo(480f, 720f)
                lineTo(200f, 840f)
                close()
                moveToRelative(480f, -480f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Bookmark_add!!
    }

private var _Bookmark_add: ImageVector? = null

