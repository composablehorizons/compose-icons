package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Settings_night_sight: ImageVector
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
                moveToRelative(88f, -114f)
                quadToRelative(5f, -5f, 2.5f, -12f)
                reflectiveQuadToRelative(-9.5f, -8f)
                quadToRelative(-26f, -5f, -48.5f, -19.5f)
                reflectiveQuadTo(676f, 688f)
                quadToRelative(-14f, -24f, -15.5f, -51f)
                reflectiveQuadToRelative(7.5f, -52f)
                quadToRelative(2f, -7f, -2.5f, -12.5f)
                reflectiveQuadTo(654f, 569f)
                quadToRelative(-67f, 12f, -91.5f, 76f)
                reflectiveQuadTo(582f, 764f)
                quadToRelative(35f, 44f, 92f, 45f)
                reflectiveQuadToRelative(94f, -43f)
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

