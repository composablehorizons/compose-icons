package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Tag: ImageVector
    get() {
        if (_Tag != null) return _Tag!!
        
        _Tag = ImageVector.Builder(
            name = "tag",
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
                moveTo(12.586f, 2.586f)
                arcTo(2f, 2f, 0f, false, false, 11.172f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(7.172f)
                arcToRelative(2f, 2f, 0f, false, false, 0.586f, 1.414f)
                lineToRelative(8.704f, 8.704f)
                arcToRelative(2.426f, 2.426f, 0f, false, false, 3.42f, 0f)
                lineToRelative(6.58f, -6.58f)
                arcToRelative(2.426f, 2.426f, 0f, false, false, 0f, -3.42f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7.5f, 8f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7f, 7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 7.5f)
                close()
            }
        }.build()
        
        return _Tag!!
    }

private var _Tag: ImageVector? = null

