package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BarChart: ImageVector
    get() {
        if (_BarChart != null) return _BarChart!!
        
        _BarChart = ImageVector.Builder(
            name = "bar-chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 11f)
                horizontalLineTo(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                close()
                moveToRelative(5f, -4f)
                horizontalLineTo(7f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                close()
                moveToRelative(5f, -5f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-2f)
                verticalLineTo(2f)
                close()
                moveToRelative(-2f, -1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
                moveTo(6f, 7f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
                moveToRelative(-5f, 4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
            }
        }.build()
        
        return _BarChart!!
    }

private var _BarChart: ImageVector? = null

