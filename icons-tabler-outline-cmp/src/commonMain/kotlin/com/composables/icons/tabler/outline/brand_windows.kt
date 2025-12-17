package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandWindows: ImageVector
    get() {
        if (_BrandWindows != null) return _BrandWindows!!
        
        _BrandWindows = ImageVector.Builder(
            name = "brand-windows",
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
                moveTo(17.8f, 20f)
                lineToRelative(-12f, -1.5f)
                curveToRelative(-1f, -0.1f, -1.8f, -0.9f, -1.8f, -1.9f)
                verticalLineToRelative(-9.2f)
                curveToRelative(0f, -1f, 0.8f, -1.8f, 1.8f, -1.9f)
                lineToRelative(12f, -1.5f)
                curveToRelative(1.2f, -0.1f, 2.2f, 0.8f, 2.2f, 1.9f)
                verticalLineToRelative(12.1f)
                curveToRelative(0f, 1.2f, -1.1f, 2.1f, -2.2f, 1.9f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 5f)
                lineToRelative(0f, 14f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 12f)
                lineToRelative(16f, 0f)
            }
        }.build()
        
        return _BrandWindows!!
    }

private var _BrandWindows: ImageVector? = null

