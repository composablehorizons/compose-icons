package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Chromecast_device: ImageVector
    get() {
        if (_Chromecast_device != null) return _Chromecast_device!!
        
        _Chromecast_device = ImageVector.Builder(
            name = "chromecast_device",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(800f, 580f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(200f)
                horizontalLineTo(800f)
                close()
                moveToRelative(-40f, 60f)
                horizontalLineTo(440f)
                quadToRelative(-16f, 0f, -32.5f, 4.5f)
                reflectiveQuadTo(366f, 660f)
                quadToRelative(-39f, 17f, -67f, 23.5f)
                reflectiveQuadToRelative(-59f, 6.5f)
                quadToRelative(-78f, 0f, -139f, -46f)
                reflectiveQuadTo(40f, 540f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -59f, 61f, -104.5f)
                reflectiveQuadTo(240f, 270f)
                quadToRelative(31f, 0f, 59f, 6.5f)
                reflectiveQuadToRelative(67f, 23.5f)
                quadToRelative(25f, 11f, 41.5f, 15.5f)
                reflectiveQuadTo(440f, 320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(-520f, -30f)
                quadToRelative(22f, 0f, 43f, -5f)
                reflectiveQuadToRelative(51f, -18f)
                quadToRelative(35f, -15f, 59f, -21f)
                reflectiveQuadToRelative(47f, -6f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-160f)
                horizontalLineTo(440f)
                quadToRelative(-23f, 0f, -47f, -6f)
                reflectiveQuadToRelative(-59f, -21f)
                quadToRelative(-30f, -13f, -51f, -18f)
                reflectiveQuadToRelative(-43f, -5f)
                quadToRelative(-47f, 0f, -83.5f, 21.5f)
                reflectiveQuadTo(120f, 420f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(20f)
                quadToRelative(8f, 0f, 14f, 6f)
                reflectiveQuadToRelative(6f, 14f)
                quadToRelative(0f, 8f, -6f, 14f)
                reflectiveQuadToRelative(-14f, 6f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 27f, 36.5f, 48.5f)
                reflectiveQuadTo(240f, 610f)
                close()
                moveTo(120f, 480f)
                close()
            }
        }.build()
        
        return _Chromecast_device!!
    }

private var _Chromecast_device: ImageVector? = null

