package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandCloudflare: ImageVector
    get() {
        if (_BrandCloudflare != null) return _BrandCloudflare!!
        
        _BrandCloudflare = ImageVector.Builder(
            name = "brand-cloudflare",
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
                moveTo(13.031f, 7.007f)
                curveToRelative(2.469f, -0.007f, 3.295f, 1.293f, 3.969f, 2.993f)
                curveToRelative(4f, 0f, 4.994f, 3.825f, 5f, 6f)
                horizontalLineToRelative(-20f)
                curveToRelative(-0.001f, -1.64f, 1.36f, -2.954f, 3f, -3f)
                curveToRelative(0f, -1.5f, 1f, -3f, 3f, -3f)
                curveToRelative(0.66f, -1.942f, 2.562f, -2.986f, 5.031f, -2.993f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 13f)
                horizontalLineToRelative(6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 10f)
                lineToRelative(-2.5f, 6f)
            }
        }.build()
        
        return _BrandCloudflare!!
    }

private var _BrandCloudflare: ImageVector? = null

