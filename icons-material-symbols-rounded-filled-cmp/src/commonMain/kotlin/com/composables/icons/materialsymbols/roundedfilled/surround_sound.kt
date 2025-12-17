package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Surround_sound: ImageVector
    get() {
        if (_Surround_sound != null) return _Surround_sound!!
        
        _Surround_sound = ImageVector.Builder(
            name = "surround_sound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 600f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(200f, -120f)
                quadToRelative(0f, 30f, -8f, 58f)
                reflectiveQuadToRelative(-25f, 53f)
                quadToRelative(-9f, 14f, -8.5f, 31f)
                reflectiveQuadToRelative(11.5f, 28f)
                quadToRelative(12f, 12f, 28f, 11.5f)
                reflectiveQuadToRelative(26f, -13.5f)
                quadToRelative(27f, -36f, 41.5f, -79f)
                reflectiveQuadToRelative(14.5f, -89f)
                quadToRelative(0f, -46f, -14.5f, -89f)
                reflectiveQuadTo(704f, 312f)
                quadToRelative(-10f, -13f, -26f, -13.5f)
                reflectiveQuadTo(650f, 310f)
                quadToRelative(-11f, 11f, -11.5f, 28f)
                reflectiveQuadToRelative(8.5f, 31f)
                quadToRelative(17f, 25f, 25f, 53f)
                reflectiveQuadToRelative(8f, 58f)
                close()
                moveToRelative(-400f, 0f)
                quadToRelative(0f, -30f, 8f, -58f)
                reflectiveQuadToRelative(25f, -53f)
                quadToRelative(9f, -14f, 8.5f, -31f)
                reflectiveQuadTo(310f, 310f)
                quadToRelative(-12f, -12f, -28f, -11.5f)
                reflectiveQuadTo(256f, 312f)
                quadToRelative(-27f, 36f, -41.5f, 79f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, 46f, 14.5f, 89f)
                reflectiveQuadToRelative(41.5f, 79f)
                quadToRelative(10f, 13f, 26f, 13.5f)
                reflectiveQuadToRelative(28f, -11.5f)
                quadToRelative(11f, -11f, 11.5f, -28f)
                reflectiveQuadToRelative(-8.5f, -31f)
                quadToRelative(-17f, -25f, -25f, -53f)
                reflectiveQuadToRelative(-8f, -58f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Surround_sound!!
    }

private var _Surround_sound: ImageVector? = null

