package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Crown: ImageVector
    get() {
        if (_Crown != null) return _Crown!!
        
        _Crown = ImageVector.Builder(
            name = "crown",
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
                moveTo(11.562f, 3.266f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.876f, 0f)
                lineTo(15.39f, 8.87f)
                arcToRelative(1f, 1f, 0f, false, false, 1.516f, 0.294f)
                lineTo(21.183f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.798f, 0.519f)
                lineToRelative(-2.834f, 10.246f)
                arcToRelative(1f, 1f, 0f, false, true, -0.956f, 0.734f)
                horizontalLineTo(5.81f)
                arcToRelative(1f, 1f, 0f, false, true, -0.957f, -0.734f)
                lineTo(2.02f, 6.02f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.798f, -0.519f)
                lineToRelative(4.276f, 3.664f)
                arcToRelative(1f, 1f, 0f, false, false, 1.516f, -0.294f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 21f)
                horizontalLineToRelative(14f)
            }
        }.build()
        
        return _Crown!!
    }

private var _Crown: ImageVector? = null

