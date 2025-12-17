package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ChevronDoubleUp: ImageVector
    get() {
        if (_ChevronDoubleUp != null) return _ChevronDoubleUp!!
        
        _ChevronDoubleUp = ImageVector.Builder(
            name = "chevron-double-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.646f, 2.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                lineToRelative(6f, 6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                lineTo(8f, 3.707f)
                lineTo(2.354f, 9.354f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, -0.708f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.646f, 6.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                lineToRelative(6f, 6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                lineTo(8f, 7.707f)
                lineToRelative(-5.646f, 5.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, -0.708f)
                close()
            }
        }.build()
        
        return _ChevronDoubleUp!!
    }

private var _ChevronDoubleUp: ImageVector? = null

