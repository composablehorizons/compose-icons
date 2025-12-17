package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Wifi_calling_bar_2: ImageVector
    get() {
        if (_Wifi_calling_bar_2 != null) return _Wifi_calling_bar_2!!
        
        _Wifi_calling_bar_2 = ImageVector.Builder(
            name = "wifi_calling_bar_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(660f, 440f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(620f, 400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(660f, 360f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(700f, 400f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(660f, 440f)
                close()
                moveToRelative(-100f, -98f)
                lineToRelative(-42f, -42f)
                quadToRelative(29f, -29f, 65.5f, -44.5f)
                reflectiveQuadTo(660f, 240f)
                quadToRelative(40f, 0f, 76.5f, 15.5f)
                reflectiveQuadTo(802f, 300f)
                lineToRelative(-42f, 42f)
                quadToRelative(-20f, -20f, -45.5f, -31f)
                reflectiveQuadTo(660f, 300f)
                quadToRelative(-29f, 0f, -54.5f, 11f)
                reflectiveQuadTo(560f, 342f)
                close()
                moveToRelative(238f, 498f)
                quadToRelative(-125f, 0f, -247f, -54.5f)
                reflectiveQuadTo(329f, 631f)
                quadTo(229f, 531f, 174.5f, 409f)
                reflectiveQuadTo(120f, 162f)
                quadToRelative(0f, -18f, 12f, -30f)
                reflectiveQuadToRelative(30f, -12f)
                horizontalLineToRelative(162f)
                quadToRelative(14f, 0f, 25f, 9.5f)
                reflectiveQuadToRelative(13f, 22.5f)
                lineToRelative(26f, 140f)
                quadToRelative(2f, 16f, -1f, 27f)
                reflectiveQuadToRelative(-11f, 19f)
                lineToRelative(-97f, 98f)
                quadToRelative(20f, 37f, 47.5f, 71.5f)
                reflectiveQuadTo(387f, 574f)
                quadToRelative(31f, 31f, 65f, 57.5f)
                reflectiveQuadToRelative(72f, 48.5f)
                lineToRelative(94f, -94f)
                quadToRelative(9f, -9f, 23.5f, -13.5f)
                reflectiveQuadTo(670f, 570f)
                lineToRelative(138f, 28f)
                quadToRelative(14f, 4f, 23f, 14.5f)
                reflectiveQuadToRelative(9f, 23.5f)
                verticalLineToRelative(162f)
                quadToRelative(0f, 18f, -12f, 30f)
                reflectiveQuadToRelative(-30f, 12f)
                close()
            }
        }.build()
        
        return _Wifi_calling_bar_2!!
    }

private var _Wifi_calling_bar_2: ImageVector? = null

