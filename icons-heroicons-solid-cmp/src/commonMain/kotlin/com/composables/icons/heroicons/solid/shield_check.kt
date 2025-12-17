package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ShieldCheck: ImageVector
    get() {
        if (_ShieldCheck != null) return _ShieldCheck!!
        
        _ShieldCheck = ImageVector.Builder(
            name = "shield-check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.516f, 2.17f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.032f, 0f)
                arcToRelative(11.209f, 11.209f, 0f, false, true, -7.877f, 3.08f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.722f, 0.515f)
                arcTo(12.74f, 12.74f, 0f, false, false, 2.25f, 9.75f)
                curveToRelative(0f, 5.942f, 4.064f, 10.933f, 9.563f, 12.348f)
                arcToRelative(0.749f, 0.749f, 0f, false, false, 0.374f, 0f)
                curveToRelative(5.499f, -1.415f, 9.563f, -6.406f, 9.563f, -12.348f)
                curveToRelative(0f, -1.39f, -0.223f, -2.73f, -0.635f, -3.985f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.722f, -0.516f)
                lineToRelative(-0.143f, 0.001f)
                curveToRelative(-2.996f, 0f, -5.717f, -1.17f, -7.734f, -3.08f)
                close()
                moveToRelative(3.094f, 8.016f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.22f, -0.872f)
                lineToRelative(-3.236f, 4.53f)
                lineTo(9.53f, 12.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineToRelative(2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.14f, -0.094f)
                lineToRelative(3.75f, -5.25f)
                close()
            }
        }.build()
        
        return _ShieldCheck!!
    }

private var _ShieldCheck: ImageVector? = null

