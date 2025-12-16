package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Vibrate: ImageVector
    get() {
        if (_Vibrate != null) return _Vibrate!!
        
        _Vibrate = ImageVector.Builder(
            name = "vibrate",
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
                moveTo(2f, 8f)
                lineToRelative(2f, 2f)
                lineToRelative(-2f, 2f)
                lineToRelative(2f, 2f)
                lineToRelative(-2f, 2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 8f)
                lineToRelative(-2f, 2f)
                lineToRelative(2f, 2f)
                lineToRelative(-2f, 2f)
                lineToRelative(2f, 2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 5f)
                horizontalLineTo(15f)
                arcTo(1f, 1f, 0f, false, true, 16f, 6f)
                verticalLineTo(18f)
                arcTo(1f, 1f, 0f, false, true, 15f, 19f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, false, true, 8f, 18f)
                verticalLineTo(6f)
                arcTo(1f, 1f, 0f, false, true, 9f, 5f)
                close()
            }
        }.build()
        
        return _Vibrate!!
    }

private var _Vibrate: ImageVector? = null

