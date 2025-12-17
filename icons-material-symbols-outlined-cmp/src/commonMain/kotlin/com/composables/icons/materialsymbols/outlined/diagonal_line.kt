package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Diagonal_line: ImageVector
    get() {
        if (_Diagonal_line != null) return _Diagonal_line!!
        
        _Diagonal_line = ImageVector.Builder(
            name = "diagonal_line",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 880f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -14f, 3f, -27f)
                reflectiveQuadToRelative(9f, -25f)
                lineTo(252f, 308f)
                quadToRelative(-12f, 6f, -25f, 9f)
                reflectiveQuadToRelative(-27f, 3f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 14f, -3f, 27f)
                reflectiveQuadToRelative(-9f, 25f)
                lineToRelative(400f, 400f)
                quadToRelative(12f, -6f, 25f, -9f)
                reflectiveQuadToRelative(27f, -3f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
            }
        }.build()
        
        return _Diagonal_line!!
    }

private var _Diagonal_line: ImageVector? = null

