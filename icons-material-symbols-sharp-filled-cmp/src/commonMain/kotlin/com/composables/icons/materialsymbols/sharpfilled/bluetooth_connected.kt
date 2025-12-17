package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Bluetooth_connected: ImageVector
    get() {
        if (_Bluetooth_connected != null) return _Bluetooth_connected!!
        
        _Bluetooth_connected = ImageVector.Builder(
            name = "bluetooth_connected",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 880f)
                verticalLineToRelative(-304f)
                lineTo(256f, 760f)
                lineToRelative(-56f, -56f)
                lineToRelative(224f, -224f)
                lineToRelative(-224f, -224f)
                lineToRelative(56f, -56f)
                lineToRelative(184f, 184f)
                verticalLineToRelative(-304f)
                horizontalLineToRelative(40f)
                lineToRelative(228f, 228f)
                lineToRelative(-172f, 172f)
                lineToRelative(172f, 172f)
                lineTo(480f, 880f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(80f, -496f)
                lineToRelative(76f, -76f)
                lineToRelative(-76f, -74f)
                verticalLineToRelative(150f)
                close()
                moveToRelative(0f, 342f)
                lineToRelative(76f, -74f)
                lineToRelative(-76f, -76f)
                verticalLineToRelative(150f)
                close()
                moveTo(200f, 540f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(140f, 480f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(200f, 420f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(260f, 480f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(200f, 540f)
                close()
                moveToRelative(560f, 0f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(700f, 480f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(760f, 420f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(820f, 480f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(760f, 540f)
                close()
            }
        }.build()
        
        return _Bluetooth_connected!!
    }

private var _Bluetooth_connected: ImageVector? = null

