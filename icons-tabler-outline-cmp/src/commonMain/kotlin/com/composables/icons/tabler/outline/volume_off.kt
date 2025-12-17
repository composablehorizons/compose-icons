package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.VolumeOff: ImageVector
    get() {
        if (_VolumeOff != null) return _VolumeOff!!
        
        _VolumeOff = ImageVector.Builder(
            name = "volume-off",
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
                moveTo(15f, 8f)
                arcToRelative(5f, 5f, 0f, false, true, 1.912f, 4.934f)
                moveToRelative(-1.377f, 2.602f)
                arcToRelative(5f, 5f, 0f, false, true, -0.535f, 0.464f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.7f, 5f)
                arcToRelative(9f, 9f, 0f, false, true, 2.362f, 11.086f)
                moveToRelative(-1.676f, 2.299f)
                arcToRelative(9f, 9f, 0f, false, true, -0.686f, 0.615f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.069f, 5.054f)
                lineToRelative(0.431f, -0.554f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, 1.5f, 0.5f)
                verticalLineToRelative(2f)
                moveToRelative(0f, 4f)
                verticalLineToRelative(8f)
                arcToRelative(0.8f, 0.8f, 0f, false, true, -1.5f, 0.5f)
                lineToRelative(-3.5f, -4.5f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(2f)
                lineToRelative(1.294f, -1.664f)
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
        
        return _VolumeOff!!
    }

private var _VolumeOff: ImageVector? = null

