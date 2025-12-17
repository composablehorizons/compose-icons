package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandWeibo: ImageVector
    get() {
        if (_BrandWeibo != null) return _BrandWeibo!!
        
        _BrandWeibo = ImageVector.Builder(
            name = "brand-weibo",
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
                moveTo(19f, 14.127f)
                curveToRelative(0f, 3.073f, -3.502f, 5.873f, -8f, 5.873f)
                curveToRelative(-4.126f, 0f, -8f, -2.224f, -8f, -5.565f)
                curveToRelative(0f, -1.78f, 0.984f, -3.737f, 2.7f, -5.567f)
                curveToRelative(2.362f, -2.51f, 5.193f, -3.687f, 6.551f, -2.238f)
                curveToRelative(0.415f, 0.44f, 0.752f, 1.39f, 0.749f, 2.062f)
                curveToRelative(2f, -1.615f, 4.308f, 0.387f, 3.5f, 2.693f)
                curveToRelative(1.26f, 0.557f, 2.5f, 0.538f, 2.5f, 2.742f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 4f)
                horizontalLineToRelative(1f)
                arcToRelative(5f, 5f, 0f, false, true, 5f, 5f)
                verticalLineToRelative(1f)
            }
        }.build()
        
        return _BrandWeibo!!
    }

private var _BrandWeibo: ImageVector? = null

