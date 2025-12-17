package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mode_fan_off: ImageVector
    get() {
        if (_Mode_fan_off != null) return _Mode_fan_off!!
        
        _Mode_fan_off = ImageVector.Builder(
            name = "mode_fan_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(643f, 180f)
                quadToRelative(0f, 28f, -13.5f, 53f)
                reflectiveQuadTo(593f, 273f)
                quadToRelative(-23f, 15f, -30.5f, 30.5f)
                reflectiveQuadTo(546f, 343f)
                quadToRelative(-8f, 21f, -29.5f, 27.5f)
                reflectiveQuadTo(478f, 361f)
                lineTo(343f, 229f)
                quadToRelative(-8f, -9f, -10.5f, -21f)
                reflectiveQuadToRelative(2.5f, -23f)
                quadToRelative(20f, -45f, 71.5f, -75f)
                reflectiveQuadTo(539f, 80f)
                quadToRelative(51f, 0f, 77.5f, 31f)
                reflectiveQuadToRelative(26.5f, 69f)
                close()
                moveToRelative(76f, 140f)
                quadToRelative(76f, 0f, 118.5f, 66.5f)
                reflectiveQuadTo(880f, 536f)
                quadToRelative(0f, 43f, -27f, 73.5f)
                reflectiveQuadTo(783f, 640f)
                horizontalLineToRelative(-2f)
                quadToRelative(-8f, 0f, -15.5f, -3.5f)
                reflectiveQuadTo(753f, 628f)
                lineTo(545f, 433f)
                quadToRelative(-13f, -14f, -10.5f, -35f)
                reflectiveQuadToRelative(22.5f, -29f)
                lineToRelative(97f, -36f)
                quadToRelative(16f, -6f, 32f, -9.5f)
                reflectiveQuadToRelative(33f, -3.5f)
                close()
                moveTo(424f, 880f)
                quadToRelative(-51f, 0f, -77.5f, -30.5f)
                reflectiveQuadTo(320f, 780f)
                quadToRelative(0f, -26f, 11.5f, -50.5f)
                reflectiveQuadTo(367f, 689f)
                quadToRelative(22f, -14f, 35.5f, -36f)
                reflectiveQuadToRelative(18.5f, -47f)
                lineToRelative(-12f, -6f)
                quadToRelative(-6f, -3f, -11f, -7f)
                lineToRelative(-92f, 33f)
                quadToRelative(-17f, 6f, -33f, 10f)
                reflectiveQuadToRelative(-33f, 4f)
                quadToRelative(-63f, 0f, -111.5f, -55f)
                reflectiveQuadTo(80f, 424f)
                quadToRelative(0f, -51f, 30.5f, -77.5f)
                reflectiveQuadTo(179f, 320f)
                quadToRelative(8f, 0f, 16f, 1f)
                reflectiveQuadToRelative(16f, 3f)
                lineTo(80f, 193f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(80f, 136f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(683f, 684f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(763f, 876f)
                lineTo(637f, 749f)
                quadToRelative(-13f, 54f, -66.5f, 92.5f)
                reflectiveQuadTo(424f, 880f)
                close()
            }
        }.build()
        
        return _Mode_fan_off!!
    }

private var _Mode_fan_off: ImageVector? = null

