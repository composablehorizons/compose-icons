package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandCodecov: ImageVector
    get() {
        if (_BrandCodecov != null) return _BrandCodecov!!
        
        _BrandCodecov = ImageVector.Builder(
            name = "brand-codecov",
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
                moveTo(9.695f, 12.985f)
                arcToRelative(5.972f, 5.972f, 0f, false, false, -3.295f, -0.985f)
                curveToRelative(-1.257f, 0f, -2.436f, 0.339f, -3.4f, 1f)
                arcToRelative(9f, 9f, 0f, true, true, 18f, 0f)
                curveToRelative(-0.966f, -0.664f, -2.14f, -1f, -3.4f, -1f)
                arcToRelative(6f, 6f, 0f, false, false, -5.605f, 8.144f)
            }
        }.build()
        
        return _BrandCodecov!!
    }

private var _BrandCodecov: ImageVector? = null

