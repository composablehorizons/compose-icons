package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Fish: ImageVector
    get() {
        if (_Fish != null) return _Fish!!
        
        _Fish = ImageVector.Builder(
            name = "fish",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(327.1f, 96f)
                curveToRelative(-89.97f, 0f, -168.54f, 54.77f, -212.27f, 101.63f)
                lineTo(27.5f, 131.58f)
                curveToRelative(-12.13f, -9.18f, -30.24f, 0.6f, -27.14f, 14.66f)
                lineTo(24.54f, 256f)
                lineTo(0.35f, 365.77f)
                curveToRelative(-3.1f, 14.06f, 15.01f, 23.83f, 27.14f, 14.66f)
                lineToRelative(87.33f, -66.05f)
                curveTo(158.55f, 361.23f, 237.13f, 416f, 327.1f, 416f)
                curveTo(464.56f, 416f, 576f, 288f, 576f, 256f)
                reflectiveCurveTo(464.56f, 96f, 327.1f, 96f)
                close()
                moveToRelative(87.43f, 184f)
                curveToRelative(-13.25f, 0f, -24f, -10.75f, -24f, -24f)
                curveToRelative(0f, -13.26f, 10.75f, -24f, 24f, -24f)
                curveToRelative(13.26f, 0f, 24f, 10.74f, 24f, 24f)
                curveToRelative(0f, 13.25f, -10.75f, 24f, -24f, 24f)
                close()
            }
        }.build()
        
        return _Fish!!
    }

private var _Fish: ImageVector? = null

