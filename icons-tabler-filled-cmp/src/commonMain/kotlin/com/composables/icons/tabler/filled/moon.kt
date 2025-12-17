package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Moon: ImageVector
    get() {
        if (_Moon != null) return _Moon!!
        
        _Moon = ImageVector.Builder(
            name = "moon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 1.992f)
                arcToRelative(10f, 10f, 0f, true, false, 9.236f, 13.838f)
                curveToRelative(0.341f, -0.82f, -0.476f, -1.644f, -1.298f, -1.31f)
                arcToRelative(6.5f, 6.5f, 0f, false, true, -6.864f, -10.787f)
                lineToRelative(0.077f, -0.08f)
                curveToRelative(0.551f, -0.63f, 0.113f, -1.653f, -0.758f, -1.653f)
                horizontalLineToRelative(-0.266f)
                lineToRelative(-0.068f, -0.006f)
                lineToRelative(-0.06f, -0.002f)
                close()
            }
        }.build()
        
        return _Moon!!
    }

private var _Moon: ImageVector? = null

