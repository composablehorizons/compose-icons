package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandSnapseed: ImageVector
    get() {
        if (_BrandSnapseed != null) return _BrandSnapseed!!
        
        _BrandSnapseed = ImageVector.Builder(
            name = "brand-snapseed",
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
                moveTo(8.152f, 3.115f)
                arcToRelative(0.46f, 0.46f, 0f, false, false, -0.609f, 0f)
                curveToRelative(-2.943f, 2.58f, -4.529f, 5.441f, -4.543f, 8.378f)
                curveToRelative(0f, 2.928f, 1.586f, 5.803f, 4.543f, 8.392f)
                arcToRelative(0.46f, 0.46f, 0f, false, false, 0.61f, 0f)
                curveToRelative(2.957f, -2.589f, 4.547f, -5.464f, 4.547f, -8.392f)
                curveToRelative(0f, -2.928f, -1.6f, -5.799f, -4.548f, -8.378f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 20f)
                lineToRelative(12.09f, -0.011f)
                curveToRelative(0.503f, 0f, 0.91f, -0.434f, 0.91f, -0.969f)
                verticalLineToRelative(-6.063f)
                curveToRelative(0f, -0.535f, -0.407f, -0.968f, -0.91f, -0.968f)
                horizontalLineToRelative(-7.382f)
            }
        }.build()
        
        return _BrandSnapseed!!
    }

private var _BrandSnapseed: ImageVector? = null

