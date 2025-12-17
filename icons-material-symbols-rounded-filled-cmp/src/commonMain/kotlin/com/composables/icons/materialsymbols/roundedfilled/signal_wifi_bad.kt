package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Signal_wifi_bad: ImageVector
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
                moveToRelative(9f, -300f)
                horizontalLineToRelative(-8f)
                quadToRelative(-101f, 0f, -172f, 71f)
                reflectiveQuadToRelative(-71f, 172f)
                verticalLineToRelative(8f)
                quadToRelative(1f, 18f, 4f, 36.5f)
                reflectiveQuadToRelative(9f, 35.5f)
                quadToRelative(3f, 10f, 1.5f, 19.5f)
                reflectiveQuadTo(524f, 796f)
                quadToRelative(-9f, 9f, -20.5f, 13.5f)
                reflectiveQuadTo(480f, 814f)
                quadToRelative(-12f, 0f, -23.5f, -4.5f)
                reflectiveQuadTo(436f, 796f)
                lineTo(63f, 423f)
                quadToRelative(-13f, -13f, -19f, -28f)
                reflectiveQuadToRelative(-6f, -32f)
                quadToRelative(0f, -17f, 7f, -34f)
                reflectiveQuadToRelative(22f, -29f)
                quadToRelative(88f, -69f, 194f, -104.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(113f, 0f, 219f, 35.5f)
                reflectiveQuadTo(893f, 300f)
                quadToRelative(15f, 11f, 22f, 28f)
                reflectiveQuadToRelative(7f, 34f)
                quadToRelative(0f, 17f, -6f, 32.5f)
                reflectiveQuadTo(897f, 423f)
                lineToRelative(-20f, 20f)
                quadToRelative(-8f, 8f, -17f, 9.5f)
                reflectiveQuadToRelative(-19f, -2.5f)
                quadToRelative(-17f, -6f, -35f, -9f)
                reflectiveQuadToRelative(-37f, -4f)
                close()
            }
        }.build()
        
        return _Signal_wifi_bad!!
    }

private var _Signal_wifi_bad: ImageVector? = null

