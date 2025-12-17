package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.RectangleStack: ImageVector
    get() {
        if (_RectangleStack != null) return _RectangleStack!!
        
        _RectangleStack = ImageVector.Builder(
            name = "rectangle-stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.127f, 3.502f)
                lineTo(5.25f, 3.5f)
                horizontalLineToRelative(9.5f)
                curveToRelative(0.041f, 0f, 0.082f, 0f, 0.123f, 0.002f)
                arcTo(2.251f, 2.251f, 0f, false, false, 12.75f, 2f)
                horizontalLineToRelative(-5.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.123f, 1.502f)
                close()
                moveTo(1f, 10.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 3.25f, 8f)
                horizontalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 19f, 10.25f)
                verticalLineToRelative(5.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 16.75f, 18f)
                horizontalLineTo(3.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 1f, 15.75f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(3.25f, 6.5f)
                curveToRelative(-0.04f, 0f, -0.082f, 0f, -0.123f, 0.002f)
                arcTo(2.25f, 2.25f, 0f, false, true, 5.25f, 5f)
                horizontalLineToRelative(9.5f)
                curveToRelative(0.98f, 0f, 1.814f, 0.627f, 2.123f, 1.502f)
                arcToRelative(3.819f, 3.819f, 0f, false, false, -0.123f, -0.002f)
                horizontalLineTo(3.25f)
                close()
            }
        }.build()
        
        return _RectangleStack!!
    }

private var _RectangleStack: ImageVector? = null

