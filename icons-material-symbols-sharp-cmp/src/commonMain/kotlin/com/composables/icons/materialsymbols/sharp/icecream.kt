package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Icecream: ImageVector
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
                moveTo(482f, 920f)
                lineTo(294f, 560f)
                quadToRelative(-71f, 3f, -122.5f, -41f)
                reflectiveQuadTo(120f, 400f)
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
                lineTo(482f, 920f)
                close()
                moveTo(280f, 480f)
                quadToRelative(15f, 0f, 29.5f, -5f)
                reflectiveQuadToRelative(26.5f, -17f)
                lineToRelative(22f, -22f)
                lineToRelative(26f, 16f)
                quadToRelative(21f, 14f, 45.5f, 21f)
                reflectiveQuadToRelative(50.5f, 7f)
                quadToRelative(26f, 0f, 50.5f, -7f)
                reflectiveQuadToRelative(45.5f, -21f)
                lineToRelative(26f, -16f)
                lineToRelative(22f, 22f)
                quadToRelative(12f, 12f, 26.5f, 17f)
                reflectiveQuadToRelative(29.5f, 5f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(760f, 400f)
                quadToRelative(0f, -30f, -19f, -52.5f)
                reflectiveQuadTo(692f, 320f)
                lineToRelative(-30f, -4f)
                lineToRelative(-2f, -32f)
                quadToRelative(-5f, -69f, -57f, -116.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(-71f, 0f, -123f, 47.5f)
                reflectiveQuadTo(300f, 284f)
                lineToRelative(-2f, 32f)
                lineToRelative(-30f, 6f)
                quadToRelative(-30f, 6f, -49f, 27f)
                reflectiveQuadToRelative(-19f, 51f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(280f, 480f)
                close()
                moveToRelative(202f, 266f)
                lineToRelative(108f, -210f)
                quadToRelative(-24f, 12f, -52f, 18f)
                reflectiveQuadToRelative(-58f, 6f)
                quadToRelative(-27f, 0f, -54.5f, -6f)
                reflectiveQuadTo(372f, 536f)
                lineToRelative(110f, 210f)
                close()
                moveToRelative(-2f, -446f)
                close()
            }
        }.build()
        
        return _Icecream!!
    }

private var _Icecream: ImageVector? = null

