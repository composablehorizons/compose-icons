package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandEvernote: ImageVector
    get() {
        if (_BrandEvernote != null) return _BrandEvernote!!
        
        _BrandEvernote = ImageVector.Builder(
            name = "brand-evernote",
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
                moveTo(4f, 8f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.9f, 19f)
                curveToRelative(0.6f, -2.5f, 1.1f, -5.471f, 1.1f, -9f)
                curveToRelative(0f, -4.5f, -2f, -5f, -3f, -5f)
                curveToRelative(-1.906f, 0f, -3f, -0.5f, -3.5f, -1f)
                curveToRelative(-0.354f, -0.354f, -0.5f, -1f, -1.5f, -1f)
                horizontalLineToRelative(-2f)
                lineToRelative(-5f, 5f)
                curveToRelative(0f, 6f, 2.5f, 8f, 5f, 8f)
                curveToRelative(1f, 0f, 1.5f, -0.5f, 2f, -1.5f)
                reflectiveCurveToRelative(1.414f, -0.326f, 2.5f, 0f)
                curveToRelative(1.044f, 0.313f, 2.01f, 0.255f, 2.5f, 0.5f)
                curveToRelative(1f, 0.5f, 2f, 1.5f, 2f, 3f)
                curveToRelative(0f, 0.5f, 0f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -3f, -1f, -3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 10f)
                horizontalLineToRelative(1f)
            }
        }.build()
        
        return _BrandEvernote!!
    }

private var _BrandEvernote: ImageVector? = null

