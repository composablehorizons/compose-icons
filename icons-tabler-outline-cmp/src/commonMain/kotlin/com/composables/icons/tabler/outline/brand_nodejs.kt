package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandNodejs: ImageVector
    get() {
        if (_BrandNodejs != null) return _BrandNodejs!!
        
        _BrandNodejs = ImageVector.Builder(
            name = "brand-nodejs",
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
                moveTo(9f, 9f)
                verticalLineToRelative(8.044f)
                arcToRelative(2f, 2f, 0f, false, true, -2.996f, 1.734f)
                lineToRelative(-1.568f, -0.9f)
                arcToRelative(3f, 3f, 0f, false, true, -1.436f, -2.561f)
                verticalLineToRelative(-6.635f)
                arcToRelative(3f, 3f, 0f, false, true, 1.436f, -2.56f)
                lineToRelative(6f, -3.667f)
                arcToRelative(3f, 3f, 0f, false, true, 3.128f, 0f)
                lineToRelative(6f, 3.667f)
                arcToRelative(3f, 3f, 0f, false, true, 1.436f, 2.561f)
                verticalLineToRelative(6.634f)
                arcToRelative(3f, 3f, 0f, false, true, -1.436f, 2.56f)
                lineToRelative(-6f, 3.667f)
                arcToRelative(3f, 3f, 0f, false, true, -3.128f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 9f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 3f)
                horizontalLineToRelative(2f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 3f)
                horizontalLineToRelative(-3.5f)
            }
        }.build()
        
        return _BrandNodejs!!
    }

private var _BrandNodejs: ImageVector? = null

