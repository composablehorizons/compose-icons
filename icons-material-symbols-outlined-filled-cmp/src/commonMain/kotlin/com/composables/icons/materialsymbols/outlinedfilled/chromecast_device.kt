package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Chromecast_device: ImageVector
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
                moveTo(240f, 690f)
                quadToRelative(-78f, 0f, -139f, -46f)
                reflectiveQuadTo(40f, 540f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -59f, 61f, -104.5f)
                reflectiveQuadTo(240f, 270f)
                quadToRelative(31f, 0f, 59f, 6.5f)
                reflectiveQuadToRelative(67f, 23.5f)
                quadToRelative(12f, 6f, 22.5f, 9.5f)
                reflectiveQuadToRelative(19f, 6f)
                quadTo(416f, 318f, 424f, 319f)
                reflectiveQuadToRelative(16f, 1f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(440f)
                quadToRelative(-8f, 0f, -16f, 1f)
                reflectiveQuadToRelative(-16.5f, 3.5f)
                quadToRelative(-8.5f, 2.5f, -19f, 6f)
                reflectiveQuadTo(366f, 660f)
                quadToRelative(-39f, 17f, -67f, 23.5f)
                reflectiveQuadToRelative(-59f, 6.5f)
                close()
                moveTo(100f, 500f)
                horizontalLineToRelative(40f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                horizontalLineToRelative(-40f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
            }
        }.build()
        
        return _Chromecast_device!!
    }

private var _Chromecast_device: ImageVector? = null

