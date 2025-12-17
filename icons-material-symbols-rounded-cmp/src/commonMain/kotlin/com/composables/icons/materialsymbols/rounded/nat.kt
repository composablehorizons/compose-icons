package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Nat: ImageVector
    get() {
        if (_Nat != null) return _Nat!!
        
        _Nat = ImageVector.Builder(
            name = "nat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 600f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(39f, 0f, 69.5f, 22.5f)
                reflectiveQuadTo(272f, 440f)
                horizontalLineToRelative(128f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 520f)
                horizontalLineTo(272f)
                quadToRelative(-12f, 35f, -42.5f, 57.5f)
                reflectiveQuadTo(160f, 600f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(160f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(160f, 520f)
                close()
                moveToRelative(360f, -40f)
                quadToRelative(0f, -124f, -82f, -214f)
                reflectiveQuadTo(236f, 162f)
                quadToRelative(-16f, -2f, -26f, -14f)
                reflectiveQuadToRelative(-10f, -28f)
                quadToRelative(0f, -17f, 10.5f, -28.5f)
                reflectiveQuadTo(237f, 82f)
                quadToRelative(144f, 13f, 245.5f, 114f)
                reflectiveQuadTo(598f, 440f)
                horizontalLineToRelative(168f)
                lineToRelative(-35f, -36f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(104f, 104f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(788f, 612f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(732f, 612f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(731f, 556f)
                lineToRelative(35f, -36f)
                horizontalLineTo(598f)
                quadToRelative(-14f, 143f, -115.5f, 244f)
                reflectiveQuadTo(237f, 878f)
                quadToRelative(-16f, 2f, -26.5f, -9.5f)
                reflectiveQuadTo(200f, 840f)
                quadToRelative(0f, -16f, 10f, -28f)
                reflectiveQuadToRelative(26f, -14f)
                quadToRelative(120f, -14f, 202f, -104f)
                reflectiveQuadToRelative(82f, -214f)
                close()
            }
        }.build()
        
        return _Nat!!
    }

private var _Nat: ImageVector? = null

