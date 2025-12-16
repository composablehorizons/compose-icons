package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.HatGlasses: ImageVector
    get() {
        if (_HatGlasses != null) return _HatGlasses!!
        
        _HatGlasses = ImageVector.Builder(
            name = "hat-glasses",
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
                moveTo(14f, 18f)
                arcToRelative(2f, 2f, 0f, false, false, -4f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 11f)
                lineToRelative(-2.11f, -6.657f)
                arcToRelative(2f, 2f, 0f, false, false, -2.752f, -1.148f)
                lineToRelative(-1.276f, 0.61f)
                arcTo(2f, 2f, 0f, false, true, 12f, 4f)
                horizontalLineTo(8.5f)
                arcToRelative(2f, 2f, 0f, false, false, -1.925f, 1.456f)
                lineTo(5f, 11f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 11f)
                horizontalLineToRelative(20f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 18f)
                arcTo(3f, 3f, 0f, false, true, 17f, 21f)
                arcTo(3f, 3f, 0f, false, true, 14f, 18f)
                arcTo(3f, 3f, 0f, false, true, 20f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 18f)
                arcTo(3f, 3f, 0f, false, true, 7f, 21f)
                arcTo(3f, 3f, 0f, false, true, 4f, 18f)
                arcTo(3f, 3f, 0f, false, true, 10f, 18f)
                close()
            }
        }.build()
        
        return _HatGlasses!!
    }

private var _HatGlasses: ImageVector? = null

