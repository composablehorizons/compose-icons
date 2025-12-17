package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Data_usage: ImageVector
    get() {
        if (_Data_usage != null) return _Data_usage!!
        
        _Data_usage = ImageVector.Builder(
            name = "data_usage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -130f, 75f, -234f)
                reflectiveQuadToRelative(199f, -145f)
                quadToRelative(29f, -10f, 53.5f, 7f)
                reflectiveQuadToRelative(24.5f, 46f)
                quadToRelative(0f, 20f, -11.5f, 36.5f)
                reflectiveQuadTo(391f, 213f)
                quadToRelative(-86f, 27f, -138.5f, 100.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, 117f, 81.5f, 198.5f)
                reflectiveQuadTo(480f, 760f)
                quadToRelative(52f, 0f, 100.5f, -18f)
                reflectiveQuadToRelative(86.5f, -52f)
                quadToRelative(15f, -14f, 36.5f, -14f)
                reflectiveQuadToRelative(36.5f, 14f)
                quadToRelative(23f, 21f, 24f, 47.5f)
                reflectiveQuadTo(742f, 784f)
                quadToRelative(-54f, 47f, -120.5f, 71.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(280f, -400f)
                quadToRelative(0f, -92f, -53f, -165.5f)
                reflectiveQuadTo(568f, 213f)
                quadToRelative(-18f, -6f, -29.5f, -22.5f)
                reflectiveQuadTo(527f, 154f)
                quadToRelative(0f, -29f, 24.5f, -46f)
                reflectiveQuadToRelative(53.5f, -7f)
                quadToRelative(125f, 42f, 200f, 146f)
                reflectiveQuadToRelative(75f, 233f)
                quadToRelative(0f, 18f, -1.5f, 36.5f)
                reflectiveQuadTo(873f, 557f)
                quadToRelative(-5f, 29f, -29.5f, 41.5f)
                reflectiveQuadTo(790f, 600f)
                quadToRelative(-19f, -7f, -29.5f, -25.5f)
                reflectiveQuadTo(754f, 536f)
                quadToRelative(3f, -17f, 4.5f, -30f)
                reflectiveQuadToRelative(1.5f, -26f)
                close()
            }
        }.build()
        
        return _Data_usage!!
    }

private var _Data_usage: ImageVector? = null

