package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Settings_photo_camera: ImageVector
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
                lineToRelative(40f, -40f)
                horizontalLineToRelative(80f)
                lineToRelative(40f, 40f)
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
                moveTo(480f, 480f)
                close()
                moveToRelative(2f, -140f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 48f, 27f, 84f)
                reflectiveQuadToRelative(71f, 50f)
                verticalLineToRelative(-90f)
                quadToRelative(-8f, -8f, -13f, -20.5f)
                reflectiveQuadToRelative(-5f, -23.5f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(482f, 420f)
                quadToRelative(14f, 0f, 25f, 5.5f)
                reflectiveQuadToRelative(19f, 14.5f)
                horizontalLineToRelative(90f)
                quadToRelative(-13f, -44f, -49.5f, -72f)
                reflectiveQuadTo(482f, 340f)
                close()
                moveTo(370f, 880f)
                lineToRelative(-16f, -128f)
                quadToRelative(-13f, -5f, -24.5f, -12f)
                reflectiveQuadTo(307f, 725f)
                lineToRelative(-119f, 50f)
                lineTo(78f, 585f)
                lineToRelative(103f, -78f)
                quadToRelative(-1f, -7f, -1f, -13.5f)
                verticalLineToRelative(-27f)
                quadToRelative(0f, -6.5f, 1f, -13.5f)
                lineTo(78f, 375f)
                lineToRelative(110f, -190f)
                lineToRelative(119f, 50f)
                quadToRelative(11f, -8f, 23f, -15f)
                reflectiveQuadToRelative(24f, -12f)
                lineToRelative(16f, -128f)
                horizontalLineToRelative(220f)
                lineToRelative(16f, 128f)
                quadToRelative(13f, 5f, 24.5f, 12f)
                reflectiveQuadToRelative(22.5f, 15f)
                lineToRelative(119f, -50f)
                lineToRelative(110f, 190f)
                lineToRelative(-85f, 65f)
                horizontalLineTo(696f)
                quadToRelative(-1f, -5f, -2f, -10.5f)
                reflectiveQuadToRelative(-3f, -10.5f)
                lineToRelative(86f, -65f)
                lineToRelative(-39f, -68f)
                lineToRelative(-99f, 42f)
                quadToRelative(-22f, -23f, -48.5f, -38.5f)
                reflectiveQuadTo(533f, 266f)
                lineToRelative(-13f, -106f)
                horizontalLineToRelative(-79f)
                lineToRelative(-14f, 106f)
                quadToRelative(-31f, 8f, -57.5f, 23.5f)
                reflectiveQuadTo(321f, 327f)
                lineToRelative(-99f, -41f)
                lineToRelative(-39f, 68f)
                lineToRelative(86f, 64f)
                quadToRelative(-5f, 15f, -7f, 30f)
                reflectiveQuadToRelative(-2f, 32f)
                quadToRelative(0f, 16f, 2f, 31f)
                reflectiveQuadToRelative(7f, 30f)
                lineToRelative(-86f, 65f)
                lineToRelative(39f, 68f)
                lineToRelative(99f, -42f)
                quadToRelative(24f, 25f, 54f, 42f)
                reflectiveQuadToRelative(65f, 22f)
                verticalLineToRelative(184f)
                horizontalLineToRelative(-70f)
                close()
            }
        }.build()
        
        return _Settings_photo_camera!!
    }

private var _Settings_photo_camera: ImageVector? = null

