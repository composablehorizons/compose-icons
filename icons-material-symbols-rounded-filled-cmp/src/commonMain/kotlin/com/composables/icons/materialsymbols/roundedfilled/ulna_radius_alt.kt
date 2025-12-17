package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Ulna_radius_alt: ImageVector
    get() {
        if (_Ulna_radius_alt != null) return _Ulna_radius_alt!!
        
        _Ulna_radius_alt = ImageVector.Builder(
            name = "ulna_radius_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(494f, 840f)
                quadToRelative(-30f, 0f, -58f, -11.5f)
                reflectiveQuadTo(385f, 796f)
                lineTo(104f, 534f)
                quadToRelative(-11f, -10f, -12.5f, -24.5f)
                reflectiveQuadTo(98f, 483f)
                lineToRelative(175f, -280f)
                quadToRelative(11f, -18f, 32f, -23.5f)
                reflectiveQuadToRelative(39f, 5.5f)
                quadToRelative(62f, 39f, 113f, 95f)
                reflectiveQuadToRelative(78f, 116f)
                quadToRelative(36f, -38f, 79.5f, -61f)
                reflectiveQuadTo(736f, 292f)
                quadToRelative(27f, -8f, 49.5f, -14.5f)
                reflectiveQuadTo(828f, 263f)
                quadToRelative(19f, -8f, 35.5f, 3f)
                reflectiveQuadToRelative(16.5f, 31f)
                verticalLineToRelative(285f)
                quadToRelative(0f, 20f, -10f, 38.5f)
                reflectiveQuadTo(843f, 650f)
                lineTo(580f, 815f)
                quadToRelative(-19f, 12f, -40.5f, 18.5f)
                reflectiveQuadTo(494f, 840f)
                close()
                moveToRelative(16f, -140f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(550f, 660f)
                quadToRelative(0f, -2f, -4f, -17f)
                lineToRelative(142f, -89f)
                quadToRelative(5f, 8f, 13.5f, 12f)
                reflectiveQuadToRelative(18.5f, 4f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(760f, 530f)
                quadToRelative(0f, -14f, -9f, -25f)
                reflectiveQuadToRelative(-23f, -14f)
                quadToRelative(1f, -2f, 1.5f, -5f)
                reflectiveQuadToRelative(0.5f, -6f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(690f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(650f, 480f)
                quadToRelative(0f, 4f, 7f, 22f)
                lineToRelative(-142f, 88f)
                quadToRelative(-5f, -9f, -14.5f, -14.5f)
                reflectiveQuadTo(480f, 570f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 610f)
                quadToRelative(0f, 14f, 9f, 25f)
                reflectiveQuadToRelative(23f, 14f)
                quadToRelative(-1f, 2f, -1.5f, 5f)
                reflectiveQuadToRelative(-0.5f, 6f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(510f, 700f)
                close()
            }
        }.build()
        
        return _Ulna_radius_alt!!
    }

private var _Ulna_radius_alt: ImageVector? = null

