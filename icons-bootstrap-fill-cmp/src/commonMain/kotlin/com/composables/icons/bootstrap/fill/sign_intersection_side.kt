package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SignIntersectionSide: ImageVector
    get() {
        if (_SignIntersectionSide != null) return _SignIntersectionSide!!
        
        _SignIntersectionSide = ImageVector.Builder(
            name = "sign-intersection-side",
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
                moveTo(6.25f, 4f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3.25f)
                horizontalLineTo(11f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(7.75f)
                verticalLineTo(12f)
                horizontalLineToRelative(-1.5f)
                close()
            }
        }.build()
        
        return _SignIntersectionSide!!
    }

private var _SignIntersectionSide: ImageVector? = null

