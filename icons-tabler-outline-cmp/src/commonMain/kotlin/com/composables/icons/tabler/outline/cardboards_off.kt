package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CardboardsOff: ImageVector
    get() {
        if (_CardboardsOff != null) return _CardboardsOff!!
        
        _CardboardsOff = ImageVector.Builder(
            name = "cardboards-off",
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
                moveTo(20.96f, 16.953f)
                curveToRelative(0.026f, -0.147f, 0.04f, -0.298f, 0.04f, -0.453f)
                verticalLineToRelative(-8.5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-9f)
                moveToRelative(-4f, 0f)
                horizontalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(8.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 2.5f, 2.5f)
                horizontalLineToRelative(1.06f)
                arcToRelative(3f, 3f, 0f, false, false, 2.34f, -1.13f)
                lineToRelative(1.54f, -1.92f)
                arcToRelative(2f, 2f, 0f, false, true, 3.12f, 0f)
                lineToRelative(1.54f, 1.92f)
                arcToRelative(3f, 3f, 0f, false, false, 2.34f, 1.13f)
                horizontalLineToRelative(1.06f)
                curveToRelative(0.155f, 0f, 0.307f, -0.014f, 0.454f, -0.041f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 12f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, 2f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.714f, 12.7f)
                arcToRelative(1f, 1f, 0f, false, false, -1.417f, -1.411f)
                lineToRelative(1.417f, 1.41f)
                close()
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
        
        return _CardboardsOff!!
    }

private var _CardboardsOff: ImageVector? = null

