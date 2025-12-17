package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Arrow_right: ImageVector
    get() {
        if (_Arrow_right != null) return _Arrow_right!!
        
        _Arrow_right = ImageVector.Builder(
            name = "arrow_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(420f, 652f)
                quadToRelative(-8f, 0f, -14f, -5.5f)
                reflectiveQuadToRelative(-6f, -14.5f)
                verticalLineToRelative(-304f)
                quadToRelative(0f, -9f, 6f, -14.5f)
                reflectiveQuadToRelative(14f, -5.5f)
                quadToRelative(2f, 0f, 14f, 6f)
                lineToRelative(145f, 145f)
                quadToRelative(5f, 5f, 7f, 10f)
                reflectiveQuadToRelative(2f, 11f)
                quadToRelative(0f, 6f, -2f, 11f)
                reflectiveQuadToRelative(-7f, 10f)
                lineTo(434f, 646f)
                quadToRelative(-3f, 3f, -6.5f, 4.5f)
                reflectiveQuadTo(420f, 652f)
                close()
            }
        }.build()
        
        return _Arrow_right!!
    }

private var _Arrow_right: ImageVector? = null

