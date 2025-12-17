package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Handbag: ImageVector
    get() {
        if (_Handbag != null) return _Handbag!!
        
        _Handbag = ImageVector.Builder(
            name = "handbag",
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
                moveTo(2.048f, 18.566f)
                arcTo(2f, 2f, 0f, false, false, 4f, 21f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 1.952f, -2.434f)
                lineToRelative(-2f, -9f)
                arcTo(2f, 2f, 0f, false, false, 18f, 8f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -1.952f, 1.566f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 11f)
                verticalLineTo(6f)
                arcToRelative(4f, 4f, 0f, false, true, 8f, 0f)
                verticalLineToRelative(5f)
            }
        }.build()
        
        return _Handbag!!
    }

private var _Handbag: ImageVector? = null

