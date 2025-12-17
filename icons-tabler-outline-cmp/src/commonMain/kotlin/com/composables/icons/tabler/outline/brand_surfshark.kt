package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandSurfshark: ImageVector
    get() {
        if (_BrandSurfshark != null) return _BrandSurfshark!!
        
        _BrandSurfshark = ImageVector.Builder(
            name = "brand-surfshark",
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
                moveTo(19.954f, 9.447f)
                curveToRelative(-0.237f, -6.217f, 0f, -6.217f, -6f, -6.425f)
                curveToRelative(-5.774f, -0.208f, -6.824f, 1f, -7.91f, 5.382f)
                curveToRelative(-2.884f, 11.816f, -3.845f, 14.716f, 4.792f, 11.198f)
                curveToRelative(9.392f, -3.831f, 9.297f, -5.382f, 9.114f, -10.155f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 16f)
                horizontalLineToRelative(0.452f)
                curveToRelative(1.943f, 0.007f, 3.526f, -1.461f, 3.543f, -3.286f)
                verticalLineToRelative(-2.428f)
                curveToRelative(0.018f, -1.828f, 1.607f, -3.298f, 3.553f, -3.286f)
                horizontalLineToRelative(0.452f)
            }
        }.build()
        
        return _BrandSurfshark!!
    }

private var _BrandSurfshark: ImageVector? = null

