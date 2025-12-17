package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Bluetooth_disabled: ImageVector
    get() {
        if (_Bluetooth_disabled != null) return _Bluetooth_disabled!!
        
        _Bluetooth_disabled = ImageVector.Builder(
            name = "bluetooth_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 576f)
                lineTo(284f, 732f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(168f, -168f)
                lineTo(84f, 196f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(624f, 736f)
                lineTo(508f, 852f)
                quadToRelative(-6f, 6f, -13f, 9f)
                reflectiveQuadToRelative(-15f, 3f)
                quadToRelative(-16f, 0f, -28f, -11.5f)
                reflectiveQuadTo(440f, 823f)
                verticalLineToRelative(-247f)
                close()
                moveToRelative(80f, 150f)
                lineToRelative(46f, -46f)
                lineToRelative(-46f, -46f)
                verticalLineToRelative(92f)
                close()
                moveToRelative(44f, -274f)
                lineToRelative(-56f, -56f)
                lineToRelative(88f, -88f)
                lineToRelative(-76f, -74f)
                verticalLineToRelative(174f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-191f)
                quadToRelative(0f, -18f, 12f, -29.5f)
                reflectiveQuadToRelative(28f, -11.5f)
                quadToRelative(8f, 0f, 15f, 3f)
                reflectiveQuadToRelative(13f, 9f)
                lineToRelative(172f, 172f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(564f, 452f)
                close()
            }
        }.build()
        
        return _Bluetooth_disabled!!
    }

private var _Bluetooth_disabled: ImageVector? = null

