package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BuildingAirport: ImageVector
    get() {
        if (_BuildingAirport != null) return _BuildingAirport!!
        
        _BuildingAirport = ImageVector.Builder(
            name = "building-airport",
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
                moveTo(3.59f, 7f)
                horizontalLineToRelative(8.82f)
                arcToRelative(1f, 1f, 0f, false, true, 0.902f, 1.433f)
                lineToRelative(-1.44f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, -0.901f, 0.567f)
                horizontalLineToRelative(-5.942f)
                arcToRelative(1f, 1f, 0f, false, true, -0.901f, -0.567f)
                lineToRelative(-1.44f, -3f)
                arcToRelative(1f, 1f, 0f, false, true, 0.901f, -1.433f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 7f)
                lineToRelative(-0.78f, -2.342f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.473f, -0.658f)
                horizontalLineToRelative(4.612f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.475f, 0.658f)
                lineToRelative(-0.78f, 2.342f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 2f)
                verticalLineToRelative(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 21f)
                horizontalLineToRelative(18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 5f)
                horizontalLineToRelative(-6f)
                lineToRelative(-1f, -1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 3f)
                lineToRelative(2f, 2f)
                lineToRelative(-2f, 2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 17f)
                horizontalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(2f)
            }
        }.build()
        
        return _BuildingAirport!!
    }

private var _BuildingAirport: ImageVector? = null

