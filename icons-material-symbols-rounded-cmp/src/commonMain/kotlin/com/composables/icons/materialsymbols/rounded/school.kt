package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.School: ImageVector
    get() {
        if (_School != null) return _School!!
        
        _School = ImageVector.Builder(
            name = "school",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(242f, 711f)
                quadToRelative(-20f, -11f, -31f, -29.5f)
                reflectiveQuadTo(200f, 640f)
                verticalLineToRelative(-192f)
                lineToRelative(-96f, -53f)
                quadToRelative(-11f, -6f, -16f, -15f)
                reflectiveQuadToRelative(-5f, -20f)
                quadToRelative(0f, -11f, 5f, -20f)
                reflectiveQuadToRelative(16f, -15f)
                lineToRelative(338f, -184f)
                quadToRelative(9f, -5f, 18.5f, -7.5f)
                reflectiveQuadTo(480f, 131f)
                quadToRelative(10f, 0f, 19.5f, 2.5f)
                reflectiveQuadTo(518f, 141f)
                lineToRelative(381f, 208f)
                quadToRelative(10f, 5f, 15.5f, 14.5f)
                reflectiveQuadTo(920f, 384f)
                verticalLineToRelative(256f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(840f, 640f)
                verticalLineToRelative(-236f)
                lineToRelative(-80f, 44f)
                verticalLineToRelative(192f)
                quadToRelative(0f, 23f, -11f, 41.5f)
                reflectiveQuadTo(718f, 711f)
                lineTo(518f, 819f)
                quadToRelative(-9f, 5f, -18.5f, 7.5f)
                reflectiveQuadTo(480f, 829f)
                quadToRelative(-10f, 0f, -19.5f, -2.5f)
                reflectiveQuadTo(442f, 819f)
                lineTo(242f, 711f)
                close()
                moveToRelative(238f, -203f)
                lineToRelative(274f, -148f)
                lineToRelative(-274f, -148f)
                lineToRelative(-274f, 148f)
                lineToRelative(274f, 148f)
                close()
                moveToRelative(0f, 241f)
                lineToRelative(200f, -108f)
                verticalLineToRelative(-151f)
                lineToRelative(-161f, 89f)
                quadToRelative(-9f, 5f, -19f, 7.5f)
                reflectiveQuadToRelative(-20f, 2.5f)
                quadToRelative(-10f, 0f, -20f, -2.5f)
                reflectiveQuadToRelative(-19f, -7.5f)
                lineToRelative(-161f, -89f)
                verticalLineToRelative(151f)
                lineToRelative(200f, 108f)
                close()
                moveToRelative(0f, -241f)
                close()
                moveToRelative(0f, 121f)
                close()
                moveToRelative(0f, 0f)
                close()
            }
        }.build()
        
        return _School!!
    }

private var _School: ImageVector? = null

