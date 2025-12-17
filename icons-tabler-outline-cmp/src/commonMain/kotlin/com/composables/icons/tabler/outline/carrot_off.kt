package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CarrotOff: ImageVector
    get() {
        if (_CarrotOff != null) return _CarrotOff!!
        
        _CarrotOff = ImageVector.Builder(
            name = "carrot-off",
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
                moveTo(8.868f, 8.846f)
                curveToRelative(-2.756f, 3.382f, -5.868f, 12.154f, -5.868f, 12.154f)
                reflectiveCurveToRelative(8.75f, -3.104f, 12.134f, -5.85f)
                moveToRelative(1.667f, -2.342f)
                arcToRelative(4.486f, 4.486f, 0f, false, false, -5.589f, -5.615f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 13f)
                lineToRelative(-1.5f, -1.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 8f)
                reflectiveCurveToRelative(-1.14f, -2f, -3f, -2f)
                curveToRelative(-1.406f, 0f, -3f, 2f, -3f, 2f)
                reflectiveCurveToRelative(1.14f, 2f, 3f, 2f)
                reflectiveCurveToRelative(3f, -2f, 3f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 2f)
                reflectiveCurveToRelative(-2f, 1.14f, -2f, 3f)
                reflectiveCurveToRelative(2f, 3f, 2f, 3f)
                reflectiveCurveToRelative(2f, -1.577f, 2f, -3f)
                curveToRelative(0f, -1.86f, -2f, -3f, -2f, -3f)
                close()
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
        
        return _CarrotOff!!
    }

private var _CarrotOff: ImageVector? = null

