package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SignIntersectionY: ImageVector
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
                moveTo(10.493f, 5.197f)
                lineTo(8f, 7.483f)
                lineTo(5.507f, 5.197f)
                lineTo(4.493f, 6.303f)
                lineTo(7.25f, 8.83f)
                verticalLineTo(12f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(8.83f)
                lineToRelative(2.757f, -2.527f)
                close()
            }
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
                moveToRelative(-1.4f, 0.7f)
                arcToRelative(0.495f, 0.495f, 0f, false, true, 0.7f, 0f)
                lineToRelative(6.516f, 6.515f)
                arcToRelative(0.495f, 0.495f, 0f, false, true, 0f, 0.7f)
                lineTo(8.35f, 14.866f)
                arcToRelative(0.495f, 0.495f, 0f, false, true, -0.7f, 0f)
                lineTo(1.134f, 8.35f)
                arcToRelative(0.495f, 0.495f, 0f, false, true, 0f, -0.7f)
                lineTo(7.65f, 1.134f)
                close()
            }
        }.build()
        
        return _SignIntersectionY!!
    }

private var _SignIntersectionY: ImageVector? = null

