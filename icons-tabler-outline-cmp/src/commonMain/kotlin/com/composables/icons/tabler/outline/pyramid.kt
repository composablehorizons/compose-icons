package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Pyramid: ImageVector
    get() {
        if (_Pyramid != null) return _Pyramid!!
        
        _Pyramid = ImageVector.Builder(
            name = "pyramid",
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
                moveTo(11.105f, 21.788f)
                arcToRelative(1.994f, 1.994f, 0f, false, false, 1.789f, 0f)
                lineToRelative(8.092f, -4.054f)
                curveToRelative(0.538f, -0.27f, 0.718f, -0.951f, 0.385f, -1.452f)
                lineToRelative(-8.54f, -13.836f)
                arcToRelative(0.999f, 0.999f, 0f, false, false, -1.664f, 0f)
                lineToRelative(-8.54f, 13.836f)
                arcToRelative(1.005f, 1.005f, 0f, false, false, 0.386f, 1.452f)
                lineToRelative(8.092f, 4.054f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 2f)
                verticalLineToRelative(20f)
            }
        }.build()
        
        return _Pyramid!!
    }

private var _Pyramid: ImageVector? = null

