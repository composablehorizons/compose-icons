package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BulbOff: ImageVector
    get() {
        if (_BulbOff != null) return _BulbOff!!
        
        _BulbOff = ImageVector.Builder(
            name = "bulb-off",
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
                moveTo(3f, 12f)
                horizontalLineToRelative(1f)
                moveToRelative(8f, -9f)
                verticalLineToRelative(1f)
                moveToRelative(8f, 8f)
                horizontalLineToRelative(1f)
                moveToRelative(-15.4f, -6.4f)
                lineToRelative(0.7f, 0.7f)
                moveToRelative(12.1f, -0.7f)
                lineToRelative(-0.7f, 0.7f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.089f, 7.083f)
                arcToRelative(5f, 5f, 0f, false, true, 5.826f, 5.84f)
                moveToRelative(-1.378f, 2.611f)
                arcToRelative(5.012f, 5.012f, 0f, false, true, -0.537f, 0.466f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -1f, 3f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -1f, -3f)
                arcToRelative(5f, 5f, 0f, false, true, -0.528f, -7.544f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.7f, 17f)
                horizontalLineToRelative(4.6f)
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
        
        return _BulbOff!!
    }

private var _BulbOff: ImageVector? = null

