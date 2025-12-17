package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ChevronRight: ImageVector
    get() {
        if (_ChevronRight != null) return _ChevronRight!!
        
        _ChevronRight = ImageVector.Builder(
            name = "chevron-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.646f, 1.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                lineToRelative(6f, 6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.708f)
                lineToRelative(-6f, 6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, -0.708f)
                lineTo(10.293f, 8f)
                lineTo(4.646f, 2.354f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.708f)
            }
        }.build()
        
        return _ChevronRight!!
    }

private var _ChevronRight: ImageVector? = null

