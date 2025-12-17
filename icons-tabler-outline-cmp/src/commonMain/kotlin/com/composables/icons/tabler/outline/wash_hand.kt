package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.WashHand: ImageVector
    get() {
        if (_WashHand != null) return _WashHand!!
        
        _WashHand = ImageVector.Builder(
            name = "wash-hand",
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
                moveTo(3.486f, 8.965f)
                curveToRelative(0.168f, 0.02f, 0.34f, 0.033f, 0.514f, 0.035f)
                curveToRelative(0.79f, 0.009f, 1.539f, -0.178f, 2f, -0.5f)
                curveToRelative(0.426f, -0.296f, 0.777f, -0.5f, 1.5f, -0.5f)
                horizontalLineToRelative(1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 8f)
                lineToRelative(0.615f, 0.034f)
                curveToRelative(0.552f, 0.067f, 1.046f, 0.23f, 1.385f, 0.466f)
                curveToRelative(0.461f, 0.322f, 1.21f, 0.509f, 2f, 0.5f)
                curveToRelative(0.17f, 0f, 0.339f, -0.014f, 0.503f, -0.034f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 10.5f)
                lineToRelative(0.586f, 0.578f)
                arcToRelative(1.516f, 1.516f, 0f, false, false, 2f, 0f)
                curveToRelative(0.476f, -0.433f, 0.55f, -1.112f, 0.176f, -1.622f)
                lineToRelative(-1.762f, -2.456f)
                curveToRelative(-0.37f, -0.506f, -1.331f, -1f, -2f, -1f)
                horizontalLineToRelative(-3.117f)
                arcToRelative(1f, 1f, 0f, false, false, -0.992f, 0.876f)
                lineToRelative(-0.499f, 3.986f)
                arcToRelative(3.857f, 3.857f, 0f, false, false, 2.608f, 4.138f)
                arcToRelative(2.28f, 2.28f, 0f, false, false, 3f, -2.162f)
                verticalLineToRelative(-2.338f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 6f)
                lineToRelative(1.721f, 10.329f)
                arcToRelative(2f, 2f, 0f, false, false, 1.973f, 1.671f)
                horizontalLineToRelative(10.612f)
                arcToRelative(2f, 2f, 0f, false, false, 1.973f, -1.671f)
                lineToRelative(1.721f, -10.329f)
            }
        }.build()
        
        return _WashHand!!
    }

private var _WashHand: ImageVector? = null

