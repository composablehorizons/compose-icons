package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Ssid_chart: ImageVector
    get() {
        if (_Ssid_chart != null) return _Ssid_chart!!
        
        _Ssid_chart = ImageVector.Builder(
            name = "ssid_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                lineTo(232f, 600f)
                lineToRelative(-112f, 80f)
                verticalLineToRelative(-98f)
                lineToRelative(120f, -86f)
                lineToRelative(245f, 238f)
                lineToRelative(167f, -134f)
                horizontalLineToRelative(188f)
                verticalLineToRelative(80f)
                horizontalLineTo(680f)
                lineTo(480f, 840f)
                close()
                moveToRelative(0f, -360f)
                lineTo(305f, 305f)
                lineTo(120f, 440f)
                verticalLineToRelative(-99f)
                lineToRelative(193f, -141f)
                lineToRelative(175f, 175f)
                lineToRelative(352f, -255f)
                verticalLineToRelative(99f)
                lineTo(480f, 480f)
                close()
            }
        }.build()
        
        return _Ssid_chart!!
    }

private var _Ssid_chart: ImageVector? = null

