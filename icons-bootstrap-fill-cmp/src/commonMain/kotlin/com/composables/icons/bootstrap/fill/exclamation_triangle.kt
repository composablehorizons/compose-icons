package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.ExclamationTriangle: ImageVector
    get() {
        if (_ExclamationTriangle != null) return _ExclamationTriangle!!
        
        _ExclamationTriangle = ImageVector.Builder(
            name = "exclamation-triangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.982f, 1.566f)
                arcToRelative(1.13f, 1.13f, 0f, false, false, -1.96f, 0f)
                lineTo(0.165f, 13.233f)
                curveToRelative(-0.457f, 0.778f, 0.091f, 1.767f, 0.98f, 1.767f)
                horizontalLineToRelative(13.713f)
                curveToRelative(0.889f, 0f, 1.438f, -0.99f, 0.98f, -1.767f)
                close()
                moveTo(8f, 5f)
                curveToRelative(0.535f, 0f, 0.954f, 0.462f, 0.9f, 0.995f)
                lineToRelative(-0.35f, 3.507f)
                arcToRelative(0.552f, 0.552f, 0f, false, true, -1.1f, 0f)
                lineTo(7.1f, 5.995f)
                arcTo(0.905f, 0.905f, 0f, false, true, 8f, 5f)
                moveToRelative(0.002f, 6f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
            }
        }.build()
        
        return _ExclamationTriangle!!
    }

private var _ExclamationTriangle: ImageVector? = null

