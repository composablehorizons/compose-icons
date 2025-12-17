package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ScaleOutlineOff: ImageVector
    get() {
        if (_ScaleOutlineOff != null) return _ScaleOutlineOff!!
        
        _ScaleOutlineOff = ImageVector.Builder(
            name = "scale-outline-off",
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
                moveTo(7f, 3f)
                horizontalLineToRelative(10f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, 4f)
                verticalLineToRelative(10f)
                moveToRelative(-1.173f, 2.83f)
                arcToRelative(3.987f, 3.987f, 0f, false, true, -2.827f, 1.17f)
                horizontalLineToRelative(-10f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, -4f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -1.104f, 0.447f, -2.103f, 1.17f, -2.827f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.062f, 7.062f)
                curveToRelative(0.31f, -0.041f, 0.622f, -0.062f, 0.938f, -0.062f)
                curveToRelative(1.956f, 0f, 3.724f, 0.802f, 5f, 2.095f)
                arcToRelative(142.85f, 142.85f, 0f, false, false, -2f, 1.905f)
                moveToRelative(-3.723f, 0.288f)
                arcToRelative(3f, 3f, 0f, false, false, -1.315f, 0.71f)
                lineToRelative(-2.956f, -2.903f)
                arcToRelative(6.977f, 6.977f, 0f, false, true, 1.142f, -0.942f)
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
        
        return _ScaleOutlineOff!!
    }

private var _ScaleOutlineOff: ImageVector? = null

