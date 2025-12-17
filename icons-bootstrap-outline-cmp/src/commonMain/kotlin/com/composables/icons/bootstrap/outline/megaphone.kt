package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Megaphone: ImageVector
    get() {
        if (_Megaphone != null) return _Megaphone!!
        
        _Megaphone = ImageVector.Builder(
            name = "megaphone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 2.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 3f, 0f)
                verticalLineToRelative(11f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -3f, 0f)
                verticalLineToRelative(-0.214f)
                curveToRelative(-2.162f, -1.241f, -4.49f, -1.843f, -6.912f, -2.083f)
                lineToRelative(0.405f, 2.712f)
                arcTo(1f, 1f, 0f, false, true, 5.51f, 15.1f)
                horizontalLineToRelative(-0.548f)
                arcToRelative(1f, 1f, 0f, false, true, -0.916f, -0.599f)
                lineToRelative(-1.85f, -3.49f)
                lineToRelative(-0.202f, -0.003f)
                arcTo(2.014f, 2.014f, 0f, false, true, 0f, 9f)
                verticalLineTo(7f)
                arcToRelative(2.02f, 2.02f, 0f, false, true, 1.992f, -2.013f)
                arcToRelative(75f, 75f, 0f, false, false, 2.483f, -0.075f)
                curveToRelative(3.043f, -0.154f, 6.148f, -0.849f, 8.525f, -2.199f)
                close()
                moveToRelative(1f, 0f)
                verticalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineToRelative(-11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                moveToRelative(-1f, 1.35f)
                curveToRelative(-2.344f, 1.205f, -5.209f, 1.842f, -8f, 2.033f)
                verticalLineToRelative(4.233f)
                quadToRelative(0.27f, 0.015f, 0.537f, 0.036f)
                curveToRelative(2.568f, 0.189f, 5.093f, 0.744f, 7.463f, 1.993f)
                close()
                moveToRelative(-9f, 6.215f)
                verticalLineToRelative(-4.13f)
                arcToRelative(95f, 95f, 0f, false, true, -1.992f, 0.052f)
                arcTo(1.02f, 1.02f, 0f, false, false, 1f, 7f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.448f, 1.002f, 1.006f, 1.009f)
                arcTo(61f, 61f, 0f, false, true, 4f, 10.065f)
                moveToRelative(-0.657f, 0.975f)
                lineToRelative(1.609f, 3.037f)
                lineToRelative(0.01f, 0.024f)
                horizontalLineToRelative(0.548f)
                lineToRelative(-0.002f, -0.014f)
                lineToRelative(-0.443f, -2.966f)
                arcToRelative(68f, 68f, 0f, false, false, -1.722f, -0.082f)
                close()
            }
        }.build()
        
        return _Megaphone!!
    }

private var _Megaphone: ImageVector? = null

