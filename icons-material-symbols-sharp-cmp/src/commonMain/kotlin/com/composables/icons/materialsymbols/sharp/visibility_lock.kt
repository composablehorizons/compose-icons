package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Visibility_lock: ImageVector
    get() {
        if (_Visibility_lock != null) return _Visibility_lock!!
        
        _Visibility_lock = ImageVector.Builder(
            name = "visibility_lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 568f)
                quadToRelative(-45f, 0f, -76.5f, -31.5f)
                reflectiveQuadTo(372f, 460f)
                quadToRelative(0f, -45f, 31.5f, -76.5f)
                reflectiveQuadTo(480f, 352f)
                quadToRelative(45f, 0f, 76.5f, 31.5f)
                reflectiveQuadTo(588f, 460f)
                quadToRelative(0f, 45f, -31.5f, 76.5f)
                reflectiveQuadTo(480f, 568f)
                close()
                moveToRelative(0f, 192f)
                quadToRelative(-146f, 0f, -266f, -81.5f)
                reflectiveQuadTo(40f, 460f)
                quadToRelative(54f, -137f, 174f, -218.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(141f, 0f, 257.5f, 76f)
                reflectiveQuadTo(912f, 440f)
                horizontalLineToRelative(-91f)
                quadToRelative(-52f, -93f, -143f, -146.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-113f, 0f, -207.5f, 59.5f)
                reflectiveQuadTo(128f, 460f)
                quadToRelative(50f, 101f, 144.5f, 160.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(20f, 0f, 40f, -2f)
                reflectiveQuadToRelative(40f, -6f)
                verticalLineToRelative(81f)
                quadToRelative(-20f, 3f, -40f, 5f)
                reflectiveQuadToRelative(-40f, 2f)
                close()
                moveToRelative(0f, -120f)
                quadToRelative(22f, 0f, 42.5f, -5f)
                reflectiveQuadToRelative(38.5f, -14f)
                quadToRelative(5f, -50f, 31.5f, -90f)
                reflectiveQuadToRelative(67.5f, -64f)
                verticalLineToRelative(-7f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(300f, 460f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(480f, 640f)
                close()
                moveToRelative(-5f, -180f)
                close()
                moveToRelative(165f, 380f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(760f, 520f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 600f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(200f)
                horizontalLineTo(640f)
                close()
                moveToRelative(80f, -200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(760f, 560f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(720f, 600f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Visibility_lock!!
    }

private var _Visibility_lock: ImageVector? = null

