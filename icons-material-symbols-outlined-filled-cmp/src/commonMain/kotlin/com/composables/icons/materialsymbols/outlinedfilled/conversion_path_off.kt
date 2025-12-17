package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Conversion_path_off: ImageVector
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
                moveTo(818f, 932f)
                lineTo(26f, 140f)
                lineToRelative(57f, -57f)
                lineTo(875f, 875f)
                lineToRelative(-57f, 57f)
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
                moveToRelative(433f, -1f)
                lineTo(721f, 607f)
                quadToRelative(9f, -3f, 18.5f, -5f)
                reflectiveQuadToRelative(20.5f, -2f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 11f, -2f, 20.5f)
                reflectiveQuadToRelative(-5f, 18.5f)
                close()
                moveTo(608f, 494f)
                lineToRelative(-59f, -59f)
                quadToRelative(23f, -9f, 37f, -29f)
                reflectiveQuadToRelative(14f, -46f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(520f, 280f)
                horizontalLineTo(394f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(206f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 42f, -20f, 77f)
                reflectiveQuadToRelative(-52f, 57f)
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
            }
        }.build()
        
        return _Conversion_path_off!!
    }

private var _Conversion_path_off: ImageVector? = null

