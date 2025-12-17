package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.FilterFilled: ImageVector
    get() {
        if (_FilterFilled != null) return _FilterFilled!!
        
        _FilterFilled = ImageVector.Builder(
            name = "filter-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.5f, 14f)
                horizontalLineTo(6.5f)
                curveTo(6.224f, 14f, 6f, 13.776f, 6f, 13.5f)
                verticalLineTo(9.329f)
                curveTo(6f, 8.928f, 5.844f, 8.552f, 5.561f, 8.268f)
                lineTo(1.561f, 4.268f)
                curveTo(1.205f, 3.911f, 1f, 3.418f, 1f, 2.914f)
                curveTo(1f, 1.858f, 1.858f, 1f, 2.914f, 1f)
                horizontalLineTo(13.086f)
                curveTo(14.142f, 1f, 15f, 1.858f, 15f, 2.914f)
                curveTo(15f, 3.417f, 14.796f, 3.911f, 14.439f, 4.267f)
                lineTo(10.439f, 8.267f)
                curveTo(10.156f, 8.551f, 10f, 8.927f, 10f, 9.328f)
                verticalLineTo(13.499f)
                curveTo(10f, 13.775f, 9.776f, 13.999f, 9.5f, 13.999f)
                verticalLineTo(14f)
                close()
            }
        }.build()
        
        return _FilterFilled!!
    }

private var _FilterFilled: ImageVector? = null

