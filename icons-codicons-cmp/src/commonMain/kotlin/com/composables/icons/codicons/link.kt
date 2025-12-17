package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Link: ImageVector
    get() {
        if (_Link != null) return _Link!!
        
        _Link = ImageVector.Builder(
            name = "link",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.49999f, 4f)
                horizontalLineTo(10.5f)
                curveTo(12.433f, 4f, 14f, 5.567f, 14f, 7.5f)
                curveTo(14f, 9.36856f, 12.5357f, 10.8951f, 10.6941f, 10.9948f)
                lineTo(10.5023f, 11f)
                lineTo(9.5023f, 11.0046f)
                curveTo(9.22616f, 11.0059f, 9.00127f, 10.783f, 8.99999f, 10.5069f)
                curveTo(8.99888f, 10.2614f, 9.17481f, 10.0565f, 9.40787f, 10.0131f)
                lineTo(9.4977f, 10.0046f)
                lineTo(10.5f, 10f)
                curveTo(11.8807f, 10f, 13f, 8.88071f, 13f, 7.5f)
                curveTo(13f, 6.17452f, 11.9685f, 5.08996f, 10.6644f, 5.00532f)
                lineTo(10.5f, 5f)
                horizontalLineTo(9.49999f)
                curveTo(9.22386f, 5f, 8.99999f, 4.77614f, 8.99999f, 4.5f)
                curveTo(8.99999f, 4.25454f, 9.17687f, 4.05039f, 9.41012f, 4.00806f)
                lineTo(9.49999f, 4f)
                horizontalLineTo(10.5f)
                horizontalLineTo(9.49999f)
                close()
                moveTo(5.5f, 4f)
                horizontalLineTo(6.5f)
                curveTo(6.77614f, 4f, 7f, 4.22386f, 7f, 4.5f)
                curveTo(7f, 4.74546f, 6.82312f, 4.94961f, 6.58988f, 4.99194f)
                lineTo(6.5f, 5f)
                horizontalLineTo(5.5f)
                curveTo(4.11929f, 5f, 3f, 6.11929f, 3f, 7.5f)
                curveTo(3f, 8.82548f, 4.03154f, 9.91004f, 5.33562f, 9.99468f)
                lineTo(5.5f, 10f)
                horizontalLineTo(6.5f)
                curveTo(6.77614f, 10f, 7f, 10.2239f, 7f, 10.5f)
                curveTo(7f, 10.7455f, 6.82312f, 10.9496f, 6.58988f, 10.9919f)
                lineTo(6.5f, 11f)
                horizontalLineTo(5.5f)
                curveTo(3.567f, 11f, 2f, 9.433f, 2f, 7.5f)
                curveTo(2f, 5.63144f, 3.46428f, 4.10487f, 5.30796f, 4.00518f)
                lineTo(5.5f, 4f)
                horizontalLineTo(6.5f)
                horizontalLineTo(5.5f)
                close()
                moveTo(5.50023f, 7f)
                lineTo(10.5002f, 7.0023f)
                curveTo(10.7764f, 7.00242f, 11.0001f, 7.22638f, 11f, 7.50252f)
                curveTo(10.9999f, 7.74798f, 10.8229f, 7.95205f, 10.5897f, 7.99428f)
                lineTo(10.4998f, 8.0023f)
                lineTo(5.49977f, 8f)
                curveTo(5.22363f, 7.99987f, 4.99987f, 7.77591f, 5f, 7.49977f)
                curveTo(5.00011f, 7.25431f, 5.17708f, 7.05024f, 5.41035f, 7.00801f)
                lineTo(5.50023f, 7f)
                close()
            }
        }.build()
        
        return _Link!!
    }

private var _Link: ImageVector? = null

