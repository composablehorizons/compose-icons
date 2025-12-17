package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Battery_android_frame_shield: ImageVector
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
                moveTo(160.22f, 720f)
                quadToRelative(-50.09f, 0f, -85.16f, -35f)
                quadTo(40f, 650f, 40f, 600f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -50f, 35.13f, -85f)
                quadToRelative(35.14f, -35f, 85.33f, -35f)
                horizontalLineToRelative(366.39f)
                quadToRelative(17.06f, 0f, 28.61f, 11.5f)
                quadTo(567f, 263f, 567f, 280f)
                reflectiveQuadToRelative(-11.55f, 28.5f)
                quadTo(543.9f, 320f, 526.82f, 320f)
                horizontalLineTo(160.18f)
                quadToRelative(-17.08f, 0f, -28.63f, 11.5f)
                reflectiveQuadTo(120f, 360f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, 11.52f, 28.5f)
                quadToRelative(11.53f, 11.5f, 28.57f, 11.5f)
                horizontalLineToRelative(389.83f)
                quadToRelative(20.04f, 0f, 29.56f, 12.5f)
                reflectiveQuadTo(589f, 680f)
                quadToRelative(0f, 15f, -9.52f, 27.5f)
                quadToRelative(-9.51f, 12.5f, -29.55f, 12.5f)
                horizontalLineTo(160.22f)
                close()
                moveToRelative(39.9f, -120f)
                quadToRelative(-17.05f, 0f, -28.59f, -11.5f)
                quadTo(160f, 577f, 160f, 560f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.54f, -28.5f)
                reflectiveQuadToRelative(28.59f, -11.5f)
                horizontalLineToRelative(247.82f)
                quadToRelative(14.05f, 0f, 23.55f, 9.5f)
                reflectiveQuadTo(482f, 393f)
                quadToRelative(3f, 45f, 12f, 85.5f)
                reflectiveQuadToRelative(24f, 75.5f)
                quadToRelative(7f, 17f, -2f, 31.5f)
                reflectiveQuadTo(489.96f, 600f)
                horizontalLineTo(200.12f)
                close()
                moveTo(740f, 674f)
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

