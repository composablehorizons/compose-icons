package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SymbolConstant: ImageVector
    get() {
        if (_SymbolConstant != null) return _SymbolConstant!!
        
        _SymbolConstant = ImageVector.Builder(
            name = "symbol-constant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 2f)
                curveTo(3.83696f, 2f, 3.20107f, 2.26339f, 2.73223f, 2.73223f)
                curveTo(2.26339f, 3.20107f, 2f, 3.83696f, 2f, 4.5f)
                verticalLineTo(11.5f)
                curveTo(2f, 12.163f, 2.26339f, 12.7989f, 2.73223f, 13.2678f)
                curveTo(3.20107f, 13.7366f, 3.83696f, 14f, 4.5f, 14f)
                horizontalLineTo(11.5f)
                curveTo(12.163f, 14f, 12.7989f, 13.7366f, 13.2678f, 13.2678f)
                curveTo(13.7366f, 12.7989f, 14f, 12.163f, 14f, 11.5f)
                verticalLineTo(4.5f)
                curveTo(14f, 3.83696f, 13.7366f, 3.20107f, 13.2678f, 2.73223f)
                curveTo(12.7989f, 2.26339f, 12.163f, 2f, 11.5f, 2f)
                horizontalLineTo(4.5f)
                close()
                moveTo(3f, 4.5f)
                curveTo(3f, 4.10218f, 3.15804f, 3.72064f, 3.43934f, 3.43934f)
                curveTo(3.72064f, 3.15804f, 4.10218f, 3f, 4.5f, 3f)
                horizontalLineTo(11.5f)
                curveTo(11.8978f, 3f, 12.2794f, 3.15804f, 12.5607f, 3.43934f)
                curveTo(12.842f, 3.72064f, 13f, 4.10218f, 13f, 4.5f)
                verticalLineTo(11.5f)
                curveTo(13f, 11.8978f, 12.842f, 12.2794f, 12.5607f, 12.5607f)
                curveTo(12.2794f, 12.842f, 11.8978f, 13f, 11.5f, 13f)
                horizontalLineTo(4.5f)
                curveTo(4.10218f, 13f, 3.72064f, 12.842f, 3.43934f, 12.5607f)
                curveTo(3.15804f, 12.2794f, 3f, 11.8978f, 3f, 11.5f)
                verticalLineTo(4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 6.5f)
                curveTo(5f, 6.36739f, 5.05268f, 6.24021f, 5.14645f, 6.14645f)
                curveTo(5.24021f, 6.05268f, 5.36739f, 6f, 5.5f, 6f)
                horizontalLineTo(10.5f)
                curveTo(10.6326f, 6f, 10.7598f, 6.05268f, 10.8536f, 6.14645f)
                curveTo(10.9473f, 6.24021f, 11f, 6.36739f, 11f, 6.5f)
                curveTo(11f, 6.63261f, 10.9473f, 6.75979f, 10.8536f, 6.85355f)
                curveTo(10.7598f, 6.94732f, 10.6326f, 7f, 10.5f, 7f)
                horizontalLineTo(5.5f)
                curveTo(5.36739f, 7f, 5.24021f, 6.94732f, 5.14645f, 6.85355f)
                curveTo(5.05268f, 6.75979f, 5f, 6.63261f, 5f, 6.5f)
                close()
                moveTo(10.5f, 9f)
                horizontalLineTo(5.5f)
                curveTo(5.36739f, 9f, 5.24021f, 9.05268f, 5.14645f, 9.14645f)
                curveTo(5.05268f, 9.24021f, 5f, 9.36739f, 5f, 9.5f)
                curveTo(5f, 9.63261f, 5.05268f, 9.75979f, 5.14645f, 9.85355f)
                curveTo(5.24021f, 9.94732f, 5.36739f, 10f, 5.5f, 10f)
                horizontalLineTo(10.5f)
                curveTo(10.6326f, 10f, 10.7598f, 9.94732f, 10.8536f, 9.85355f)
                curveTo(10.9473f, 9.75979f, 11f, 9.63261f, 11f, 9.5f)
                curveTo(11f, 9.36739f, 10.9473f, 9.24021f, 10.8536f, 9.14645f)
                curveTo(10.7598f, 9.05268f, 10.6326f, 9f, 10.5f, 9f)
                close()
            }
        }.build()
        
        return _SymbolConstant!!
    }

private var _SymbolConstant: ImageVector? = null

