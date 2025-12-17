package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.ExclamationOctagon: ImageVector
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
                moveTo(11.46f, 0.146f)
                arcTo(0.5f, 0.5f, 0f, false, false, 11.107f, 0f)
                horizontalLineTo(4.893f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.353f, 0.146f)
                lineTo(0.146f, 4.54f)
                arcTo(0.5f, 0.5f, 0f, false, false, 0f, 4.893f)
                verticalLineToRelative(6.214f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.146f, 0.353f)
                lineToRelative(4.394f, 4.394f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.353f, 0.146f)
                horizontalLineToRelative(6.214f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.353f, -0.146f)
                lineToRelative(4.394f, -4.394f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.146f, -0.353f)
                verticalLineTo(4.893f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.146f, -0.353f)
                close()
                moveTo(8f, 4f)
                curveToRelative(0.535f, 0f, 0.954f, 0.462f, 0.9f, 0.995f)
                lineToRelative(-0.35f, 3.507f)
                arcToRelative(0.552f, 0.552f, 0f, false, true, -1.1f, 0f)
                lineTo(7.1f, 4.995f)
                arcTo(0.905f, 0.905f, 0f, false, true, 8f, 4f)
                moveToRelative(0.002f, 6f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
            }
        }.build()
        
        return _ExclamationOctagon!!
    }

private var _ExclamationOctagon: ImageVector? = null

