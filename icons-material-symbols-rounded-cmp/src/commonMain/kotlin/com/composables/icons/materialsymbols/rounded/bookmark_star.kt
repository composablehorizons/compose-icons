package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Bookmark_star: ImageVector
    get() {
        if (_Bookmark_star != null) return _Bookmark_star!!
        
        _Bookmark_star = ImageVector.Builder(
            name = "bookmark_star",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 505f)
                lineToRelative(51f, 31f)
                quadToRelative(11f, 7f, 21.5f, -1f)
                reflectiveQuadToRelative(7.5f, -21f)
                lineToRelative(-13f, -58f)
                lineToRelative(44f, -38f)
                quadToRelative(10f, -9f, 6.5f, -21f)
                reflectiveQuadTo(580f, 383f)
                lineToRelative(-58f, -5f)
                lineToRelative(-24f, -55f)
                quadToRelative(-5f, -12f, -18f, -12f)
                reflectiveQuadToRelative(-18f, 12f)
                lineToRelative(-24f, 55f)
                lineToRelative(-58f, 5f)
                quadToRelative(-14f, 2f, -17.5f, 14f)
                reflectiveQuadToRelative(6.5f, 21f)
                lineToRelative(44f, 38f)
                lineToRelative(-13f, 58f)
                quadToRelative(-3f, 13f, 7.5f, 21f)
                reflectiveQuadToRelative(21.5f, 1f)
                lineToRelative(51f, -31f)
                close()
                moveToRelative(0f, 215f)
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
        
        return _Bookmark_star!!
    }

private var _Bookmark_star: ImageVector? = null

