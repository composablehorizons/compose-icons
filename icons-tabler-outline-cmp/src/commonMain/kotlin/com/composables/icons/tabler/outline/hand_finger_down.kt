package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.HandFingerDown: ImageVector
    get() {
        if (_HandFingerDown != null) return _HandFingerDown!!
        
        _HandFingerDown = ImageVector.Builder(
            name = "hand-finger-down",
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
                moveTo(8f, 12f)
                verticalLineToRelative(8.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 3f, 0f)
                verticalLineToRelative(-7.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 13.5f)
                verticalLineToRelative(2f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 3f, 0f)
                verticalLineToRelative(-2.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 14.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 3f, 0f)
                verticalLineToRelative(-1.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 13.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 3f, 0f)
                verticalLineToRelative(-4.5f)
                arcToRelative(6f, 6f, 0f, false, false, -6f, -6f)
                horizontalLineToRelative(-2f)
                horizontalLineToRelative(0.208f)
                arcToRelative(6f, 6f, 0f, false, false, -5.012f, 2.7f)
                lineToRelative(-0.196f, 0.3f)
                quadToRelative(-0.468f, 0.718f, -3.286f, 5.728f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0.536f, 2.022f)
                curveToRelative(0.734f, 0.44f, 1.674f, 0.325f, 2.28f, -0.28f)
                lineToRelative(1.47f, -1.47f)
            }
        }.build()
        
        return _HandFingerDown!!
    }

private var _HandFingerDown: ImageVector? = null

