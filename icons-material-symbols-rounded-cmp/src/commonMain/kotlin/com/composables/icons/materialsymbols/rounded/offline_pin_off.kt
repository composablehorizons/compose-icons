package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Offline_pin_off: ImageVector
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
                moveTo(360f, 680f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 600f)
                horizontalLineToRelative(240f)
                lineToRelative(80f, 80f)
                horizontalLineTo(360f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -59f, 17f, -115f)
                reflectiveQuadToRelative(49f, -105f)
                lineToRelative(-63f, -63f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(83f, 140f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(680f, 680f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(763f, 876f)
                lineToRelative(-63f, -62f)
                quadToRelative(-49f, 32f, -105f, 49f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(162f, -124f)
                lineTo(204f, 318f)
                quadToRelative(-22f, 37f, -33f, 78f)
                reflectiveQuadToRelative(-11f, 84f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                quadToRelative(43f, 0f, 84f, -11f)
                reflectiveQuadToRelative(78f, -33f)
                close()
                moveToRelative(-83f, -355f)
                close()
                moveTo(401f, 559f)
                close()
                moveToRelative(234f, -253f)
                quadToRelative(12f, 11f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 29f)
                lineToRelative(-51f, 51f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(52f, -52f)
                quadToRelative(11f, -11f, 27f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                close()
                moveTo(314f, 116f)
                quadToRelative(39f, -18f, 80.5f, -27f)
                reflectiveQuadToRelative(85.5f, -9f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 44f, -9f, 85.5f)
                reflectiveQuadTo(844f, 646f)
                quadToRelative(-7f, 15f, -23f, 19.5f)
                reflectiveQuadToRelative(-30f, -3.5f)
                quadToRelative(-14f, -8f, -19f, -24f)
                reflectiveQuadToRelative(2f, -32f)
                quadToRelative(13f, -30f, 19.5f, -62f)
                reflectiveQuadToRelative(6.5f, -64f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-32f, 0f, -64f, 6.5f)
                reflectiveQuadTo(354f, 186f)
                quadToRelative(-16f, 7f, -32f, 2f)
                reflectiveQuadToRelative(-24f, -19f)
                quadToRelative(-8f, -14f, -3.5f, -30f)
                reflectiveQuadToRelative(19.5f, -23f)
                close()
            }
        }.build()
        
        return _Offline_pin_off!!
    }

private var _Offline_pin_off: ImageVector? = null

