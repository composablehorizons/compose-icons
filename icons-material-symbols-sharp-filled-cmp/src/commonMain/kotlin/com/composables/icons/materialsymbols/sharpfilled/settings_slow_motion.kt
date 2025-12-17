package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Settings_slow_motion: ImageVector
    get() {
        if (_Settings_slow_motion != null) return _Settings_slow_motion!!
        
        _Settings_slow_motion = ImageVector.Builder(
            name = "settings_slow_motion",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
                moveToRelative(278f, -4f)
                quadToRelative(-64f, -10f, -109.5f, -56f)
                reflectiveQuadTo(483f, 710f)
                horizontalLineToRelative(59f)
                quadToRelative(9f, 40f, 37.5f, 68.5f)
                reflectiveQuadTo(648f, 816f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(60f, 1f)
                verticalLineToRelative(-61f)
                quadToRelative(48f, -11f, 79f, -48f)
                reflectiveQuadToRelative(31f, -88f)
                quadToRelative(0f, -51f, -31f, -88f)
                reflectiveQuadToRelative(-79f, -48f)
                verticalLineToRelative(-61f)
                quadToRelative(72f, 11f, 121f, 66.5f)
                reflectiveQuadTo(878f, 680f)
                quadToRelative(0f, 75f, -49f, 130.5f)
                reflectiveQuadTo(708f, 877f)
                close()
                moveTo(483f, 650f)
                quadToRelative(10f, -64f, 55.5f, -110f)
                reflectiveQuadTo(648f, 484f)
                verticalLineToRelative(60f)
                quadToRelative(-40f, 9f, -68.5f, 37.5f)
                reflectiveQuadTo(542f, 650f)
                horizontalLineToRelative(-59f)
                close()
                moveToRelative(155f, 110f)
                verticalLineToRelative(-160f)
                lineToRelative(124f, 80f)
                lineToRelative(-124f, 80f)
                close()
            }
        }.build()
        
        return _Settings_slow_motion!!
    }

private var _Settings_slow_motion: ImageVector? = null

