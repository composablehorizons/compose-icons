package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Wheat: ImageVector
    get() {
        if (_Wheat != null) return _Wheat!!
        
        _Wheat = ImageVector.Builder(
            name = "wheat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.014f, 21.514f)
                verticalLineToRelative(-3.75f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.93f, 9.504f)
                lineToRelative(-0.43f, 1.604f)
                curveToRelative(-0.712f, 2.659f, 0.866f, 5.391f, 3.524f, 6.105f)
                curveToRelative(0.997f, 0.268f, 1.993f, 0.535f, 2.99f, 0.801f)
                verticalLineToRelative(-3.44f)
                curveToRelative(-0.164f, -2.105f, -1.637f, -3.879f, -3.676f, -4.426f)
                lineToRelative(-2.408f, -0.644f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.744f, 11.164f)
                curveToRelative(0.454f, -0.454f, 0.815f, -0.994f, 1.061f, -1.587f)
                curveToRelative(0.246f, -0.594f, 0.372f, -1.23f, 0.372f, -1.873f)
                curveToRelative(0f, -0.643f, -0.126f, -1.279f, -0.372f, -1.872f)
                curveToRelative(-0.246f, -0.594f, -0.606f, -1.133f, -1.061f, -1.588f)
                lineToRelative(-1.73f, -1.73f)
                lineToRelative(-1.73f, 1.73f)
                curveToRelative(-0.454f, 0.454f, -0.815f, 0.994f, -1.06f, 1.588f)
                curveToRelative(-0.246f, 0.594f, -0.372f, 1.23f, -0.373f, 1.872f)
                curveToRelative(0f, 0.643f, 0.127f, 1.279f, 0.373f, 1.873f)
                curveToRelative(0.246f, 0.594f, 0.606f, 1.133f, 1.06f, 1.587f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.099f, 9.504f)
                lineToRelative(0.43f, 1.604f)
                curveToRelative(0.712f, 2.659f, -0.866f, 5.391f, -3.525f, 6.105f)
                curveToRelative(-0.997f, 0.268f, -1.994f, 0.535f, -2.99f, 0.801f)
                verticalLineToRelative(-3.44f)
                curveToRelative(0.164f, -2.105f, 1.637f, -3.879f, 3.677f, -4.426f)
                lineToRelative(2.408f, -0.644f)
                close()
            }
        }.build()
        
        return _Wheat!!
    }

private var _Wheat: ImageVector? = null

