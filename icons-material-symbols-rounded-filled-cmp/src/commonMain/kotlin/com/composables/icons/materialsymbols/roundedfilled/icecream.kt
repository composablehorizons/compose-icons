package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Icecream: ImageVector
    get() {
        if (_Icecream != null) return _Icecream!!
        
        _Icecream = ImageVector.Builder(
            name = "icecream",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 400f)
                quadToRelative(0f, -51f, 29.5f, -92f)
                reflectiveQuadToRelative(74.5f, -58f)
                quadToRelative(18f, -91f, 89.5f, -150.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(95f, 0f, 166.5f, 59.5f)
                reflectiveQuadTo(736f, 250f)
                quadToRelative(45f, 17f, 74.5f, 58f)
                reflectiveQuadToRelative(29.5f, 92f)
                quadToRelative(0f, 75f, -53f, 119f)
                reflectiveQuadToRelative(-119f, 41f)
                lineTo(517f, 852f)
                quadToRelative(-5f, 11f, -14.5f, 16f)
                reflectiveQuadTo(482f, 873f)
                quadToRelative(-11f, 0f, -21f, -5f)
                reflectiveQuadToRelative(-15f, -16f)
                lineTo(294f, 560f)
                quadToRelative(-71f, 3f, -122.5f, -41f)
                reflectiveQuadTo(120f, 400f)
                close()
                moveToRelative(362f, 346f)
                lineToRelative(108f, -210f)
                quadToRelative(-24f, 12f, -52f, 18f)
                reflectiveQuadToRelative(-58f, 6f)
                quadToRelative(-27f, 0f, -54.5f, -6f)
                reflectiveQuadTo(372f, 536f)
                lineToRelative(110f, 210f)
                close()
            }
        }.build()
        
        return _Icecream!!
    }

private var _Icecream: ImageVector? = null

