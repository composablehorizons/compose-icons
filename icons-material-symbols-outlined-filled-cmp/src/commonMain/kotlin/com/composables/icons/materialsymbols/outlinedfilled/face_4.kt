package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Face_4: ImageVector
    get() {
        if (_Face_4 != null) return _Face_4!!
        
        _Face_4 = ImageVector.Builder(
            name = "face_4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 650f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(310f, 600f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(360f, 550f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(410f, 600f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(360f, 650f)
                close()
                moveToRelative(240f, 0f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(550f, 600f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(600f, 550f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(650f, 600f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(600f, 650f)
                close()
                moveTo(480f, 880f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -24f, -3f, -46.5f)
                reflectiveQuadTo(786f, 470f)
                quadToRelative(-21f, 5f, -42f, 7.5f)
                reflectiveQuadToRelative(-44f, 2.5f)
                quadToRelative(-91f, 0f, -172f, -39f)
                reflectiveQuadTo(390f, 332f)
                quadToRelative(-32f, 78f, -91.5f, 135.5f)
                reflectiveQuadTo(160f, 554f)
                verticalLineToRelative(6f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 843f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 560f)
                quadToRelative(0f, -29f, 4f, -57.5f)
                reflectiveQuadTo(96f, 448f)
                quadToRelative(-43f, -26f, -69.5f, -70.5f)
                reflectiveQuadTo(0f, 279f)
                quadToRelative(0f, -83f, 58f, -141f)
                reflectiveQuadToRelative(141f, -58f)
                quadToRelative(53f, 0f, 97.5f, 25.5f)
                reflectiveQuadTo(368f, 176f)
                quadToRelative(26f, -8f, 54.5f, -12f)
                reflectiveQuadToRelative(57.5f, -4f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 277f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 560f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 843f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 960f)
                close()
            }
        }.build()
        
        return _Face_4!!
    }

private var _Face_4: ImageVector? = null

