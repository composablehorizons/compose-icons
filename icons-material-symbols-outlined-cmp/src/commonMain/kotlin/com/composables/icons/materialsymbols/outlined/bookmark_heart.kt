package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Bookmark_heart: ImageVector
    get() {
        if (_Bookmark_heart != null) return _Bookmark_heart!!
        
        _Bookmark_heart = ImageVector.Builder(
            name = "bookmark_heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 572f)
                quadToRelative(51f, -47f, 82.5f, -77.5f)
                reflectiveQuadTo(611f, 442f)
                quadToRelative(17f, -22f, 23f, -38.5f)
                reflectiveQuadToRelative(6f, -35.5f)
                quadToRelative(0f, -36f, -26f, -62f)
                reflectiveQuadToRelative(-62f, -26f)
                quadToRelative(-21f, 0f, -40.5f, 8.5f)
                reflectiveQuadTo(480f, 312f)
                quadToRelative(-12f, -15f, -31f, -23.5f)
                reflectiveQuadToRelative(-41f, -8.5f)
                quadToRelative(-36f, 0f, -62f, 26f)
                reflectiveQuadToRelative(-26f, 62f)
                quadToRelative(0f, 19f, 5.5f, 35f)
                reflectiveQuadToRelative(22.5f, 38f)
                quadToRelative(17f, 22f, 48f, 52.5f)
                reflectiveQuadToRelative(84f, 78.5f)
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
        
        return _Bookmark_heart!!
    }

private var _Bookmark_heart: ImageVector? = null

