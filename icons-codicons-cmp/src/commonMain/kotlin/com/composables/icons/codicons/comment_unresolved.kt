package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.CommentUnresolved: ImageVector
    get() {
        if (_CommentUnresolved != null) return _CommentUnresolved!!
        
        _CommentUnresolved = ImageVector.Builder(
            name = "comment-unresolved",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.081f, 11.203f)
                curveTo(8.028f, 11.46f, 8f, 11.727f, 8f, 12f)
                verticalLineTo(11.999f)
                curveTo(8f, 12.1664f, 8.02354f, 12.3283f, 8.04698f, 12.4896f)
                curveTo(8.05001f, 12.5104f, 8.05303f, 12.5312f, 8.056f, 12.552f)
                lineTo(5.625f, 14.679f)
                curveTo(4.992f, 15.234f, 4f, 14.784f, 4f, 13.942f)
                verticalLineTo(12f)
                horizontalLineTo(3.5f)
                curveTo(2.119f, 12f, 1f, 10.881f, 1f, 9.5f)
                verticalLineTo(4.5f)
                curveTo(1f, 3.119f, 2.119f, 2f, 3.5f, 2f)
                horizontalLineTo(12.5f)
                curveTo(13.881f, 2f, 15f, 3.119f, 15f, 4.5f)
                verticalLineTo(9.382f)
                curveTo(14.714f, 9.054f, 14.378f, 8.777f, 14f, 8.556f)
                verticalLineTo(4.5f)
                curveTo(14f, 3.672f, 13.328f, 3f, 12.5f, 3f)
                horizontalLineTo(3.5f)
                curveTo(2.672f, 3f, 2f, 3.672f, 2f, 4.5f)
                verticalLineTo(9.5f)
                curveTo(2f, 10.328f, 2.672f, 11f, 3.5f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(13.898f)
                lineTo(8.081f, 11.203f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 12f)
                curveTo(15f, 13.6569f, 13.6569f, 15f, 12f, 15f)
                curveTo(10.3431f, 15f, 9f, 13.6569f, 9f, 12f)
                curveTo(9f, 10.3431f, 10.3431f, 9f, 12f, 9f)
                curveTo(13.6569f, 9f, 15f, 10.3431f, 15f, 12f)
                close()
            }
        }.build()
        
        return _CommentUnresolved!!
    }

private var _CommentUnresolved: ImageVector? = null

