package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.EyeSlash: ImageVector
    get() {
        if (_EyeSlash != null) return _EyeSlash!!
        
        _EyeSlash = ImageVector.Builder(
            name = "eye-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.79f, 12.912f)
                lineToRelative(-1.614f, -1.615f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -4.474f, -4.474f)
                lineToRelative(-2.06f, -2.06f)
                curveTo(0.938f, 6.278f, 0f, 8f, 0f, 8f)
                reflectiveCurveToRelative(3f, 5.5f, 8f, 5.5f)
                arcToRelative(7f, 7f, 0f, false, false, 2.79f, -0.588f)
                moveTo(5.21f, 3.088f)
                arcTo(7f, 7f, 0f, false, true, 8f, 2.5f)
                curveToRelative(5f, 0f, 8f, 5.5f, 8f, 5.5f)
                reflectiveCurveToRelative(-0.939f, 1.721f, -2.641f, 3.238f)
                lineToRelative(-2.062f, -2.062f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -4.474f, -4.474f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.525f, 7.646f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 2.829f, 2.829f)
                close()
                moveToRelative(4.95f, 0.708f)
                lineToRelative(-2.829f, -2.83f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 2.829f, 2.829f)
                close()
                moveToRelative(3.171f, 6f)
                lineToRelative(-12f, -12f)
                lineToRelative(0.708f, -0.708f)
                lineToRelative(12f, 12f)
                close()
            }
        }.build()
        
        return _EyeSlash!!
    }

private var _EyeSlash: ImageVector? = null

