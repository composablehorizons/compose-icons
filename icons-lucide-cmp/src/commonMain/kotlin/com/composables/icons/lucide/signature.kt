package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Signature: ImageVector
    get() {
        if (_Signature != null) return _Signature!!
        
        _Signature = ImageVector.Builder(
            name = "signature",
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
                moveTo(21f, 17f)
                lineToRelative(-2.156f, -1.868f)
                arcTo(0.5f, 0.5f, 0f, false, false, 18f, 15.5f)
                verticalLineToRelative(0.5f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                curveToRelative(0f, -2.545f, -3.991f, -3.97f, -8.5f, -4f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 5f)
                curveToRelative(4.153f, 0f, 4.745f, -11.295f, 5.708f, -13.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, 3.31f, 3.284f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 21f)
                horizontalLineToRelative(18f)
            }
        }.build()
        
        return _Signature!!
    }

private var _Signature: ImageVector? = null

