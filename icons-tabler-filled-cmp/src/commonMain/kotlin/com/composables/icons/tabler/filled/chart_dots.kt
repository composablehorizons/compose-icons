package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ChartDots: ImageVector
    get() {
        if (_ChartDots != null) return _ChartDots!!
        
        _ChartDots = ImageVector.Builder(
            name = "chart-dots",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 4f)
                arcToRelative(3f, 3f, 0f, true, true, -0.651f, 5.93f)
                lineToRelative(-2.002f, 3.202f)
                arcToRelative(3f, 3f, 0f, true, true, -4.927f, 0.337f)
                lineToRelative(-1.378f, -1.655f)
                arcToRelative(3f, 3f, 0f, true, true, 1.538f, -1.282f)
                lineToRelative(1.378f, 1.654f)
                arcToRelative(2.994f, 2.994f, 0f, false, true, 1.693f, -0.115f)
                lineToRelative(2.002f, -3.203f)
                arcToRelative(3f, 3f, 0f, false, true, 2.347f, -4.868f)
                close()
            }
        }.build()
        
        return _ChartDots!!
    }

private var _ChartDots: ImageVector? = null

