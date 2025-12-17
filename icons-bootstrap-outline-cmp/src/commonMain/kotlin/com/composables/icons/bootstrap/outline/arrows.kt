package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Arrows: ImageVector
    get() {
        if (_Arrows != null) return _Arrows!!
        
        _Arrows = ImageVector.Builder(
            name = "arrows",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.146f, 8.354f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.708f)
                lineToRelative(2f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.708f, 0.708f)
                lineTo(2.707f, 7.5f)
                horizontalLineToRelative(10.586f)
                lineToRelative(-1.147f, -1.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, -0.708f)
                lineToRelative(2f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.708f)
                lineToRelative(-2f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, -0.708f)
                lineTo(13.293f, 8.5f)
                horizontalLineTo(2.707f)
                lineToRelative(1.147f, 1.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                close()
            }
        }.build()
        
        return _Arrows!!
    }

private var _Arrows: ImageVector? = null

