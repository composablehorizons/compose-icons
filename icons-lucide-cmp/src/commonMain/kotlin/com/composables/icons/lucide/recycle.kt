package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Recycle: ImageVector
    get() {
        if (_Recycle != null) return _Recycle!!
        
        _Recycle = ImageVector.Builder(
            name = "recycle",
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
                moveTo(7f, 19f)
                horizontalLineTo(4.815f)
                arcToRelative(1.83f, 1.83f, 0f, false, true, -1.57f, -0.881f)
                arcToRelative(1.785f, 1.785f, 0f, false, true, -0.004f, -1.784f)
                lineTo(7.196f, 9.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 19f)
                horizontalLineToRelative(8.203f)
                arcToRelative(1.83f, 1.83f, 0f, false, false, 1.556f, -0.89f)
                arcToRelative(1.784f, 1.784f, 0f, false, false, 0f, -1.775f)
                lineToRelative(-1.226f, -2.12f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 16f)
                lineToRelative(-3f, 3f)
                lineToRelative(3f, 3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.293f, 13.596f)
                lineTo(7.196f, 9.5f)
                lineTo(3.1f, 10.598f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.344f, 5.811f)
                lineToRelative(1.093f, -1.892f)
                arcTo(1.83f, 1.83f, 0f, false, true, 11.985f, 3f)
                arcToRelative(1.784f, 1.784f, 0f, false, true, 1.546f, 0.888f)
                lineToRelative(3.943f, 6.843f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.378f, 9.633f)
                lineToRelative(4.096f, 1.098f)
                lineToRelative(1.097f, -4.096f)
            }
        }.build()
        
        return _Recycle!!
    }

private var _Recycle: ImageVector? = null

