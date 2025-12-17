package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Droplets: ImageVector
    get() {
        if (_Droplets != null) return _Droplets!!
        
        _Droplets = ImageVector.Builder(
            name = "droplets",
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
                moveTo(4.072f, 20.3f)
                arcToRelative(2.999f, 2.999f, 0f, false, false, 3.856f, 0f)
                arcToRelative(3.002f, 3.002f, 0f, false, false, 0.67f, -3.798f)
                lineToRelative(-2.095f, -3.227f)
                arcToRelative(0.6f, 0.6f, 0f, false, false, -1.005f, 0f)
                lineToRelative(-2.098f, 3.227f)
                arcToRelative(3.003f, 3.003f, 0f, false, false, 0.671f, 3.798f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.072f, 20.3f)
                arcToRelative(2.999f, 2.999f, 0f, false, false, 3.856f, 0f)
                arcToRelative(3.002f, 3.002f, 0f, false, false, 0.67f, -3.798f)
                lineToRelative(-2.095f, -3.227f)
                arcToRelative(0.6f, 0.6f, 0f, false, false, -1.005f, 0f)
                lineToRelative(-2.098f, 3.227f)
                arcToRelative(3.003f, 3.003f, 0f, false, false, 0.671f, 3.798f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.072f, 10.3f)
                arcToRelative(2.999f, 2.999f, 0f, false, false, 3.856f, 0f)
                arcToRelative(3.002f, 3.002f, 0f, false, false, 0.67f, -3.798f)
                lineToRelative(-2.095f, -3.227f)
                arcToRelative(0.6f, 0.6f, 0f, false, false, -1.005f, 0f)
                lineToRelative(-2.098f, 3.227f)
                arcToRelative(3.003f, 3.003f, 0f, false, false, 0.671f, 3.798f)
                close()
            }
        }.build()
        
        return _Droplets!!
    }

private var _Droplets: ImageVector? = null

