package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Funnel: ImageVector
    get() {
        if (_Funnel != null) return _Funnel!!
        
        _Funnel = ImageVector.Builder(
            name = "funnel",
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
                moveTo(10f, 20f)
                arcToRelative(1f, 1f, 0f, false, false, 0.553f, 0.895f)
                lineToRelative(2f, 1f)
                arcTo(1f, 1f, 0f, false, false, 14f, 21f)
                verticalLineToRelative(-7f)
                arcToRelative(2f, 2f, 0f, false, true, 0.517f, -1.341f)
                lineTo(21.74f, 4.67f)
                arcTo(1f, 1f, 0f, false, false, 21f, 3f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -0.742f, 1.67f)
                lineToRelative(7.225f, 7.989f)
                arcTo(2f, 2f, 0f, false, true, 10f, 14f)
                close()
            }
        }.build()
        
        return _Funnel!!
    }

private var _Funnel: ImageVector? = null

