package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandAlgolia: ImageVector
    get() {
        if (_BrandAlgolia != null) return _BrandAlgolia!!
        
        _BrandAlgolia = ImageVector.Builder(
            name = "brand-algolia",
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
                moveTo(15.5f, 11f)
                curveToRelative(-0.414f, -1.477f, -1.886f, -2.5f, -3.5f, -2.5f)
                arcToRelative(3.47f, 3.47f, 0f, false, false, -3.5f, 3.5f)
                arcToRelative(3.47f, 3.47f, 0f, false, false, 3.5f, 3.5f)
                curveToRelative(0.974f, 0f, 1.861f, -0.357f, 2.5f, -1f)
                lineToRelative(4.5f, 4.5f)
                verticalLineToRelative(-15f)
                horizontalLineToRelative(-7f)
                curveToRelative(-4.386f, 0f, -8f, 3.582f, -8f, 8f)
                reflectiveCurveToRelative(3.614f, 8f, 8f, 8f)
                arcToRelative(7.577f, 7.577f, 0f, false, false, 2.998f, -0.614f)
            }
        }.build()
        
        return _BrandAlgolia!!
    }

private var _BrandAlgolia: ImageVector? = null

