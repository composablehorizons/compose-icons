package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ChevronLeft: ImageVector
    get() {
        if (_ChevronLeft != null) return _ChevronLeft!!
        
        _ChevronLeft = ImageVector.Builder(
            name = "chevron-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.354f, 1.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.708f)
                lineTo(5.707f, 8f)
                lineToRelative(5.647f, 5.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                lineToRelative(-6f, -6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.708f)
                lineToRelative(6f, -6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
            }
        }.build()
        
        return _ChevronLeft!!
    }

private var _ChevronLeft: ImageVector? = null

