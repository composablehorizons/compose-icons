package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Phone_forwarded: ImageVector
    get() {
        if (_Phone_forwarded != null) return _Phone_forwarded!!
        
        _Phone_forwarded = ImageVector.Builder(
            name = "phone_forwarded",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(798f, 840f)
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
                moveToRelative(-72f, -560f)
                horizontalLineTo(560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(560f, 200f)
                horizontalLineToRelative(166f)
                lineToRelative(-34f, -34f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(691f, 110f)
                quadToRelative(12f, -12f, 29f, -12.5f)
                reflectiveQuadToRelative(29f, 11.5f)
                lineToRelative(103f, 105f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(748f, 372f)
                quadToRelative(-12f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-12f, -12f, -12.5f, -28.5f)
                reflectiveQuadTo(691f, 315f)
                lineToRelative(35f, -35f)
                close()
            }
        }.build()
        
        return _Phone_forwarded!!
    }

private var _Phone_forwarded: ImageVector? = null

