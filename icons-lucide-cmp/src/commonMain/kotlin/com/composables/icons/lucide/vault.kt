package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Vault: ImageVector
    get() {
        if (_Vault != null) return _Vault!!
        
        _Vault = ImageVector.Builder(
            name = "vault",
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
                moveTo(5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, false, true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, false, true, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, false, true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, false, true, 5f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7.5f, 8f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7f, 7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 7.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.9f, 7.9f)
                lineToRelative(2.7f, 2.7f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 16.5f, 8f)
                arcTo(0.5f, 0.5f, 0f, false, true, 16f, 7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 17f, 7.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.4f, 10.6f)
                lineToRelative(2.7f, -2.7f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 16.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7.5f, 17f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7f, 16.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 16.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.9f, 16.1f)
                lineToRelative(2.7f, -2.7f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 16.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 16.5f, 17f)
                arcTo(0.5f, 0.5f, 0f, false, true, 16f, 16.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 17f, 16.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.4f, 13.4f)
                lineToRelative(2.7f, 2.7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 12f)
                arcTo(2f, 2f, 0f, false, true, 12f, 14f)
                arcTo(2f, 2f, 0f, false, true, 10f, 12f)
                arcTo(2f, 2f, 0f, false, true, 14f, 12f)
                close()
            }
        }.build()
        
        return _Vault!!
    }

private var _Vault: ImageVector? = null

