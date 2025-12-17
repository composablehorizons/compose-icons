package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Landscape_2_off: ImageVector
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
                moveTo(792f, 905f)
                lineTo(55f, 169f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(55f, 112f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(737f, 737f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(792f, 905f)
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
                moveToRelative(152f, -171f)
                lineToRelative(115f, 330f)
                quadToRelative(7f, 19f, -2f, 32.5f)
                reflectiveQuadTo(832f, 684f)
                quadToRelative(-14f, 5f, -29f, -0.5f)
                reflectiveQuadTo(781f, 659f)
                lineTo(666f, 328f)
                quadToRelative(-7f, -21f, -24.5f, -34.5f)
                reflectiveQuadTo(601f, 280f)
                quadToRelative(-23f, 0f, -41f, 13.5f)
                reflectiveQuadTo(535f, 329f)
                lineToRelative(-2f, 5f)
                quadToRelative(-5f, 16f, -19.5f, 24f)
                reflectiveQuadToRelative(-30.5f, 3f)
                quadToRelative(-16f, -5f, -24f, -19.5f)
                reflectiveQuadToRelative(-3f, -30.5f)
                lineToRelative(2f, -5f)
                quadToRelative(14f, -48f, 53.5f, -77f)
                reflectiveQuadToRelative(89.5f, -29f)
                quadToRelative(48f, 0f, 87f, 28.5f)
                reflectiveQuadToRelative(54f, 74.5f)
                close()
                moveTo(184f, 524f)
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
                lineToRelative(-107f, 219f)
                quadToRelative(-5f, 10f, -14.5f, 16f)
                reflectiveQuadToRelative(-20.5f, 6f)
                quadToRelative(-23f, 0f, -34.5f, -19f)
                reflectiveQuadTo(75f, 742f)
                lineToRelative(109f, -218f)
                close()
            }
        }.build()
        
        return _Landscape_2_off!!
    }

private var _Landscape_2_off: ImageVector? = null

