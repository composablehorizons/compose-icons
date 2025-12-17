package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Torus: ImageVector
    get() {
        if (_Torus != null) return _Torus!!
        
        _Torus = ImageVector.Builder(
            name = "torus",
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
                moveTo(15f, 11f)
                arcTo(3f, 2f, 0f, false, true, 12f, 13f)
                arcTo(3f, 2f, 0f, false, true, 9f, 11f)
                arcTo(3f, 2f, 0f, false, true, 15f, 11f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 12.5f)
                arcTo(10f, 8.5f, 0f, false, true, 12f, 21f)
                arcTo(10f, 8.5f, 0f, false, true, 2f, 12.5f)
                arcTo(10f, 8.5f, 0f, false, true, 22f, 12.5f)
                close()
            }
        }.build()
        
        return _Torus!!
    }

private var _Torus: ImageVector? = null

