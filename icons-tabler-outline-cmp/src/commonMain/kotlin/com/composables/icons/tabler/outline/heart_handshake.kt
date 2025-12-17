package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.HeartHandshake: ImageVector
    get() {
        if (_HeartHandshake != null) return _HeartHandshake!!
        
        _HeartHandshake = ImageVector.Builder(
            name = "heart-handshake",
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
                moveTo(19.5f, 12.572f)
                lineToRelative(-7.5f, 7.428f)
                lineToRelative(-7.5f, -7.428f)
                arcToRelative(5f, 5f, 0f, true, true, 7.5f, -6.566f)
                arcToRelative(5f, 5f, 0f, true, true, 7.5f, 6.572f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 6f)
                lineToRelative(-3.293f, 3.293f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.414f)
                lineToRelative(0.543f, 0.543f)
                curveToRelative(0.69f, 0.69f, 1.81f, 0.69f, 2.5f, 0f)
                lineToRelative(1f, -1f)
                arcToRelative(3.182f, 3.182f, 0f, false, true, 4.5f, 0f)
                lineToRelative(2.25f, 2.25f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.5f, 15.5f)
                lineToRelative(2f, 2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 13f)
                lineToRelative(2f, 2f)
            }
        }.build()
        
        return _HeartHandshake!!
    }

private var _HeartHandshake: ImageVector? = null

