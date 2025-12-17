package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Images: ImageVector
    get() {
        if (_Images != null) return _Images!!
        
        _Images = ImageVector.Builder(
            name = "images",
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
                moveTo(22f, 11f)
                lineToRelative(-1.296f, -1.296f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, -3.408f, 0f)
                lineTo(11f, 16f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 8f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 7f)
                arcTo(1f, 1f, 0f, false, true, 13f, 8f)
                arcTo(1f, 1f, 0f, false, true, 12f, 7f)
                arcTo(1f, 1f, 0f, false, true, 14f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 2f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, false, true, 22f, 4f)
                verticalLineTo(14f)
                arcTo(2f, 2f, 0f, false, true, 20f, 16f)
                horizontalLineTo(10f)
                arcTo(2f, 2f, 0f, false, true, 8f, 14f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, false, true, 10f, 2f)
                close()
            }
        }.build()
        
        return _Images!!
    }

private var _Images: ImageVector? = null

