package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Fish: ImageVector
    get() {
        if (_Fish != null) return _Fish!!
        
        _Fish = ImageVector.Builder(
            name = "fish",
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
                moveTo(16.69f, 7.44f)
                arcToRelative(6.973f, 6.973f, 0f, false, false, -1.69f, 4.56f)
                curveToRelative(0f, 1.747f, 0.64f, 3.345f, 1.699f, 4.571f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 9.504f)
                curveToRelative(7.715f, 8.647f, 14.75f, 10.265f, 20f, 2.498f)
                curveToRelative(-5.25f, -7.761f, -12.285f, -6.142f, -20f, 2.504f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 11f)
                verticalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.5f, 10.5f)
                curveToRelative(-0.667f, 1f, -0.667f, 2f, 0f, 3f)
            }
        }.build()
        
        return _Fish!!
    }

private var _Fish: ImageVector? = null

