package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Spool: ImageVector
    get() {
        if (_Spool != null) return _Spool!!
        
        _Spool = ImageVector.Builder(
            name = "spool",
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
                moveTo(17f, 13.44f)
                lineTo(4.442f, 17.082f)
                arcTo(2f, 2f, 0f, false, false, 4.982f, 21f)
                horizontalLineTo(19f)
                arcToRelative(2f, 2f, 0f, false, false, 0.558f, -3.921f)
                lineToRelative(-1.115f, -0.32f)
                arcTo(2f, 2f, 0f, false, true, 17f, 14.837f)
                verticalLineTo(7.66f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 10.56f)
                lineToRelative(12.558f, -3.642f)
                arcTo(2f, 2f, 0f, false, false, 19.018f, 3f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -0.558f, 3.921f)
                lineToRelative(1.115f, 0.32f)
                arcTo(2f, 2f, 0f, false, true, 7f, 9.163f)
                verticalLineToRelative(7.178f)
            }
        }.build()
        
        return _Spool!!
    }

private var _Spool: ImageVector? = null

