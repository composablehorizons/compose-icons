package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Eco: ImageVector
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
                moveTo(450f, 880f)
                quadToRelative(-33f, 0f, -66.5f, -7.5f)
                reflectiveQuadTo(315f, 851f)
                quadToRelative(12f, -121f, 70f, -226f)
                reflectiveQuadToRelative(149f, -185f)
                quadToRelative(-110f, 56f, -190.5f, 148f)
                reflectiveQuadTo(231f, 798f)
                quadToRelative(-4f, -3f, -7.5f, -6.5f)
                lineTo(216f, 784f)
                quadToRelative(-47f, -47f, -71.5f, -105f)
                reflectiveQuadTo(120f, 558f)
                quadToRelative(0f, -68f, 27f, -130f)
                reflectiveQuadToRelative(75f, -110f)
                quadToRelative(81f, -81f, 210f, -105.5f)
                reflectiveQuadToRelative(362f, -4.5f)
                quadToRelative(18f, 239f, -6f, 364.5f)
                reflectiveQuadTo(684f, 778f)
                quadToRelative(-49f, 49f, -109.5f, 75.5f)
                reflectiveQuadTo(450f, 880f)
                close()
            }
        }.build()
        
        return _Eco!!
    }

private var _Eco: ImageVector? = null

