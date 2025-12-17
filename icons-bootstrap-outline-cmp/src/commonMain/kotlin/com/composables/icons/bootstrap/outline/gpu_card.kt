package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.GpuCard: ImageVector
    get() {
        if (_GpuCard != null) return _GpuCard!!
        
        _GpuCard = ImageVector.Builder(
            name = "gpu-card",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 8f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -3f, 0f)
                moveToRelative(7.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, -3f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.5f, 1f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(4f)
                horizontalLineToRelative(13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(2f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(2f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveToRelative(5.5f, 4f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 0f, 5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0f, -5f)
                moveTo(9f, 8f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -5f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 12.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                close()
                moveToRelative(4f, 1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
            }
        }.build()
        
        return _GpuCard!!
    }

private var _GpuCard: ImageVector? = null

