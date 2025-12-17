package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Carrot: ImageVector
    get() {
        if (_Carrot != null) return _Carrot!!
        
        _Carrot = ImageVector.Builder(
            name = "carrot",
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
                moveTo(3f, 21f)
                reflectiveCurveToRelative(9.834f, -3.489f, 12.684f, -6.34f)
                arcToRelative(4.487f, 4.487f, 0f, false, false, 0f, -6.344f)
                arcToRelative(4.483f, 4.483f, 0f, false, false, -6.342f, 0f)
                curveToRelative(-2.86f, 2.861f, -6.347f, 12.689f, -6.347f, 12.689f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 13f)
                lineToRelative(-1.5f, -1.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 14f)
                lineToRelative(-2f, -2f)
            }
            path(
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
        }.build()
        
        return _Carrot!!
    }

private var _Carrot: ImageVector? = null

