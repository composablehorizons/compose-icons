package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ExclamationOctagon: ImageVector
    get() {
        if (_ExclamationOctagon != null) return _ExclamationOctagon!!
        
        _ExclamationOctagon = ImageVector.Builder(
            name = "exclamation-octagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.54f, 0.146f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4.893f, 0f)
                horizontalLineToRelative(6.214f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.353f, 0.146f)
                lineToRelative(4.394f, 4.394f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.146f, 0.353f)
                verticalLineToRelative(6.214f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.146f, 0.353f)
                lineToRelative(-4.394f, 4.394f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.353f, 0.146f)
                horizontalLineTo(4.893f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.353f, -0.146f)
                lineTo(0.146f, 11.46f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0f, 11.107f)
                verticalLineTo(4.893f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.146f, -0.353f)
                close()
                moveTo(5.1f, 1f)
                lineTo(1f, 5.1f)
                verticalLineToRelative(5.8f)
                lineTo(5.1f, 15f)
                horizontalLineToRelative(5.8f)
                lineToRelative(4.1f, -4.1f)
                verticalLineTo(5.1f)
                lineTo(10.9f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.002f, 11f)
                arcToRelative(1f, 1f, 0f, true, true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                moveTo(7.1f, 4.995f)
                arcToRelative(0.905f, 0.905f, 0f, true, true, 1.8f, 0f)
                lineToRelative(-0.35f, 3.507f)
                arcToRelative(0.552f, 0.552f, 0f, false, true, -1.1f, 0f)
                close()
            }
        }.build()
        
        return _ExclamationOctagon!!
    }

private var _ExclamationOctagon: ImageVector? = null

