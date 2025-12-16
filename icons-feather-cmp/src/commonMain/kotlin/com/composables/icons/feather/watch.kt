package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Watch: ImageVector
    get() {
        if (_Watch != null) return _Watch!!
        
        _Watch = ImageVector.Builder(
            name = "watch",
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
                moveTo(19f, 12f)
                arcTo(7f, 7f, 0f, false, true, 12f, 19f)
                arcTo(7f, 7f, 0f, false, true, 5f, 12f)
                arcTo(7f, 7f, 0f, false, true, 19f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 9f)
                lineTo(12f, 12f)
                lineTo(13.5f, 13.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.51f, 17.35f)
                lineToRelative(-0.35f, 3.83f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 1.82f)
                horizontalLineTo(9.83f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -1.82f)
                lineToRelative(-0.35f, -3.83f)
                moveToRelative(0.01f, -10.7f)
                lineToRelative(0.35f, -3.83f)
                arcTo(2f, 2f, 0f, false, true, 9.83f, 1f)
                horizontalLineToRelative(4.35f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 1.82f)
                lineToRelative(0.35f, 3.83f)
            }
        }.build()
        
        return _Watch!!
    }

private var _Watch: ImageVector? = null

