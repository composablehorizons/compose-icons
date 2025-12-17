package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.FlowerOff: ImageVector
    get() {
        if (_FlowerOff != null) return _FlowerOff!!
        
        _FlowerOff = ImageVector.Builder(
            name = "flower-off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.875f, 9.882f)
                arcToRelative(3f, 3f, 0f, false, false, 4.247f, 4.238f)
                moveToRelative(0.581f, -3.423f)
                arcToRelative(3.012f, 3.012f, 0f, false, false, -1.418f, -1.409f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 5f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                curveToRelative(0f, 0.562f, -0.259f, 1.442f, -0.776f, 2.64f)
                lineToRelative(-0.724f, 1.36f)
                lineToRelative(1.76f, -1.893f)
                curveToRelative(0.499f, -0.6f, 0.922f, -1f, 1.27f, -1.205f)
                arcToRelative(2.968f, 2.968f, 0f, false, true, 4.07f, 1.099f)
                arcToRelative(3.011f, 3.011f, 0f, false, true, -1.09f, 4.098f)
                curveToRelative(-0.374f, 0.217f, -0.99f, 0.396f, -1.846f, 0.535f)
                lineToRelative(-1.779f, 0.244f)
                moveToRelative(0.292f, 0.282f)
                lineToRelative(1.223f, 0.166f)
                curveToRelative(1f, 0.145f, 1.698f, 0.337f, 2.11f, 0.576f)
                arcToRelative(3.011f, 3.011f, 0f, false, true, 1.226f, 3.832f)
                moveToRelative(-2.277f, 1.733f)
                arcToRelative(2.968f, 2.968f, 0f, false, true, -1.929f, -0.369f)
                curveToRelative(-0.348f, -0.202f, -0.771f, -0.604f, -1.27f, -1.205f)
                lineToRelative(-1.76f, -1.893f)
                lineToRelative(0.724f, 1.36f)
                curveToRelative(0.516f, 1.199f, 0.776f, 2.079f, 0.776f, 2.64f)
                arcToRelative(3f, 3f, 0f, false, true, -6f, 0f)
                curveToRelative(0f, -0.562f, 0.259f, -1.442f, 0.776f, -2.64f)
                lineToRelative(0.724f, -1.36f)
                lineToRelative(-1.76f, 1.893f)
                curveToRelative(-0.499f, 0.601f, -0.922f, 1f, -1.27f, 1.205f)
                arcToRelative(2.968f, 2.968f, 0f, false, true, -4.07f, -1.098f)
                arcToRelative(3.011f, 3.011f, 0f, false, true, 1.09f, -4.098f)
                curveToRelative(0.374f, -0.218f, 0.99f, -0.396f, 1.846f, -0.536f)
                lineToRelative(2.664f, -0.366f)
                lineToRelative(-2.4f, -0.325f)
                curveToRelative(-1f, -0.145f, -1.698f, -0.337f, -2.11f, -0.576f)
                arcToRelative(3.011f, 3.011f, 0f, false, true, -1.09f, -4.099f)
                arcToRelative(2.968f, 2.968f, 0f, false, true, 2.134f, -1.467f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _FlowerOff!!
    }

private var _FlowerOff: ImageVector? = null

