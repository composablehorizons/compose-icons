package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HatCowboySide: ImageVector
    get() {
        if (_HatCowboySide != null) return _HatCowboySide!!
        
        _HatCowboySide = ImageVector.Builder(
            name = "hat-cowboy-side",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260.8f, 291.06f)
                curveToRelative(-28.63f, -22.94f, -62f, -35.06f, -96.4f, -35.06f)
                curveTo(87f, 256f, 21.47f, 318.72f, 1.43f, 412.06f)
                curveToRelative(-3.55f, 16.6f, -0.43f, 33.83f, 8.57f, 47.3f)
                curveTo(18.75f, 472.47f, 31.83f, 480f, 45.88f, 480f)
                horizontalLineTo(592f)
                curveToRelative(-103.21f, 0f, -155f, -37.07f, -233.19f, -104.46f)
                close()
                moveToRelative(234.65f, -18.29f)
                lineTo(468.4f, 116.2f)
                arcTo(64f, 64f, 0f, false, false, 392f, 64.41f)
                lineTo(200.85f, 105f)
                arcToRelative(64f, 64f, 0f, false, false, -50.35f, 55.79f)
                lineTo(143.61f, 226f)
                curveToRelative(6.9f, -0.83f, 13.7f, -2f, 20.79f, -2f)
                curveToRelative(41.79f, 0f, 82f, 14.55f, 117.29f, 42.82f)
                lineToRelative(98f, 84.48f)
                curveTo(450.76f, 412.54f, 494.9f, 448f, 592f, 448f)
                arcToRelative(48f, 48f, 0f, false, false, 48f, -48f)
                curveToRelative(0f, -25.39f, -29.6f, -119.33f, -144.55f, -127.23f)
                close()
            }
        }.build()
        
        return _HatCowboySide!!
    }

private var _HatCowboySide: ImageVector? = null

