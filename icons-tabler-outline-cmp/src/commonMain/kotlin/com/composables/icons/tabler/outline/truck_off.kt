package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.TruckOff: ImageVector
    get() {
        if (_TruckOff != null) return _TruckOff!!
        
        _TruckOff = ImageVector.Builder(
            name = "truck-off",
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
                moveTo(7f, 17f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, 4f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.585f, 15.586f)
                arcToRelative(2f, 2f, 0f, false, false, 2.826f, 2.831f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-11f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(1f)
                moveToRelative(3.96f, 0f)
                horizontalLineToRelative(4.04f)
                verticalLineToRelative(4f)
                moveToRelative(0f, 4f)
                verticalLineToRelative(4f)
                moveToRelative(-4f, 0f)
                horizontalLineToRelative(6f)
                moveToRelative(6f, 0f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-6f)
                moveToRelative(-2f, -5f)
                horizontalLineToRelative(5f)
                lineToRelative(3f, 5f)
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
        
        return _TruckOff!!
    }

private var _TruckOff: ImageVector? = null

