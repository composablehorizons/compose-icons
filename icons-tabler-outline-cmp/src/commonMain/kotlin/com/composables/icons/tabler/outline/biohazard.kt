package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Biohazard: ImageVector
    get() {
        if (_Biohazard != null) return _Biohazard!!
        
        _Biohazard = ImageVector.Builder(
            name = "biohazard",
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
                moveTo(12f, 12f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, 4f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.939f, 14f)
                curveToRelative(0f, 0.173f, 0.048f, 0.351f, 0.056f, 0.533f)
                lineToRelative(0f, 0.217f)
                arcToRelative(4.75f, 4.75f, 0f, false, true, -4.533f, 4.745f)
                lineToRelative(-0.217f, 0f)
                moveToRelative(-4.75f, -4.75f)
                arcToRelative(4.75f, 4.75f, 0f, false, true, 7.737f, -3.693f)
                moveToRelative(6.513f, 8.443f)
                arcToRelative(4.75f, 4.75f, 0f, false, true, -4.69f, -5.503f)
                lineToRelative(-0.06f, 0f)
                moveToRelative(1.764f, -2.944f)
                arcToRelative(4.75f, 4.75f, 0f, false, true, 7.731f, 3.477f)
                lineToRelative(0f, 0.217f)
                moveToRelative(-11.195f, -3.813f)
                arcToRelative(4.75f, 4.75f, 0f, false, true, -1.828f, -7.624f)
                lineToRelative(0.164f, -0.172f)
                moveToRelative(6.718f, 0f)
                arcToRelative(4.75f, 4.75f, 0f, false, true, -1.665f, 7.798f)
            }
        }.build()
        
        return _Biohazard!!
    }

private var _Biohazard: ImageVector? = null

