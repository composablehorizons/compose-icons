package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Arrow90degLeft: ImageVector
    get() {
        if (_Arrow90degLeft != null) return _Arrow90degLeft!!
        
        _Arrow90degLeft = ImageVector.Builder(
            name = "arrow-90deg-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.146f, 4.854f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.708f)
                lineToRelative(4f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.708f, 0.708f)
                lineTo(2.707f, 4f)
                horizontalLineTo(12.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 15f, 6.5f)
                verticalLineToRelative(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-8f)
                arcTo(1.5f, 1.5f, 0f, false, false, 12.5f, 5f)
                horizontalLineTo(2.707f)
                lineToRelative(3.147f, 3.146f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, 0.708f)
                close()
            }
        }.build()
        
        return _Arrow90degLeft!!
    }

private var _Arrow90degLeft: ImageVector? = null

