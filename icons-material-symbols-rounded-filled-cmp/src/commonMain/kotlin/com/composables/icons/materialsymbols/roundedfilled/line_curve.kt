package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Line_curve: ImageVector
    get() {
        if (_Line_curve != null) return _Line_curve!!
        
        _Line_curve = ImageVector.Builder(
            name = "line_curve",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -13f)
                reflectiveQuadTo(718f, 756f)
                quadToRelative(-8f, -103f, -50.5f, -193f)
                reflectiveQuadToRelative(-111f, -158.5f)
                quadTo(488f, 336f, 398f, 293f)
                reflectiveQuadToRelative(-192f, -51f)
                quadToRelative(-18f, -2f, -32f, -13.5f)
                reflectiveQuadTo(160f, 200f)
                quadToRelative(0f, -17f, 12.5f, -28.5f)
                reflectiveQuadTo(202f, 161f)
                quadToRelative(120f, 8f, 225.5f, 57.5f)
                reflectiveQuadTo(613f, 348f)
                quadToRelative(80f, 80f, 129.5f, 186f)
                reflectiveQuadTo(799f, 760f)
                quadToRelative(1f, 17f, -10.5f, 28.5f)
                reflectiveQuadTo(760f, 800f)
                close()
            }
        }.build()
        
        return _Line_curve!!
    }

private var _Line_curve: ImageVector? = null

