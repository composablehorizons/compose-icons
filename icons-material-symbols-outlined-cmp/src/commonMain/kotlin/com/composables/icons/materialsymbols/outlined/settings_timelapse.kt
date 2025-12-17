package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Settings_timelapse: ImageVector
    get() {
        if (_Settings_timelapse != null) return _Settings_timelapse!!
        
        _Settings_timelapse = ImageVector.Builder(
            name = "settings_timelapse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 840f)
                verticalLineToRelative(-240f)
                lineToRelative(200f, 120f)
                lineToRelative(-200f, 120f)
                close()
                moveToRelative(-200f, 0f)
                verticalLineToRelative(-240f)
                lineToRelative(200f, 120f)
                lineToRelative(-200f, 120f)
                close()
                moveToRelative(-40f, -360f)
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
                lineToRelative(-103f, 78f)
                quadToRelative(1f, 7f, 1f, 13.5f)
                verticalLineToRelative(33.5f)
                quadToRelative(0f, 10f, -2f, 20f)
                horizontalLineToRelative(-82f)
                quadToRelative(2f, -10f, 3f, -20f)
                reflectiveQuadToRelative(1f, -20f)
                quadToRelative(-1f, -19f, -3f, -33.5f)
                reflectiveQuadToRelative(-6f, -27.5f)
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
                moveToRelative(70f, -266f)
                verticalLineToRelative(-91f)
                quadToRelative(-8f, -8f, -13f, -19f)
                reflectiveQuadToRelative(-5f, -24f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(482f, 420f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(542f, 480f)
                quadToRelative(0f, 11f, -3.5f, 21.5f)
                reflectiveQuadTo(527f, 520f)
                horizontalLineToRelative(89f)
                quadToRelative(3f, -10f, 4.5f, -19.5f)
                reflectiveQuadTo(622f, 480f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-59f, 0f, -99.5f, 41f)
                reflectiveQuadTo(342f, 480f)
                quadToRelative(0f, 48f, 27.5f, 84f)
                reflectiveQuadToRelative(70.5f, 50f)
                close()
            }
        }.build()
        
        return _Settings_timelapse!!
    }

private var _Settings_timelapse: ImageVector? = null

