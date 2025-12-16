package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Gitlab: ImageVector
    get() {
        if (_Gitlab != null) return _Gitlab!!
        
        _Gitlab = ImageVector.Builder(
            name = "gitlab",
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
                moveTo(22f, 13.29f)
                lineToRelative(-3.33f, -10f)
                arcToRelative(0.42f, 0.42f, 0f, false, false, -0.14f, -0.18f)
                arcToRelative(0.38f, 0.38f, 0f, false, false, -0.22f, -0.11f)
                arcToRelative(0.39f, 0.39f, 0f, false, false, -0.23f, 0.07f)
                arcToRelative(0.42f, 0.42f, 0f, false, false, -0.14f, 0.18f)
                lineToRelative(-2.26f, 6.67f)
                horizontalLineTo(8.32f)
                lineTo(6.1f, 3.26f)
                arcToRelative(0.42f, 0.42f, 0f, false, false, -0.1f, -0.18f)
                arcToRelative(0.38f, 0.38f, 0f, false, false, -0.26f, -0.08f)
                arcToRelative(0.39f, 0.39f, 0f, false, false, -0.23f, 0.07f)
                arcToRelative(0.42f, 0.42f, 0f, false, false, -0.14f, 0.18f)
                lineTo(2f, 13.29f)
                arcToRelative(0.74f, 0.74f, 0f, false, false, 0.27f, 0.83f)
                lineTo(12f, 21f)
                lineToRelative(9.69f, -6.88f)
                arcToRelative(0.71f, 0.71f, 0f, false, false, 0.31f, -0.83f)
                close()
            }
        }.build()
        
        return _Gitlab!!
    }

private var _Gitlab: ImageVector? = null

