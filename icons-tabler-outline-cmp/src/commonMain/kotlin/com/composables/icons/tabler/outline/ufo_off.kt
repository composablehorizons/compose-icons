package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.UfoOff: ImageVector
    get() {
        if (_UfoOff != null) return _UfoOff!!
        
        _UfoOff = ImageVector.Builder(
            name = "ufo-off",
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
                moveTo(16.95f, 9.01f)
                curveToRelative(3.02f, 0.739f, 5.05f, 2.123f, 5.05f, 3.714f)
                curveToRelative(0f, 1.08f, -0.931f, 2.063f, -2.468f, 2.814f)
                moveToRelative(-3f, 1f)
                curveToRelative(-1.36f, 0.295f, -2.9f, 0.462f, -4.531f, 0.462f)
                curveToRelative(-5.52f, 0f, -10f, -1.909f, -10f, -4.276f)
                curveToRelative(0f, -1.59f, 2.04f, -2.985f, 5.07f, -3.724f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.69f, 10.686f)
                curveToRelative(1.388f, -0.355f, 2.31f, -0.976f, 2.31f, -1.686f)
                verticalLineToRelative(-0.035f)
                curveToRelative(0f, -2.742f, -2.239f, -4.965f, -5f, -4.965f)
                curveToRelative(-1.125f, 0f, -2.164f, 0.37f, -3f, 0.992f)
                moveToRelative(-1.707f, 2.297f)
                arcToRelative(4.925f, 4.925f, 0f, false, false, -0.293f, 1.676f)
                verticalLineToRelative(0.035f)
                curveToRelative(0f, 0.961f, 1.696f, 1.764f, 3.956f, 1.956f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 17f)
                lineToRelative(2f, 3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 17f)
                lineToRelative(-1.5f, 3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 14f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 13f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 13f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _UfoOff!!
    }

private var _UfoOff: ImageVector? = null

