package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.AtOff: ImageVector
    get() {
        if (_AtOff != null) return _AtOff!!
        
        _AtOff = ImageVector.Builder(
            name = "at-off",
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
                moveTo(9.174f, 9.17f)
                arcToRelative(4f, 4f, 0f, false, false, 5.646f, 5.668f)
                moveToRelative(1.18f, -2.838f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, -4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.695f, 15.697f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 1.305f, -2.197f)
                verticalLineToRelative(-1.5f)
                arcToRelative(9f, 9f, 0f, false, false, -13.055f, -8.047f)
                moveToRelative(-2.322f, 1.683f)
                arcToRelative(9f, 9f, 0f, false, false, 9.877f, 14.644f)
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
        
        return _AtOff!!
    }

private var _AtOff: ImageVector? = null

