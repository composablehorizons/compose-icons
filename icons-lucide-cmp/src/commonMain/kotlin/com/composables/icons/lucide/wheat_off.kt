package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.WheatOff: ImageVector
    get() {
        if (_WheatOff != null) return _WheatOff!!
        
        _WheatOff = ImageVector.Builder(
            name = "wheat-off",
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
                moveTo(2f, 22f)
                lineToRelative(10f, -10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 8f)
                lineToRelative(-1.17f, 1.17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.47f, 12.53f)
                lineTo(5f, 11f)
                lineToRelative(1.53f, 1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, 4.94f)
                lineTo(5f, 19f)
                lineToRelative(-1.53f, -1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, -4.94f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 8f)
                lineToRelative(-0.53f, 0.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 0f, 4.94f)
                lineTo(9f, 15f)
                lineToRelative(1.53f, -1.53f)
                curveToRelative(0.55f, -0.55f, 0.88f, -1.25f, 0.98f, -1.97f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.91f, 5.26f)
                curveToRelative(0.15f, -0.26f, 0.34f, -0.51f, 0.56f, -0.73f)
                lineTo(13f, 3f)
                lineToRelative(1.53f, 1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0.28f, 4.62f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
                horizontalLineToRelative(-2f)
                verticalLineTo(6f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.47f, 17.47f)
                lineTo(13f, 19f)
                lineToRelative(-1.53f, 1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -4.94f, 0f)
                lineTo(5f, 19f)
                lineToRelative(1.53f, -1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 4.94f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 16f)
                lineToRelative(-0.53f, 0.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -4.94f, 0f)
                lineTo(9f, 15f)
                lineToRelative(1.53f, -1.53f)
                arcToRelative(3.49f, 3.49f, 0f, false, true, 1.97f, -0.98f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.74f, 13.09f)
                curveToRelative(0.26f, -0.15f, 0.51f, -0.34f, 0.73f, -0.56f)
                lineTo(21f, 11f)
                lineToRelative(-1.53f, -1.53f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -4.62f, -0.28f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 2f)
                lineTo(22f, 22f)
            }
        }.build()
        
        return _WheatOff!!
    }

private var _WheatOff: ImageVector? = null

