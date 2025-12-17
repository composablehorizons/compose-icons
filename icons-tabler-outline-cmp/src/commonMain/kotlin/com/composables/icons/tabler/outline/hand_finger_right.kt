package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.HandFingerRight: ImageVector
    get() {
        if (_HandFingerRight != null) return _HandFingerRight!!
        
        _HandFingerRight = ImageVector.Builder(
            name = "hand-finger-right",
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
                moveTo(12f, 8f)
                horizontalLineToRelative(8.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 3f)
                horizontalLineToRelative(-7.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.5f, 11f)
                horizontalLineToRelative(2f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 3f)
                horizontalLineToRelative(-2.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 14f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 3f)
                horizontalLineToRelative(-1.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.5f, 17f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 0f, 3f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, -6f)
                verticalLineToRelative(-2f)
                verticalLineToRelative(0.208f)
                arcToRelative(6f, 6f, 0f, false, true, 2.7f, -5.012f)
                lineToRelative(0.3f, -0.196f)
                quadToRelative(0.718f, -0.468f, 5.728f, -3.286f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 2.022f, 0.536f)
                curveToRelative(0.44f, 0.734f, 0.325f, 1.674f, -0.28f, 2.28f)
                lineToRelative(-1.47f, 1.47f)
            }
        }.build()
        
        return _HandFingerRight!!
    }

private var _HandFingerRight: ImageVector? = null

