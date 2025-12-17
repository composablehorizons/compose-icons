package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Screen_search_desktop: ImageVector
    get() {
        if (_Screen_search_desktop != null) return _Screen_search_desktop!!
        
        _Screen_search_desktop = ImageVector.Builder(
            name = "screen_search_desktop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(460f, 540f)
                quadToRelative(21f, 0f, 39.5f, -5.5f)
                reflectiveQuadTo(536f, 518f)
                lineToRelative(61f, 63f)
                quadToRelative(8f, 9f, 20.5f, 8.5f)
                reflectiveQuadTo(639f, 581f)
                quadToRelative(9f, -9f, 9.5f, -21.5f)
                reflectiveQuadTo(640f, 538f)
                lineToRelative(-62f, -62f)
                quadToRelative(11f, -17f, 16.5f, -36f)
                reflectiveQuadToRelative(5.5f, -40f)
                quadToRelative(0f, -59f, -41.5f, -99.5f)
                reflectiveQuadTo(460f, 260f)
                quadToRelative(-57f, 0f, -98.5f, 40.5f)
                reflectiveQuadTo(320f, 400f)
                quadToRelative(0f, 59f, 41.5f, 99.5f)
                reflectiveQuadTo(460f, 540f)
                close()
                moveToRelative(0f, -60f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(380f, 400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(460f, 320f)
                quadToRelative(32f, 0f, 56f, 23.5f)
                reflectiveQuadToRelative(24f, 56.5f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(460f, 480f)
                close()
                moveTo(80f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 760f)
                horizontalLineToRelative(800f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 840f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 640f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 720f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-440f)
                horizontalLineTo(160f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-440f)
                verticalLineToRelative(440f)
                close()
            }
        }.build()
        
        return _Screen_search_desktop!!
    }

private var _Screen_search_desktop: ImageVector? = null

