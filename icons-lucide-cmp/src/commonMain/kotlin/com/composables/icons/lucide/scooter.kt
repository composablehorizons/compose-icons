package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Scooter: ImageVector
    get() {
        if (_Scooter != null) return _Scooter!!
        
        _Scooter = ImageVector.Builder(
            name = "scooter",
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
                moveTo(21f, 4f)
                horizontalLineToRelative(-3.5f)
                lineToRelative(2f, 11.05f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.95f, 17f)
                horizontalLineToRelative(5.142f)
                curveToRelative(0.523f, 0f, 0.95f, -0.406f, 1.063f, -0.916f)
                arcToRelative(6.5f, 6.5f, 0f, false, true, 5.345f, -5.009f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 17.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 19.5f, 20f)
                arcTo(2.5f, 2.5f, 0f, false, true, 17f, 17.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 22f, 17.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 17.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 4.5f, 20f)
                arcTo(2.5f, 2.5f, 0f, false, true, 2f, 17.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 7f, 17.5f)
                close()
            }
        }.build()
        
        return _Scooter!!
    }

private var _Scooter: ImageVector? = null

