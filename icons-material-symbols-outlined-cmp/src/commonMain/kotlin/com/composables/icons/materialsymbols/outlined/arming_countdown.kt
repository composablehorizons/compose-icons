package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Arming_countdown: ImageVector
    get() {
        if (_Arming_countdown != null) return _Arming_countdown!!
        
        _Arming_countdown = ImageVector.Builder(
            name = "arming_countdown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 640f)
                quadToRelative(75f, 0f, 127.5f, -52.5f)
                reflectiveQuadTo(660f, 460f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(480f, 280f)
                verticalLineToRelative(60f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-33f, 0f, -61.5f, -17f)
                reflectiveQuadTo(374f, 517f)
                lineToRelative(-52f, 29f)
                quadToRelative(24f, 44f, 66f, 69f)
                reflectiveQuadToRelative(92f, 25f)
                close()
                moveTo(330f, 494f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(360f, 464f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(330f, 434f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(300f, 464f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(330f, 494f)
                close()
                moveToRelative(22f, -84f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(382f, 380f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(352f, 350f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(322f, 380f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(352f, 410f)
                close()
                moveToRelative(58f, -55f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(440f, 325f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(410f, 295f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(380f, 325f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(410f, 355f)
                close()
                moveToRelative(70f, 525f)
                quadToRelative(-139f, -35f, -229.5f, -159.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-244f)
                lineToRelative(320f, -120f)
                lineToRelative(320f, 120f)
                verticalLineToRelative(244f)
                quadToRelative(0f, 152f, -90.5f, 276.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -84f)
                quadToRelative(104f, -33f, 172f, -132f)
                reflectiveQuadToRelative(68f, -220f)
                verticalLineToRelative(-189f)
                lineToRelative(-240f, -90f)
                lineToRelative(-240f, 90f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 121f, 68f, 220f)
                reflectiveQuadToRelative(172f, 132f)
                close()
                moveToRelative(0f, -316f)
                close()
            }
        }.build()
        
        return _Arming_countdown!!
    }

private var _Arming_countdown: ImageVector? = null

