package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.HandFist: ImageVector
    get() {
        if (_HandFist != null) return _HandFist!!
        
        _HandFist = ImageVector.Builder(
            name = "hand-fist",
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
                moveTo(12.035f, 17.012f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                lineToRelative(-0.311f, -0.002f)
                arcToRelative(0.72f, 0.72f, 0f, false, true, -0.505f, -1.229f)
                lineToRelative(1.195f, -1.195f)
                arcTo(2f, 2f, 0f, false, true, 10.828f, 11f)
                horizontalLineTo(12f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -4f)
                horizontalLineTo(9.243f)
                arcToRelative(3f, 3f, 0f, false, false, -2.122f, 0.879f)
                lineToRelative(-2.707f, 2.707f)
                arcTo(4.83f, 4.83f, 0f, false, false, 3f, 14f)
                arcToRelative(8f, 8f, 0f, false, false, 8f, 8f)
                horizontalLineToRelative(2f)
                arcToRelative(8f, 8f, 0f, false, false, 8f, -8f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, true, false, 4f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.888f, 9.662f)
                arcTo(2f, 2f, 0f, false, false, 17f, 8f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, true, false, 13f, 5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 5f)
                arcTo(2f, 2f, 0f, true, false, 5f, 5f)
                verticalLineTo(10f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 7f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, true, true, 13f, 4f)
                verticalLineTo(7.268f)
            }
        }.build()
        
        return _HandFist!!
    }

private var _HandFist: ImageVector? = null

