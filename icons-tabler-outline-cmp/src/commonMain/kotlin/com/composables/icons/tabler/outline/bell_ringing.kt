package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BellRinging: ImageVector
    get() {
        if (_BellRinging != null) return _BellRinging!!
        
        _BellRinging = ImageVector.Builder(
            name = "bell-ringing",
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
                moveTo(10f, 5f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                arcToRelative(7f, 7f, 0f, false, true, 4f, 6f)
                verticalLineToRelative(3f)
                arcToRelative(4f, 4f, 0f, false, false, 2f, 3f)
                horizontalLineToRelative(-16f)
                arcToRelative(4f, 4f, 0f, false, false, 2f, -3f)
                verticalLineToRelative(-3f)
                arcToRelative(7f, 7f, 0f, false, true, 4f, -6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 17f)
                verticalLineToRelative(1f)
                arcToRelative(3f, 3f, 0f, false, false, 6f, 0f)
                verticalLineToRelative(-1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 6.727f)
                arcToRelative(11.05f, 11.05f, 0f, false, false, -2.794f, -3.727f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 6.727f)
                arcToRelative(11.05f, 11.05f, 0f, false, true, 2.792f, -3.727f)
            }
        }.build()
        
        return _BellRinging!!
    }

private var _BellRinging: ImageVector? = null

