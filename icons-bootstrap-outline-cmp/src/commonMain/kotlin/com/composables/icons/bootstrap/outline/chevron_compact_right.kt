package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ChevronCompactRight: ImageVector
    get() {
        if (_ChevronCompactRight != null) return _ChevronCompactRight!!
        
        _ChevronCompactRight = ImageVector.Builder(
            name = "chevron-compact-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.776f, 1.553f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.671f, 0.223f)
                lineToRelative(3f, 6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.448f)
                lineToRelative(-3f, 6f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.894f, -0.448f)
                lineTo(9.44f, 8f)
                lineTo(6.553f, 2.224f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.223f, -0.671f)
            }
        }.build()
        
        return _ChevronCompactRight!!
    }

private var _ChevronCompactRight: ImageVector? = null

