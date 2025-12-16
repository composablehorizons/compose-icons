package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Medal: ImageVector
    get() {
        if (_Medal != null) return _Medal!!
        
        _Medal = ImageVector.Builder(
            name = "medal",
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
                moveTo(7.21f, 15f)
                lineTo(2.66f, 7.14f)
                arcToRelative(2f, 2f, 0f, false, true, 0.13f, -2.2f)
                lineTo(4.4f, 2.8f)
                arcTo(2f, 2f, 0f, false, true, 6f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 1.6f, 0.8f)
                lineToRelative(1.6f, 2.14f)
                arcToRelative(2f, 2f, 0f, false, true, 0.14f, 2.2f)
                lineTo(16.79f, 15f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 12f)
                lineTo(5.12f, 2.2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 12f)
                lineToRelative(5.88f, -9.8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 7f)
                horizontalLineToRelative(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 17f)
                arcTo(5f, 5f, 0f, false, true, 12f, 22f)
                arcTo(5f, 5f, 0f, false, true, 7f, 17f)
                arcTo(5f, 5f, 0f, false, true, 17f, 17f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 18f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-0.5f)
            }
        }.build()
        
        return _Medal!!
    }

private var _Medal: ImageVector? = null

