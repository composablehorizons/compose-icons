package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Megaphone: ImageVector
    get() {
        if (_Megaphone != null) return _Megaphone!!
        
        _Megaphone = ImageVector.Builder(
            name = "megaphone",
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
                moveTo(11f, 6f)
                arcToRelative(13f, 13f, 0f, false, false, 8.4f, -2.8f)
                arcTo(1f, 1f, 0f, false, true, 21f, 4f)
                verticalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, true, -1.6f, 0.8f)
                arcTo(13f, 13f, 0f, false, false, 11f, 14f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 14f)
                arcToRelative(12f, 12f, 0f, false, false, 2.4f, 7.2f)
                arcToRelative(2f, 2f, 0f, false, false, 3.2f, -2.4f)
                arcTo(8f, 8f, 0f, false, true, 10f, 14f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 6f)
                verticalLineToRelative(8f)
            }
        }.build()
        
        return _Megaphone!!
    }

private var _Megaphone: ImageVector? = null

