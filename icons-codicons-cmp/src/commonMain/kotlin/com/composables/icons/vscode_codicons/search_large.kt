package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SearchLarge: ImageVector
    get() {
        if (_SearchLarge != null) return _SearchLarge!!
        
        _SearchLarge = ImageVector.Builder(
            name = "search-large",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22.281f, 21.219f)
                lineTo(16.0875f, 15.0255f)
                curveTo(17.2815f, 13.5945f, 18f, 11.754f, 18f, 9.74854f)
                curveTo(18f, 5.19904f, 14.298f, 1.49854f, 9.75f, 1.49854f)
                curveTo(5.202f, 1.49854f, 1.5f, 5.20054f, 1.5f, 9.75004f)
                curveTo(1.5f, 14.2995f, 5.202f, 18f, 9.75f, 18f)
                curveTo(11.7555f, 18f, 13.5945f, 17.28f, 15.027f, 16.0875f)
                lineTo(21.2205f, 22.281f)
                curveTo(21.3675f, 22.428f, 21.5595f, 22.5f, 21.7515f, 22.5f)
                curveTo(21.9435f, 22.5f, 22.1355f, 22.4265f, 22.2825f, 22.281f)
                curveTo(22.575f, 21.9885f, 22.575f, 21.513f, 22.2825f, 21.2205f)
                lineTo(22.281f, 21.219f)
                close()
                moveTo(9.75f, 16.5f)
                curveTo(6.0285f, 16.5f, 3f, 13.4715f, 3f, 9.75004f)
                curveTo(3f, 6.02853f, 6.0285f, 3.00004f, 9.75f, 3.00004f)
                curveTo(13.4715f, 3.00004f, 16.5f, 6.02853f, 16.5f, 9.75004f)
                curveTo(16.5f, 13.4715f, 13.4715f, 16.5f, 9.75f, 16.5f)
                close()
            }
        }.build()
        
        return _SearchLarge!!
    }

private var _SearchLarge: ImageVector? = null

