package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Funnel: ImageVector
    get() {
        if (_Funnel != null) return _Funnel!!
        
        _Funnel = ImageVector.Builder(
            name = "funnel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.628f, 1.601f)
                curveTo(5.028f, 1.206f, 7.49f, 1f, 10f, 1f)
                reflectiveCurveToRelative(4.973f, 0.206f, 7.372f, 0.601f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.628f, 0.74f)
                verticalLineToRelative(2.288f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -0.659f, 1.59f)
                lineToRelative(-4.682f, 4.683f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -0.659f, 1.59f)
                verticalLineToRelative(3.037f)
                curveToRelative(0f, 0.684f, -0.31f, 1.33f, -0.844f, 1.757f)
                lineToRelative(-1.937f, 1.55f)
                arcTo(0.75f, 0.75f, 0f, false, true, 8f, 18.25f)
                verticalLineToRelative(-5.757f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -0.659f, -1.591f)
                lineTo(2.659f, 6.22f)
                arcTo(2.25f, 2.25f, 0f, false, true, 2f, 4.629f)
                verticalLineTo(2.34f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.628f, -0.74f)
                close()
            }
        }.build()
        
        return _Funnel!!
    }

private var _Funnel: ImageVector? = null

