package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Vscode: ImageVector
    get() {
        if (_Vscode != null) return _Vscode!!
        
        _Vscode = ImageVector.Builder(
            name = "vscode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.8635f, 13.9195f)
                curveTo(10.6568f, 14.0195f, 10.4234f, 14.0246f, 10.2186f, 13.9444f)
                curveTo(10.1163f, 13.9044f, 10.0211f, 13.843f, 9.94003f, 13.7614f)
                lineTo(4.81622f, 9.06268f)
                lineTo(2.5844f, 10.7656f)
                curveTo(2.37664f, 10.9241f, 2.08603f, 10.9111f, 1.89307f, 10.7347f)
                lineTo(1.17725f, 10.0802f)
                curveTo(0.941229f, 9.86437f, 0.940959f, 9.49112f, 1.17667f, 9.27496f)
                lineTo(3.11219f, 7.5f)
                lineTo(1.17667f, 5.72504f)
                curveTo(0.940959f, 5.50888f, 0.941229f, 5.13563f, 1.17725f, 4.91982f)
                lineTo(1.89307f, 4.2653f)
                curveTo(2.08603f, 4.08887f, 2.37664f, 4.07588f, 2.5844f, 4.2344f)
                lineTo(4.81622f, 5.93732f)
                lineTo(9.94003f, 1.23855f)
                curveTo(9.97043f, 1.20797f, 10.0028f, 1.18023f, 10.0368f, 1.15538f)
                curveTo(10.2749f, 0.981429f, 10.5923f, 0.949298f, 10.8635f, 1.08048f)
                lineTo(13.54f, 2.37507f)
                curveTo(13.8212f, 2.5111f, 14.0001f, 2.79721f, 14.0001f, 3.11109f)
                verticalLineTo(8f)
                horizontalLineTo(10.752f)
                verticalLineTo(4.53356f)
                lineTo(6.86425f, 7.5f)
                lineTo(10.752f, 10.4664f)
                verticalLineTo(8f)
                horizontalLineTo(14.0001f)
                verticalLineTo(11.8889f)
                curveTo(14.0001f, 12.2028f, 13.8212f, 12.4889f, 13.54f, 12.625f)
                lineTo(10.8635f, 13.9195f)
                close()
            }
        }.build()
        
        return _Vscode!!
    }

private var _Vscode: ImageVector? = null

