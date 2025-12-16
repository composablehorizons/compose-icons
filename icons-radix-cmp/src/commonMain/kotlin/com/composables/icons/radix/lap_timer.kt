package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.LapTimer: ImageVector
    get() {
        if (_LapTimer != null) return _LapTimer!!
        
        _LapTimer = ImageVector.Builder(
            name = "lap-timer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.00037f, 0f)
                curveTo(9.27633f, 2.10167E-4f, 9.50037f, 0.223987f, 9.50037f, 0.5f)
                curveTo(9.50037f, 0.776013f, 9.27633f, 0.99979f, 9.00037f, 1f)
                horizontalLineTo(8.00037f)
                verticalLineTo(2.12109f)
                curveTo(9.09875f, 2.20608f, 10.1186f, 2.56801f, 10.9916f, 3.1377f)
                curveTo(11.0114f, 3.1099f, 11.033f, 3.08255f, 11.058f, 3.05762f)
                lineTo(12.058f, 2.05762f)
                lineTo(12.1566f, 1.97754f)
                curveTo(12.3992f, 1.81778f, 12.7293f, 1.84422f, 12.9427f, 2.05762f)
                curveTo(13.156f, 2.27105f, 13.1826f, 2.60127f, 13.0228f, 2.84375f)
                lineTo(12.9427f, 2.94238f)
                lineTo(11.9662f, 3.91797f)
                curveTo(13.1585f, 5.08042f, 13.8997f, 6.70335f, 13.8998f, 8.5f)
                curveTo(13.8996f, 12.0343f, 11.0347f, 14.8992f, 7.50037f, 14.8994f)
                curveTo(3.96587f, 14.8994f, 1.10019f, 12.0344f, 1.09998f, 8.5f)
                curveTo(1.10016f, 5.13385f, 3.69958f, 2.37627f, 7.00037f, 2.12109f)
                verticalLineTo(1f)
                horizontalLineTo(6.00037f)
                curveTo(5.72422f, 1f, 5.50037f, 0.776142f, 5.50037f, 0.5f)
                curveTo(5.50037f, 0.223858f, 5.72422f, 0f, 6.00037f, 0f)
                horizontalLineTo(9.00037f)
                close()
                moveTo(7.50037f, 3.09961f)
                curveTo(4.51815f, 3.09961f, 2.10017f, 5.51783f, 2.09998f, 8.5f)
                curveTo(2.10019f, 11.4822f, 4.51816f, 13.8994f, 7.50037f, 13.8994f)
                curveTo(10.4824f, 13.8992f, 12.8996f, 11.482f, 12.8998f, 8.5f)
                curveTo(12.8996f, 5.51796f, 10.4824f, 3.09982f, 7.50037f, 3.09961f)
                close()
                moveTo(7.50037f, 8.5f)
                lineTo(10.6117f, 11.6113f)
                curveTo(9.81554f, 12.4075f, 8.71524f, 12.8993f, 7.50037f, 12.8994f)
                curveTo(5.07044f, 12.8994f, 3.10019f, 10.9299f, 3.09998f, 8.5f)
                curveTo(3.10017f, 6.07012f, 5.07044f, 4.09961f, 7.50037f, 4.09961f)
                verticalLineTo(8.5f)
                close()
            }
        }.build()
        
        return _LapTimer!!
    }

private var _LapTimer: ImageVector? = null

