package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Tonality_2: ImageVector
    get() {
        if (_Tonality_2 != null) return _Tonality_2!!
        
        _Tonality_2 = ImageVector.Builder(
            name = "tonality_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(40f, -718f)
                verticalLineToRelative(636f)
                quadToRelative(121f, -15f, 200.5f, -106f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -121f, -79.5f, -212f)
                reflectiveQuadTo(520f, 162f)
                close()
                moveToRelative(-80f, 38f)
                verticalLineToRelative(-38f)
                quadToRelative(-30f, 5f, -59f, 13.5f)
                reflectiveQuadTo(326f, 200f)
                horizontalLineToRelative(114f)
                close()
                moveToRelative(0f, 120f)
                verticalLineToRelative(-40f)
                horizontalLineTo(230f)
                quadToRelative(-8f, 9f, -14f, 19f)
                reflectiveQuadToRelative(-12f, 21f)
                horizontalLineToRelative(236f)
                close()
                moveToRelative(0f, 120f)
                verticalLineToRelative(-40f)
                horizontalLineTo(170f)
                lineToRelative(-4f, 20f)
                lineToRelative(-4f, 20f)
                horizontalLineToRelative(278f)
                close()
                moveToRelative(0f, 120f)
                verticalLineToRelative(-40f)
                horizontalLineTo(162f)
                lineToRelative(4f, 20f)
                lineToRelative(4f, 20f)
                horizontalLineToRelative(270f)
                close()
                moveToRelative(0f, 120f)
                verticalLineToRelative(-40f)
                horizontalLineTo(204f)
                quadToRelative(6f, 11f, 12f, 21f)
                reflectiveQuadToRelative(14f, 19f)
                horizontalLineToRelative(210f)
                close()
                moveToRelative(0f, 118f)
                verticalLineToRelative(-38f)
                horizontalLineTo(326f)
                quadToRelative(26f, 16f, 55f, 24.5f)
                reflectiveQuadToRelative(59f, 13.5f)
                close()
                moveToRelative(80f, -318f)
                close()
            }
        }.build()
        
        return _Tonality_2!!
    }

private var _Tonality_2: ImageVector? = null

