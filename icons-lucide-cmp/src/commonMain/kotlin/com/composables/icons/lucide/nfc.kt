package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Nfc: ImageVector
    get() {
        if (_Nfc != null) return _Nfc!!
        
        _Nfc = ImageVector.Builder(
            name = "nfc",
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
                moveTo(6f, 8.32f)
                arcToRelative(7.43f, 7.43f, 0f, false, true, 0f, 7.36f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.46f, 6.21f)
                arcToRelative(11.76f, 11.76f, 0f, false, true, 0f, 11.58f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.91f, 4.1f)
                arcToRelative(15.91f, 15.91f, 0f, false, true, 0.01f, 15.8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.37f, 2f)
                arcToRelative(20.16f, 20.16f, 0f, false, true, 0f, 20f)
            }
        }.build()
        
        return _Nfc!!
    }

private var _Nfc: ImageVector? = null

