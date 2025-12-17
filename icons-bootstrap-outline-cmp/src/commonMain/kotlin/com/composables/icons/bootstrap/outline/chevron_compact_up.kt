package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ChevronCompactUp: ImageVector
    get() {
        if (_ChevronCompactUp != null) return _ChevronCompactUp!!
        
        _ChevronCompactUp = ImageVector.Builder(
            name = "chevron-compact-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.776f, 5.553f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.448f, 0f)
                lineToRelative(6f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.448f, 0.894f)
                lineTo(8f, 6.56f)
                lineTo(2.224f, 9.447f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.448f, -0.894f)
                close()
            }
        }.build()
        
        return _ChevronCompactUp!!
    }

private var _ChevronCompactUp: ImageVector? = null

