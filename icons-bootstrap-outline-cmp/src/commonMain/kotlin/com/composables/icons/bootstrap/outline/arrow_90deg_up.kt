package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Arrow90degUp: ImageVector
    get() {
        if (_Arrow90degUp != null) return _Arrow90degUp!!
        
        _Arrow90degUp = ImageVector.Builder(
            name = "arrow-90deg-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.854f, 1.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, 0f)
                lineToRelative(-4f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.708f, 0.708f)
                lineTo(4f, 2.707f)
                verticalLineTo(12.5f)
                arcTo(2.5f, 2.5f, 0f, false, false, 6.5f, 15f)
                horizontalLineToRelative(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-8f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5f, 12.5f)
                verticalLineTo(2.707f)
                lineToRelative(3.146f, 3.147f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.708f, -0.708f)
                close()
            }
        }.build()
        
        return _Arrow90degUp!!
    }

private var _Arrow90degUp: ImageVector? = null

