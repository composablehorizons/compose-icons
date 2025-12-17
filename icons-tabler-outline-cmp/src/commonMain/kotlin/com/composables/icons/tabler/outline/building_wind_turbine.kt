package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BuildingWindTurbine: ImageVector
    get() {
        if (_BuildingWindTurbine != null) return _BuildingWindTurbine!!
        
        _BuildingWindTurbine = ImageVector.Builder(
            name = "building-wind-turbine",
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
                moveTo(12f, 11f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, 4f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 11f)
                verticalLineToRelative(-2.573f)
                curveToRelative(0f, -0.18f, 0.013f, -0.358f, 0.04f, -0.536f)
                lineToRelative(0.716f, -4.828f)
                curveToRelative(0.064f, -0.597f, 0.597f, -1.063f, 1.244f, -1.063f)
                reflectiveCurveToRelative(1.18f, 0.466f, 1.244f, 1.063f)
                lineToRelative(0.716f, 4.828f)
                curveToRelative(0.027f, 0.178f, 0.04f, 0.357f, 0.04f, 0.536f)
                verticalLineToRelative(2.573f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.01f, 9.28f)
                lineToRelative(2.235f, 1.276f)
                curveToRelative(0.156f, 0.09f, 0.305f, 0.19f, 0.446f, 0.3f)
                lineToRelative(3.836f, 2.911f)
                curveToRelative(0.487f, 0.352f, 0.624f, 1.04f, 0.3f, 1.596f)
                curveToRelative(-0.325f, 0.556f, -1f, 0.782f, -1.548f, 0.541f)
                lineToRelative(-4.555f, -1.68f)
                arcToRelative(3.624f, 3.624f, 0f, false, true, -0.486f, -0.231f)
                lineToRelative(-2.235f, -1.277f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 12.716f)
                lineToRelative(-2.236f, 1.277f)
                arcToRelative(3.624f, 3.624f, 0f, false, true, -0.485f, 0.23f)
                lineToRelative(-4.555f, 1.681f)
                curveToRelative(-0.551f, 0.241f, -1.223f, 0.015f, -1.548f, -0.54f)
                curveToRelative(-0.324f, -0.557f, -0.187f, -1.245f, 0.3f, -1.597f)
                lineToRelative(3.836f, -2.91f)
                arcToRelative(3.41f, 3.41f, 0f, false, true, 0.446f, -0.3f)
                lineToRelative(2.235f, -1.277f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 21f)
                horizontalLineToRelative(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 21f)
                lineToRelative(1f, -7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 14f)
                lineToRelative(1f, 7f)
            }
        }.build()
        
        return _BuildingWindTurbine!!
    }

private var _BuildingWindTurbine: ImageVector? = null

