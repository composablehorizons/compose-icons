package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ChartDots3: ImageVector
    get() {
        if (_ChartDots3 != null) return _ChartDots3!!
        
        _ChartDots3 = ImageVector.Builder(
            name = "chart-dots-3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 2f)
                arcToRelative(4f, 4f, 0f, true, true, -3.843f, 5.114f)
                lineToRelative(-6.295f, 0.786f)
                arcToRelative(3f, 3f, 0f, false, true, -0.094f, 0.257f)
                lineToRelative(6.446f, 4.431f)
                arcToRelative(3f, 3f, 0f, true, true, -0.695f, 4.099f)
                lineToRelative(-3.527f, 1.058f)
                quadToRelative(0.008f, 0.127f, 0.008f, 0.255f)
                arcToRelative(4f, 4f, 0f, true, true, -8f, 0f)
                lineToRelative(0.005f, -0.2f)
                arcToRelative(4f, 4f, 0f, false, true, 7.366f, -1.954f)
                lineToRelative(3.64f, -1.094f)
                lineToRelative(0.01f, -0.102f)
                quadToRelative(0.023f, -0.204f, 0.074f, -0.4f)
                lineToRelative(-6.688f, -4.6f)
                arcToRelative(3f, 3f, 0f, false, true, -4.407f, -2.65f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3f, 3f, 0f, false, true, 5.784f, -0.931f)
                lineToRelative(6.312f, -0.79f)
                arcToRelative(4f, 4f, 0f, false, true, 3.899f, -3.103f)
            }
        }.build()
        
        return _ChartDots3!!
    }

private var _ChartDots3: ImageVector? = null

