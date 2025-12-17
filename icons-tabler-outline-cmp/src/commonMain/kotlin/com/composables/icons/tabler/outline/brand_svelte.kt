package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandSvelte: ImageVector
    get() {
        if (_BrandSvelte != null) return _BrandSvelte!!
        
        _BrandSvelte = ImageVector.Builder(
            name = "brand-svelte",
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
                moveTo(15f, 8f)
                lineToRelative(-5f, 3f)
                lineToRelative(0.821f, -0.495f)
                curveToRelative(1.86f, -1.15f, 4.412f, -0.49f, 5.574f, 1.352f)
                arcToRelative(3.91f, 3.91f, 0f, false, true, -1.264f, 5.42f)
                lineToRelative(-5.053f, 3.126f)
                curveToRelative(-1.86f, 1.151f, -4.312f, 0.591f, -5.474f, -1.251f)
                arcToRelative(3.91f, 3.91f, 0f, false, true, 1.263f, -5.42f)
                lineToRelative(0.26f, -0.16f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 17f)
                lineToRelative(5f, -3f)
                lineToRelative(-0.822f, 0.496f)
                curveToRelative(-1.86f, 1.151f, -4.411f, 0.491f, -5.574f, -1.351f)
                arcToRelative(3.91f, 3.91f, 0f, false, true, 1.264f, -5.42f)
                lineToRelative(5.054f, -3.127f)
                curveToRelative(1.86f, -1.15f, 4.311f, -0.59f, 5.474f, 1.252f)
                arcToRelative(3.91f, 3.91f, 0f, false, true, -1.264f, 5.42f)
                lineToRelative(-0.26f, 0.16f)
            }
        }.build()
        
        return _BrandSvelte!!
    }

private var _BrandSvelte: ImageVector? = null

