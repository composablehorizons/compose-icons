package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandZoom: ImageVector
    get() {
        if (_BrandZoom != null) return _BrandZoom!!
        
        _BrandZoom = ImageVector.Builder(
            name = "brand-zoom",
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
                moveTo(17.011f, 9.385f)
                verticalLineToRelative(5.128f)
                lineToRelative(3.989f, 3.487f)
                verticalLineToRelative(-12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.887f, 6f)
                horizontalLineToRelative(10.08f)
                curveToRelative(1.468f, 0f, 3.033f, 1.203f, 3.033f, 2.803f)
                verticalLineToRelative(8.196f)
                arcToRelative(0.991f, 0.991f, 0f, false, true, -0.975f, 1f)
                horizontalLineToRelative(-10.373f)
                curveToRelative(-1.667f, 0f, -2.652f, -1.5f, -2.652f, -3f)
                lineToRelative(0.01f, -8f)
                arcToRelative(0.882f, 0.882f, 0f, false, true, 0.208f, -0.71f)
                arcToRelative(0.841f, 0.841f, 0f, false, true, 0.67f, -0.287f)
                close()
            }
        }.build()
        
        return _BrandZoom!!
    }

private var _BrandZoom: ImageVector? = null

