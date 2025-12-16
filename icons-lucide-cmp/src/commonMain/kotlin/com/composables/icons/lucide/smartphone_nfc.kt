package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.SmartphoneNfc: ImageVector
    get() {
        if (_SmartphoneNfc != null) return _SmartphoneNfc!!
        
        _SmartphoneNfc = ImageVector.Builder(
            name = "smartphone-nfc",
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
                moveTo(3f, 6f)
                horizontalLineTo(8f)
                arcTo(1f, 1f, 0f, false, true, 9f, 7f)
                verticalLineTo(17f)
                arcTo(1f, 1f, 0f, false, true, 8f, 18f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, false, true, 2f, 17f)
                verticalLineTo(7f)
                arcTo(1f, 1f, 0f, false, true, 3f, 6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 8.32f)
                arcToRelative(7.43f, 7.43f, 0f, false, true, 0f, 7.36f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.46f, 6.21f)
                arcToRelative(11.76f, 11.76f, 0f, false, true, 0f, 11.58f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.91f, 4.1f)
                arcToRelative(15.91f, 15.91f, 0f, false, true, 0.01f, 15.8f)
            }
        }.build()
        
        return _SmartphoneNfc!!
    }

private var _SmartphoneNfc: ImageVector? = null

