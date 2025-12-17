package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Arrow90degDown: ImageVector
    get() {
        if (_Arrow90degDown != null) return _Arrow90degDown!!
        
        _Arrow90degDown = ImageVector.Builder(
            name = "arrow-90deg-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.854f, 14.854f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0f)
                lineToRelative(-4f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, -0.708f)
                lineTo(4f, 13.293f)
                verticalLineTo(3.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 6.5f, 1f)
                horizontalLineToRelative(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-8f)
                arcTo(1.5f, 1.5f, 0f, false, false, 5f, 3.5f)
                verticalLineToRelative(9.793f)
                lineToRelative(3.146f, -3.147f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0.708f)
                close()
            }
        }.build()
        
        return _Arrow90degDown!!
    }

private var _Arrow90degDown: ImageVector? = null

