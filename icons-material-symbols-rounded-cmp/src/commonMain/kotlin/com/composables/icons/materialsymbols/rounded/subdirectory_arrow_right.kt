package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Subdirectory_arrow_right: ImageVector
    get() {
        if (_Subdirectory_arrow_right != null) return _Subdirectory_arrow_right!!
        
        _Subdirectory_arrow_right = ImageVector.Builder(
            name = "subdirectory_arrow_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(532f, 811f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(115f, -115f)
                horizontalLineTo(280f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 560f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(280f, 200f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(367f)
                lineTo(531f, 444f)
                quadToRelative(-12f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(11.5f, -28f)
                quadToRelative(12f, -12f, 28f, -12.5f)
                reflectiveQuadToRelative(28f, 11.5f)
                lineToRelative(185f, 185f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(589f, 811f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(532f, 811f)
                close()
            }
        }.build()
        
        return _Subdirectory_arrow_right!!
    }

private var _Subdirectory_arrow_right: ImageVector? = null

