package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.RefreshOff: ImageVector
    get() {
        if (_RefreshOff != null) return _RefreshOff!!
        
        _RefreshOff = ImageVector.Builder(
            name = "refresh-off",
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
                moveTo(20f, 11f)
                arcToRelative(8.1f, 8.1f, 0f, false, false, -11.271f, -6.305f)
                moveToRelative(-2.41f, 1.624f)
                arcToRelative(8.083f, 8.083f, 0f, false, false, -1.819f, 2.681f)
                moveToRelative(-0.5f, -4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 13f)
                arcToRelative(8.1f, 8.1f, 0f, false, false, 13.671f, 4.691f)
                moveToRelative(2.329f, -1.691f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
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
        
        return _RefreshOff!!
    }

private var _RefreshOff: ImageVector? = null

