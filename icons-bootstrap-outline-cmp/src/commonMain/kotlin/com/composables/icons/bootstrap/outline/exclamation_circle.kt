package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ExclamationCircle: ImageVector
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
                moveTo(8f, 15f)
                arcTo(7f, 7f, 0f, true, true, 8f, 1f)
                arcToRelative(7f, 7f, 0f, false, true, 0f, 14f)
                moveToRelative(0f, 1f)
                arcTo(8f, 8f, 0f, true, false, 8f, 0f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, 16f)
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
        
        return _ExclamationCircle!!
    }

private var _ExclamationCircle: ImageVector? = null

