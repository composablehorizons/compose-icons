package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ActivityLog: ImageVector
    get() {
        if (_ActivityLog != null) return _ActivityLog!!
        
        _ActivityLog = ImageVector.Builder(
            name = "activity-log",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 13f)
                curveTo(2.77614f, 13f, 3f, 13.2239f, 3f, 13.5f)
                curveTo(3f, 13.7761f, 2.77614f, 14f, 2.5f, 14f)
                horizontalLineTo(0.5f)
                curveTo(0.223858f, 14f, 0f, 13.7761f, 0f, 13.5f)
                curveTo(0f, 13.2239f, 0.223858f, 13f, 0.5f, 13f)
                horizontalLineTo(2.5f)
                close()
                moveTo(14.5f, 13f)
                curveTo(14.7761f, 13f, 15f, 13.2239f, 15f, 13.5f)
                curveTo(15f, 13.7761f, 14.7761f, 14f, 14.5f, 14f)
                horizontalLineTo(4.5f)
                curveTo(4.22386f, 14f, 4f, 13.7761f, 4f, 13.5f)
                curveTo(4f, 13.2239f, 4.22386f, 13f, 4.5f, 13f)
                horizontalLineTo(14.5f)
                close()
                moveTo(11.5f, 10f)
                curveTo(11.7761f, 10f, 12f, 10.2239f, 12f, 10.5f)
                curveTo(12f, 10.7761f, 11.7761f, 11f, 11.5f, 11f)
                horizontalLineTo(4.5f)
                curveTo(4.22386f, 11f, 4f, 10.7761f, 4f, 10.5f)
                curveTo(4f, 10.2239f, 4.22386f, 10f, 4.5f, 10f)
                horizontalLineTo(11.5f)
                close()
                moveTo(2.5f, 7f)
                curveTo(2.77614f, 7f, 3f, 7.22386f, 3f, 7.5f)
                curveTo(3f, 7.77614f, 2.77614f, 8f, 2.5f, 8f)
                horizontalLineTo(0.5f)
                curveTo(0.223858f, 8f, 0f, 7.77614f, 0f, 7.5f)
                curveTo(0f, 7.22386f, 0.223858f, 7f, 0.5f, 7f)
                horizontalLineTo(2.5f)
                close()
                moveTo(14.5f, 7f)
                curveTo(14.7761f, 7f, 15f, 7.22386f, 15f, 7.5f)
                curveTo(15f, 7.77614f, 14.7761f, 8f, 14.5f, 8f)
                horizontalLineTo(4.5f)
                curveTo(4.22386f, 8f, 4f, 7.77614f, 4f, 7.5f)
                curveTo(4f, 7.22386f, 4.22386f, 7f, 4.5f, 7f)
                horizontalLineTo(14.5f)
                close()
                moveTo(11.5f, 4f)
                curveTo(11.7761f, 4f, 12f, 4.22386f, 12f, 4.5f)
                curveTo(12f, 4.77614f, 11.7761f, 5f, 11.5f, 5f)
                horizontalLineTo(4.5f)
                curveTo(4.22386f, 5f, 4f, 4.77614f, 4f, 4.5f)
                curveTo(4f, 4.22386f, 4.22386f, 4f, 4.5f, 4f)
                horizontalLineTo(11.5f)
                close()
                moveTo(2.5f, 1f)
                curveTo(2.77614f, 1f, 3f, 1.22386f, 3f, 1.5f)
                curveTo(3f, 1.77614f, 2.77614f, 2f, 2.5f, 2f)
                horizontalLineTo(0.5f)
                curveTo(0.223858f, 2f, 0f, 1.77614f, 0f, 1.5f)
                curveTo(0f, 1.22386f, 0.223858f, 1f, 0.5f, 1f)
                horizontalLineTo(2.5f)
                close()
                moveTo(14.5f, 1f)
                curveTo(14.7761f, 1f, 15f, 1.22386f, 15f, 1.5f)
                curveTo(15f, 1.77614f, 14.7761f, 2f, 14.5f, 2f)
                horizontalLineTo(4.5f)
                curveTo(4.22386f, 2f, 4f, 1.77614f, 4f, 1.5f)
                curveTo(4f, 1.22386f, 4.22386f, 1f, 4.5f, 1f)
                horizontalLineTo(14.5f)
                close()
            }
        }.build()
        
        return _ActivityLog!!
    }

private var _ActivityLog: ImageVector? = null

