package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Italic: ImageVector
    get() {
        if (_Italic != null) return _Italic!!
        
        _Italic = ImageVector.Builder(
            name = "italic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 2.00014f)
                horizontalLineTo(7f)
                curveTo(6.72386f, 2.00014f, 6.5f, 2.22399f, 6.5f, 2.50014f)
                curveTo(6.5f, 2.77628f, 6.72386f, 3.00014f, 7f, 3.00014f)
                horizontalLineTo(9.47388f)
                lineTo(5.65575f, 13f)
                lineTo(3f, 13.0001f)
                curveTo(2.72386f, 13.0001f, 2.5f, 13.224f, 2.5f, 13.5001f)
                curveTo(2.5f, 13.7763f, 2.72386f, 14.0001f, 3f, 14.0001f)
                horizontalLineTo(5.98833f)
                curveTo(5.99606f, 14.0003f, 6.00378f, 14.0003f, 6.01148f, 14.0001f)
                horizontalLineTo(9f)
                curveTo(9.27614f, 14.0001f, 9.5f, 13.7763f, 9.5f, 13.5001f)
                curveTo(9.5f, 13.224f, 9.27614f, 13.0001f, 9f, 13.0001f)
                lineTo(6.72617f, 13f)
                lineTo(10.5443f, 3.00014f)
                horizontalLineTo(13f)
                curveTo(13.2761f, 3.00014f, 13.5f, 2.77628f, 13.5f, 2.50014f)
                curveTo(13.5f, 2.22399f, 13.2761f, 2.00014f, 13f, 2.00014f)
                close()
            }
        }.build()
        
        return _Italic!!
    }

private var _Italic: ImageVector? = null

