package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Magnet: ImageVector
    get() {
        if (_Magnet != null) return _Magnet!!
        
        _Magnet = ImageVector.Builder(
            name = "magnet",
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
                moveTo(12f, 15f)
                lineToRelative(4f, 4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.352f, 10.648f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, 0f, 1.704f)
                lineToRelative(2.296f, 2.296f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, 1.704f, 0f)
                lineToRelative(6.029f, -6.029f)
                arcToRelative(1f, 1f, 0f, true, true, 3f, 3f)
                lineToRelative(-6.029f, 6.029f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, 0f, 1.704f)
                lineToRelative(2.296f, 2.296f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, 1.704f, 0f)
                lineToRelative(6.365f, -6.367f)
                arcTo(1f, 1f, 0f, false, false, 8.716f, 4.282f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 8f)
                lineToRelative(4f, 4f)
            }
        }.build()
        
        return _Magnet!!
    }

private var _Magnet: ImageVector? = null

