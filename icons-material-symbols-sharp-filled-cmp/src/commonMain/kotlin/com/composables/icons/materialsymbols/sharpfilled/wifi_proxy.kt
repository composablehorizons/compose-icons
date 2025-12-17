package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Wifi_proxy: ImageVector
    get() {
        if (_Wifi_proxy != null) return _Wifi_proxy!!
        
        _Wifi_proxy = ImageVector.Builder(
            name = "wifi_proxy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                lineTo(0f, 360f)
                quadToRelative(95f, -97f, 219.5f, -148.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(136f, 0f, 260.5f, 51.5f)
                reflectiveQuadTo(960f, 360f)
                lineToRelative(-99f, 99f)
                quadToRelative(-23f, -11f, -48.5f, -16.5f)
                reflectiveQuadTo(761f, 437f)
                quadToRelative(-101f, 0f, -172f, 71f)
                reflectiveQuadToRelative(-71f, 172f)
                quadToRelative(0f, 26f, 5.5f, 51.5f)
                reflectiveQuadTo(540f, 780f)
                lineToRelative(-60f, 60f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(170f)
                verticalLineToRelative(110f)
                horizontalLineToRelative(110f)
                verticalLineToRelative(170f)
                horizontalLineTo(640f)
                close()
                moveToRelative(60f, -170f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(-50f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(50f)
                close()
                moveToRelative(0f, 110f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(-50f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(50f)
                close()
                moveToRelative(110f, 0f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(-50f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(50f)
                close()
            }
        }.build()
        
        return _Wifi_proxy!!
    }

private var _Wifi_proxy: ImageVector? = null

