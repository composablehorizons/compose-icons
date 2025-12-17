package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SignOut: ImageVector
    get() {
        if (_SignOut != null) return _SignOut!!
        
        _SignOut = ImageVector.Builder(
            name = "sign-out",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 2f)
                curveTo(3.119f, 2f, 2f, 3.119f, 2f, 4.5f)
                verticalLineTo(11.5f)
                curveTo(2f, 12.881f, 3.119f, 14f, 4.5f, 14f)
                horizontalLineTo(9.5f)
                curveTo(9.776f, 14f, 10f, 13.776f, 10f, 13.5f)
                curveTo(10f, 13.224f, 9.776f, 13f, 9.5f, 13f)
                horizontalLineTo(4.5f)
                curveTo(3.672f, 13f, 3f, 12.328f, 3f, 11.5f)
                verticalLineTo(4.5f)
                curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
                horizontalLineTo(9.5f)
                curveTo(9.776f, 3f, 10f, 2.776f, 10f, 2.5f)
                curveTo(10f, 2.224f, 9.776f, 2f, 9.5f, 2f)
                horizontalLineTo(4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.854f, 7.646f)
                lineTo(10.854f, 4.646f)
                curveTo(10.659f, 4.451f, 10.342f, 4.451f, 10.147f, 4.646f)
                curveTo(9.952f, 4.841f, 9.952f, 5.158f, 10.147f, 5.353f)
                lineTo(12.293f, 7.499f)
                horizontalLineTo(5.5f)
                curveTo(5.224f, 7.499f, 5f, 7.723f, 5f, 7.999f)
                curveTo(5f, 8.275f, 5.224f, 8.499f, 5.5f, 8.499f)
                horizontalLineTo(12.293f)
                lineTo(10.147f, 10.645f)
                curveTo(9.952f, 10.84f, 9.952f, 11.157f, 10.147f, 11.352f)
                curveTo(10.342f, 11.547f, 10.659f, 11.547f, 10.854f, 11.352f)
                lineTo(13.854f, 8.352f)
                curveTo(14.049f, 8.157f, 14.049f, 7.841f, 13.854f, 7.646f)
                close()
            }
        }.build()
        
        return _SignOut!!
    }

private var _SignOut: ImageVector? = null

