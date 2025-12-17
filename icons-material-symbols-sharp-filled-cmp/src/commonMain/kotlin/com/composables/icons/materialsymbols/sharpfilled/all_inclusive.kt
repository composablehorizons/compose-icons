package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.All_inclusive: ImageVector
    get() {
        if (_All_inclusive != null) return _All_inclusive!!
        
        _All_inclusive = ImageVector.Builder(
            name = "all_inclusive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(220f, 700f)
                quadToRelative(-92f, 0f, -156f, -64f)
                reflectiveQuadTo(0f, 480f)
                quadToRelative(0f, -92f, 64f, -156f)
                reflectiveQuadToRelative(156f, -64f)
                quadToRelative(37f, 0f, 71f, 13f)
                reflectiveQuadToRelative(61f, 37f)
                lineToRelative(68f, 62f)
                lineToRelative(-60f, 54f)
                lineToRelative(-62f, -56f)
                quadToRelative(-16f, -14f, -36f, -22f)
                reflectiveQuadToRelative(-42f, -8f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                quadToRelative(22f, 0f, 42f, -8f)
                reflectiveQuadToRelative(36f, -22f)
                lineToRelative(310f, -280f)
                quadToRelative(27f, -24f, 61f, -37f)
                reflectiveQuadToRelative(71f, -13f)
                quadToRelative(92f, 0f, 156f, 64f)
                reflectiveQuadToRelative(64f, 156f)
                quadToRelative(0f, 92f, -64f, 156f)
                reflectiveQuadToRelative(-156f, 64f)
                quadToRelative(-37f, 0f, -71f, -13f)
                reflectiveQuadToRelative(-61f, -37f)
                lineToRelative(-68f, -62f)
                lineToRelative(60f, -54f)
                lineToRelative(62f, 56f)
                quadToRelative(16f, 14f, 36f, 22f)
                reflectiveQuadToRelative(42f, 8f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-22f, 0f, -42f, 8f)
                reflectiveQuadToRelative(-36f, 22f)
                lineTo(352f, 650f)
                quadToRelative(-27f, 24f, -61f, 37f)
                reflectiveQuadToRelative(-71f, 13f)
                close()
            }
        }.build()
        
        return _All_inclusive!!
    }

private var _All_inclusive: ImageVector? = null

