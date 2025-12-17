package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Unsubscribe: ImageVector
    get() {
        if (_Unsubscribe != null) return _Unsubscribe!!
        
        _Unsubscribe = ImageVector.Builder(
            name = "unsubscribe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 440f)
                lineTo(212f, 272f)
                quadToRelative(-17f, -11f, -34.5f, -1f)
                reflectiveQuadTo(160f, 301f)
                quadToRelative(0f, 9f, 4f, 16.5f)
                reflectiveQuadToRelative(12f, 12.5f)
                lineToRelative(283f, 177f)
                quadToRelative(10f, 6f, 21f, 6f)
                reflectiveQuadToRelative(21f, -6f)
                lineToRelative(283f, -177f)
                quadToRelative(8f, -5f, 12f, -12.5f)
                reflectiveQuadToRelative(4f, -16.5f)
                quadToRelative(0f, -20f, -17.5f, -30f)
                reflectiveQuadToRelative(-34.5f, 1f)
                lineTo(480f, 440f)
                close()
                moveTo(760f, 920f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(560f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(760f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(960f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(760f, 920f)
                close()
                moveTo(660f, 740f)
                horizontalLineToRelative(200f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                horizontalLineTo(660f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
                moveToRelative(-500f, 60f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(178f)
                quadToRelative(0f, 18f, -15f, 28f)
                reflectiveQuadToRelative(-32f, 4f)
                quadToRelative(-18f, -5f, -36f, -7.5f)
                reflectiveQuadToRelative(-37f, -2.5f)
                quadToRelative(-117f, 0f, -198.5f, 81.5f)
                reflectiveQuadTo(480f, 720f)
                quadToRelative(0f, 9f, 0.5f, 18f)
                reflectiveQuadToRelative(1.5f, 17f)
                quadToRelative(2f, 18f, -8.5f, 31.5f)
                reflectiveQuadTo(446f, 800f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Unsubscribe!!
    }

private var _Unsubscribe: ImageVector? = null

