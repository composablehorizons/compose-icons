package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandFlipboard: ImageVector
    get() {
        if (_BrandFlipboard != null) return _BrandFlipboard!!
        
        _BrandFlipboard = ImageVector.Builder(
            name = "brand-flipboard",
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
                moveTo(3.973f, 3f)
                horizontalLineToRelative(16.054f)
                curveToRelative(0.537f, 0f, 0.973f, 0.436f, 0.973f, 0.973f)
                verticalLineToRelative(4.052f)
                arcToRelative(0.973f, 0.973f, 0f, false, true, -0.973f, 0.973f)
                horizontalLineToRelative(-5.025f)
                verticalLineToRelative(4.831f)
                curveToRelative(0f, 0.648f, -0.525f, 1.173f, -1.173f, 1.173f)
                horizontalLineToRelative(-4.829f)
                verticalLineToRelative(5.025f)
                arcToRelative(0.973f, 0.973f, 0f, false, true, -0.974f, 0.973f)
                horizontalLineToRelative(-4.053f)
                arcToRelative(0.973f, 0.973f, 0f, false, true, -0.973f, -0.973f)
                verticalLineToRelative(-16.054f)
                curveToRelative(0f, -0.537f, 0.436f, -0.973f, 0.973f, -0.973f)
                close()
            }
        }.build()
        
        return _BrandFlipboard!!
    }

private var _BrandFlipboard: ImageVector? = null

