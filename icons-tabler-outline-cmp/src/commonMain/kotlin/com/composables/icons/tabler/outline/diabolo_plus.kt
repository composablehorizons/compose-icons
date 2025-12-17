package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.DiaboloPlus: ImageVector
    get() {
        if (_DiaboloPlus != null) return _DiaboloPlus!!
        
        _DiaboloPlus = ImageVector.Builder(
            name = "diabolo-plus",
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
                moveTo(12f, 6f)
                moveToRelative(-8f, 0f)
                arcToRelative(8f, 3f, 0f, true, false, 16f, 0f)
                arcToRelative(8f, 3f, 0f, true, false, -16f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 6f)
                verticalLineToRelative(0.143f)
                arcToRelative(1f, 1f, 0f, false, false, 0.048f, 0.307f)
                lineToRelative(1.952f, 5.55f)
                lineToRelative(-1.964f, 5.67f)
                arcToRelative(1f, 1f, 0f, false, false, -0.036f, 0.265f)
                verticalLineToRelative(0.065f)
                curveToRelative(0f, 1.657f, 3.582f, 3f, 8f, 3f)
                curveToRelative(0.17f, 0f, 0.34f, -0.002f, 0.508f, -0.006f)
                moveToRelative(5.492f, -8.994f)
                lineToRelative(1.952f, -5.55f)
                arcToRelative(1f, 1f, 0f, false, false, 0.048f, -0.307f)
                verticalLineToRelative(-0.143f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12f)
                curveToRelative(0f, 1.105f, 2.686f, 2f, 6f, 2f)
                reflectiveCurveToRelative(6f, -0.895f, 6f, -2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 19f)
                horizontalLineToRelative(6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 16f)
                verticalLineToRelative(6f)
            }
        }.build()
        
        return _DiaboloPlus!!
    }

private var _DiaboloPlus: ImageVector? = null

