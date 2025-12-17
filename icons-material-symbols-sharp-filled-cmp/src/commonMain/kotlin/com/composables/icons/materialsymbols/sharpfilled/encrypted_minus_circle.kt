package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Encrypted_minus_circle: ImageVector
    get() {
        if (_Encrypted_minus_circle != null) return _Encrypted_minus_circle!!
        
        _Encrypted_minus_circle = ImageVector.Builder(
            name = "encrypted_minus_circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 700f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-40f)
                horizontalLineTo(560f)
                verticalLineToRelative(40f)
                close()
                moveTo(680f, 880f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveToRelative(-200f, 0f)
                quadToRelative(-139f, -35f, -229.5f, -159.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-244f)
                lineToRelative(320f, -120f)
                lineToRelative(320f, 120f)
                verticalLineToRelative(227f)
                quadToRelative(-26f, -13f, -58.5f, -20f)
                reflectiveQuadToRelative(-61.5f, -7f)
                quadToRelative(-116f, 0f, -198f, 82f)
                reflectiveQuadToRelative(-82f, 198f)
                quadToRelative(0f, 62f, 23.5f, 112f)
                reflectiveQuadTo(483f, 879f)
                quadToRelative(-1f, 0f, -1.5f, 0.5f)
                reflectiveQuadToRelative(-1.5f, 0.5f)
                close()
                moveToRelative(0f, -560f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 400f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 480f)
                horizontalLineToRelative(4f)
                quadToRelative(16f, -15f, 33f, -27.5f)
                reflectiveQuadToRelative(37f, -22.5f)
                quadToRelative(3f, -7f, 4.5f, -14.5f)
                reflectiveQuadTo(560f, 400f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 320f)
                close()
            }
        }.build()
        
        return _Encrypted_minus_circle!!
    }

private var _Encrypted_minus_circle: ImageVector? = null

