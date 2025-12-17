package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Bookmark_flag: ImageVector
    get() {
        if (_Bookmark_flag != null) return _Bookmark_flag!!
        
        _Bookmark_flag = ImageVector.Builder(
            name = "bookmark_flag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(380f, 560f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(180f)
                lineToRelative(-60f, -80f)
                lineToRelative(60f, -80f)
                horizontalLineTo(380f)
                verticalLineToRelative(280f)
                close()
                moveTo(200f, 840f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 120f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 200f)
                verticalLineToRelative(640f)
                lineTo(480f, 720f)
                lineTo(200f, 840f)
                close()
                moveToRelative(80f, -122f)
                lineToRelative(200f, -86f)
                lineToRelative(200f, 86f)
                verticalLineToRelative(-518f)
                horizontalLineTo(280f)
                verticalLineToRelative(518f)
                close()
                moveToRelative(0f, -518f)
                horizontalLineToRelative(400f)
                horizontalLineToRelative(-400f)
                close()
            }
        }.build()
        
        return _Bookmark_flag!!
    }

private var _Bookmark_flag: ImageVector? = null

