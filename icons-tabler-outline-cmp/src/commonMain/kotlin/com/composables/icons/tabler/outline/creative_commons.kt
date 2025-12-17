package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CreativeCommons: ImageVector
    get() {
        if (_CreativeCommons != null) return _CreativeCommons!!
        
        _CreativeCommons = ImageVector.Builder(
            name = "creative-commons",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                moveToRelative(-9f, 0f)
                arcToRelative(9f, 9f, 0f, true, false, 18f, 0f)
                arcToRelative(9f, 9f, 0f, true, false, -18f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 10.5f)
                curveToRelative(-0.847f, -0.71f, -2.132f, -0.658f, -2.914f, 0.116f)
                arcToRelative(1.928f, 1.928f, 0f, false, false, 0f, 2.768f)
                curveToRelative(0.782f, 0.774f, 2.067f, 0.825f, 2.914f, 0.116f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 10.5f)
                curveToRelative(-0.847f, -0.71f, -2.132f, -0.658f, -2.914f, 0.116f)
                arcToRelative(1.928f, 1.928f, 0f, false, false, 0f, 2.768f)
                curveToRelative(0.782f, 0.774f, 2.067f, 0.825f, 2.914f, 0.116f)
            }
        }.build()
        
        return _CreativeCommons!!
    }

private var _CreativeCommons: ImageVector? = null

