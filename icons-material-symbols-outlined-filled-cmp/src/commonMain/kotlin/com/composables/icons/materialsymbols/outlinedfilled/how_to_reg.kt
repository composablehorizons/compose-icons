package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.How_to_reg: ImageVector
    get() {
        if (_How_to_reg != null) return _How_to_reg!!
        
        _How_to_reg = ImageVector.Builder(
            name = "how_to_reg",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(622f, 816f)
                lineTo(484f, 678f)
                lineToRelative(56f, -56f)
                lineToRelative(82f, 82f)
                lineToRelative(202f, -202f)
                lineToRelative(56f, 56f)
                lineToRelative(-258f, 258f)
                close()
                moveTo(400f, 480f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(114f, 52f)
                lineTo(368f, 678f)
                lineToRelative(122f, 122f)
                horizontalLineTo(80f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -33f, 17f, -62f)
                reflectiveQuadToRelative(47f, -44f)
                quadToRelative(51f, -26f, 115f, -44f)
                reflectiveQuadToRelative(141f, -18f)
                quadToRelative(30f, 0f, 58.5f, 3f)
                reflectiveQuadToRelative(55.5f, 9f)
                close()
            }
        }.build()
        
        return _How_to_reg!!
    }

private var _How_to_reg: ImageVector? = null

