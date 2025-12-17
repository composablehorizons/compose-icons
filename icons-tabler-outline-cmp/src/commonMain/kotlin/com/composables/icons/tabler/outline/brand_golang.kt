package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandGolang: ImageVector
    get() {
        if (_BrandGolang != null) return _BrandGolang!!
        
        _BrandGolang = ImageVector.Builder(
            name = "brand-golang",
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
                moveTo(15.695f, 14.305f)
                curveToRelative(1.061f, 1.06f, 2.953f, 0.888f, 4.226f, -0.384f)
                curveToRelative(1.272f, -1.273f, 1.444f, -3.165f, 0.384f, -4.226f)
                curveToRelative(-1.061f, -1.06f, -2.953f, -0.888f, -4.226f, 0.384f)
                curveToRelative(-1.272f, 1.273f, -1.444f, 3.165f, -0.384f, 4.226f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.68f, 9.233f)
                curveToRelative(-1.084f, -0.497f, -2.545f, -0.191f, -3.591f, 0.846f)
                curveToRelative(-1.284f, 1.273f, -1.457f, 3.165f, -0.388f, 4.226f)
                curveToRelative(1.07f, 1.06f, 2.978f, 0.888f, 4.261f, -0.384f)
                arcToRelative(3.669f, 3.669f, 0f, false, false, 1.038f, -1.921f)
                horizontalLineToRelative(-2.427f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.5f, 15f)
                horizontalLineToRelative(-1.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 9f)
                horizontalLineToRelative(-2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 12f)
                horizontalLineToRelative(-3f)
            }
        }.build()
        
        return _BrandGolang!!
    }

private var _BrandGolang: ImageVector? = null

