package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Dizzy: ImageVector
    get() {
        if (_Dizzy != null) return _Dizzy!!
        
        _Dizzy = ImageVector.Builder(
            name = "dizzy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(248f, 8f)
                curveTo(111f, 8f, 0f, 119f, 0f, 256f)
                reflectiveCurveToRelative(111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                reflectiveCurveTo(385f, 8f, 248f, 8f)
                close()
                moveToRelative(-96f, 206.6f)
                lineToRelative(-28.7f, 28.7f)
                curveToRelative(-14.8f, 14.8f, -37.8f, -7.5f, -22.6f, -22.6f)
                lineToRelative(28.7f, -28.7f)
                lineToRelative(-28.7f, -28.7f)
                curveToRelative(-15f, -15f, 7.7f, -37.6f, 22.6f, -22.6f)
                lineToRelative(28.7f, 28.7f)
                lineToRelative(28.7f, -28.7f)
                curveToRelative(15f, -15f, 37.6f, 7.7f, 22.6f, 22.6f)
                lineTo(174.6f, 192f)
                lineToRelative(28.7f, 28.7f)
                curveToRelative(15.2f, 15.2f, -7.9f, 37.4f, -22.6f, 22.6f)
                lineTo(152f, 214.6f)
                close()
                moveTo(248f, 416f)
                curveToRelative(-35.3f, 0f, -64f, -28.7f, -64f, -64f)
                reflectiveCurveToRelative(28.7f, -64f, 64f, -64f)
                reflectiveCurveToRelative(64f, 28.7f, 64f, 64f)
                reflectiveCurveToRelative(-28.7f, 64f, -64f, 64f)
                close()
                moveToRelative(147.3f, -195.3f)
                curveToRelative(15.2f, 15.2f, -7.9f, 37.4f, -22.6f, 22.6f)
                lineTo(344f, 214.6f)
                lineToRelative(-28.7f, 28.7f)
                curveToRelative(-14.8f, 14.8f, -37.8f, -7.5f, -22.6f, -22.6f)
                lineToRelative(28.7f, -28.7f)
                lineToRelative(-28.7f, -28.7f)
                curveToRelative(-15f, -15f, 7.7f, -37.6f, 22.6f, -22.6f)
                lineToRelative(28.7f, 28.7f)
                lineToRelative(28.7f, -28.7f)
                curveToRelative(15f, -15f, 37.6f, 7.7f, 22.6f, 22.6f)
                lineTo(366.6f, 192f)
                lineToRelative(28.7f, 28.7f)
                close()
            }
        }.build()
        
        return _Dizzy!!
    }

private var _Dizzy: ImageVector? = null

