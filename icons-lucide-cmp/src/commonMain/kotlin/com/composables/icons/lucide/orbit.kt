package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Orbit: ImageVector
    get() {
        if (_Orbit != null) return _Orbit!!
        
        _Orbit = ImageVector.Builder(
            name = "orbit",
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
                moveTo(20.341f, 6.484f)
                arcTo(10f, 10f, 0f, false, true, 10.266f, 21.85f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.659f, 17.516f)
                arcTo(10f, 10f, 0f, false, true, 13.74f, 2.152f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 12f)
                arcTo(3f, 3f, 0f, false, true, 12f, 15f)
                arcTo(3f, 3f, 0f, false, true, 9f, 12f)
                arcTo(3f, 3f, 0f, false, true, 15f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 5f)
                arcTo(2f, 2f, 0f, false, true, 19f, 7f)
                arcTo(2f, 2f, 0f, false, true, 17f, 5f)
                arcTo(2f, 2f, 0f, false, true, 21f, 5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 19f)
                arcTo(2f, 2f, 0f, false, true, 5f, 21f)
                arcTo(2f, 2f, 0f, false, true, 3f, 19f)
                arcTo(2f, 2f, 0f, false, true, 7f, 19f)
                close()
            }
        }.build()
        
        return _Orbit!!
    }

private var _Orbit: ImageVector? = null

