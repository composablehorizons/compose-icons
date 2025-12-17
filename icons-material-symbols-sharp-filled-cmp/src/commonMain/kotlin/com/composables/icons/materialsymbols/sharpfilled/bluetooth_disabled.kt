package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Bluetooth_disabled: ImageVector
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
                moveTo(792f, 904f)
                lineTo(624f, 736f)
                lineTo(480f, 880f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-304f)
                lineTo(256f, 760f)
                lineToRelative(-56f, -56f)
                lineToRelative(196f, -196f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(520f, 726f)
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
                verticalLineToRelative(-248f)
                horizontalLineToRelative(40f)
                lineToRelative(228f, 228f)
                lineToRelative(-144f, 144f)
                close()
            }
        }.build()
        
        return _Bluetooth_disabled!!
    }

private var _Bluetooth_disabled: ImageVector? = null

