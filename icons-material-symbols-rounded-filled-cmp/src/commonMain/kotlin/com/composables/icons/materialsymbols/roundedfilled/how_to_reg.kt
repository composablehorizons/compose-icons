package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.How_to_reg: ImageVector
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
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-32f)
                quadToRelative(0f, -33f, 17f, -62f)
                reflectiveQuadToRelative(47f, -44f)
                quadToRelative(51f, -26f, 115f, -44f)
                reflectiveQuadToRelative(141f, -18f)
                horizontalLineToRelative(26.5f)
                quadToRelative(12.5f, 0f, 25.5f, 2f)
                quadToRelative(20f, 2f, 26f, 21f)
                reflectiveQuadToRelative(-8f, 33f)
                lineToRelative(-17f, 17f)
                quadToRelative(-31f, 31f, -35f, 73f)
                reflectiveQuadToRelative(19f, 77f)
                quadToRelative(12f, 19f, 3.5f, 38f)
                reflectiveQuadTo(412f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(462f, -96f)
                lineToRelative(174f, -174f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(650f, 788f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineToRelative(-82f, -82f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(54f, 54f)
                close()
            }
        }.build()
        
        return _How_to_reg!!
    }

private var _How_to_reg: ImageVector? = null

