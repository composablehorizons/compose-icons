package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Chromecast_device: ImageVector
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
                moveTo(840f, 580f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 540f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(840f, 380f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 420f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 580f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(-160f, 60f)
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
                horizontalLineToRelative(240f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 400f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 640f)
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

