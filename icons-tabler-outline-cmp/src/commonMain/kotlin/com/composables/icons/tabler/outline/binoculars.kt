package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Binoculars: ImageVector
    get() {
        if (_Binoculars != null) return _Binoculars!!
        
        _Binoculars = ImageVector.Builder(
            name = "binoculars",
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
                moveTo(7f, 16f)
                moveToRelative(-3f, 0f)
                arcToRelative(3f, 3f, 0f, true, false, 6f, 0f)
                arcToRelative(3f, 3f, 0f, true, false, -6f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 16f)
                moveToRelative(-3f, 0f)
                arcToRelative(3f, 3f, 0f, true, false, 6f, 0f)
                arcToRelative(3f, 3f, 0f, true, false, -6f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.346f, 9.17f)
                lineToRelative(-0.729f, -1.261f)
                curveToRelative(-0.16f, -0.248f, -1.056f, -0.203f, -1.117f, 0.091f)
                lineToRelative(-0.177f, 1.38f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.761f, 14.813f)
                lineToRelative(-2.84f, -5.133f)
                curveToRelative(-0.189f, -0.31f, -0.592f, -0.68f, -1.421f, -0.68f)
                curveToRelative(-0.828f, 0f, -1.5f, 0.448f, -1.5f, 1f)
                verticalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.654f, 9.17f)
                lineToRelative(0.729f, -1.261f)
                curveToRelative(0.16f, -0.249f, 1.056f, -0.203f, 1.117f, 0.091f)
                lineToRelative(0.177f, 1.38f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.239f, 14.813f)
                lineToRelative(2.84f, -5.133f)
                curveToRelative(0.189f, -0.31f, 0.592f, -0.68f, 1.421f, -0.68f)
                curveToRelative(0.828f, 0f, 1.5f, 0.448f, 1.5f, 1f)
                verticalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 12f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                close()
            }
        }.build()
        
        return _Binoculars!!
    }

private var _Binoculars: ImageVector? = null

