package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Offline_pin_off: ImageVector
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
                moveTo(320f, 680f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                lineToRelative(80f, 80f)
                horizontalLineTo(320f)
                close()
                moveTo(791f, 905f)
                lineToRelative(-91f, -91f)
                quadToRelative(-49f, 32f, -105f, 49f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -59f, 17f, -115f)
                reflectiveQuadToRelative(49f, -105f)
                lineToRelative(-91f, -91f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(23f, -205f)
                lineToRelative(-58f, -58f)
                quadToRelative(22f, -37f, 33f, -78f)
                reflectiveQuadToRelative(11f, -84f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-43f, 0f, -84f, 11f)
                reflectiveQuadToRelative(-78f, 33f)
                lineToRelative(-58f, -58f)
                quadToRelative(49f, -32f, 105f, -49f)
                reflectiveQuadToRelative(115f, -17f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 59f, -17f, 115f)
                reflectiveQuadToRelative(-49f, 105f)
                close()
                moveToRelative(-172f, 56f)
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
                moveToRelative(99f, -173f)
                lineToRelative(107f, -107f)
                lineToRelative(57f, 55f)
                lineToRelative(-108f, 108f)
                lineToRelative(-56f, -56f)
                close()
            }
        }.build()
        
        return _Offline_pin_off!!
    }

private var _Offline_pin_off: ImageVector? = null

