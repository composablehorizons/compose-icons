package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Conversion_path_off: ImageVector
    get() {
        if (_Conversion_path_off != null) return _Conversion_path_off!!
        
        _Conversion_path_off = ImageVector.Builder(
            name = "conversion_path_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(790f, 903f)
                lineTo(54f, 168f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(54f, 111f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(736f, 736f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(790f, 903f)
                close()
                moveTo(440f, 760f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(360f, 600f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(440f, 680f)
                horizontalLineToRelative(240f)
                lineToRelative(142f, 142f)
                quadToRelative(-14f, 8f, -29.5f, 13f)
                reflectiveQuadToRelative(-32.5f, 5f)
                quadToRelative(-39f, 0f, -70f, -22.5f)
                reflectiveQuadTo(647f, 760f)
                horizontalLineTo(440f)
                close()
                moveToRelative(405f, -125f)
                quadToRelative(20f, 20f, 29f, 47f)
                reflectiveQuadToRelative(5f, 54f)
                quadToRelative(-2f, 8f, -9.5f, 10f)
                reflectiveQuadToRelative(-13.5f, -4f)
                lineToRelative(-61f, -61f)
                lineToRelative(-57f, -57f)
                quadToRelative(-6f, -6f, -3.5f, -13.5f)
                reflectiveQuadTo(745f, 601f)
                quadToRelative(27f, -4f, 53.5f, 5f)
                reflectiveQuadToRelative(46.5f, 29f)
                close()
                moveTo(200f, 360f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -32f, 16f, -59f)
                reflectiveQuadToRelative(42f, -43f)
                lineToRelative(164f, 164f)
                quadToRelative(-16f, 26f, -43f, 42f)
                reflectiveQuadToRelative(-59f, 16f)
                close()
                moveToRelative(409f, 120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(569f, 440f)
                quadToRelative(0f, -11f, 15f, -32f)
                quadToRelative(9f, -9f, 12.5f, -21.5f)
                reflectiveQuadTo(600f, 360f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(520f, 280f)
                horizontalLineTo(411f)
                quadToRelative(-20f, 0f, -30f, -12.5f)
                reflectiveQuadTo(371f, 240f)
                quadToRelative(0f, -15f, 10f, -27.5f)
                reflectiveQuadToRelative(30f, -12.5f)
                horizontalLineToRelative(109f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 31f, -11f, 58f)
                reflectiveQuadToRelative(-30f, 48f)
                quadToRelative(-5f, 6f, -13f, 10f)
                reflectiveQuadToRelative(-17f, 4f)
                close()
            }
        }.build()
        
        return _Conversion_path_off!!
    }

private var _Conversion_path_off: ImageVector? = null

