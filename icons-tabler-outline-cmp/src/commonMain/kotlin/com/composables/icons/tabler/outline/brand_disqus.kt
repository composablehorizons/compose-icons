package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandDisqus: ImageVector
    get() {
        if (_BrandDisqus != null) return _BrandDisqus!!
        
        _BrandDisqus = ImageVector.Builder(
            name = "brand-disqus",
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
                moveTo(11.847f, 21f)
                curveToRelative(-2.259f, 0f, -4.323f, -0.667f, -5.919f, -2f)
                horizontalLineToRelative(-3.928f)
                lineToRelative(1.708f, -3.266f)
                curveToRelative(-0.545f, -1.174f, -0.759f, -2.446f, -0.758f, -3.734f)
                curveToRelative(0f, -4.97f, 3.84f, -9f, 8.898f, -9f)
                curveToRelative(5.052f, 0f, 9.152f, 4.03f, 9.152f, 9f)
                curveToRelative(0f, 4.972f, -4.098f, 9f, -9.153f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.485f, 15f)
                horizontalLineToRelative(-1.485f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1.485f)
                curveToRelative(2.112f, 0f, 3.515f, 0.823f, 3.515f, 2.981f)
                verticalLineToRelative(0.035f)
                curveToRelative(0f, 2.18f, -1.403f, 2.984f, -3.515f, 2.984f)
                close()
            }
        }.build()
        
        return _BrandDisqus!!
    }

private var _BrandDisqus: ImageVector? = null

