package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Landscape_2: ImageVector
    get() {
        if (_Landscape_2 != null) return _Landscape_2!!
        
        _Landscape_2 = ImageVector.Builder(
            name = "landscape_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(110f, 800f)
                quadToRelative(-23f, 0f, -34f, -19f)
                reflectiveQuadToRelative(-1f, -39f)
                lineToRelative(109f, -218f)
                quadToRelative(10f, -20f, 28.5f, -32f)
                reflectiveQuadToRelative(41.5f, -12f)
                quadToRelative(24f, 0f, 44f, 12.5f)
                reflectiveQuadToRelative(29f, 35.5f)
                lineToRelative(27f, 66f)
                quadToRelative(2f, 6f, 9f, 5.5f)
                reflectiveQuadToRelative(9f, -6.5f)
                lineToRelative(86f, -287f)
                quadToRelative(14f, -48f, 53.5f, -77f)
                reflectiveQuadToRelative(89.5f, -29f)
                quadToRelative(49f, 0f, 87.5f, 28.5f)
                reflectiveQuadTo(742f, 303f)
                lineToRelative(155f, 444f)
                quadToRelative(7f, 20f, -5.5f, 36.5f)
                reflectiveQuadTo(859f, 800f)
                horizontalLineTo(110f)
                close()
                moveToRelative(130f, -400f)
                quadToRelative(-50f, 0f, -85f, -35.5f)
                reflectiveQuadTo(120f, 280f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 49f, -35f, 84.5f)
                reflectiveQuadTo(240f, 400f)
                close()
            }
        }.build()
        
        return _Landscape_2!!
    }

private var _Landscape_2: ImageVector? = null

