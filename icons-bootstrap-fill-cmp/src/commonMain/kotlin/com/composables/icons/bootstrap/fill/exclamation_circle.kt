package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.ExclamationCircle: ImageVector
    get() {
        if (_ExclamationCircle != null) return _ExclamationCircle!!
        
        _ExclamationCircle = ImageVector.Builder(
            name = "exclamation-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveTo(8f, 4f)
                arcToRelative(0.905f, 0.905f, 0f, false, false, -0.9f, 0.995f)
                lineToRelative(0.35f, 3.507f)
                arcToRelative(0.552f, 0.552f, 0f, false, false, 1.1f, 0f)
                lineToRelative(0.35f, -3.507f)
                arcTo(0.905f, 0.905f, 0f, false, false, 8f, 4f)
                moveToRelative(0.002f, 6f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
            }
        }.build()
        
        return _ExclamationCircle!!
    }

private var _ExclamationCircle: ImageVector? = null

