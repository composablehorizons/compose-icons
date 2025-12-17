package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.EyeSlash: ImageVector
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
                moveTo(13.359f, 11.238f)
                curveTo(15.06f, 9.72f, 16f, 8f, 16f, 8f)
                reflectiveCurveToRelative(-3f, -5.5f, -8f, -5.5f)
                arcToRelative(7f, 7f, 0f, false, false, -2.79f, 0.588f)
                lineToRelative(0.77f, 0.771f)
                arcTo(6f, 6f, 0f, false, true, 8f, 3.5f)
                curveToRelative(2.12f, 0f, 3.879f, 1.168f, 5.168f, 2.457f)
                arcTo(13f, 13f, 0f, false, true, 14.828f, 8f)
                quadToRelative(-0.086f, 0.13f, -0.195f, 0.288f)
                curveToRelative(-0.335f, 0.48f, -0.83f, 1.12f, -1.465f, 1.755f)
                quadToRelative(-0.247f, 0.248f, -0.517f, 0.486f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.297f, 9.176f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -4.474f, -4.474f)
                lineToRelative(0.823f, 0.823f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 2.829f, 2.829f)
                close()
                moveToRelative(-2.943f, 1.299f)
                lineToRelative(0.822f, 0.822f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -4.474f, -4.474f)
                lineToRelative(0.823f, 0.823f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 2.829f, 2.829f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.35f, 5.47f)
                quadToRelative(-0.27f, 0.24f, -0.518f, 0.487f)
                arcTo(13f, 13f, 0f, false, false, 1.172f, 8f)
                lineToRelative(0.195f, 0.288f)
                curveToRelative(0.335f, 0.48f, 0.83f, 1.12f, 1.465f, 1.755f)
                curveTo(4.121f, 11.332f, 5.881f, 12.5f, 8f, 12.5f)
                curveToRelative(0.716f, 0f, 1.39f, -0.133f, 2.02f, -0.36f)
                lineToRelative(0.77f, 0.772f)
                arcTo(7f, 7f, 0f, false, true, 8f, 13.5f)
                curveTo(3f, 13.5f, 0f, 8f, 0f, 8f)
                reflectiveCurveToRelative(0.939f, -1.721f, 2.641f, -3.238f)
                lineToRelative(0.708f, 0.709f)
                close()
                moveToRelative(10.296f, 8.884f)
                lineToRelative(-12f, -12f)
                lineToRelative(0.708f, -0.708f)
                lineToRelative(12f, 12f)
                close()
            }
        }.build()
        
        return _EyeSlash!!
    }

private var _EyeSlash: ImageVector? = null

