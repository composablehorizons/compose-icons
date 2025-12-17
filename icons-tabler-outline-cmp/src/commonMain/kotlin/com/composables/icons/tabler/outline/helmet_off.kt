package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.HelmetOff: ImageVector
    get() {
        if (_HelmetOff != null) return _HelmetOff!!
        
        _HelmetOff = ImageVector.Builder(
            name = "helmet-off",
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
                moveTo(8.633f, 4.654f)
                arcToRelative(9f, 9f, 0f, false, true, 11.718f, 11.7f)
                moveToRelative(-1.503f, 2.486f)
                arcToRelative(9.008f, 9.008f, 0f, false, true, -1.192f, 1.16f)
                horizontalLineToRelative(-11.312f)
                arcToRelative(9f, 9f, 0f, false, true, -0.185f, -13.847f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 9f)
                horizontalLineToRelative(-7f)
                moveToRelative(-2.768f, 1.246f)
                curveToRelative(0.507f, 2f, 1.596f, 3.418f, 3.268f, 4.254f)
                curveToRelative(0.524f, 0.262f, 1.07f, 0.49f, 1.64f, 0.683f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _HelmetOff!!
    }

private var _HelmetOff: ImageVector? = null

