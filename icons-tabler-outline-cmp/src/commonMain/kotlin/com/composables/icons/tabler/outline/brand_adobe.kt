package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandAdobe: ImageVector
    get() {
        if (_BrandAdobe != null) return _BrandAdobe!!
        
        _BrandAdobe = ImageVector.Builder(
            name = "brand-adobe",
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
                moveTo(12.893f, 4.514f)
                lineToRelative(7.977f, 14f)
                arcToRelative(0.993f, 0.993f, 0f, false, true, -0.394f, 1.365f)
                arcToRelative(1.04f, 1.04f, 0f, false, true, -0.5f, 0.127f)
                horizontalLineToRelative(-3.476f)
                lineToRelative(-4.5f, -8f)
                lineToRelative(-2.5f, 4f)
                horizontalLineToRelative(1.5f)
                lineToRelative(2f, 4f)
                horizontalLineToRelative(-8.977f)
                curveToRelative(-0.565f, 0f, -1.023f, -0.45f, -1.023f, -1f)
                curveToRelative(0f, -0.171f, 0.045f, -0.34f, 0.13f, -0.49f)
                lineToRelative(7.977f, -13.993f)
                arcToRelative(1.034f, 1.034f, 0f, false, true, 1.786f, 0f)
                close()
            }
        }.build()
        
        return _BrandAdobe!!
    }

private var _BrandAdobe: ImageVector? = null

