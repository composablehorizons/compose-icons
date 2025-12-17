package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Donut_large: ImageVector
    get() {
        if (_Donut_large != null) return _Donut_large!!
        
        _Donut_large = ImageVector.Builder(
            name = "donut_large",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 480f)
                quadToRelative(0f, 93f, 52.5f, 166.5f)
                reflectiveQuadTo(391f, 747f)
                quadToRelative(18f, 6f, 29.5f, 22.5f)
                reflectiveQuadTo(432f, 806f)
                quadToRelative(0f, 29f, -24.5f, 46f)
                reflectiveQuadToRelative(-53.5f, 7f)
                quadToRelative(-124f, -41f, -199f, -145f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -130f, 75f, -234f)
                reflectiveQuadToRelative(199f, -145f)
                quadToRelative(29f, -10f, 53.5f, 7f)
                reflectiveQuadToRelative(24.5f, 46f)
                quadToRelative(0f, 20f, -11.5f, 36.5f)
                reflectiveQuadTo(391f, 213f)
                quadToRelative(-86f, 27f, -138.5f, 100.5f)
                reflectiveQuadTo(200f, 480f)
                close()
                moveToRelative(562f, 282f)
                quadToRelative(-32f, 33f, -72.5f, 57.5f)
                reflectiveQuadTo(605f, 859f)
                quadToRelative(-29f, 10f, -53.5f, -7f)
                reflectiveQuadTo(527f, 806f)
                quadToRelative(0f, -20f, 11.5f, -36.5f)
                reflectiveQuadTo(568f, 747f)
                quadToRelative(31f, -10f, 59.5f, -27.5f)
                reflectiveQuadTo(679f, 679f)
                quadToRelative(23f, -24f, 40f, -51.5f)
                reflectiveQuadToRelative(28f, -59.5f)
                quadToRelative(6f, -18f, 22.5f, -29.5f)
                reflectiveQuadTo(806f, 527f)
                quadToRelative(29f, 0f, 46f, 24.5f)
                reflectiveQuadToRelative(7f, 53.5f)
                quadToRelative(-15f, 44f, -39.5f, 84f)
                reflectiveQuadTo(762f, 762f)
                close()
                moveToRelative(0f, -564f)
                quadToRelative(33f, 33f, 57.5f, 73f)
                reflectiveQuadToRelative(39.5f, 84f)
                quadToRelative(10f, 29f, -7f, 53.5f)
                reflectiveQuadTo(806f, 433f)
                quadToRelative(-20f, 0f, -36.5f, -11.5f)
                reflectiveQuadTo(747f, 392f)
                quadToRelative(-11f, -32f, -28f, -59.5f)
                reflectiveQuadTo(679f, 281f)
                quadToRelative(-23f, -23f, -51.5f, -40.5f)
                reflectiveQuadTo(568f, 213f)
                quadToRelative(-18f, -6f, -29.5f, -22.5f)
                reflectiveQuadTo(527f, 154f)
                quadToRelative(0f, -29f, 24.5f, -46f)
                reflectiveQuadToRelative(53.5f, -7f)
                quadToRelative(44f, 15f, 84.5f, 39.5f)
                reflectiveQuadTo(762f, 198f)
                close()
            }
        }.build()
        
        return _Donut_large!!
    }

private var _Donut_large: ImageVector? = null

