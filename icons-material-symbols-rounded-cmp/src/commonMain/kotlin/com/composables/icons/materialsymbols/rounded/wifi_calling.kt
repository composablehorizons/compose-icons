package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Wifi_calling: ImageVector
    get() {
        if (_Wifi_calling != null) return _Wifi_calling!!
        
        _Wifi_calling = ImageVector.Builder(
            name = "wifi_calling",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(632f, 392f)
                lineTo(473f, 233f)
                quadToRelative(-14f, -14f, -12f, -33f)
                reflectiveQuadToRelative(19f, -29f)
                quadToRelative(42f, -26f, 88f, -38.5f)
                reflectiveQuadToRelative(92f, -12.5f)
                quadToRelative(45f, 0f, 90f, 13f)
                reflectiveQuadToRelative(88f, 39f)
                quadToRelative(17f, 11f, 19.5f, 29.5f)
                reflectiveQuadTo(846f, 234f)
                lineTo(688f, 392f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                close()
                moveToRelative(28f, -86f)
                lineToRelative(89f, -88f)
                quadToRelative(-18f, -9f, -40.5f, -13.5f)
                reflectiveQuadTo(660f, 200f)
                quadToRelative(-27f, 0f, -49.5f, 4.5f)
                reflectiveQuadTo(570f, 217f)
                lineToRelative(90f, 89f)
                close()
                moveToRelative(0f, 0f)
                close()
                moveToRelative(138f, 534f)
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
                moveTo(241f, 360f)
                lineToRelative(66f, -66f)
                lineToRelative(-17f, -94f)
                horizontalLineToRelative(-89f)
                quadToRelative(5f, 41f, 14f, 81f)
                reflectiveQuadToRelative(26f, 79f)
                close()
                moveToRelative(358f, 358f)
                quadToRelative(39f, 17f, 79.5f, 27f)
                reflectiveQuadToRelative(81.5f, 13f)
                verticalLineToRelative(-88f)
                lineToRelative(-94f, -19f)
                lineToRelative(-67f, 67f)
                close()
                moveTo(241f, 360f)
                close()
                moveToRelative(358f, 358f)
                close()
            }
        }.build()
        
        return _Wifi_calling!!
    }

private var _Wifi_calling: ImageVector? = null

