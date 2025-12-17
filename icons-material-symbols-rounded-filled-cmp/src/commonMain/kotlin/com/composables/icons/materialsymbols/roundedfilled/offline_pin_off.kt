package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Offline_pin_off: ImageVector
    get() {
        if (_Offline_pin_off != null) return _Offline_pin_off!!
        
        _Offline_pin_off = ImageVector.Builder(
            name = "offline_pin_off",
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
                quadToRelative(0f, -59f, 17f, -115f)
                reflectiveQuadToRelative(49f, -105f)
                lineToRelative(-63f, -63f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(84f, 140f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(679f, 680f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(763f, 876f)
                lineToRelative(-63f, -62f)
                quadToRelative(-49f, 32f, -105f, 49f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveTo(360f, 680f)
                horizontalLineToRelative(206f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 640f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 680f)
                close()
                moveToRelative(120f, -600f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 42f, -8.5f, 82.5f)
                reflectiveQuadTo(846f, 641f)
                quadToRelative(-6f, 14f, -17.5f, 20.5f)
                reflectiveQuadTo(803f, 668f)
                quadToRelative(-10f, 0f, -19f, -3.5f)
                reflectiveQuadTo(767f, 653f)
                lineTo(570f, 456f)
                quadToRelative(-6f, -6f, -6f, -14f)
                reflectiveQuadToRelative(6f, -14f)
                lineToRelative(66f, -66f)
                quadToRelative(12f, -12f, 11.5f, -28.5f)
                reflectiveQuadTo(635f, 306f)
                quadToRelative(-12f, -11f, -28.5f, -10.5f)
                reflectiveQuadTo(579f, 307f)
                lineToRelative(-65f, 65f)
                quadToRelative(-6f, 6f, -14f, 6f)
                reflectiveQuadToRelative(-14f, -6f)
                lineTo(307f, 193f)
                quadToRelative(-8f, -8f, -11.5f, -17f)
                reflectiveQuadToRelative(-3.5f, -19f)
                quadToRelative(0f, -14f, 6.5f, -25.5f)
                reflectiveQuadTo(319f, 114f)
                quadToRelative(38f, -17f, 78.5f, -25.5f)
                reflectiveQuadTo(480f, 80f)
                close()
            }
        }.build()
        
        return _Offline_pin_off!!
    }

private var _Offline_pin_off: ImageVector? = null

