package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.ToyBrick: ImageVector
    get() {
        if (_ToyBrick != null) return _ToyBrick!!
        
        _ToyBrick = ImageVector.Builder(
            name = "toy-brick",
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
                moveTo(4f, 8f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, false, true, 21f, 9f)
                verticalLineTo(19f)
                arcTo(1f, 1f, 0f, false, true, 20f, 20f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, false, true, 3f, 19f)
                verticalLineTo(9f)
                arcTo(1f, 1f, 0f, false, true, 4f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 8f)
                verticalLineTo(5f)
                curveToRelative(0f, -0.6f, -0.4f, -1f, -1f, -1f)
                horizontalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 8f)
                verticalLineTo(5f)
                curveToRelative(0f, -0.6f, -0.4f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(3f)
            }
        }.build()
        
        return _ToyBrick!!
    }

private var _ToyBrick: ImageVector? = null

