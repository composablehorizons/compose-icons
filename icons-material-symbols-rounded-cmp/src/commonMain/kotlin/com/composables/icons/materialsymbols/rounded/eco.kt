package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Eco: ImageVector
    get() {
        if (_Eco != null) return _Eco!!
        
        _Eco = ImageVector.Builder(
            name = "eco",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(216f, 784f)
                quadToRelative(-45f, -45f, -70.5f, -104f)
                reflectiveQuadTo(120f, 558f)
                quadToRelative(0f, -63f, 24f, -124.5f)
                reflectiveQuadTo(222f, 318f)
                quadToRelative(60f, -60f, 169.5f, -91f)
                reflectiveQuadTo(675f, 201f)
                quadToRelative(26f, 1f, 48f, 11f)
                reflectiveQuadToRelative(39f, 27f)
                quadToRelative(17f, 17f, 27f, 39.5f)
                reflectiveQuadToRelative(11f, 48.5f)
                quadToRelative(2f, 82f, -4.5f, 151.5f)
                reflectiveQuadToRelative(-21f, 125.5f)
                quadToRelative(-14.5f, 56f, -37f, 99.5f)
                reflectiveQuadTo(684f, 778f)
                quadToRelative(-53f, 53f, -112.5f, 77.5f)
                reflectiveQuadTo(450f, 880f)
                quadToRelative(-65f, 0f, -127f, -25.5f)
                reflectiveQuadTo(216f, 784f)
                close()
                moveToRelative(112f, -16f)
                quadToRelative(29f, 17f, 59.5f, 24.5f)
                reflectiveQuadTo(450f, 800f)
                quadToRelative(46f, 0f, 91f, -18.5f)
                reflectiveQuadToRelative(86f, -59.5f)
                quadToRelative(18f, -18f, 36.5f, -50.5f)
                reflectiveQuadToRelative(32f, -85f)
                quadTo(709f, 534f, 716f, 459.5f)
                reflectiveQuadToRelative(2f, -177.5f)
                quadToRelative(-49f, -2f, -110.5f, -1.5f)
                reflectiveQuadTo(485f, 290f)
                quadToRelative(-61f, 9f, -116f, 29f)
                reflectiveQuadToRelative(-90f, 55f)
                quadToRelative(-45f, 45f, -62f, 89f)
                reflectiveQuadToRelative(-17f, 85f)
                quadToRelative(0f, 59f, 22.5f, 103.5f)
                reflectiveQuadTo(262f, 714f)
                quadToRelative(42f, -80f, 111f, -153.5f)
                reflectiveQuadTo(534f, 440f)
                quadToRelative(-72f, 63f, -125.5f, 142.5f)
                reflectiveQuadTo(328f, 768f)
                close()
                moveToRelative(0f, 0f)
                close()
                moveToRelative(0f, 0f)
                close()
            }
        }.build()
        
        return _Eco!!
    }

private var _Eco: ImageVector? = null

