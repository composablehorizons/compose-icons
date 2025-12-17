package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.EmpathizeOff: ImageVector
    get() {
        if (_EmpathizeOff != null) return _EmpathizeOff!!
        
        _EmpathizeOff = ImageVector.Builder(
            name = "empathize-off",
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
                moveTo(12f, 8f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, -2.5f, -2.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.317f, 12.315f)
                lineToRelative(-0.317f, 0.317f)
                lineToRelative(-0.728f, -0.727f)
                arcToRelative(3.088f, 3.088f, 0f, true, false, -4.367f, 4.367f)
                lineToRelative(5.095f, 5.096f)
                lineToRelative(4.689f, -4.69f)
                moveToRelative(1.324f, -2.673f)
                arcToRelative(3.087f, 3.087f, 0f, false, false, -3.021f, -3.018f)
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
        
        return _EmpathizeOff!!
    }

private var _EmpathizeOff: ImageVector? = null

