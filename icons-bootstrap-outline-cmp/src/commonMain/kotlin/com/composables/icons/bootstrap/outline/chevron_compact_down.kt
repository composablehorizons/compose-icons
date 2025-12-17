package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ChevronCompactDown: ImageVector
    get() {
        if (_ChevronCompactDown != null) return _ChevronCompactDown!!
        
        _ChevronCompactDown = ImageVector.Builder(
            name = "chevron-compact-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.553f, 6.776f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.67f, -0.223f)
                lineTo(8f, 9.44f)
                lineToRelative(5.776f, -2.888f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.448f, 0.894f)
                lineToRelative(-6f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.448f, 0f)
                lineToRelative(-6f, -3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.223f, -0.67f)
            }
        }.build()
        
        return _ChevronCompactDown!!
    }

private var _ChevronCompactDown: ImageVector? = null

