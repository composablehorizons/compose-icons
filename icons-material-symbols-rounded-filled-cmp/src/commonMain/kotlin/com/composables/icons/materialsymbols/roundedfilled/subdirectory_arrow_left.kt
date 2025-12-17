package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Subdirectory_arrow_left: ImageVector
    get() {
        if (_Subdirectory_arrow_left != null) return _Subdirectory_arrow_left!!
        
        _Subdirectory_arrow_left = ImageVector.Builder(
            name = "subdirectory_arrow_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(313f, 640f)
                lineToRelative(115f, 115f)
                quadToRelative(12f, 12f, 12.5f, 28f)
                reflectiveQuadTo(429f, 811f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(372f, 811f)
                lineTo(188f, 628f)
                quadToRelative(-6f, -6f, -8.5f, -13f)
                reflectiveQuadToRelative(-2.5f, -15f)
                quadToRelative(0f, -8f, 2.5f, -15f)
                reflectiveQuadToRelative(8.5f, -13f)
                lineToRelative(185f, -185f)
                quadToRelative(12f, -12f, 28f, -11.5f)
                reflectiveQuadToRelative(28f, 12.5f)
                quadToRelative(11f, 12f, 11.5f, 28f)
                reflectiveQuadTo(429f, 444f)
                lineTo(313f, 560f)
                horizontalLineToRelative(367f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 200f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 640f)
                horizontalLineTo(313f)
                close()
            }
        }.build()
        
        return _Subdirectory_arrow_left!!
    }

private var _Subdirectory_arrow_left: ImageVector? = null

