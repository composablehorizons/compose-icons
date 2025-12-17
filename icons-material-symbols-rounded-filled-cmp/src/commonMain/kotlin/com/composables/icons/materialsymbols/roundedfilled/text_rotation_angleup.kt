package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Text_rotation_angleup: ImageVector
    get() {
        if (_Text_rotation_angleup != null) return _Text_rotation_angleup!!
        
        _Text_rotation_angleup = ImageVector.Builder(
            name = "text_rotation_angleup",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(761f, 496f)
                lineTo(417f, 840f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(344f, -344f)
                horizontalLineToRelative(-24f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(641f, 400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(681f, 360f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(841f, 400f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(801f, 560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(761f, 520f)
                verticalLineToRelative(-24f)
                close()
                moveToRelative(-428f, -12f)
                lineToRelative(39f, 84f)
                quadToRelative(5f, 10f, 3.5f, 20.5f)
                reflectiveQuadTo(366f, 607f)
                quadToRelative(-14f, 14f, -32f, 10.5f)
                reflectiveQuadTo(308f, 597f)
                lineTo(146f, 239f)
                quadToRelative(-5f, -11f, -3f, -22f)
                reflectiveQuadToRelative(10f, -19f)
                lineToRelative(20f, -20f)
                quadToRelative(8f, -8f, 19f, -10f)
                reflectiveQuadToRelative(22f, 3f)
                lineToRelative(359f, 164f)
                quadToRelative(17f, 8f, 20f, 26f)
                reflectiveQuadToRelative(-10f, 31f)
                quadToRelative(-8f, 8f, -19f, 10f)
                reflectiveQuadToRelative(-22f, -3f)
                lineToRelative(-83f, -41f)
                lineToRelative(-126f, 126f)
                close()
                moveToRelative(-30f, -62f)
                lineToRelative(94f, -92f)
                lineToRelative(-174f, -84f)
                lineToRelative(-2f, 2f)
                lineToRelative(82f, 174f)
                close()
            }
        }.build()
        
        return _Text_rotation_angleup!!
    }

private var _Text_rotation_angleup: ImageVector? = null

