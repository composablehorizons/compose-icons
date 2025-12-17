package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.XLg: ImageVector
    get() {
        if (_XLg != null) return _XLg!!
        
        _XLg = ImageVector.Builder(
            name = "x-lg",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.146f, 2.854f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.708f, -0.708f)
                lineTo(8f, 7.293f)
                lineToRelative(5.146f, -5.147f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0.708f)
                lineTo(8.707f, 8f)
                lineToRelative(5.147f, 5.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                lineTo(8f, 8.707f)
                lineToRelative(-5.146f, 5.147f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, -0.708f)
                lineTo(7.293f, 8f)
                close()
            }
        }.build()
        
        return _XLg!!
    }

private var _XLg: ImageVector? = null

