package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Infrared: ImageVector
    get() {
        if (_Infrared != null) return _Infrared!!
        
        _Infrared = ImageVector.Builder(
            name = "infrared",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(800f, 480f)
                quadToRelative(0f, 105f, -36f, 197.5f)
                reflectiveQuadTo(665f, 844f)
                quadToRelative(-11f, 13f, -28f, 14.5f)
                reflectiveQuadTo(608f, 848f)
                quadToRelative(-12f, -12f, -11f, -29.5f)
                reflectiveQuadToRelative(12f, -31.5f)
                quadToRelative(52f, -63f, 81.5f, -141f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(0f, -88f, -29.5f, -166f)
                reflectiveQuadTo(609f, 173f)
                quadToRelative(-11f, -14f, -12f, -31.5f)
                reflectiveQuadToRelative(11f, -29.5f)
                quadToRelative(12f, -12f, 29f, -10.5f)
                reflectiveQuadToRelative(28f, 14.5f)
                quadToRelative(63f, 74f, 99f, 166.5f)
                reflectiveQuadTo(800f, 480f)
                close()
                moveToRelative(-160f, 0f)
                quadToRelative(0f, 72f, -23f, 135.5f)
                reflectiveQuadTo(552f, 731f)
                quadToRelative(-11f, 14f, -28f, 15f)
                reflectiveQuadToRelative(-29f, -11f)
                quadToRelative(-12f, -12f, -12f, -29f)
                reflectiveQuadToRelative(11f, -31f)
                quadToRelative(32f, -41f, 49f, -90.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, -55f, -17f, -104.5f)
                reflectiveQuadTo(494f, 285f)
                quadToRelative(-11f, -14f, -11f, -31f)
                reflectiveQuadToRelative(12f, -29f)
                quadToRelative(12f, -12f, 29f, -11f)
                reflectiveQuadToRelative(28f, 15f)
                quadToRelative(42f, 52f, 65f, 115.5f)
                reflectiveQuadTo(640f, 480f)
                close()
                moveToRelative(-160f, 0f)
                quadToRelative(0f, 39f, -11.5f, 74.5f)
                reflectiveQuadTo(436f, 619f)
                quadToRelative(-10f, 14f, -26.5f, 14f)
                reflectiveQuadTo(381f, 621f)
                quadToRelative(-11f, -11f, -12f, -28f)
                reflectiveQuadToRelative(8f, -31f)
                quadToRelative(11f, -18f, 17f, -38.5f)
                reflectiveQuadToRelative(6f, -43.5f)
                quadToRelative(0f, -23f, -6f, -43.5f)
                reflectiveQuadTo(377f, 398f)
                quadToRelative(-9f, -14f, -8f, -31f)
                reflectiveQuadToRelative(12f, -28f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(26.5f, 14f)
                quadToRelative(21f, 29f, 32.5f, 64.5f)
                reflectiveQuadTo(480f, 480f)
                close()
                moveToRelative(-160f, 0f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(240f, 560f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(200f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(240f, 200f)
                verticalLineToRelative(200f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(320f, 480f)
                close()
            }
        }.build()
        
        return _Infrared!!
    }

private var _Infrared: ImageVector? = null

