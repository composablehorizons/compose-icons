package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Pyramid: ImageVector
    get() {
        if (_Pyramid != null) return _Pyramid!!
        
        _Pyramid = ImageVector.Builder(
            name = "pyramid",
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
                moveTo(2.5f, 16.88f)
                arcToRelative(1f, 1f, 0f, false, true, -0.32f, -1.43f)
                lineToRelative(9f, -13.02f)
                arcToRelative(1f, 1f, 0f, false, true, 1.64f, 0f)
                lineToRelative(9f, 13.01f)
                arcToRelative(1f, 1f, 0f, false, true, -0.32f, 1.44f)
                lineToRelative(-8.51f, 4.86f)
                arcToRelative(2f, 2f, 0f, false, true, -1.98f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 2f)
                verticalLineToRelative(20f)
            }
        }.build()
        
        return _Pyramid!!
    }

private var _Pyramid: ImageVector? = null

