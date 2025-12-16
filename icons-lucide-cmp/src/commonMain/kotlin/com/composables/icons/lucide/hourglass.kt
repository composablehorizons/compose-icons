package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Hourglass: ImageVector
    get() {
        if (_Hourglass != null) return _Hourglass!!
        
        _Hourglass = ImageVector.Builder(
            name = "hourglass",
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
                moveTo(5f, 22f)
                horizontalLineToRelative(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 2f)
                horizontalLineToRelative(14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 22f)
                verticalLineToRelative(-4.172f)
                arcToRelative(2f, 2f, 0f, false, false, -0.586f, -1.414f)
                lineTo(12f, 12f)
                lineToRelative(-4.414f, 4.414f)
                arcTo(2f, 2f, 0f, false, false, 7f, 17.828f)
                verticalLineTo(22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 2f)
                verticalLineToRelative(4.172f)
                arcToRelative(2f, 2f, 0f, false, false, 0.586f, 1.414f)
                lineTo(12f, 12f)
                lineToRelative(4.414f, -4.414f)
                arcTo(2f, 2f, 0f, false, false, 17f, 6.172f)
                verticalLineTo(2f)
            }
        }.build()
        
        return _Hourglass!!
    }

private var _Hourglass: ImageVector? = null

