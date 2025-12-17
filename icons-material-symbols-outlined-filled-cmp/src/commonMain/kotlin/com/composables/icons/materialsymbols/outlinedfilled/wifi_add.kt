package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Wifi_add: ImageVector
    get() {
        if (_Wifi_add != null) return _Wifi_add!!
        
        _Wifi_add = ImageVector.Builder(
            name = "wifi_add",
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
                moveToRelative(240f, 0f)
                verticalLineToRelative(-120f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(800f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Wifi_add!!
    }

private var _Wifi_add: ImageVector? = null

