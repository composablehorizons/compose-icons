package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandSwift: ImageVector
    get() {
        if (_BrandSwift != null) return _BrandSwift!!
        
        _BrandSwift = ImageVector.Builder(
            name = "brand-swift",
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
                moveTo(20.547f, 15.828f)
                curveToRelative(1.33f, -4.126f, -1.384f, -9.521f, -6.047f, -12.828f)
                curveToRelative(-0.135f, -0.096f, 2.39f, 6.704f, 1.308f, 9.124f)
                curveToRelative(-2.153f, -1.454f, -4.756f, -3.494f, -7.808f, -6.124f)
                lineToRelative(-0.5f, 2f)
                lineToRelative(-3.5f, -1f)
                curveToRelative(4.36f, 4.748f, 7.213f, 7.695f, 8.56f, 8.841f)
                curveToRelative(-4.658f, 2.089f, -10.65f, -0.978f, -10.56f, -0.841f)
                curveToRelative(1.016f, 1.545f, 6f, 6f, 11f, 6f)
                curveToRelative(2f, 0f, 3.788f, -0.502f, 4.742f, -1.389f)
                curveToRelative(0.005f, -0.005f, 0.432f, -0.446f, 1.378f, -0.17f)
                curveToRelative(0.504f, 0.148f, 1.463f, 0.667f, 2.88f, 1.559f)
                verticalLineToRelative(-1.507f)
                curveToRelative(0f, -1.377f, -0.515f, -2.67f, -1.453f, -3.665f)
                close()
            }
        }.build()
        
        return _BrandSwift!!
    }

private var _BrandSwift: ImageVector? = null

