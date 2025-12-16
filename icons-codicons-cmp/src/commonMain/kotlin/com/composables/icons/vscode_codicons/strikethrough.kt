package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Strikethrough: ImageVector
    get() {
        if (_Strikethrough != null) return _Strikethrough!!
        
        _Strikethrough = ImageVector.Builder(
            name = "strikethrough",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 5.1f)
                curveTo(5f, 4.5456f, 5.29153f, 4.03507f, 5.83988f, 3.6449f)
                curveTo(6.39218f, 3.25191f, 7.18666f, 3f, 8.1f, 3f)
                curveTo(9.39792f, 3f, 10.4839f, 3.56064f, 10.8629f, 4.24282f)
                curveTo(10.997f, 4.48421f, 11.3014f, 4.57119f, 11.5428f, 4.43708f)
                curveTo(11.7842f, 4.30297f, 11.8712f, 3.99857f, 11.7371f, 3.75718f)
                curveTo(11.1161f, 2.63936f, 9.60209f, 2f, 8.1f, 2f)
                curveTo(7.01334f, 2f, 6.00782f, 2.29809f, 5.26012f, 2.8301f)
                curveTo(4.50847f, 3.36493f, 4f, 4.1544f, 4f, 5.1f)
                curveTo(4f, 5.8196f, 4.30015f, 6.47451f, 4.78915f, 7f)
                horizontalLineTo(6.51156f)
                curveTo(5.55248f, 6.59331f, 5f, 5.83014f, 5f, 5.1f)
                close()
                moveTo(13.5f, 8f)
                curveTo(13.7761f, 8f, 14f, 8.22386f, 14f, 8.5f)
                curveTo(14f, 8.77614f, 13.7761f, 9f, 13.5f, 9f)
                horizontalLineTo(11.1582f)
                curveTo(11.6751f, 9.50409f, 12f, 10.1489f, 12f, 10.9f)
                curveTo(12f, 11.8018f, 11.4854f, 12.5876f, 10.745f, 13.1287f)
                curveTo(10.0019f, 13.6717f, 8.99641f, 14f, 7.9f, 14f)
                curveTo(6.27633f, 14f, 4.89849f, 13.3491f, 4.18397f, 12.2774f)
                curveTo(4.0308f, 12.0476f, 4.09289f, 11.7372f, 4.32265f, 11.584f)
                curveTo(4.55241f, 11.4308f, 4.86285f, 11.4929f, 5.01603f, 11.7226f)
                curveTo(5.50151f, 12.4509f, 6.52367f, 13f, 7.9f, 13f)
                curveTo(8.80359f, 13f, 9.5981f, 12.7283f, 10.155f, 12.3213f)
                curveTo(10.7146f, 11.9124f, 11f, 11.3982f, 11f, 10.9f)
                curveTo(11f, 10.1248f, 10.3695f, 9.37447f, 9.22269f, 9f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 9f, 2f, 8.77614f, 2f, 8.5f)
                curveTo(2f, 8.22386f, 2.22386f, 8f, 2.5f, 8f)
                horizontalLineTo(13.5f)
                close()
            }
        }.build()
        
        return _Strikethrough!!
    }

private var _Strikethrough: ImageVector? = null

