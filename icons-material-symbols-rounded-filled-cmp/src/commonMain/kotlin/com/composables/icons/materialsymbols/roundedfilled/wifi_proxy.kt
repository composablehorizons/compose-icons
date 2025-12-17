package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Wifi_proxy: ImageVector
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
                moveTo(700f, 780f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(-50f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(50f)
                close()
                moveToRelative(0f, -110f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(-50f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(50f)
                close()
                moveToRelative(110f, 110f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(-50f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(50f)
                close()
                moveToRelative(-110f, 60f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(640f, 780f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(700f, 560f)
                horizontalLineToRelative(50f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(810f, 620f)
                verticalLineToRelative(50f)
                horizontalLineToRelative(50f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(920f, 730f)
                verticalLineToRelative(50f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(860f, 840f)
                horizontalLineTo(700f)
                close()
                moveToRelative(-220f, -26f)
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
                quadToRelative(-7f, 7f, -17f, 9.5f)
                reflectiveQuadToRelative(-19f, -1.5f)
                quadToRelative(-20f, -7f, -40f, -10.5f)
                reflectiveQuadToRelative(-40f, -3.5f)
                quadToRelative(-101f, 0f, -172f, 71f)
                reflectiveQuadToRelative(-71f, 172f)
                quadToRelative(0f, 20f, 3.5f, 40f)
                reflectiveQuadToRelative(10.5f, 40f)
                quadToRelative(3f, 9f, 1f, 19f)
                reflectiveQuadToRelative(-9f, 17f)
                quadToRelative(-9f, 9f, -20.5f, 13.5f)
                reflectiveQuadTo(480f, 814f)
                close()
            }
        }.build()
        
        return _Wifi_proxy!!
    }

private var _Wifi_proxy: ImageVector? = null

