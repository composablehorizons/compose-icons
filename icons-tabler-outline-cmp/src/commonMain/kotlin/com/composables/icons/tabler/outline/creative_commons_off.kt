package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CreativeCommonsOff: ImageVector
    get() {
        if (_CreativeCommonsOff != null) return _CreativeCommonsOff!!
        
        _CreativeCommonsOff = ImageVector.Builder(
            name = "creative-commons-off",
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
                moveTo(5.638f, 5.634f)
                arcToRelative(9f, 9f, 0f, true, false, 12.723f, 12.733f)
                moveToRelative(1.686f, -2.332f)
                arcToRelative(9f, 9f, 0f, false, false, -12.093f, -12.077f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 10.5f)
                arcToRelative(2.187f, 2.187f, 0f, false, false, -2.914f, 0.116f)
                arcToRelative(1.928f, 1.928f, 0f, false, false, 0f, 2.768f)
                arcToRelative(2.188f, 2.188f, 0f, false, false, 2.914f, 0.116f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 10.5f)
                arcToRelative(2.194f, 2.194f, 0f, false, false, -2.309f, -0.302f)
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
        
        return _CreativeCommonsOff!!
    }

private var _CreativeCommonsOff: ImageVector? = null

