package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Priority_high: ImageVector
    get() {
        if (_Priority_high != null) return _Priority_high!!
        
        _Priority_high = ImageVector.Builder(
            name = "priority_high",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 760f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 760f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 840f)
                close()
                moveToRelative(-80f, -240f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(480f)
                horizontalLineTo(400f)
                close()
            }
        }.build()
        
        return _Priority_high!!
    }

private var _Priority_high: ImageVector? = null

