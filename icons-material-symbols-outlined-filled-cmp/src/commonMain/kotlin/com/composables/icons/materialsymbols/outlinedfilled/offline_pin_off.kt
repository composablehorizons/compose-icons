package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Offline_pin_off: ImageVector
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
                moveTo(320f, 680f)
                horizontalLineToRelative(246f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(494f, 20f)
                lineTo(556f, 442f)
                lineToRelative(108f, -108f)
                lineToRelative(-57f, -55f)
                lineToRelative(-107f, 107f)
                lineToRelative(-240f, -240f)
                quadToRelative(49f, -32f, 105f, -49f)
                reflectiveQuadToRelative(115f, -17f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 59f, -17f, 115f)
                reflectiveQuadToRelative(-49f, 105f)
                close()
            }
        }.build()
        
        return _Offline_pin_off!!
    }

private var _Offline_pin_off: ImageVector? = null

