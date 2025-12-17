package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Arrow_drop_up: ImageVector
    get() {
        if (_Arrow_drop_up != null) return _Arrow_drop_up!!
        
        _Arrow_drop_up = ImageVector.Builder(
            name = "arrow_drop_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(328f, 560f)
                quadToRelative(-9f, 0f, -14.5f, -6f)
                reflectiveQuadToRelative(-5.5f, -14f)
                quadToRelative(0f, -2f, 6f, -14f)
                lineToRelative(145f, -145f)
                quadToRelative(5f, -5f, 10f, -7f)
                reflectiveQuadToRelative(11f, -2f)
                quadToRelative(6f, 0f, 11f, 2f)
                reflectiveQuadToRelative(10f, 7f)
                lineToRelative(145f, 145f)
                quadToRelative(3f, 3f, 4.5f, 6.5f)
                reflectiveQuadToRelative(1.5f, 7.5f)
                quadToRelative(0f, 8f, -5.5f, 14f)
                reflectiveQuadToRelative(-14.5f, 6f)
                horizontalLineTo(328f)
                close()
            }
        }.build()
        
        return _Arrow_drop_up!!
    }

private var _Arrow_drop_up: ImageVector? = null

