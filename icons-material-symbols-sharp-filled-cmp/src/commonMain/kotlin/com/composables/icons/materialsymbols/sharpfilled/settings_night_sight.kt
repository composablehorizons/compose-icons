package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Settings_night_sight: ImageVector
    get() {
        if (_Settings_night_sight != null) return _Settings_night_sight!!
        
        _Settings_night_sight = ImageVector.Builder(
            name = "settings_night_sight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 880f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveToRelative(-6f, -71f)
                quadToRelative(34f, 1f, 59.5f, -15.5f)
                reflectiveQuadTo(782f, 751f)
                quadToRelative(-34f, -7f, -61.5f, -20.5f)
                reflectiveQuadTo(676f, 688f)
                quadToRelative(-17f, -29f, -14.5f, -60f)
                reflectiveQuadToRelative(13.5f, -63f)
                quadToRelative(-39f, 8f, -69.5f, 26.5f)
                reflectiveQuadTo(562f, 648f)
                quadToRelative(-11f, 32f, -6f, 61f)
                reflectiveQuadToRelative(26f, 55f)
                quadToRelative(17f, 22f, 40f, 33f)
                reflectiveQuadToRelative(52f, 12f)
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
                quadToRelative(11f, -8f, 22.5f, -15f)
                reflectiveQuadToRelative(24.5f, -12f)
                lineToRelative(16f, -128f)
                horizontalLineToRelative(220f)
                lineToRelative(16f, 128f)
                quadToRelative(13f, 5f, 24.5f, 12f)
                reflectiveQuadToRelative(22.5f, 15f)
                lineToRelative(119f, -50f)
                lineToRelative(110f, 190f)
                lineToRelative(-74f, 56f)
                quadToRelative(-30f, -15f, -62f, -23f)
                reflectiveQuadToRelative(-66f, -8f)
                quadToRelative(-20f, 0f, -38.5f, 3.5f)
                reflectiveQuadTo(604f, 412f)
                quadToRelative(-19f, -33f, -51.5f, -52.5f)
                reflectiveQuadTo(482f, 340f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 38f, 18.5f, 70f)
                reflectiveQuadToRelative(50.5f, 51f)
                quadToRelative(-6f, 20f, -8.5f, 41.5f)
                reflectiveQuadTo(400f, 685f)
                quadToRelative(1f, 56f, 22.5f, 106.5f)
                reflectiveQuadTo(484f, 880f)
                horizontalLineTo(370f)
                close()
            }
        }.build()
        
        return _Settings_night_sight!!
    }

private var _Settings_night_sight: ImageVector? = null

