package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Label_important: ImageVector
    get() {
        if (_Label_important != null) return _Label_important!!
        
        _Label_important = ImageVector.Builder(
            name = "label_important",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 760f)
                lineToRelative(180f, -280f)
                lineToRelative(-180f, -280f)
                horizontalLineToRelative(480f)
                quadToRelative(20f, 0f, 37.5f, 9f)
                reflectiveQuadToRelative(28.5f, 25f)
                lineToRelative(174f, 246f)
                lineToRelative(-174f, 246f)
                quadToRelative(-11f, 16f, -28.5f, 25f)
                reflectiveQuadToRelative(-37.5f, 9f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Label_important!!
    }

private var _Label_important: ImageVector? = null

