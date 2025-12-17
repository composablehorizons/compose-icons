package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.GardenCartOff: ImageVector
    get() {
        if (_GardenCartOff != null) return _GardenCartOff!!
        
        _GardenCartOff = ImageVector.Builder(
            name = "garden-cart-off",
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
                moveTo(15.733f, 15.732f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 3.544f, 3.527f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 8f)
                verticalLineToRelative(11f)
                arcToRelative(1f, 1f, 0f, false, false, 1.806f, 0.591f)
                lineToRelative(3.694f, -5.091f)
                verticalLineToRelative(0.055f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 8f)
                horizontalLineToRelative(2f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(9f)
                lineToRelative(-3f, 6.01f)
                moveToRelative(-3.319f, 0.693f)
                lineToRelative(-4.276f, -0.45f)
                arcToRelative(4f, 4f, 0f, false, true, -3.296f, -2.493f)
                lineToRelative(-2.853f, -7.13f)
                arcToRelative(1f, 1f, 0f, false, false, -0.928f, -0.63f)
                horizontalLineToRelative(-1.323f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _GardenCartOff!!
    }

private var _GardenCartOff: ImageVector? = null

