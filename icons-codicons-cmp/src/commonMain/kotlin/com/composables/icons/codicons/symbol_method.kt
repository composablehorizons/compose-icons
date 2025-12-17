package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SymbolMethod: ImageVector
    get() {
        if (_SymbolMethod != null) return _SymbolMethod!!
        
        _SymbolMethod = ImageVector.Builder(
            name = "symbol-method",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.69684f, 5.04043f)
                curveTo(4.44303f, 4.93166f, 4.14909f, 5.04923f, 4.04031f, 5.30305f)
                curveTo(3.93153f, 5.55686f, 4.04911f, 5.8508f, 4.30292f, 5.95958f)
                lineTo(7.49988f, 7.3297f)
                verticalLineTo(10.5f)
                curveTo(7.49988f, 10.7761f, 7.72374f, 11f, 7.99988f, 11f)
                curveTo(8.27603f, 11f, 8.49988f, 10.7761f, 8.49988f, 10.5f)
                verticalLineTo(7.3297f)
                lineTo(11.6968f, 5.95958f)
                curveTo(11.9507f, 5.8508f, 12.0682f, 5.55686f, 11.9595f, 5.30305f)
                curveTo(11.8507f, 5.04923f, 11.5567f, 4.93166f, 11.3029f, 5.04043f)
                lineTo(7.99988f, 6.45602f)
                lineTo(4.69684f, 5.04043f)
                close()
                moveTo(9.07694f, 1.37855f)
                curveTo(8.38373f, 1.11193f, 7.61627f, 1.11193f, 6.92306f, 1.37855f)
                lineTo(1.96153f, 3.28683f)
                curveTo(1.38224f, 3.50964f, 1f, 4.06619f, 1f, 4.68685f)
                verticalLineTo(11.3133f)
                curveTo(1f, 11.9339f, 1.38224f, 12.4905f, 1.96153f, 12.7133f)
                lineTo(6.92306f, 14.6216f)
                curveTo(7.61627f, 14.8882f, 8.38373f, 14.8882f, 9.07694f, 14.6216f)
                lineTo(14.0385f, 12.7133f)
                curveTo(14.6178f, 12.4905f, 15f, 11.9339f, 15f, 11.3133f)
                verticalLineTo(4.68685f)
                curveTo(15f, 4.06619f, 14.6178f, 3.50964f, 14.0385f, 3.28683f)
                lineTo(9.07694f, 1.37855f)
                close()
                moveTo(7.28204f, 2.3119f)
                curveTo(7.74418f, 2.13415f, 8.25582f, 2.13415f, 8.71796f, 2.3119f)
                lineTo(13.6795f, 4.22018f)
                curveTo(13.8726f, 4.29445f, 14f, 4.47997f, 14f, 4.68685f)
                verticalLineTo(11.3133f)
                curveTo(14f, 11.5201f, 13.8726f, 11.7057f, 13.6795f, 11.7799f)
                lineTo(8.71796f, 13.6882f)
                curveTo(8.25582f, 13.866f, 7.74418f, 13.866f, 7.28204f, 13.6882f)
                lineTo(2.32051f, 11.7799f)
                curveTo(2.12741f, 11.7057f, 2f, 11.5201f, 2f, 11.3133f)
                verticalLineTo(4.68685f)
                curveTo(2f, 4.47997f, 2.12741f, 4.29445f, 2.32051f, 4.22018f)
                lineTo(7.28204f, 2.3119f)
                close()
            }
        }.build()
        
        return _SymbolMethod!!
    }

private var _SymbolMethod: ImageVector? = null

