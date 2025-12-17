package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandTwitter: ImageVector
    get() {
        if (_BrandTwitter != null) return _BrandTwitter!!
        
        _BrandTwitter = ImageVector.Builder(
            name = "brand-twitter",
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
                moveTo(22f, 4.01f)
                curveToRelative(-1f, 0.49f, -1.98f, 0.689f, -3f, 0.99f)
                curveToRelative(-1.121f, -1.265f, -2.783f, -1.335f, -4.38f, -0.737f)
                reflectiveCurveToRelative(-2.643f, 2.06f, -2.62f, 3.737f)
                verticalLineToRelative(1f)
                curveToRelative(-3.245f, 0.083f, -6.135f, -1.395f, -8f, -4f)
                curveToRelative(0f, 0f, -4.182f, 7.433f, 4f, 11f)
                curveToRelative(-1.872f, 1.247f, -3.739f, 2.088f, -6f, 2f)
                curveToRelative(3.308f, 1.803f, 6.913f, 2.423f, 10.034f, 1.517f)
                curveToRelative(3.58f, -1.04f, 6.522f, -3.723f, 7.651f, -7.742f)
                arcToRelative(13.84f, 13.84f, 0f, false, false, 0.497f, -3.753f)
                curveToRelative(0f, -0.249f, 1.51f, -2.772f, 1.818f, -4.013f)
                close()
            }
        }.build()
        
        return _BrandTwitter!!
    }

private var _BrandTwitter: ImageVector? = null

