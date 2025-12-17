package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandBebo: ImageVector
    get() {
        if (_BrandBebo != null) return _BrandBebo!!
        
        _BrandBebo = ImageVector.Builder(
            name = "brand-bebo",
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
                moveTo(12f, 17.5f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 3.5f, -3.5f)
                curveToRelative(0f, -1.838f, -1.159f, -3.002f, -3.005f, -3.372f)
                curveToRelative(-0.746f, -0.15f, -1.37f, -0.745f, -1.37f, -1.506f)
                curveToRelative(0f, -1.142f, 0.934f, -2.095f, 2.058f, -1.894f)
                curveToRelative(3.61f, 0.645f, 5.817f, 3.058f, 5.817f, 6.772f)
                arcToRelative(7f, 7f, 0f, true, true, -14f, 0f)
                verticalLineToRelative(-9.25f)
                arcToRelative(1.75f, 1.75f, 0f, true, true, 3.5f, 0f)
                verticalLineToRelative(9.25f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 3.5f, 3.5f)
            }
        }.build()
        
        return _BrandBebo!!
    }

private var _BrandBebo: ImageVector? = null

