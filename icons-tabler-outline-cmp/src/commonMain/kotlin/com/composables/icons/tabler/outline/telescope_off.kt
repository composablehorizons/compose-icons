package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.TelescopeOff: ImageVector
    get() {
        if (_TelescopeOff != null) return _TelescopeOff!!
        
        _TelescopeOff = ImageVector.Builder(
            name = "telescope-off",
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
                moveTo(6f, 21f)
                lineToRelative(6f, -5f)
                lineToRelative(6f, 5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 13f)
                verticalLineToRelative(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.238f, 8.264f)
                lineToRelative(-4.183f, 2.51f)
                curveToRelative(-1.02f, 0.614f, -1.357f, 1.898f, -0.76f, 2.906f)
                lineToRelative(0.165f, 0.28f)
                curveToRelative(0.52f, 0.88f, 1.624f, 1.266f, 2.605f, 0.91f)
                lineToRelative(6.457f, -2.34f)
                moveToRelative(2.907f, -1.055f)
                lineToRelative(4.878f, -1.77f)
                arcToRelative(1.023f, 1.023f, 0f, false, false, 0.565f, -1.455f)
                lineToRelative(-2.62f, -4.705f)
                arcToRelative(1.087f, 1.087f, 0f, false, false, -1.447f, -0.42f)
                lineToRelative(-0.056f, 0.032f)
                lineToRelative(-6.016f, 3.61f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 5f)
                lineToRelative(3f, 5.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _TelescopeOff!!
    }

private var _TelescopeOff: ImageVector? = null

