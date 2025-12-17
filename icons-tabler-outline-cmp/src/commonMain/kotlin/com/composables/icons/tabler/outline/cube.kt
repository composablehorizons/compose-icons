package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Cube: ImageVector
    get() {
        if (_Cube != null) return _Cube!!
        
        _Cube = ImageVector.Builder(
            name = "cube",
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
                moveTo(21f, 16.008f)
                verticalLineToRelative(-8.018f)
                arcToRelative(1.98f, 1.98f, 0f, false, false, -1f, -1.717f)
                lineToRelative(-7f, -4.008f)
                arcToRelative(2.016f, 2.016f, 0f, false, false, -2f, 0f)
                lineToRelative(-7f, 4.008f)
                curveToRelative(-0.619f, 0.355f, -1f, 1.01f, -1f, 1.718f)
                verticalLineToRelative(8.018f)
                curveToRelative(0f, 0.709f, 0.381f, 1.363f, 1f, 1.717f)
                lineToRelative(7f, 4.008f)
                arcToRelative(2.016f, 2.016f, 0f, false, false, 2f, 0f)
                lineToRelative(7f, -4.008f)
                curveToRelative(0.619f, -0.355f, 1f, -1.01f, 1f, -1.718f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                verticalLineToRelative(-10f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                lineToRelative(8.73f, -5.04f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.27f, 6.96f)
                lineToRelative(8.73f, 5.04f)
            }
        }.build()
        
        return _Cube!!
    }

private var _Cube: ImageVector? = null

