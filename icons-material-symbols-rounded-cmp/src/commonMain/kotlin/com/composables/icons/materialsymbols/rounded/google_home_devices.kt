package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Google_home_devices: ImageVector
    get() {
        if (_Google_home_devices != null) return _Google_home_devices!!
        
        _Google_home_devices = ImageVector.Builder(
            name = "google_home_devices",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 760f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 680f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 800f)
                verticalLineToRelative(-40f)
                close()
                moveToRelative(286f, -100f)
                quadToRelative(0f, -39f, 27.5f, -66.5f)
                reflectiveQuadTo(700f, 566f)
                quadToRelative(39f, 0f, 66.5f, 27.5f)
                reflectiveQuadTo(794f, 660f)
                quadToRelative(0f, 39f, -27.5f, 66.5f)
                reflectiveQuadTo(700f, 754f)
                quadToRelative(-39f, 0f, -66.5f, -27.5f)
                reflectiveQuadTo(606f, 660f)
                close()
                moveToRelative(234f, -340f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 360f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 840f)
                horizontalLineTo(560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 800f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(560f, 320f)
                horizontalLineToRelative(280f)
                close()
                moveToRelative(-140f, 40f)
                quadToRelative(-26f, 0f, -43f, 17f)
                reflectiveQuadToRelative(-17f, 43f)
                quadToRelative(0f, 26f, 17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                quadToRelative(0f, -26f, -17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                close()
                moveToRelative(0f, 440f)
                quadToRelative(59f, 0f, 99.5f, -40.5f)
                reflectiveQuadTo(840f, 660f)
                quadToRelative(0f, -59f, -40.5f, -99.5f)
                reflectiveQuadTo(700f, 520f)
                quadToRelative(-59f, 0f, -99.5f, 40.5f)
                reflectiveQuadTo(560f, 660f)
                quadToRelative(0f, 59f, 40.5f, 99.5f)
                reflectiveQuadTo(700f, 800f)
                close()
            }
        }.build()
        
        return _Google_home_devices!!
    }

private var _Google_home_devices: ImageVector? = null

