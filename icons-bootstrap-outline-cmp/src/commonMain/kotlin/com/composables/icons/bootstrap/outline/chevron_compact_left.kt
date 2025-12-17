package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ChevronCompactLeft: ImageVector
    get() {
        if (_ChevronCompactLeft != null) return _ChevronCompactLeft!!
        
        _ChevronCompactLeft = ImageVector.Builder(
            name = "chevron-compact-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.224f, 1.553f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.223f, 0.67f)
                lineTo(6.56f, 8f)
                lineToRelative(2.888f, 5.776f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.894f, 0.448f)
                lineToRelative(-3f, -6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.448f)
                lineToRelative(3f, -6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.67f, -0.223f)
            }
        }.build()
        
        return _ChevronCompactLeft!!
    }

private var _ChevronCompactLeft: ImageVector? = null

