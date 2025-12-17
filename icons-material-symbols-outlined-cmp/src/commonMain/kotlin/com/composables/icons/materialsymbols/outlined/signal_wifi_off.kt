package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Signal_wifi_off: ImageVector
    get() {
        if (_Signal_wifi_off != null) return _Signal_wifi_off!!
        
        _Signal_wifi_off = ImageVector.Builder(
            name = "signal_wifi_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(717f, 603f)
                lineToRelative(-57f, -57f)
                lineToRelative(184f, -184f)
                quadToRelative(-79f, -60f, -172f, -91f)
                reflectiveQuadToRelative(-192f, -31f)
                quadToRelative(-29f, 0f, -58f, 3f)
                reflectiveQuadToRelative(-58f, 8f)
                lineToRelative(-66f, -66f)
                quadToRelative(45f, -12f, 90f, -18.5f)
                reflectiveQuadToRelative(92f, -6.5f)
                quadToRelative(136f, 0f, 260.5f, 51.5f)
                reflectiveQuadTo(960f, 360f)
                lineTo(717f, 603f)
                close()
                moveTo(480f, 726f)
                lineToRelative(67f, -66f)
                lineToRelative(-350f, -350f)
                quadToRelative(-21f, 11f, -41f, 24.5f)
                reflectiveQuadTo(116f, 362f)
                lineToRelative(364f, 364f)
                close()
                moveTo(819f, 932f)
                lineTo(604f, 716f)
                lineTo(480f, 840f)
                lineTo(0f, 360f)
                quadToRelative(32f, -32f, 66.5f, -59f)
                reflectiveQuadToRelative(72.5f, -49f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(512f, 398f)
                close()
                moveToRelative(-140f, 87f)
                close()
            }
        }.build()
        
        return _Signal_wifi_off!!
    }

private var _Signal_wifi_off: ImageVector? = null

