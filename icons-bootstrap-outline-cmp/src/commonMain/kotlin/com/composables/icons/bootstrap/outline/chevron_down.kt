package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ChevronDown: ImageVector
    get() {
        if (_ChevronDown != null) return _ChevronDown!!
        
        _ChevronDown = ImageVector.Builder(
            name = "chevron-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.646f, 4.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                lineTo(8f, 10.293f)
                lineToRelative(5.646f, -5.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0.708f)
                lineToRelative(-6f, 6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0f)
                lineToRelative(-6f, -6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.708f)
            }
        }.build()
        
        return _ChevronDown!!
    }

private var _ChevronDown: ImageVector? = null

