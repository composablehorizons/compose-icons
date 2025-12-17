package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PieChart: ImageVector
    get() {
        if (_PieChart != null) return _PieChart!!
        
        _PieChart = ImageVector.Builder(
            name = "pie-chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 1.018f)
                arcToRelative(7f, 7f, 0f, false, false, -4.79f, 11.566f)
                lineTo(7.5f, 7.793f)
                close()
                moveToRelative(1f, 0f)
                verticalLineTo(7.5f)
                horizontalLineToRelative(6.482f)
                arcTo(7f, 7f, 0f, false, false, 8.5f, 1.018f)
                moveTo(14.982f, 8.5f)
                horizontalLineTo(8.207f)
                lineToRelative(-4.79f, 4.79f)
                arcTo(7f, 7f, 0f, false, false, 14.982f, 8.5f)
                moveTo(0f, 8f)
                arcToRelative(8f, 8f, 0f, true, true, 16f, 0f)
                arcTo(8f, 8f, 0f, false, true, 0f, 8f)
            }
        }.build()
        
        return _PieChart!!
    }

private var _PieChart: ImageVector? = null

