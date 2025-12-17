package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Cone: ImageVector
    get() {
        if (_Cone != null) return _Cone!!
        
        _Cone = ImageVector.Builder(
            name = "cone",
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
                moveTo(20.9f, 18.55f)
                lineToRelative(-8f, -15.98f)
                arcToRelative(1f, 1f, 0f, false, false, -1.8f, 0f)
                lineToRelative(-8f, 15.98f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 19f)
                arcTo(9f, 3f, 0f, false, true, 12f, 22f)
                arcTo(9f, 3f, 0f, false, true, 3f, 19f)
                arcTo(9f, 3f, 0f, false, true, 21f, 19f)
                close()
            }
        }.build()
        
        return _Cone!!
    }

private var _Cone: ImageVector? = null

