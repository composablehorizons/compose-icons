package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Google_home_devices: ImageVector
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
                moveTo(320f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(160f)
                horizontalLineTo(320f)
                close()
                moveToRelative(286f, -180f)
                quadToRelative(0f, -39f, 27.5f, -66.5f)
                reflectiveQuadTo(700f, 566f)
                quadToRelative(39f, 0f, 66.5f, 27.5f)
                reflectiveQuadTo(794f, 660f)
                quadToRelative(0f, 39f, -27.5f, 66.5f)
                reflectiveQuadTo(700f, 754f)
                quadToRelative(-39f, 0f, -66.5f, -27.5f)
                reflectiveQuadTo(606f, 660f)
                close()
                moveToRelative(274f, -340f)
                verticalLineToRelative(520f)
                horizontalLineTo(520f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(360f)
                close()
                moveToRelative(-180f, 40f)
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

