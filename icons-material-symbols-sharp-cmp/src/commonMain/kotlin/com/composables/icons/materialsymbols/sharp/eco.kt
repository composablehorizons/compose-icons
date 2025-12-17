package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Eco: ImageVector
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
                quadToRelative(35f, -35f, 86.5f, -60f)
                reflectiveQuadToRelative(122f, -39.5f)
                quadTo(501f, 204f, 591.5f, 201f)
                reflectiveQuadToRelative(202.5f, 7f)
                quadToRelative(8f, 106f, 5f, 195f)
                reflectiveQuadToRelative(-16.5f, 160.5f)
                quadToRelative(-13.5f, 71.5f, -38f, 125f)
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

