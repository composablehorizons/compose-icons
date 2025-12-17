package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Tap_and_play: ImageVector
    get() {
        if (_Tap_and_play != null) return _Tap_and_play!!
        
        _Tap_and_play = ImageVector.Builder(
            name = "tap_and_play",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 440f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(880f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-680f)
                horizontalLineTo(280f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, 480f)
                verticalLineToRelative(-80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(280f, 920f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                verticalLineToRelative(-80f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                verticalLineToRelative(-80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(483f, 637f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(600f, 920f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(280f, 160f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-40f)
                horizontalLineTo(280f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Tap_and_play!!
    }

private var _Tap_and_play: ImageVector? = null

