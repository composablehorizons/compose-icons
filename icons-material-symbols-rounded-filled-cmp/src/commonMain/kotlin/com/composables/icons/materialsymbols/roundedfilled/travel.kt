package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Travel: ImageVector
    get() {
        if (_Travel != null) return _Travel!!
        
        _Travel = ImageVector.Builder(
            name = "travel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(274f, 686f)
                lineToRelative(-100f, -55f)
                quadToRelative(-11f, -6f, -12.5f, -17.5f)
                reflectiveQuadTo(168f, 594f)
                lineToRelative(12f, -12f)
                quadToRelative(4f, -4f, 9.5f, -5.5f)
                reflectiveQuadToRelative(10.5f, -0.5f)
                lineToRelative(88f, 12f)
                lineToRelative(156f, -156f)
                lineToRelative(-272f, -148f)
                quadToRelative(-15f, -8f, -17.5f, -25f)
                reflectiveQuadToRelative(9.5f, -29f)
                lineToRelative(10f, -10f)
                quadToRelative(7f, -7f, 15.5f, -9f)
                reflectiveQuadToRelative(17.5f, 0f)
                lineToRelative(363f, 93f)
                lineToRelative(157f, -155f)
                quadToRelative(17f, -17f, 42.5f, -17f)
                reflectiveQuadToRelative(42.5f, 17f)
                quadToRelative(17f, 17f, 17f, 42.5f)
                reflectiveQuadTo(812f, 234f)
                lineTo(656f, 390f)
                lineToRelative(93f, 361f)
                quadToRelative(2f, 10f, -0.5f, 19.5f)
                reflectiveQuadTo(739f, 787f)
                lineToRelative(-5f, 5f)
                quadToRelative(-14f, 14f, -32.5f, 11f)
                reflectiveQuadTo(674f, 783f)
                lineTo(528f, 516f)
                lineTo(372f, 672f)
                lineToRelative(12f, 86f)
                quadToRelative(1f, 7f, -1f, 13f)
                reflectiveQuadToRelative(-7f, 11f)
                lineToRelative(-5f, 5f)
                quadToRelative(-10f, 10f, -24f, 8.5f)
                reflectiveQuadTo(326f, 781f)
                lineToRelative(-52f, -95f)
                close()
            }
        }.build()
        
        return _Travel!!
    }

private var _Travel: ImageVector? = null

