package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Bootstrap: ImageVector
    get() {
        if (_Bootstrap != null) return _Bootstrap!!
        
        _Bootstrap = ImageVector.Builder(
            name = "bootstrap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(333.5f, 201.4f)
                curveToRelative(0f, -22.1f, -15.6f, -34.3f, -43f, -34.3f)
                horizontalLineToRelative(-50.4f)
                verticalLineToRelative(71.2f)
                horizontalLineToRelative(42.5f)
                curveTo(315.4f, 238.2f, 333.5f, 225f, 333.5f, 201.4f)
                close()
                moveTo(517f, 188.6f)
                curveToRelative(-9.5f, -30.9f, -10.9f, -68.8f, -9.8f, -98.1f)
                curveToRelative(1.1f, -30.5f, -22.7f, -58.5f, -54.7f, -58.5f)
                horizontalLineTo(123.7f)
                curveToRelative(-32.1f, 0f, -55.8f, 28.1f, -54.7f, 58.5f)
                curveToRelative(1f, 29.3f, -0.3f, 67.2f, -9.8f, 98.1f)
                curveToRelative(-9.6f, 31f, -25.7f, 50.6f, -52.2f, 53.1f)
                verticalLineToRelative(28.5f)
                curveToRelative(26.4f, 2.5f, 42.6f, 22.1f, 52.2f, 53.1f)
                curveToRelative(9.5f, 30.9f, 10.9f, 68.8f, 9.8f, 98.1f)
                curveToRelative(-1.1f, 30.5f, 22.7f, 58.5f, 54.7f, 58.5f)
                horizontalLineToRelative(328.7f)
                curveToRelative(32.1f, 0f, 55.8f, -28.1f, 54.7f, -58.5f)
                curveToRelative(-1f, -29.3f, 0.3f, -67.2f, 9.8f, -98.1f)
                curveToRelative(9.6f, -31f, 25.7f, -50.6f, 52.1f, -53.1f)
                verticalLineToRelative(-28.5f)
                curveTo(542.7f, 239.2f, 526.5f, 219.6f, 517f, 188.6f)
                close()
                moveTo(300.2f, 375.1f)
                horizontalLineToRelative(-97.9f)
                verticalLineTo(136.8f)
                horizontalLineToRelative(97.4f)
                curveToRelative(43.3f, 0f, 71.7f, 23.4f, 71.7f, 59.4f)
                curveToRelative(0f, 25.3f, -19.1f, 47.9f, -43.5f, 51.8f)
                verticalLineToRelative(1.3f)
                curveToRelative(33.2f, 3.6f, 55.5f, 26.6f, 55.5f, 58.3f)
                curveTo(383.4f, 349.7f, 352.1f, 375.1f, 300.2f, 375.1f)
                close()
                moveTo(290.2f, 266.4f)
                horizontalLineToRelative(-50.1f)
                verticalLineToRelative(78.4f)
                horizontalLineToRelative(52.3f)
                curveToRelative(34.2f, 0f, 52.3f, -13.7f, 52.3f, -39.5f)
                curveTo(344.7f, 279.6f, 326.1f, 266.4f, 290.2f, 266.4f)
                close()
            }
        }.build()
        
        return _Bootstrap!!
    }

private var _Bootstrap: ImageVector? = null

