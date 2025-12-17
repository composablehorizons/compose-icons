package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Phone_in_talk: ImageVector
    get() {
        if (_Phone_in_talk != null) return _Phone_in_talk!!
        
        _Phone_in_talk = ImageVector.Builder(
            name = "phone_in_talk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(800f, 480f)
                quadToRelative(-16f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(757f, 440f)
                quadToRelative(-13f, -93f, -78.5f, -158.5f)
                reflectiveQuadTo(520f, 203f)
                quadToRelative(-17f, -2f, -28.5f, -14f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(0f, -17f, 12f, -28.5f)
                reflectiveQuadToRelative(28f, -9.5f)
                quadToRelative(126f, 14f, 215f, 103f)
                reflectiveQuadToRelative(103f, 215f)
                quadToRelative(2f, 16f, -9.5f, 28f)
                reflectiveQuadTo(800f, 480f)
                close()
                moveToRelative(-167f, 0f)
                quadToRelative(-13f, 0f, -23f, -9f)
                reflectiveQuadToRelative(-15f, -24f)
                quadToRelative(-8f, -29f, -30.5f, -51.5f)
                reflectiveQuadTo(513f, 365f)
                quadToRelative(-15f, -5f, -24f, -15f)
                reflectiveQuadToRelative(-9f, -24f)
                quadToRelative(0f, -20f, 14f, -32.5f)
                reflectiveQuadToRelative(31f, -8.5f)
                quadToRelative(56f, 13f, 96.5f, 53.5f)
                reflectiveQuadTo(675f, 435f)
                quadToRelative(4f, 17f, -9f, 31f)
                reflectiveQuadToRelative(-33f, 14f)
                close()
                moveToRelative(165f, 360f)
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
        
        return _Phone_in_talk!!
    }

private var _Phone_in_talk: ImageVector? = null

