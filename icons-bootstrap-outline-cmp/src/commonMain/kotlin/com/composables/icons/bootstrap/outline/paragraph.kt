package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Paragraph: ImageVector
    get() {
        if (_Paragraph != null) return _Paragraph!!
        
        _Paragraph = ImageVector.Builder(
            name = "paragraph",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 15f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                verticalLineToRelative(12.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                arcToRelative(4f, 4f, 0f, true, true, 0f, -8f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(11f)
                verticalLineToRelative(12.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
            }
        }.build()
        
        return _Paragraph!!
    }

private var _Paragraph: ImageVector? = null

