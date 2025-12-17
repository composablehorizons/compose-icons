package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Medal2: ImageVector
    get() {
        if (_Medal2 != null) return _Medal2!!
        
        _Medal2 = ImageVector.Builder(
            name = "medal-2",
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
                moveTo(9f, 3f)
                horizontalLineToRelative(6f)
                lineToRelative(3f, 7f)
                lineToRelative(-6f, 2f)
                lineToRelative(-6f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                lineToRelative(-3f, -9f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 11f)
                lineToRelative(-3f, -8f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 19.5f)
                lineToRelative(-3f, 1.5f)
                lineToRelative(0.5f, -3.5f)
                lineToRelative(-2f, -2f)
                lineToRelative(3f, -0.5f)
                lineToRelative(1.5f, -3f)
                lineToRelative(1.5f, 3f)
                lineToRelative(3f, 0.5f)
                lineToRelative(-2f, 2f)
                lineToRelative(0.5f, 3.5f)
                close()
            }
        }.build()
        
        return _Medal2!!
    }

private var _Medal2: ImageVector? = null

