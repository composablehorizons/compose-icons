package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandFirefox: ImageVector
    get() {
        if (_BrandFirefox != null) return _BrandFirefox!!
        
        _BrandFirefox = ImageVector.Builder(
            name = "brand-firefox",
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
                moveTo(4.028f, 7.82f)
                arcToRelative(9f, 9f, 0f, true, false, 12.823f, -3.4f)
                curveToRelative(-1.636f, -1.02f, -3.064f, -1.02f, -4.851f, -1.02f)
                horizontalLineToRelative(-1.647f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.914f, 9.485f)
                curveToRelative(-1.756f, -1.569f, -0.805f, -5.38f, 0.109f, -6.17f)
                curveToRelative(0.086f, 0.896f, 0.585f, 1.208f, 1.111f, 1.685f)
                curveToRelative(0.88f, -0.275f, 1.313f, -0.282f, 1.867f, 0f)
                curveToRelative(0.82f, -0.91f, 1.694f, -2.354f, 2.628f, -2.093f)
                curveToRelative(-1.082f, 1.741f, -0.07f, 3.733f, 1.371f, 4.173f)
                curveToRelative(-0.17f, 0.975f, -1.484f, 1.913f, -2.76f, 2.686f)
                curveToRelative(-1.296f, 0.938f, -0.722f, 1.85f, 0f, 2.234f)
                curveToRelative(0.949f, 0.506f, 3.611f, -1f, 4.545f, 0.354f)
                curveToRelative(-1.698f, 0.102f, -1.536f, 3.107f, -3.983f, 2.727f)
                curveToRelative(2.523f, 0.957f, 4.345f, 0.462f, 5.458f, -0.34f)
                curveToRelative(1.965f, -1.52f, 2.879f, -3.542f, 2.879f, -5.557f)
                curveToRelative(-0.014f, -1.398f, 0.194f, -2.695f, -1.26f, -4.75f)
            }
        }.build()
        
        return _BrandFirefox!!
    }

private var _BrandFirefox: ImageVector? = null

