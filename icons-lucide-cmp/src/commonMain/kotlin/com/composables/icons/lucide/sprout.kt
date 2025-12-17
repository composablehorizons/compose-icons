package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Sprout: ImageVector
    get() {
        if (_Sprout != null) return _Sprout!!
        
        _Sprout = ImageVector.Builder(
            name = "sprout",
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
                moveTo(14f, 9.536f)
                verticalLineTo(7f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(5f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, 4f)
                curveToRelative(0f, 2f, 1f, 3f, 1f, 5f)
                arcToRelative(5f, 5f, 0f, false, true, -1f, 3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 9f)
                arcToRelative(5f, 5f, 0f, false, true, 8f, 4f)
                arcToRelative(5f, 5f, 0f, false, true, -8f, -4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 21f)
                horizontalLineToRelative(14f)
            }
        }.build()
        
        return _Sprout!!
    }

private var _Sprout: ImageVector? = null

