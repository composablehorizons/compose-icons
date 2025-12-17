package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Settings_timelapse: ImageVector
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
                moveTo(440f, 614f)
                verticalLineToRelative(231f)
                quadToRelative(0f, 14f, -10.5f, 24.5f)
                reflectiveQuadTo(405f, 880f)
                quadToRelative(-15f, 0f, -26f, -10f)
                reflectiveQuadToRelative(-13f, -25f)
                lineToRelative(-12f, -93f)
                quadToRelative(-13f, -5f, -24.5f, -12f)
                reflectiveQuadTo(307f, 725f)
                lineToRelative(-87f, 36f)
                quadToRelative(-14f, 6f, -28f, 1.5f)
                reflectiveQuadTo(170f, 745f)
                lineTo(96f, 616f)
                quadToRelative(-8f, -13f, -5f, -28f)
                reflectiveQuadToRelative(15f, -24f)
                lineToRelative(75f, -57f)
                quadToRelative(-1f, -7f, -1f, -13.5f)
                verticalLineToRelative(-27f)
                quadToRelative(0f, -6.5f, 1f, -13.5f)
                lineToRelative(-75f, -57f)
                quadToRelative(-12f, -9f, -15f, -24f)
                reflectiveQuadToRelative(5f, -28f)
                lineToRelative(74f, -129f)
                quadToRelative(8f, -13f, 22f, -17.5f)
                reflectiveQuadToRelative(28f, 1.5f)
                lineToRelative(87f, 36f)
                quadToRelative(11f, -8f, 23f, -15f)
                reflectiveQuadToRelative(24f, -12f)
                lineToRelative(12f, -93f)
                quadToRelative(2f, -15f, 13f, -25f)
                reflectiveQuadToRelative(26f, -10f)
                horizontalLineToRelative(150f)
                quadToRelative(15f, 0f, 26f, 10f)
                reflectiveQuadToRelative(13f, 25f)
                lineToRelative(12f, 93f)
                quadToRelative(13f, 5f, 24.5f, 12f)
                reflectiveQuadToRelative(22.5f, 15f)
                lineToRelative(87f, -36f)
                quadToRelative(14f, -6f, 28f, -1.5f)
                reflectiveQuadToRelative(22f, 17.5f)
                lineToRelative(74f, 129f)
                quadToRelative(8f, 13f, 5f, 28f)
                reflectiveQuadToRelative(-15f, 24f)
                lineToRelative(-75f, 57f)
                quadToRelative(1f, 5f, 1f, 12.5f)
                verticalLineToRelative(15.5f)
                quadToRelative(0f, 17f, -12f, 28f)
                reflectiveQuadToRelative(-29f, 11f)
                horizontalLineTo(616f)
                quadToRelative(3f, -10f, 4.5f, -19.5f)
                reflectiveQuadTo(622f, 480f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-59f, 0f, -99.5f, 41f)
                reflectiveQuadTo(342f, 480f)
                quadToRelative(0f, 48f, 27.5f, 84f)
                reflectiveQuadToRelative(70.5f, 50f)
                close()
                moveToRelative(310f, 4f)
                lineToRelative(142f, 85f)
                quadToRelative(10f, 6f, 10f, 17f)
                reflectiveQuadToRelative(-10f, 17f)
                lineToRelative(-142f, 85f)
                quadToRelative(-10f, 6f, -20f, 0.5f)
                reflectiveQuadTo(720f, 805f)
                verticalLineToRelative(-170f)
                quadToRelative(0f, -12f, 10f, -17.5f)
                reflectiveQuadToRelative(20f, 0.5f)
                close()
                moveToRelative(-200f, 0f)
                lineToRelative(142f, 85f)
                quadToRelative(10f, 6f, 10f, 17f)
                reflectiveQuadToRelative(-10f, 17f)
                lineToRelative(-142f, 85f)
                quadToRelative(-10f, 6f, -20f, 0.5f)
                reflectiveQuadTo(520f, 805f)
                verticalLineToRelative(-170f)
                quadToRelative(0f, -12f, 10f, -17.5f)
                reflectiveQuadToRelative(20f, 0.5f)
                close()
            }
        }.build()
        
        return _Settings_timelapse!!
    }

private var _Settings_timelapse: ImageVector? = null

