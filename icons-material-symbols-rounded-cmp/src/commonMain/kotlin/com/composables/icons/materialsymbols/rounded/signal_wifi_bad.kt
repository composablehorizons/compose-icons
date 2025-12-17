package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Signal_wifi_bad: ImageVector
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
                moveTo(760f, 737f)
                lineToRelative(-56f, 55f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(648f, 792f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(56f, -56f)
                lineToRelative(-56f, -56f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(56f, 56f)
                lineToRelative(56f, -56f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 11f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(872f, 625f)
                lineToRelative(-55f, 55f)
                lineToRelative(55f, 56f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(872f, 792f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-56f, -55f)
                close()
                moveTo(480f, 160f)
                quadToRelative(113f, 0f, 219f, 35.5f)
                reflectiveQuadTo(893f, 300f)
                quadToRelative(15f, 11f, 22.5f, 27.5f)
                reflectiveQuadTo(923f, 361f)
                quadToRelative(0f, 17f, -6.5f, 33f)
                reflectiveQuadTo(897f, 423f)
                lineToRelative(-46f, 46f)
                quadToRelative(-12f, 11f, -28.5f, 11.5f)
                reflectiveQuadTo(794f, 469f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(50f, -50f)
                quadToRelative(-79f, -60f, -172f, -91f)
                reflectiveQuadToRelative(-192f, -31f)
                quadToRelative(-99f, 0f, -192f, 31f)
                reflectiveQuadToRelative(-172f, 91f)
                lineToRelative(364f, 364f)
                lineToRelative(11f, -11f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(548f, 772f)
                lineToRelative(-11f, 11f)
                quadToRelative(-12f, 12f, -27f, 18f)
                reflectiveQuadToRelative(-30f, 6f)
                quadToRelative(-15f, 0f, -30f, -6f)
                reflectiveQuadToRelative(-27f, -18f)
                lineTo(63f, 423f)
                quadToRelative(-13f, -13f, -19f, -28.5f)
                reflectiveQuadTo(38f, 362f)
                quadToRelative(0f, -17f, 7f, -33.5f)
                reflectiveQuadTo(67f, 300f)
                quadToRelative(88f, -69f, 194f, -104.5f)
                reflectiveQuadTo(480f, 160f)
                close()
                moveToRelative(0f, 323f)
                close()
            }
        }.build()
        
        return _Signal_wifi_bad!!
    }

private var _Signal_wifi_bad: ImageVector? = null

