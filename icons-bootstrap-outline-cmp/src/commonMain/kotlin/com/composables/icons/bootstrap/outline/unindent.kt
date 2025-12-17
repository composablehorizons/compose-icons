package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Unindent: ImageVector
    get() {
        if (_Unindent != null) return _Unindent!!
        
        _Unindent = ImageVector.Builder(
            name = "unindent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 8f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineTo(5.707f)
                lineToRelative(2.147f, -2.146f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.708f, -0.708f)
                lineToRelative(-3f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.708f)
                lineToRelative(3f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, -0.708f)
                lineTo(5.707f, 8.5f)
                horizontalLineTo(12.5f)
                arcTo(0.5f, 0.5f, 0f, false, false, 13f, 8f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineToRelative(-7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
            }
        }.build()
        
        return _Unindent!!
    }

private var _Unindent: ImageVector? = null

