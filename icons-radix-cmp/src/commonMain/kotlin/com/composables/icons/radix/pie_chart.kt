package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.PieChart: ImageVector
    get() {
        if (_PieChart != null) return _PieChart!!
        
        _PieChart = ImageVector.Builder(
            name = "pie-chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5004f, 0.850006f)
                curveTo(11.1729f, 0.850217f, 14.1498f, 3.82765f, 14.1498f, 7.5004f)
                curveTo(14.1498f, 11.1732f, 11.1729f, 14.1506f, 7.5004f, 14.1508f)
                curveTo(3.82767f, 14.1508f, 0.850006f, 11.1733f, 0.850006f, 7.5004f)
                curveTo(0.850024f, 3.82752f, 3.82768f, 0.850006f, 7.5004f, 0.850006f)
                close()
                moveTo(7.5004f, 1.85001f)
                curveTo(4.38003f, 1.85001f, 1.85002f, 4.37974f, 1.85001f, 7.5004f)
                curveTo(1.85001f, 10.6211f, 4.38002f, 13.1508f, 7.5004f, 13.1508f)
                curveTo(10.6206f, 13.1506f, 13.1498f, 10.6209f, 13.1498f, 7.5004f)
                curveTo(13.1498f, 4.37987f, 10.6206f, 1.85022f, 7.5004f, 1.85001f)
                close()
                moveTo(7.5004f, 3.10001f)
                curveTo(9.93026f, 3.10022f, 11.9008f, 5.07026f, 11.9008f, 7.5004f)
                curveTo(11.9008f, 7.66946f, 11.89f, 7.83629f, 11.8715f, 8.0004f)
                horizontalLineTo(7.0004f)
                verticalLineTo(3.12833f)
                curveTo(7.16438f, 3.10979f, 7.33146f, 3.10001f, 7.5004f, 3.10001f)
                close()
            }
        }.build()
        
        return _PieChart!!
    }

private var _PieChart: ImageVector? = null

