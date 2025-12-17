package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Diamond_shine: ImageVector
    get() {
        if (_Diamond_shine != null) return _Diamond_shine!!
        
        _Diamond_shine = ImageVector.Builder(
            name = "diamond_shine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(127f, 167f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(29f, 28f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(212f, 252f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(155f, 252f)
                lineToRelative(-28f, -29f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                close()
                moveToRelative(353f, -87f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 120f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 160f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 80f)
                close()
                moveToRelative(352f, 87f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(831f, 223f)
                lineToRelative(-28f, 29f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(28f, -28f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                close()
                moveTo(205f, 560f)
                horizontalLineToRelative(550f)
                quadToRelative(14f, 0f, 19f, 12f)
                reflectiveQuadToRelative(-5f, 22f)
                lineTo(536f, 824f)
                quadToRelative(-23f, 23f, -56f, 23f)
                reflectiveQuadToRelative(-56f, -23f)
                lineTo(191f, 594f)
                quadToRelative(-10f, -10f, -5f, -22f)
                reflectiveQuadToRelative(19f, -12f)
                close()
                moveToRelative(-22f, -113f)
                lineToRelative(113f, -138f)
                quadToRelative(11f, -14f, 27.5f, -21.5f)
                reflectiveQuadTo(358f, 280f)
                horizontalLineToRelative(244f)
                quadToRelative(18f, 0f, 34.5f, 7.5f)
                reflectiveQuadTo(664f, 309f)
                lineToRelative(113f, 138f)
                quadToRelative(8f, 10f, 3f, 21.5f)
                reflectiveQuadTo(762f, 480f)
                horizontalLineTo(198f)
                quadToRelative(-13f, 0f, -18f, -11.5f)
                reflectiveQuadToRelative(3f, -21.5f)
                close()
            }
        }.build()
        
        return _Diamond_shine!!
    }

private var _Diamond_shine: ImageVector? = null

