package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ShieldExclamation: ImageVector
    get() {
        if (_ShieldExclamation != null) return _ShieldExclamation!!
        
        _ShieldExclamation = ImageVector.Builder(
            name = "shield-exclamation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.339f, 2.237f)
                arcToRelative(0.531f, 0.531f, 0f, false, false, -0.678f, 0f)
                arcToRelative(11.947f, 11.947f, 0f, false, true, -7.078f, 2.75f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.479f, 0.425f)
                arcTo(12.11f, 12.11f, 0f, false, false, 2f, 7f)
                curveToRelative(0f, 5.163f, 3.26f, 9.564f, 7.834f, 11.257f)
                arcToRelative(0.48f, 0.48f, 0f, false, false, 0.332f, 0f)
                curveTo(14.74f, 16.564f, 18f, 12.163f, 18f, 7f)
                curveToRelative(0f, -0.538f, -0.035f, -1.069f, -0.104f, -1.589f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.48f, -0.425f)
                arcToRelative(11.947f, 11.947f, 0f, false, true, -7.077f, -2.75f)
                close()
                moveTo(10f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-3.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 10f, 6f)
                close()
                moveToRelative(0f, 9f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                close()
            }
        }.build()
        
        return _ShieldExclamation!!
    }

private var _ShieldExclamation: ImageVector? = null

