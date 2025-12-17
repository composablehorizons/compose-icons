package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.EyeDropper: ImageVector
    get() {
        if (_EyeDropper != null) return _EyeDropper!!
        
        _EyeDropper = ImageVector.Builder(
            name = "eye-dropper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.1f, 3.667f)
                arcToRelative(3.502f, 3.502f, 0f, true, true, 6.782f, 1.738f)
                arcToRelative(3.487f, 3.487f, 0f, false, true, -0.907f, 1.57f)
                arcToRelative(3.495f, 3.495f, 0f, false, true, -1.617f, 0.919f)
                lineTo(16f, 7.99f)
                verticalLineTo(10f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.22f, 0.53f)
                lineToRelative(-0.25f, 0.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineToRelative(-0.845f, -0.844f)
                lineTo(7.22f, 16.34f)
                arcTo(2.25f, 2.25f, 0f, false, true, 5.629f, 17f)
                horizontalLineTo(5.12f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.53f, 0.22f)
                lineToRelative(-1.56f, 1.56f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.061f, 0f)
                lineToRelative(-0.75f, -0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                lineToRelative(1.56f, -1.561f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.22f, -0.53f)
                verticalLineToRelative(-0.508f)
                curveToRelative(0f, -0.596f, 0.237f, -1.169f, 0.659f, -1.59f)
                lineToRelative(6.405f, -6.406f)
                lineToRelative(-0.844f, -0.845f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                lineToRelative(0.25f, -0.25f)
                arcTo(0.75f, 0.75f, 0f, false, true, 10f, 4f)
                horizontalLineToRelative(2.01f)
                lineToRelative(0.09f, -0.333f)
                close()
                moveTo(4.72f, 13.84f)
                lineToRelative(6.405f, -6.405f)
                lineToRelative(1.44f, 1.439f)
                lineToRelative(-6.406f, 6.405f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.53f, 0.22f)
                horizontalLineTo(5.12f)
                curveToRelative(-0.258f, 0f, -0.511f, 0.044f, -0.75f, 0.129f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 0.129f, -0.75f)
                verticalLineToRelative(-0.508f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.22f, -0.53f)
                close()
            }
        }.build()
        
        return _EyeDropper!!
    }

private var _EyeDropper: ImageVector? = null

