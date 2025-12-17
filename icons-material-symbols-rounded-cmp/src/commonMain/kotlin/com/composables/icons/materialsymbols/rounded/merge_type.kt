package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Merge_type: ImageVector
    get() {
        if (_Merge_type != null) return _Merge_type!!
        
        _Merge_type = ImageVector.Builder(
            name = "merge_type",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(692f, 772f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(464f, 599f)
                quadToRelative(-11f, -11f, -17.5f, -25.5f)
                reflectiveQuadTo(440f, 543f)
                verticalLineToRelative(-268f)
                lineToRelative(-75f, 75f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(308f, 350f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(144f, -145f)
                quadToRelative(6f, -6f, 13f, -8.5f)
                reflectiveQuadToRelative(15f, -2.5f)
                quadToRelative(8f, 0f, 15f, 2.5f)
                reflectiveQuadToRelative(13f, 8.5f)
                lineToRelative(144f, 143f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(652f, 349f)
                quadToRelative(-12f, 12f, -28.5f, 12.5f)
                reflectiveQuadTo(595f, 350f)
                lineToRelative(-75f, -75f)
                verticalLineToRelative(269f)
                lineToRelative(172f, 172f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                close()
                moveToRelative(-424f, 1f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(268f, 717f)
                lineToRelative(71f, -72f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(12f, 12f, 11.5f, 28.5f)
                reflectiveQuadTo(395f, 702f)
                lineToRelative(-71f, 71f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
            }
        }.build()
        
        return _Merge_type!!
    }

private var _Merge_type: ImageVector? = null

