package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Tonality: ImageVector
    get() {
        if (_Tonality != null) return _Tonality!!
        
        _Tonality = ImageVector.Builder(
            name = "tonality",
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
                moveToRelative(-40f, -82f)
                verticalLineToRelative(-636f)
                quadToRelative(-121f, 15f, -200.5f, 106f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 121f, 79.5f, 212f)
                reflectiveQuadTo(440f, 798f)
                close()
                moveToRelative(80f, 0f)
                quadToRelative(30f, -5f, 59f, -13.5f)
                reflectiveQuadToRelative(55f, -24.5f)
                horizontalLineTo(520f)
                verticalLineToRelative(38f)
                close()
                moveToRelative(0f, -118f)
                horizontalLineToRelative(210f)
                quadToRelative(8f, -9f, 14f, -19f)
                reflectiveQuadToRelative(12f, -21f)
                horizontalLineTo(520f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, -120f)
                horizontalLineToRelative(270f)
                lineToRelative(4f, -20f)
                lineToRelative(4f, -20f)
                horizontalLineTo(520f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, -120f)
                horizontalLineToRelative(278f)
                lineToRelative(-4f, -20f)
                lineToRelative(-4f, -20f)
                horizontalLineTo(520f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, -120f)
                horizontalLineToRelative(236f)
                quadToRelative(-6f, -11f, -12f, -21f)
                reflectiveQuadToRelative(-14f, -19f)
                horizontalLineTo(520f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, -120f)
                horizontalLineToRelative(114f)
                quadToRelative(-26f, -16f, -55f, -24.5f)
                reflectiveQuadTo(520f, 162f)
                verticalLineToRelative(38f)
                close()
            }
        }.build()
        
        return _Tonality!!
    }

private var _Tonality: ImageVector? = null

