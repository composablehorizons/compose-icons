package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Bookmark_flag: ImageVector
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
                moveTo(440f, 530f)
                verticalLineToRelative(-90f)
                horizontalLineToRelative(140f)
                quadToRelative(12f, 0f, 18f, -11f)
                reflectiveQuadToRelative(-2f, -21f)
                lineToRelative(-36f, -48f)
                lineToRelative(36f, -48f)
                quadToRelative(8f, -10f, 2f, -21f)
                reflectiveQuadToRelative(-18f, -11f)
                horizontalLineTo(420f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(380f, 320f)
                verticalLineToRelative(210f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(410f, 560f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(440f, 530f)
                close()
                moveToRelative(40f, 190f)
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
            }
        }.build()
        
        return _Bookmark_flag!!
    }

private var _Bookmark_flag: ImageVector? = null

