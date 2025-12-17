package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Portrait_lighting_off: ImageVector
    get() {
        if (_Portrait_lighting_off != null) return _Portrait_lighting_off!!
        
        _Portrait_lighting_off = ImageVector.Builder(
            name = "portrait_lighting_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(791f, 1001f)
                lineTo(686f, 896f)
                horizontalLineTo(160f)
                verticalLineTo(784f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(224f, 678f)
                quadToRelative(45f, -23f, 91.5f, -37f)
                reflectiveQuadToRelative(94.5f, -21f)
                lineTo(55f, 265f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(480f, 816f)
                horizontalLineToRelative(126f)
                lineTo(486f, 696f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(256f, -138f)
                quadToRelative(29f, 14f, 46f, 42.5f)
                reflectiveQuadToRelative(18f, 61.5f)
                lineTo(666f, 648f)
                quadToRelative(18f, 7f, 35.5f, 14f)
                reflectiveQuadToRelative(34.5f, 16f)
                close()
                moveTo(568f, 550f)
                lineToRelative(-59f, -59f)
                quadToRelative(23f, -9f, 37f, -29.5f)
                reflectiveQuadToRelative(14f, -45.5f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 336f)
                verticalLineToRelative(126f)
                lineTo(346f, 328f)
                quadToRelative(23f, -34f, 58f, -53f)
                reflectiveQuadToRelative(76f, -19f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 41f, -19f, 76f)
                reflectiveQuadToRelative(-53f, 58f)
                close()
            }
        }.build()
        
        return _Portrait_lighting_off!!
    }

private var _Portrait_lighting_off: ImageVector? = null

