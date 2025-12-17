package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Escape: ImageVector
    get() {
        if (_Escape != null) return _Escape!!
        
        _Escape = ImageVector.Builder(
            name = "escape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.538f, 1.02f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.076f, 0.998f)
                arcToRelative(6f, 6f, 0f, true, true, -6.445f, 6.444f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.997f, 0.076f)
                arcTo(7f, 7f, 0f, true, false, 8.538f, 1.02f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.096f, 7.828f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.707f, -0.707f)
                lineTo(2.707f, 2.025f)
                horizontalLineToRelative(2.768f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, -1f)
                horizontalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineTo(2.732f)
                close()
            }
        }.build()
        
        return _Escape!!
    }

private var _Escape: ImageVector? = null

