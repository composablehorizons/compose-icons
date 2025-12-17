package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.GoToSearch: ImageVector
    get() {
        if (_GoToSearch != null) return _GoToSearch!!
        
        _GoToSearch = ImageVector.Builder(
            name = "go-to-search",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.97754f, 2.26758f)
                curveTo(9.73254f, 2.88158f, 11f, 4.53402f, 11f, 6.49902f)
                curveTo(11f, 7.56199f, 10.6316f, 8.53763f, 10.0156f, 9.30762f)
                lineTo(13.8545f, 13.1465f)
                curveTo(14.0489f, 13.3414f, 14.0498f, 13.6577f, 13.8555f, 13.8525f)
                curveTo(13.6605f, 14.0475f, 13.3434f, 14.0475f, 13.1484f, 13.8525f)
                lineTo(9.30957f, 10.0146f)
                curveTo(8.53958f, 10.6306f, 7.56293f, 10.999f, 6.50098f, 10.999f)
                curveTo(4.016f, 10.999f, 2.00099f, 8.984f, 2.00098f, 6.49902f)
                curveTo(2.00098f, 5.97108f, 2.10159f, 5.46898f, 2.26855f, 4.99902f)
                horizontalLineTo(3.09863f)
                curveTo(3.13463f, 5.09902f, 3.17349f, 5.19806f, 3.22949f, 5.28906f)
                curveTo(3.08949f, 5.66706f, 3.00098f, 6.07202f, 3.00098f, 6.49902f)
                curveTo(3.00099f, 8.432f, 4.568f, 9.99901f, 6.50098f, 9.99902f)
                curveTo(8.43397f, 9.99902f, 10.001f, 8.43202f, 10.001f, 6.49902f)
                curveTo(10.001f, 5.01618f, 9.07524f, 3.7562f, 7.77246f, 3.24609f)
                curveTo(7.8074f, 3.18526f, 7.85968f, 3.13904f, 7.8877f, 3.07227f)
                curveTo(7.9627f, 2.88927f, 8.00098f, 2.696f, 8.00098f, 2.5f)
                curveTo(8.00098f, 2.422f, 7.98954f, 2.34458f, 7.97754f, 2.26758f)
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
        
        return _GoToSearch!!
    }

private var _GoToSearch: ImageVector? = null

