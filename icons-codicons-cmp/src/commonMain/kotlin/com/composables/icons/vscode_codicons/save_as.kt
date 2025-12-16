package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SaveAs: ImageVector
    get() {
        if (_SaveAs != null) return _SaveAs!!
        
        _SaveAs = ImageVector.Builder(
            name = "save-as",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 9.5f)
                curveTo(5f, 9.224f, 5.224f, 9f, 5.5f, 9f)
                horizontalLineTo(10.5f)
                curveTo(10.738f, 9f, 10.929f, 9.171f, 10.979f, 9.394f)
                lineTo(11.729f, 8.644f)
                curveTo(11.458f, 8.256f, 11.009f, 8f, 10.5f, 8f)
                horizontalLineTo(5.5f)
                curveTo(4.673f, 8f, 4f, 8.673f, 4f, 9.5f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                curveTo(2.449f, 14f, 2f, 13.551f, 2f, 13f)
                verticalLineTo(3f)
                curveTo(2f, 2.449f, 2.449f, 2f, 3f, 2f)
                horizontalLineTo(5f)
                verticalLineTo(3.5f)
                curveTo(5f, 4.327f, 5.673f, 5f, 6.5f, 5f)
                horizontalLineTo(8.5f)
                curveTo(9.327f, 5f, 10f, 4.327f, 10f, 3.5f)
                verticalLineTo(2f)
                horizontalLineTo(11.379f)
                curveTo(11.642f, 2f, 11.9f, 2.107f, 12.086f, 2.293f)
                lineTo(13.707f, 3.914f)
                curveTo(13.893f, 4.1f, 14f, 4.358f, 14f, 4.621f)
                verticalLineTo(7.04f)
                curveTo(14.143f, 7.015f, 14.289f, 6.997f, 14.437f, 6.997f)
                curveTo(14.629f, 6.997f, 14.817f, 7.023f, 15f, 7.064f)
                verticalLineTo(4.62f)
                curveTo(15f, 4.094f, 14.787f, 3.578f, 14.414f, 3.206f)
                lineTo(12.793f, 1.585f)
                curveTo(12.421f, 1.212f, 11.905f, 0.999001f, 11.379f, 0.999001f)
                horizontalLineTo(3f)
                curveTo(1.897f, 1f, 1f, 1.897f, 1f, 3f)
                verticalLineTo(13f)
                curveTo(1f, 14.103f, 1.897f, 15f, 3f, 15f)
                horizontalLineTo(7.045f)
                lineTo(7.293f, 14f)
                horizontalLineTo(5f)
                verticalLineTo(9.5f)
                close()
                moveTo(6f, 2f)
                horizontalLineTo(9f)
                verticalLineTo(3.5f)
                curveTo(9f, 3.776f, 8.776f, 4f, 8.5f, 4f)
                horizontalLineTo(6.5f)
                curveTo(6.224f, 4f, 6f, 3.776f, 6f, 3.5f)
                verticalLineTo(2f)
                close()
                moveTo(16f, 9.559f)
                curveTo(16f, 9.764f, 15.96f, 9.967f, 15.882f, 10.157f)
                curveTo(15.803f, 10.346f, 15.688f, 10.519f, 15.543f, 10.664f)
                lineTo(11.254f, 14.951f)
                curveTo(10.898f, 15.307f, 10.452f, 15.56f, 9.964f, 15.682f)
                lineTo(8.753f, 15.982f)
                curveTo(8.651f, 16.008f, 8.544f, 16.006f, 8.443f, 15.978f)
                curveTo(8.342f, 15.95f, 8.249f, 15.896f, 8.175f, 15.822f)
                curveTo(8.101f, 15.748f, 8.047f, 15.655f, 8.019f, 15.554f)
                curveTo(7.991f, 15.453f, 7.99f, 15.346f, 8.015f, 15.244f)
                lineTo(8.315f, 14.033f)
                curveTo(8.437f, 13.544f, 8.689f, 13.098f, 9.045f, 12.742f)
                lineTo(13.333f, 8.455f)
                curveTo(13.626f, 8.162f, 14.023f, 7.998f, 14.437f, 7.998f)
                curveTo(14.851f, 7.998f, 15.248f, 8.163f, 15.541f, 8.455f)
                curveTo(15.687f, 8.599f, 15.802f, 8.772f, 15.881f, 8.961f)
                curveTo(15.96f, 9.151f, 16f, 9.354f, 16f, 9.559f)
                close()
            }
        }.build()
        
        return _SaveAs!!
    }

private var _SaveAs: ImageVector? = null

