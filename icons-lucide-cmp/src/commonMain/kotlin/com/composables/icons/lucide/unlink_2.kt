package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Unlink2: ImageVector
    get() {
        if (_Unlink2 != null) return _Unlink2!!
        
        _Unlink2 = ImageVector.Builder(
            name = "unlink-2",
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
                moveTo(15f, 7f)
                horizontalLineToRelative(2f)
                arcToRelative(5f, 5f, 0f, false, true, 0f, 10f)
                horizontalLineToRelative(-2f)
                moveToRelative(-6f, 0f)
                horizontalLineTo(7f)
                arcTo(5f, 5f, 0f, false, true, 7f, 7f)
                horizontalLineToRelative(2f)
            }
        }.build()
        
        return _Unlink2!!
    }

private var _Unlink2: ImageVector? = null

