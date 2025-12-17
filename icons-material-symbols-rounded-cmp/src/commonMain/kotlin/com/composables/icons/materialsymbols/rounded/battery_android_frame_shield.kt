package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Battery_android_frame_shield: ImageVector
    get() {
        if (_Battery_android_frame_shield != null) return _Battery_android_frame_shield!!
        
        _Battery_android_frame_shield = ImageVector.Builder(
            name = "battery_android_frame_shield",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 720f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                horizontalLineToRelative(365f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(565f, 280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(525f, 320f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(120f, 360f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(160f, 640f)
                horizontalLineToRelative(389f)
                quadToRelative(20f, 0f, 29.5f, 12.5f)
                reflectiveQuadTo(588f, 680f)
                quadToRelative(0f, 15f, -9.5f, 27.5f)
                reflectiveQuadTo(549f, 720f)
                horizontalLineTo(160f)
                close()
                moveToRelative(40f, -120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 560f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 360f)
                horizontalLineToRelative(247f)
                quadToRelative(14f, 0f, 23.5f, 9.5f)
                reflectiveQuadTo(481f, 393f)
                quadToRelative(3f, 45f, 12f, 85.5f)
                reflectiveQuadToRelative(24f, 75.5f)
                quadToRelative(7f, 17f, -2f, 31.5f)
                reflectiveQuadTo(489f, 600f)
                horizontalLineTo(200f)
                close()
                moveToRelative(540f, 74f)
                quadToRelative(-8f, 0f, -16f, -2f)
                reflectiveQuadToRelative(-15f, -6f)
                quadToRelative(-64f, -35f, -103.5f, -112f)
                reflectiveQuadTo(561f, 383f)
                quadToRelative(-1f, -10f, 5.5f, -17.5f)
                reflectiveQuadTo(583f, 356f)
                quadToRelative(31f, -7f, 64f, -22f)
                reflectiveQuadToRelative(70f, -38f)
                quadToRelative(11f, -7f, 23f, -7f)
                reflectiveQuadToRelative(23f, 7f)
                quadToRelative(37f, 24f, 70.5f, 38.5f)
                reflectiveQuadTo(898f, 356f)
                quadToRelative(10f, 2f, 15.5f, 9.5f)
                reflectiveQuadTo(919f, 383f)
                quadToRelative(-5f, 95f, -45.5f, 171.5f)
                reflectiveQuadTo(770f, 666f)
                quadToRelative(-7f, 4f, -14.5f, 6f)
                reflectiveQuadToRelative(-15.5f, 2f)
                close()
                moveToRelative(0f, -83f)
                quadToRelative(35f, -23f, 60f, -68f)
                reflectiveQuadToRelative(35f, -102f)
                quadToRelative(-23f, -8f, -46.5f, -19.5f)
                reflectiveQuadTo(740f, 375f)
                verticalLineToRelative(216f)
                close()
            }
        }.build()
        
        return _Battery_android_frame_shield!!
    }

private var _Battery_android_frame_shield: ImageVector? = null

