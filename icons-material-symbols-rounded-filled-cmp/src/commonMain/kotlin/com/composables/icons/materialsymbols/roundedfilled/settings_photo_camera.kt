package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Settings_photo_camera: ImageVector
    get() {
        if (_Settings_photo_camera != null) return _Settings_photo_camera!!
        
        _Settings_photo_camera = ImageVector.Builder(
            name = "settings_photo_camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(580f, 880f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(520f, 820f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(580f, 560f)
                horizontalLineToRelative(60f)
                lineToRelative(28f, -28f)
                quadToRelative(6f, -6f, 13.5f, -9f)
                reflectiveQuadToRelative(15.5f, -3f)
                horizontalLineToRelative(46f)
                quadToRelative(8f, 0f, 15.5f, 3f)
                reflectiveQuadToRelative(13.5f, 9f)
                lineToRelative(28f, 28f)
                horizontalLineToRelative(60f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(920f, 620f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(860f, 880f)
                horizontalLineTo(580f)
                close()
                moveToRelative(140f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(800f, 720f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(720f, 640f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(640f, 720f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(720f, 800f)
                close()
                moveTo(411f, 880f)
                quadToRelative(-17f, 0f, -30f, -11f)
                reflectiveQuadToRelative(-15f, -28f)
                lineToRelative(-12f, -89f)
                quadToRelative(-13f, -5f, -24.5f, -12f)
                reflectiveQuadTo(307f, 725f)
                lineToRelative(-62f, 26f)
                quadToRelative(-25f, 11f, -50f, 2f)
                reflectiveQuadToRelative(-39f, -32f)
                lineToRelative(-47f, -82f)
                quadToRelative(-14f, -23f, -8f, -49f)
                reflectiveQuadToRelative(27f, -43f)
                lineToRelative(53f, -40f)
                quadToRelative(-1f, -7f, -1f, -13.5f)
                verticalLineToRelative(-27f)
                quadToRelative(0f, -6.5f, 1f, -13.5f)
                lineToRelative(-53f, -40f)
                quadToRelative(-21f, -17f, -27f, -43f)
                reflectiveQuadToRelative(8f, -49f)
                lineToRelative(47f, -82f)
                quadToRelative(14f, -23f, 39f, -32f)
                reflectiveQuadToRelative(50f, 2f)
                lineToRelative(62f, 26f)
                quadToRelative(11f, -8f, 23f, -15f)
                reflectiveQuadToRelative(24f, -12f)
                lineToRelative(8f, -66f)
                quadToRelative(3f, -27f, 23f, -44.5f)
                reflectiveQuadToRelative(47f, -17.5f)
                horizontalLineToRelative(96f)
                quadToRelative(27f, 0f, 47f, 17.5f)
                reflectiveQuadToRelative(23f, 44.5f)
                lineToRelative(8f, 66f)
                quadToRelative(13f, 5f, 24.5f, 12f)
                reflectiveQuadToRelative(22.5f, 15f)
                lineToRelative(60f, -26f)
                quadToRelative(25f, -11f, 50.5f, -2f)
                reflectiveQuadToRelative(39.5f, 32f)
                lineToRelative(47f, 82f)
                quadToRelative(14f, 23f, 8.5f, 49f)
                reflectiveQuadTo(832f, 413f)
                lineToRelative(-67f, 51f)
                quadToRelative(-11f, 8f, -22.5f, 12f)
                reflectiveQuadToRelative(-25.5f, 4f)
                horizontalLineToRelative(-94f)
                quadToRelative(0f, -58f, -41.5f, -99f)
                reflectiveQuadTo(482f, 340f)
                quadToRelative(-59f, 0f, -99.5f, 40.5f)
                reflectiveQuadTo(342f, 480f)
                quadToRelative(0f, 48f, 27.5f, 84f)
                reflectiveQuadToRelative(70.5f, 50f)
                verticalLineToRelative(232f)
                quadToRelative(0f, 14f, -8f, 24f)
                reflectiveQuadToRelative(-21f, 10f)
                close()
            }
        }.build()
        
        return _Settings_photo_camera!!
    }

private var _Settings_photo_camera: ImageVector? = null

