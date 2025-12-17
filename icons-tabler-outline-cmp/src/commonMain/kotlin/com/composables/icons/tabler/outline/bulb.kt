package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Bulb: ImageVector
    get() {
        if (_Bulb != null) return _Bulb!!
        
        _Bulb = ImageVector.Builder(
            name = "bulb",
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
                moveTo(9f, 16f)
                arcToRelative(5f, 5f, 0f, true, true, 6f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -1f, 3f)
                arcToRelative(2f, 2f, 0f, false, true, -4f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -1f, -3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.7f, 17f)
                lineToRelative(4.6f, 0f)
            }
        }.build()
        
        return _Bulb!!
    }

private var _Bulb: ImageVector? = null

