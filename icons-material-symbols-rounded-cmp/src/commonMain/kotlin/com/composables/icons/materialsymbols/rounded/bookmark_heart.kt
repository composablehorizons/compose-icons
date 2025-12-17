package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Bookmark_heart: ImageVector
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
                moveTo(480f, 312f)
                quadToRelative(-12f, -15f, -31f, -23.5f)
                reflectiveQuadToRelative(-41f, -8.5f)
                quadToRelative(-36f, 0f, -62f, 26f)
                reflectiveQuadToRelative(-26f, 62f)
                quadToRelative(0f, 19f, 5.5f, 35f)
                reflectiveQuadToRelative(22.5f, 38f)
                quadToRelative(14f, 18f, 39f, 43f)
                reflectiveQuadToRelative(64f, 61f)
                quadToRelative(6f, 6f, 13.5f, 9f)
                reflectiveQuadToRelative(15.5f, 3f)
                quadToRelative(8f, 0f, 15.5f, -3f)
                reflectiveQuadToRelative(13.5f, -9f)
                quadToRelative(38f, -35f, 63f, -59.5f)
                reflectiveQuadToRelative(39f, -43.5f)
                quadToRelative(17f, -22f, 23f, -38.5f)
                reflectiveQuadToRelative(6f, -35.5f)
                quadToRelative(0f, -36f, -26f, -62f)
                reflectiveQuadToRelative(-62f, -26f)
                quadToRelative(-21f, 0f, -40.5f, 8.5f)
                reflectiveQuadTo(480f, 312f)
                close()
                moveToRelative(0f, 408f)
                lineToRelative(-168f, 72f)
                quadToRelative(-40f, 17f, -76f, -6.5f)
                reflectiveQuadTo(200f, 719f)
                verticalLineToRelative(-519f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 120f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 200f)
                verticalLineToRelative(519f)
                quadToRelative(0f, 43f, -36f, 66.5f)
                reflectiveQuadToRelative(-76f, 6.5f)
                lineToRelative(-168f, -72f)
                close()
                moveToRelative(0f, -88f)
                lineToRelative(200f, 86f)
                verticalLineToRelative(-518f)
                horizontalLineTo(280f)
                verticalLineToRelative(518f)
                lineToRelative(200f, -86f)
                close()
                moveToRelative(0f, -432f)
                horizontalLineTo(280f)
                horizontalLineToRelative(400f)
                horizontalLineToRelative(-200f)
                close()
            }
        }.build()
        
        return _Bookmark_heart!!
    }

private var _Bookmark_heart: ImageVector? = null

