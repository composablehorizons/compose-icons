package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Settings_applications: ImageVector
    get() {
        if (_Settings_applications != null) return _Settings_applications!!
        
        _Settings_applications = ImageVector.Builder(
            name = "settings_applications",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(428f, 620f)
                lineToRelative(6f, 29f)
                quadToRelative(3f, 14f, 13.5f, 22.5f)
                reflectiveQuadTo(472f, 680f)
                horizontalLineToRelative(16f)
                quadToRelative(14f, 0f, 24.5f, -9f)
                reflectiveQuadToRelative(13.5f, -23f)
                lineToRelative(6f, -28f)
                quadToRelative(12f, -5f, 22.5f, -10.5f)
                reflectiveQuadTo(576f, 596f)
                lineToRelative(29f, 9f)
                quadToRelative(13f, 4f, 25.5f, -1f)
                reflectiveQuadToRelative(19.5f, -16f)
                lineToRelative(8f, -14f)
                quadToRelative(7f, -12f, 5f, -26f)
                reflectiveQuadToRelative(-13f, -23f)
                lineToRelative(-22f, -19f)
                quadToRelative(2f, -14f, 2f, -26f)
                reflectiveQuadToRelative(-2f, -26f)
                lineToRelative(22f, -19f)
                quadToRelative(11f, -9f, 13f, -22.5f)
                reflectiveQuadToRelative(-5f, -25.5f)
                lineToRelative(-9f, -15f)
                quadToRelative(-7f, -11f, -19f, -16f)
                reflectiveQuadToRelative(-25f, -1f)
                lineToRelative(-29f, 9f)
                quadToRelative(-11f, -8f, -21.5f, -13.5f)
                reflectiveQuadTo(532f, 340f)
                lineToRelative(-6f, -29f)
                quadToRelative(-3f, -14f, -13.5f, -22.5f)
                reflectiveQuadTo(488f, 280f)
                horizontalLineToRelative(-16f)
                quadToRelative(-14f, 0f, -24.5f, 9f)
                reflectiveQuadTo(434f, 312f)
                lineToRelative(-6f, 28f)
                quadToRelative(-12f, 5f, -22.5f, 10.5f)
                reflectiveQuadTo(384f, 364f)
                lineToRelative(-29f, -9f)
                quadToRelative(-13f, -4f, -25.5f, 1f)
                reflectiveQuadTo(310f, 372f)
                lineToRelative(-8f, 14f)
                quadToRelative(-7f, 12f, -5f, 26f)
                reflectiveQuadToRelative(13f, 23f)
                lineToRelative(22f, 19f)
                quadToRelative(-2f, 14f, -2f, 26f)
                reflectiveQuadToRelative(2f, 26f)
                lineToRelative(-22f, 19f)
                quadToRelative(-11f, 9f, -13f, 22.5f)
                reflectiveQuadToRelative(5f, 25.5f)
                lineToRelative(9f, 15f)
                quadToRelative(7f, 11f, 19f, 16f)
                reflectiveQuadToRelative(25f, 1f)
                lineToRelative(29f, -9f)
                quadToRelative(11f, 8f, 21.5f, 13.5f)
                reflectiveQuadTo(428f, 620f)
                close()
                moveToRelative(52f, -60f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, -560f)
                verticalLineToRelative(560f)
                verticalLineToRelative(-560f)
                close()
            }
        }.build()
        
        return _Settings_applications!!
    }

private var _Settings_applications: ImageVector? = null

