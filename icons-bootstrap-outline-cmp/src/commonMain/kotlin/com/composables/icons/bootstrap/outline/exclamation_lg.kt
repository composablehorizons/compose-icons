package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ExclamationLg: ImageVector
    get() {
        if (_ExclamationLg != null) return _ExclamationLg!!
        
        _ExclamationLg = ImageVector.Builder(
            name = "exclamation-lg",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.005f, 3.1f)
                arcToRelative(1f, 1f, 0f, true, true, 1.99f, 0f)
                lineToRelative(-0.388f, 6.35f)
                arcToRelative(0.61f, 0.61f, 0f, false, true, -1.214f, 0f)
                close()
                moveTo(7f, 12f)
                arcToRelative(1f, 1f, 0f, true, true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
            }
        }.build()
        
        return _ExclamationLg!!
    }

private var _ExclamationLg: ImageVector? = null

