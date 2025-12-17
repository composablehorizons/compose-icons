package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.GithubAction: ImageVector
    get() {
        if (_GithubAction != null) return _GithubAction!!
        
        _GithubAction = ImageVector.Builder(
            name = "github-action",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.085f, 11f)
                lineTo(8.068f, 11.055f)
                curveTo(7.972f, 11.366f, 7.989f, 11.696f, 8.096f, 12f)
                horizontalLineTo(4f)
                curveTo(2.897f, 12f, 2f, 11.103f, 2f, 10f)
                verticalLineTo(5f)
                curveTo(2f, 3.897f, 2.897f, 3f, 4f, 3f)
                horizontalLineTo(12f)
                curveTo(13.103f, 3f, 14f, 3.897f, 14f, 5f)
                verticalLineTo(6.015f)
                curveTo(13.9819f, 6.01371f, 13.9642f, 6.01075f, 13.9465f, 6.00779f)
                curveTo(13.9232f, 6.00389f, 13.8999f, 6f, 13.876f, 6f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                curveTo(13f, 4.449f, 12.552f, 4f, 12f, 4f)
                horizontalLineTo(4f)
                curveTo(3.448f, 4f, 3f, 4.449f, 3f, 5f)
                verticalLineTo(10f)
                curveTo(3f, 10.551f, 3.448f, 11f, 4f, 11f)
                horizontalLineTo(8.085f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 8f)
                curveTo(4.224f, 8f, 4f, 7.776f, 4f, 7.5f)
                curveTo(4f, 7.224f, 4.224f, 7f, 4.5f, 7f)
                horizontalLineTo(9.345f)
                curveTo(9.342f, 7.0095f, 9.337f, 7.01799f, 9.332f, 7.02649f)
                curveTo(9.32701f, 7.03499f, 9.322f, 7.0435f, 9.319f, 7.053f)
                lineTo(9.023f, 8f)
                horizontalLineTo(4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 9.5f)
                curveTo(4f, 9.776f, 4.224f, 10f, 4.5f, 10f)
                horizontalLineTo(8.398f)
                lineTo(8.711f, 9f)
                horizontalLineTo(4.501f)
                curveTo(4.225f, 9f, 4f, 9.224f, 4f, 9.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.876f, 9.999f)
                curveTo(15.068f, 9.999f, 15.243f, 10.109f, 15.326f, 10.282f)
                curveTo(15.41f, 10.455f, 15.387f, 10.661f, 15.266f, 10.811f)
                lineTo(11.412f, 15.629f)
                curveTo(11.224f, 15.863f, 10.944f, 15.999f, 10.642f, 16f)
                curveTo(10.33f, 16f, 10.044f, 15.858f, 9.85698f, 15.61f)
                curveTo(9.66898f, 15.362f, 9.60898f, 15.048f, 9.69298f, 14.748f)
                lineTo(10.465f, 12f)
                horizontalLineTo(9.49998f)
                curveTo(9.34098f, 12f, 9.19098f, 11.924f, 9.09698f, 11.796f)
                curveTo(9.00298f, 11.668f, 8.97598f, 11.502f, 9.02298f, 11.351f)
                lineTo(10.273f, 7.351f)
                curveTo(10.338f, 7.142f, 10.532f, 7f, 10.751f, 7f)
                horizontalLineTo(13.876f)
                curveTo(14.04f, 7f, 14.193f, 7.081f, 14.287f, 7.215f)
                curveTo(14.38f, 7.35f, 14.401f, 7.522f, 14.344f, 7.675f)
                lineTo(13.473f, 9.999f)
                horizontalLineTo(14.876f)
                close()
            }
        }.build()
        
        return _GithubAction!!
    }

private var _GithubAction: ImageVector? = null

