package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandGithub: ImageVector
    get() {
        if (_BrandGithub != null) return _BrandGithub!!
        
        _BrandGithub = ImageVector.Builder(
            name = "brand-github",
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
                moveTo(9f, 19f)
                curveToRelative(-4.3f, 1.4f, -4.3f, -2.5f, -6f, -3f)
                moveToRelative(12f, 5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1f, 0.1f, -1.4f, -0.5f, -2f)
                curveToRelative(2.8f, -0.3f, 5.5f, -1.4f, 5.5f, -6f)
                arcToRelative(4.6f, 4.6f, 0f, false, false, -1.3f, -3.2f)
                arcToRelative(4.2f, 4.2f, 0f, false, false, -0.1f, -3.2f)
                reflectiveCurveToRelative(-1.1f, -0.3f, -3.5f, 1.3f)
                arcToRelative(12.3f, 12.3f, 0f, false, false, -6.2f, 0f)
                curveToRelative(-2.4f, -1.6f, -3.5f, -1.3f, -3.5f, -1.3f)
                arcToRelative(4.2f, 4.2f, 0f, false, false, -0.1f, 3.2f)
                arcToRelative(4.6f, 4.6f, 0f, false, false, -1.3f, 3.2f)
                curveToRelative(0f, 4.6f, 2.7f, 5.7f, 5.5f, 6f)
                curveToRelative(-0.6f, 0.6f, -0.6f, 1.2f, -0.5f, 2f)
                verticalLineToRelative(3.5f)
            }
        }.build()
        
        return _BrandGithub!!
    }

private var _BrandGithub: ImageVector? = null

