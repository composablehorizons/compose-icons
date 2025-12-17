package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.GoToFile: ImageVector
    get() {
        if (_GoToFile != null) return _GoToFile!!
        
        _GoToFile = ImageVector.Builder(
            name = "go-to-file",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.58594f, 1.00098f)
                curveTo(8.98394f, 1.00098f, 9.36646f, 1.15943f, 9.64746f, 1.44043f)
                lineTo(12.5605f, 4.35352f)
                curveTo(12.8415f, 4.63552f, 13.001f, 5.01704f, 13.001f, 5.41504f)
                verticalLineTo(13.001f)
                curveTo(13.001f, 14.106f, 12.106f, 15.001f, 11.001f, 15.001f)
                horizontalLineTo(5.00098f)
                curveTo(3.89599f, 15.001f, 3.00098f, 14.106f, 3.00098f, 13.001f)
                verticalLineTo(6.00098f)
                horizontalLineTo(4.00098f)
                verticalLineTo(13.001f)
                curveTo(4.00098f, 13.553f, 4.44899f, 14.001f, 5.00098f, 14.001f)
                horizontalLineTo(11.001f)
                curveTo(11.553f, 14.001f, 12.001f, 13.553f, 12.001f, 13.001f)
                verticalLineTo(6.00098f)
                horizontalLineTo(9.50098f)
                curveTo(8.67299f, 6.00096f, 8.00098f, 5.32897f, 8.00098f, 4.50098f)
                verticalLineTo(2.00098f)
                curveTo(7.99198f, 1.97699f, 7.98265f, 1.9527f, 7.97266f, 1.92871f)
                curveTo(7.89674f, 1.74704f, 7.78717f, 1.5812f, 7.64746f, 1.44238f)
                lineTo(7.20605f, 1.00098f)
                horizontalLineTo(8.58594f)
                close()
                moveTo(9f, 4.5f)
                curveTo(9f, 4.776f, 9.224f, 5f, 9.5f, 5f)
                horizontalLineTo(11.793f)
                lineTo(9f, 2.20703f)
                verticalLineTo(4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 0f)
                curveTo(4.63299f, 0f, 4.75952f, 0.0534683f, 4.85352f, 0.147461f)
                lineTo(6.85352f, 2.14746f)
                curveTo(6.90042f, 2.19336f, 6.93789f, 2.24775f, 6.96289f, 2.30859f)
                curveTo(6.98789f, 2.36959f, 7.00097f, 2.43498f, 7.00098f, 2.50098f)
                curveTo(7.00098f, 2.56698f, 6.98789f, 2.63236f, 6.96289f, 2.69336f)
                curveTo(6.93789f, 2.75323f, 6.90043f, 2.80956f, 6.85352f, 2.85547f)
                lineTo(4.85352f, 4.85547f)
                curveTo(4.75956f, 4.94917f, 4.63278f, 5.00195f, 4.5f, 5.00195f)
                curveTo(4.36722f, 5.00195f, 4.24044f, 4.94917f, 4.14648f, 4.85547f)
                curveTo(4.05248f, 4.76147f, 3.99902f, 4.63398f, 3.99902f, 4.50098f)
                curveTo(3.99903f, 4.36799f, 4.05249f, 4.24146f, 4.14648f, 4.14746f)
                lineTo(5.29297f, 3.00098f)
                horizontalLineTo(2.5f)
                curveTo(2.10201f, 3.00098f, 1.72045f, 3.15944f, 1.43945f, 3.44043f)
                curveTo(1.15846f, 3.72242f, 1.00001f, 4.10298f, 1f, 4.50098f)
                verticalLineTo(5.50098f)
                curveTo(1f, 5.63398f, 0.947516f, 5.76147f, 0.853516f, 5.85547f)
                curveTo(0.759563f, 5.94817f, 0.632774f, 6.00098f, 0.5f, 6.00098f)
                curveTo(0.367225f, 6.00098f, 0.240437f, 5.94917f, 0.146484f, 5.85547f)
                curveTo(0.0534844f, 5.76147f, 0f, 5.63398f, 0f, 5.50098f)
                verticalLineTo(4.50098f)
                curveTo(6.17892E-6f, 3.83799f, 0.263427f, 3.20239f, 0.732422f, 2.7334f)
                curveTo(1.20142f, 2.26441f, 1.83701f, 2.00098f, 2.5f, 2.00098f)
                horizontalLineTo(5.29297f)
                lineTo(4.14648f, 0.855469f)
                curveTo(4.05248f, 0.761469f, 3.99902f, 0.633977f, 3.99902f, 0.500977f)
                curveTo(3.99903f, 0.367985f, 4.05249f, 0.241455f, 4.14648f, 0.147461f)
                curveTo(4.24048f, 0.0534683f, 4.36701f, 0f, 4.5f, 0f)
                close()
            }
        }.build()
        
        return _GoToFile!!
    }

private var _GoToFile: ImageVector? = null

