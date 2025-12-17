package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.PlayCardStar: ImageVector
    get() {
        if (_PlayCardStar != null) return _PlayCardStar!!
        
        _PlayCardStar = ImageVector.Builder(
            name = "play-card-star",
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
                moveTo(19f, 5f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-10f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-14f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 6f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 18f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.75f, 14.112f)
                lineToRelative(-1.63f, 0.853f)
                arcToRelative(0.294f, 0.294f, 0f, false, true, -0.425f, -0.307f)
                lineToRelative(0.31f, -1.808f)
                lineToRelative(-1.317f, -1.28f)
                arcToRelative(0.292f, 0.292f, 0f, false, true, 0.163f, -0.499f)
                lineToRelative(1.82f, -0.264f)
                lineToRelative(0.815f, -1.644f)
                arcToRelative(0.294f, 0.294f, 0f, false, true, 0.527f, 0f)
                lineToRelative(0.814f, 1.644f)
                lineToRelative(1.82f, 0.264f)
                arcToRelative(0.292f, 0.292f, 0f, false, true, 0.164f, 0.499f)
                lineToRelative(-1.318f, 1.28f)
                lineToRelative(0.31f, 1.807f)
                arcToRelative(0.292f, 0.292f, 0f, false, true, -0.425f, 0.308f)
                close()
            }
        }.build()
        
        return _PlayCardStar!!
    }

private var _PlayCardStar: ImageVector? = null

