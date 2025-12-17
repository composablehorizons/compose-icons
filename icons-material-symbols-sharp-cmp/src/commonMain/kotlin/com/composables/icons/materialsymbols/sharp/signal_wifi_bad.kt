package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Signal_wifi_bad: ImageVector
    get() {
        if (_Signal_wifi_bad != null) return _Signal_wifi_bad!!
        
        _Signal_wifi_bad = ImageVector.Builder(
            name = "signal_wifi_bad",
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
                lineTo(812f, 508f)
                quadToRelative(-17f, -5f, -35f, -8f)
                reflectiveQuadToRelative(-37f, -3f)
                quadToRelative(-101f, 0f, -172f, 70.5f)
                reflectiveQuadTo(497f, 740f)
                quadToRelative(0f, 19f, 3f, 37f)
                reflectiveQuadToRelative(8f, 35f)
                lineToRelative(-28f, 28f)
                close()
                moveToRelative(176f, 40f)
                lineToRelative(-56f, -56f)
                lineToRelative(84f, -84f)
                lineToRelative(-84f, -84f)
                lineToRelative(56f, -56f)
                lineToRelative(84f, 84f)
                lineToRelative(84f, -84f)
                lineToRelative(56f, 56f)
                lineToRelative(-83f, 84f)
                lineToRelative(83f, 84f)
                lineToRelative(-56f, 56f)
                lineToRelative(-84f, -83f)
                lineToRelative(-84f, 83f)
                close()
            }
        }.build()
        
        return _Signal_wifi_bad!!
    }

private var _Signal_wifi_bad: ImageVector? = null

