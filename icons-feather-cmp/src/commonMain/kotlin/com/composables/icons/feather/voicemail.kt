package com.composables.icons.feather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Feather.Voicemail: ImageVector
    get() {
        if (_Voicemail != null) return _Voicemail!!
        
        _Voicemail = ImageVector.Builder(
            name = "voicemail",
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
                moveTo(10f, 11.5f)
                arcTo(4.5f, 4.5f, 0f, false, true, 5.5f, 16f)
                arcTo(4.5f, 4.5f, 0f, false, true, 1f, 11.5f)
                arcTo(4.5f, 4.5f, 0f, false, true, 10f, 11.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(23f, 11.5f)
                arcTo(4.5f, 4.5f, 0f, false, true, 18.5f, 16f)
                arcTo(4.5f, 4.5f, 0f, false, true, 14f, 11.5f)
                arcTo(4.5f, 4.5f, 0f, false, true, 23f, 11.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.5f, 16f)
                lineTo(18.5f, 16f)
            }
        }.build()
        
        return _Voicemail!!
    }

private var _Voicemail: ImageVector? = null

