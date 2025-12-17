package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Beer: ImageVector
    get() {
        if (_Beer != null) return _Beer!!
        
        _Beer = ImageVector.Builder(
            name = "beer",
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
                moveTo(17f, 11f)
                horizontalLineToRelative(1f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, 6f)
                horizontalLineToRelative(-1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 12f)
                verticalLineToRelative(6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 12f)
                verticalLineToRelative(6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 7.5f)
                curveToRelative(-1f, 0f, -1.44f, 0.5f, -3f, 0.5f)
                reflectiveCurveToRelative(-2f, -0.5f, -3f, -0.5f)
                reflectiveCurveToRelative(-1.72f, 0.5f, -2.5f, 0.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 0f, -5f)
                curveToRelative(0.78f, 0f, 1.57f, 0.5f, 2.5f, 0.5f)
                reflectiveCurveTo(9.44f, 2f, 11f, 2f)
                reflectiveCurveToRelative(2f, 1.5f, 3f, 1.5f)
                reflectiveCurveToRelative(1.72f, -0.5f, 2.5f, -0.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 0f, 5f)
                curveToRelative(-0.78f, 0f, -1.5f, -0.5f, -2.5f, -0.5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 8f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(8f)
            }
        }.build()
        
        return _Beer!!
    }

private var _Beer: ImageVector? = null

