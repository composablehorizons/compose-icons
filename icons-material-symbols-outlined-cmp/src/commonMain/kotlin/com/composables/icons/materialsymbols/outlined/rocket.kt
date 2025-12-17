package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Rocket: ImageVector
    get() {
        if (_Rocket != null) return _Rocket!!
        
        _Rocket = ImageVector.Builder(
            name = "rocket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 762f)
                lineToRelative(79f, -32f)
                quadToRelative(-10f, -29f, -18.5f, -59f)
                reflectiveQuadTo(287f, 611f)
                lineToRelative(-47f, 32f)
                verticalLineToRelative(119f)
                close()
                moveToRelative(160f, -42f)
                horizontalLineToRelative(160f)
                quadToRelative(18f, -40f, 29f, -97.5f)
                reflectiveQuadTo(600f, 505f)
                quadToRelative(0f, -99f, -33f, -187.5f)
                reflectiveQuadTo(480f, 181f)
                quadToRelative(-54f, 48f, -87f, 136.5f)
                reflectiveQuadTo(360f, 505f)
                quadToRelative(0f, 60f, 11f, 117.5f)
                reflectiveQuadToRelative(29f, 97.5f)
                close()
                moveToRelative(80f, -200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 520f)
                close()
                moveToRelative(240f, 242f)
                verticalLineToRelative(-119f)
                lineToRelative(-47f, -32f)
                quadToRelative(-5f, 30f, -13.5f, 60f)
                reflectiveQuadTo(641f, 730f)
                lineToRelative(79f, 32f)
                close()
                moveTo(480f, 79f)
                quadToRelative(99f, 72f, 149.5f, 183f)
                reflectiveQuadTo(680f, 520f)
                lineToRelative(84f, 56f)
                quadToRelative(17f, 11f, 26.5f, 29f)
                reflectiveQuadToRelative(9.5f, 38f)
                verticalLineToRelative(237f)
                lineToRelative(-199f, -80f)
                horizontalLineTo(359f)
                lineTo(160f, 880f)
                verticalLineToRelative(-237f)
                quadToRelative(0f, -20f, 9.5f, -38f)
                reflectiveQuadToRelative(26.5f, -29f)
                lineToRelative(84f, -56f)
                quadToRelative(0f, -147f, 50.5f, -258f)
                reflectiveQuadTo(480f, 79f)
                close()
            }
        }.build()
        
        return _Rocket!!
    }

private var _Rocket: ImageVector? = null

