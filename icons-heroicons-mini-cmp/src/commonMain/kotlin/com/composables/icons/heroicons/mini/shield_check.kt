package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ShieldCheck: ImageVector
    get() {
        if (_ShieldCheck != null) return _ShieldCheck!!
        
        _ShieldCheck = ImageVector.Builder(
            name = "shield-check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.661f, 2.237f)
                arcToRelative(0.531f, 0.531f, 0f, false, true, 0.678f, 0f)
                arcToRelative(11.947f, 11.947f, 0f, false, false, 7.078f, 2.749f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.479f, 0.425f)
                curveToRelative(0.069f, 0.52f, 0.104f, 1.05f, 0.104f, 1.59f)
                curveToRelative(0f, 5.162f, -3.26f, 9.563f, -7.834f, 11.256f)
                arcToRelative(0.48f, 0.48f, 0f, false, true, -0.332f, 0f)
                curveTo(5.26f, 16.564f, 2f, 12.163f, 2f, 7f)
                curveToRelative(0f, -0.538f, 0.035f, -1.069f, 0.104f, -1.589f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.48f, -0.425f)
                arcToRelative(11.947f, 11.947f, 0f, false, false, 7.077f, -2.75f)
                close()
                moveToRelative(4.196f, 5.954f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.214f, -0.882f)
                lineToRelative(-3.483f, 4.79f)
                lineToRelative(-1.88f, -1.88f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, 1.061f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.137f, -0.089f)
                lineToRelative(4f, -5.5f)
                close()
            }
        }.build()
        
        return _ShieldCheck!!
    }

private var _ShieldCheck: ImageVector? = null

