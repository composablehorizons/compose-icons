package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Bluetooth_searching: ImageVector
    get() {
        if (_Bluetooth_searching != null) return _Bluetooth_searching!!
        
        _Bluetooth_searching = ImageVector.Builder(
            name = "bluetooth_searching",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 880f)
                verticalLineToRelative(-304f)
                lineTo(176f, 760f)
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
                lineTo(400f, 880f)
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
                moveToRelative(222f, -152f)
                lineToRelative(-92f, -94f)
                lineToRelative(92f, -92f)
                quadToRelative(9f, 22f, 14.5f, 45f)
                reflectiveQuadToRelative(5.5f, 47f)
                quadToRelative(0f, 24f, -5.5f, 47.5f)
                reflectiveQuadTo(662f, 574f)
                close()
                moveToRelative(118f, 114f)
                lineToRelative(-50f, -48f)
                quadToRelative(20f, -37f, 31f, -77.5f)
                reflectiveQuadToRelative(11f, -82.5f)
                quadToRelative(0f, -42f, -11f, -82.5f)
                reflectiveQuadTo(730f, 320f)
                lineToRelative(50f, -50f)
                quadToRelative(29f, 48f, 44.5f, 101f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(0f, 56f, -15.5f, 108.5f)
                reflectiveQuadTo(780f, 688f)
                close()
            }
        }.build()
        
        return _Bluetooth_searching!!
    }

private var _Bluetooth_searching: ImageVector? = null

