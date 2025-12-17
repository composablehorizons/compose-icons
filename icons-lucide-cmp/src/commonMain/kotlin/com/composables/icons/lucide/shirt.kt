package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Shirt: ImageVector
    get() {
        if (_Shirt != null) return _Shirt!!
        
        _Shirt = ImageVector.Builder(
            name = "shirt",
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
                moveTo(20.38f, 3.46f)
                lineTo(16f, 2f)
                arcToRelative(4f, 4f, 0f, false, true, -8f, 0f)
                lineTo(3.62f, 3.46f)
                arcToRelative(2f, 2f, 0f, false, false, -1.34f, 2.23f)
                lineToRelative(0.58f, 3.47f)
                arcToRelative(1f, 1f, 0f, false, false, 0.99f, 0.84f)
                horizontalLineTo(6f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(10f)
                horizontalLineToRelative(2.15f)
                arcToRelative(1f, 1f, 0f, false, false, 0.99f, -0.84f)
                lineToRelative(0.58f, -3.47f)
                arcToRelative(2f, 2f, 0f, false, false, -1.34f, -2.23f)
                close()
            }
        }.build()
        
        return _Shirt!!
    }

private var _Shirt: ImageVector? = null

