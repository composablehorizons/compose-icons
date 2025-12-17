package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandAstro: ImageVector
    get() {
        if (_BrandAstro != null) return _BrandAstro!!
        
        _BrandAstro = ImageVector.Builder(
            name = "brand-astro",
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
                moveTo(14.972f, 3.483f)
                curveToRelative(0.163f, 0.196f, 0.247f, 0.46f, 0.413f, 0.987f)
                lineToRelative(3.64f, 11.53f)
                arcToRelative(15.5f, 15.5f, 0f, false, false, -4.352f, -1.42f)
                lineToRelative(-2.37f, -7.723f)
                arcToRelative(0.31f, 0.31f, 0f, false, false, -0.296f, -0.213f)
                arcToRelative(0.31f, 0.31f, 0f, false, false, -0.295f, 0.214f)
                lineToRelative(-2.342f, 7.718f)
                arcToRelative(15.5f, 15.5f, 0f, false, false, -4.37f, 1.422f)
                lineToRelative(3.657f, -11.53f)
                curveToRelative(0.168f, -0.527f, 0.251f, -0.79f, 0.415f, -0.986f)
                curveToRelative(0.144f, -0.172f, 0.331f, -0.306f, 0.544f, -0.388f)
                curveToRelative(0.242f, -0.094f, 0.527f, -0.094f, 1.099f, -0.094f)
                horizontalLineToRelative(2.612f)
                curveToRelative(0.572f, 0f, 0.858f, 0f, 1.1f, 0.094f)
                curveToRelative(0.213f, 0.082f, 0.4f, 0.217f, 0.545f, 0.39f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 18f)
                curveToRelative(0f, 1.5f, 2f, 3f, 3f, 4f)
                curveToRelative(1f, -1f, 3f, -3f, 3f, -4f)
                quadToRelative(-3f, 1.5f, -6f, 0f)
            }
        }.build()
        
        return _BrandAstro!!
    }

private var _BrandAstro: ImageVector? = null

