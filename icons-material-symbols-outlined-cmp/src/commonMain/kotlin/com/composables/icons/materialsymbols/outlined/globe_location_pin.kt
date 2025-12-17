package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Globe_location_pin: ImageVector
    get() {
        if (_Globe_location_pin != null) return _Globe_location_pin!!
        
        _Globe_location_pin = ImageVector.Builder(
            name = "globe_location_pin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(152f, 0f, 263.5f, 98f)
                reflectiveQuadTo(876f, 422f)
                quadToRelative(-20f, -10f, -41.5f, -15.5f)
                reflectiveQuadTo(790f, 400f)
                quadToRelative(-19f, -73f, -68.5f, -130f)
                reflectiveQuadTo(600f, 184f)
                verticalLineToRelative(16f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(520f, 280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 400f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(240f)
                quadToRelative(11f, 0f, 20.5f, 5.5f)
                reflectiveQuadTo(595f, 501f)
                quadToRelative(-17f, 27f, -26f, 57f)
                reflectiveQuadToRelative(-9f, 62f)
                quadToRelative(0f, 63f, 32.5f, 117f)
                reflectiveQuadTo(659f, 838f)
                quadToRelative(-41f, 20f, -86f, 31f)
                reflectiveQuadToRelative(-93f, 11f)
                close()
                moveToRelative(-40f, -82f)
                verticalLineToRelative(-78f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(360f, 640f)
                verticalLineToRelative(-40f)
                lineTo(168f, 408f)
                quadToRelative(-3f, 18f, -5.5f, 36f)
                reflectiveQuadToRelative(-2.5f, 36f)
                quadToRelative(0f, 121f, 79.5f, 212f)
                reflectiveQuadTo(440f, 798f)
                close()
                moveToRelative(340f, 82f)
                quadToRelative(-7f, 0f, -12f, -4f)
                reflectiveQuadToRelative(-7f, -10f)
                quadToRelative(-11f, -35f, -31f, -65f)
                reflectiveQuadToRelative(-43f, -59f)
                quadToRelative(-21f, -26f, -34f, -57f)
                reflectiveQuadToRelative(-13f, -65f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 34f, -13.5f, 64.5f)
                reflectiveQuadTo(873f, 742f)
                quadToRelative(-23f, 29f, -43f, 59f)
                reflectiveQuadToRelative(-31f, 65f)
                quadToRelative(-2f, 6f, -7f, 10f)
                reflectiveQuadToRelative(-12f, 4f)
                close()
                moveToRelative(0f, -113f)
                quadToRelative(10f, -17f, 22f, -31.5f)
                reflectiveQuadToRelative(23f, -29.5f)
                quadToRelative(14f, -19f, 24.5f, -40.5f)
                reflectiveQuadTo(860f, 620f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(780f, 540f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(700f, 620f)
                quadToRelative(0f, 24f, 10.5f, 45.5f)
                reflectiveQuadTo(735f, 706f)
                quadToRelative(12f, 15f, 23.5f, 29.5f)
                reflectiveQuadTo(780f, 767f)
                close()
                moveToRelative(0f, -97f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(730f, 620f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(780f, 570f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(830f, 620f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(780f, 670f)
                close()
            }
        }.build()
        
        return _Globe_location_pin!!
    }

private var _Globe_location_pin: ImageVector? = null

