package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Landscape_2_off: ImageVector
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
                moveTo(848f, 906f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 906f)
                lineTo(55f, 169f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(55f, 112f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(737f, 737f)
                quadToRelative(12f, 12f, 11.5f, 28.5f)
                reflectiveQuadTo(848f, 906f)
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
                moveToRelative(600f, 279f)
                quadToRelative(-11f, 7f, -24.5f, 6.5f)
                reflectiveQuadTo(791f, 674f)
                lineTo(466f, 351f)
                quadToRelative(-8f, -8f, -10.5f, -18.5f)
                reflectiveQuadToRelative(0.5f, -21.5f)
                lineToRelative(2f, -5f)
                quadToRelative(14f, -48f, 53.5f, -77f)
                reflectiveQuadToRelative(89.5f, -29f)
                quadToRelative(49f, 0f, 87.5f, 28.5f)
                reflectiveQuadTo(742f, 303f)
                lineToRelative(115f, 329f)
                quadToRelative(5f, 15f, -0.5f, 27.5f)
                reflectiveQuadTo(840f, 679f)
                close()
                moveTo(111f, 800f)
                quadToRelative(-23f, 0f, -34.5f, -19f)
                reflectiveQuadTo(75f, 742f)
                lineToRelative(109f, -218f)
                quadToRelative(10f, -20f, 28.5f, -32f)
                reflectiveQuadToRelative(41.5f, -12f)
                quadToRelative(24f, 0f, 44f, 12.5f)
                reflectiveQuadToRelative(29f, 35.5f)
                lineToRelative(27f, 66f)
                quadToRelative(2f, 6f, 9f, 5.5f)
                reflectiveQuadToRelative(9f, -6.5f)
                lineToRelative(51f, -170f)
                lineToRelative(377f, 377f)
                horizontalLineTo(111f)
                close()
            }
        }.build()
        
        return _Landscape_2_off!!
    }

private var _Landscape_2_off: ImageVector? = null

