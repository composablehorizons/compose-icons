package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SignIntersectionY: ImageVector
    get() {
        if (_SignIntersectionY != null) return _SignIntersectionY!!
        
        _SignIntersectionY = ImageVector.Builder(
            name = "sign-intersection-y",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.05f, 0.435f)
                curveToRelative(-0.58f, -0.58f, -1.52f, -0.58f, -2.1f, 0f)
                lineTo(0.436f, 6.95f)
                curveToRelative(-0.58f, 0.58f, -0.58f, 1.519f, 0f, 2.098f)
                lineToRelative(6.516f, 6.516f)
                curveToRelative(0.58f, 0.58f, 1.519f, 0.58f, 2.098f, 0f)
                lineToRelative(6.516f, -6.516f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.519f, 0f, -2.098f)
                close()
                moveToRelative(1.443f, 4.762f)
                lineToRelative(1.014f, 1.106f)
                lineTo(8.75f, 8.83f)
                verticalLineTo(12f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(8.83f)
                lineTo(4.493f, 6.303f)
                lineToRelative(1.014f, -1.106f)
                lineTo(8f, 7.483f)
                close()
            }
        }.build()
        
        return _SignIntersectionY!!
    }

private var _SignIntersectionY: ImageVector? = null

