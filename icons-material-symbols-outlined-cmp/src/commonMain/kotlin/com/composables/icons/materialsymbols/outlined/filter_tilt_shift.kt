package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Filter_tilt_shift: ImageVector
    get() {
        if (_Filter_tilt_shift != null) return _Filter_tilt_shift!!
        
        _Filter_tilt_shift = ImageVector.Builder(
            name = "filter_tilt_shift",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(170f, 732f)
                quadToRelative(-38f, -45f, -61f, -99f)
                reflectiveQuadTo(80f, 520f)
                horizontalLineToRelative(82f)
                quadToRelative(6f, 43f, 22f, 82.5f)
                reflectiveQuadToRelative(42f, 73.5f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(80f, 440f)
                quadToRelative(8f, -59f, 30f, -113f)
                reflectiveQuadToRelative(60f, -99f)
                lineToRelative(56f, 56f)
                quadToRelative(-26f, 34f, -42f, 73.5f)
                reflectiveQuadTo(162f, 440f)
                horizontalLineTo(80f)
                close()
                moveTo(438f, 878f)
                quadToRelative(-59f, -6f, -112.5f, -28.5f)
                reflectiveQuadTo(226f, 790f)
                lineToRelative(56f, -58f)
                quadToRelative(35f, 26f, 74f, 43f)
                reflectiveQuadToRelative(82f, 23f)
                verticalLineToRelative(80f)
                close()
                moveTo(284f, 228f)
                lineToRelative(-58f, -58f)
                quadToRelative(47f, -37f, 101f, -59.5f)
                reflectiveQuadTo(440f, 82f)
                verticalLineToRelative(80f)
                quadToRelative(-43f, 6f, -82.5f, 23f)
                reflectiveQuadTo(284f, 228f)
                close()
                moveToRelative(196f, 372f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(38f, 278f)
                verticalLineToRelative(-80f)
                quadToRelative(44f, -6f, 83.5f, -22.5f)
                reflectiveQuadTo(676f, 732f)
                lineToRelative(58f, 58f)
                quadToRelative(-47f, 38f, -101.5f, 60f)
                reflectiveQuadTo(518f, 878f)
                close()
                moveToRelative(160f, -650f)
                quadToRelative(-35f, -26f, -75f, -43f)
                reflectiveQuadToRelative(-83f, -23f)
                verticalLineToRelative(-80f)
                quadToRelative(59f, 6f, 113.5f, 28.5f)
                reflectiveQuadTo(734f, 170f)
                lineToRelative(-56f, 58f)
                close()
                moveToRelative(112f, 504f)
                lineToRelative(-56f, -56f)
                quadToRelative(26f, -34f, 42f, -73.5f)
                reflectiveQuadToRelative(22f, -82.5f)
                horizontalLineToRelative(82f)
                quadToRelative(-8f, 59f, -30f, 113f)
                reflectiveQuadToRelative(-60f, 99f)
                close()
                moveToRelative(8f, -292f)
                quadToRelative(-6f, -43f, -22f, -82.5f)
                reflectiveQuadTo(734f, 284f)
                lineToRelative(56f, -56f)
                quadToRelative(38f, 45f, 61f, 99f)
                reflectiveQuadToRelative(29f, 113f)
                horizontalLineToRelative(-82f)
                close()
            }
        }.build()
        
        return _Filter_tilt_shift!!
    }

private var _Filter_tilt_shift: ImageVector? = null

