package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Landscape_2_off: ImageVector
    get() {
        if (_Landscape_2_off != null) return _Landscape_2_off!!
        
        _Landscape_2_off = ImageVector.Builder(
            name = "landscape_2_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(820f, 934f)
                lineTo(27f, 141f)
                lineToRelative(57f, -57f)
                lineTo(877f, 877f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(240f, 400f)
                quadToRelative(-50f, 0f, -85f, -35.5f)
                reflectiveQuadTo(120f, 280f)
                quadToRelative(0f, -32f, 16f, -59f)
                reflectiveQuadToRelative(42f, -43f)
                lineToRelative(164f, 164f)
                quadToRelative(-16f, 26f, -43f, 42f)
                reflectiveQuadToRelative(-59f, 16f)
                close()
                moveToRelative(123f, 280f)
                close()
                moveToRelative(227f, -206f)
                close()
                moveToRelative(324f, 322f)
                lineTo(784f, 668f)
                lineTo(666f, 328f)
                quadToRelative(-8f, -23f, -25f, -35.5f)
                reflectiveQuadTo(601f, 280f)
                quadToRelative(-23f, 0f, -40.5f, 13f)
                reflectiveQuadTo(535f, 329f)
                lineToRelative(-21f, 70f)
                lineToRelative(-64f, -65f)
                lineToRelative(8f, -28f)
                quadToRelative(14f, -48f, 53.5f, -77f)
                reflectiveQuadToRelative(89.5f, -29f)
                quadToRelative(49f, 0f, 87.5f, 28.5f)
                reflectiveQuadTo(742f, 303f)
                lineToRelative(172f, 493f)
                close()
                moveToRelative(-868f, 4f)
                lineToRelative(138f, -276f)
                quadToRelative(10f, -20f, 28.5f, -32f)
                reflectiveQuadToRelative(41.5f, -12f)
                quadToRelative(24f, 0f, 44f, 12.5f)
                reflectiveQuadToRelative(29f, 35.5f)
                lineToRelative(27f, 66f)
                quadToRelative(2f, 6f, 9f, 5.5f)
                reflectiveQuadToRelative(9f, -6.5f)
                lineToRelative(51f, -170f)
                lineToRelative(65f, 65f)
                lineToRelative(-39f, 128f)
                quadToRelative(-9f, 28f, -32.5f, 46f)
                reflectiveQuadTo(363f, 680f)
                quadToRelative(-27f, 0f, -50f, -14.5f)
                reflectiveQuadTo(280f, 625f)
                lineToRelative(-27f, -66f)
                lineToRelative(-118f, 241f)
                horizontalLineTo(46f)
                close()
            }
        }.build()
        
        return _Landscape_2_off!!
    }

private var _Landscape_2_off: ImageVector? = null

