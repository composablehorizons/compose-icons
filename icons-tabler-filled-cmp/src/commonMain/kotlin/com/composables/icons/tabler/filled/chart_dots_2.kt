package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ChartDots2: ImageVector
    get() {
        if (_ChartDots2 != null) return _ChartDots2!!
        
        _ChartDots2 = ImageVector.Builder(
            name = "chart-dots-2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(17f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-18f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-18f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                moveToRelative(18.97f, 0.757f)
                arcToRelative(1f, 1f, 0f, false, true, -0.727f, 1.213f)
                lineToRelative(-5.256f, 1.314f)
                arcToRelative(3f, 3f, 0f, false, true, -0.55f, 1.465f)
                lineToRelative(1.768f, 2.358f)
                arcToRelative(3.003f, 3.003f, 0f, false, true, 3.795f, 2.893f)
                arcToRelative(3f, 3f, 0f, false, true, -5.436f, 1.751f)
                lineToRelative(-3.57f, 1.428f)
                arcToRelative(3f, 3f, 0f, false, true, -5.994f, -0.179f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3f, 3f, 0f, false, true, 5.43f, -1.576f)
                lineToRelative(3.57f, -1.428f)
                lineToRelative(0.015f, -0.17f)
                curveToRelative(0.06f, -0.518f, 0.253f, -0.996f, 0.542f, -1.4f)
                lineToRelative(-1.767f, -2.357f)
                arcToRelative(3.003f, 3.003f, 0f, false, true, -3.795f, -2.893f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3f, 3f, 0f, false, true, 5.497f, -1.48f)
                lineToRelative(5.255f, -1.314f)
                arcToRelative(1f, 1f, 0f, false, true, 1.213f, 0.727f)
            }
        }.build()
        
        return _ChartDots2!!
    }

private var _ChartDots2: ImageVector? = null

