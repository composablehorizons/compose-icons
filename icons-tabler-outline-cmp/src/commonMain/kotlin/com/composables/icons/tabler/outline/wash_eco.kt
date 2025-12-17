package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.WashEco: ImageVector
    get() {
        if (_WashEco != null) return _WashEco!!
        
        _WashEco = ImageVector.Builder(
            name = "wash-eco",
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
                moveTo(3f, 6f)
                lineToRelative(1.721f, 10.329f)
                arcToRelative(2f, 2f, 0f, false, false, 1.973f, 1.671f)
                horizontalLineToRelative(5.306f)
                moveToRelative(8.162f, -6.972f)
                lineToRelative(0.838f, -5.028f)
            }
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
                curveToRelative(0.461f, -0.32f, 1.21f, -0.507f, 2f, -0.5f)
                curveToRelative(0.79f, -0.007f, 1.539f, 0.18f, 2f, 0.5f)
                curveToRelative(0.461f, 0.322f, 1.21f, 0.509f, 2f, 0.5f)
                curveToRelative(0.79f, 0.009f, 1.539f, -0.178f, 2f, -0.5f)
                curveToRelative(0.461f, -0.32f, 1.21f, -0.507f, 2f, -0.5f)
                curveToRelative(0.79f, -0.007f, 1.539f, 0.18f, 2f, 0.5f)
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
                moveTo(16f, 22f)
                reflectiveCurveToRelative(0f, -2f, 3f, -4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 21f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, -6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                close()
            }
        }.build()
        
        return _WashEco!!
    }

private var _WashEco: ImageVector? = null

