package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandAmd: ImageVector
    get() {
        if (_BrandAmd != null) return _BrandAmd!!
        
        _BrandAmd = ImageVector.Builder(
            name = "brand-amd",
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
                moveTo(16f, 16f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.566f, -0.434f, -1f, -1f, -1f)
                horizontalLineToRelative(-7f)
                lineToRelative(-5f, -5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.566f, 0f, 1f, 0.434f, 1f, 1f)
                verticalLineToRelative(17f)
                lineToRelative(-5f, -5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.293f, 20.707f)
                lineToRelative(4.707f, -4.707f)
                horizontalLineToRelative(-7f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-7f)
                lineToRelative(-4.707f, 4.707f)
                arcToRelative(1f, 1f, 0f, false, false, -0.293f, 0.707f)
                verticalLineToRelative(6.586f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(6.586f)
                arcToRelative(1f, 1f, 0f, false, false, 0.707f, -0.293f)
                close()
            }
        }.build()
        
        return _BrandAmd!!
    }

private var _BrandAmd: ImageVector? = null

