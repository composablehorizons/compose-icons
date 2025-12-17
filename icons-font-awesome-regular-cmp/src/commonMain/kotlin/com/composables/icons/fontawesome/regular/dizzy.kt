package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Dizzy: ImageVector
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
                moveToRelative(0f, 448f)
                curveToRelative(-110.3f, 0f, -200f, -89.7f, -200f, -200f)
                reflectiveCurveTo(137.7f, 56f, 248f, 56f)
                reflectiveCurveToRelative(200f, 89.7f, 200f, 200f)
                reflectiveCurveToRelative(-89.7f, 200f, -200f, 200f)
                close()
                moveToRelative(-33.8f, -217.9f)
                curveToRelative(7.8f, -7.8f, 7.8f, -20.5f, 0f, -28.3f)
                lineTo(196.3f, 192f)
                lineToRelative(17.9f, -17.9f)
                curveToRelative(7.8f, -7.8f, 7.8f, -20.5f, 0f, -28.3f)
                curveToRelative(-7.8f, -7.8f, -20.5f, -7.8f, -28.3f, 0f)
                lineTo(168f, 163.7f)
                lineToRelative(-17.8f, -17.8f)
                curveToRelative(-7.8f, -7.8f, -20.5f, -7.8f, -28.3f, 0f)
                curveToRelative(-7.8f, 7.8f, -7.8f, 20.5f, 0f, 28.3f)
                lineToRelative(17.9f, 17.9f)
                lineToRelative(-17.9f, 17.9f)
                curveToRelative(-7.8f, 7.8f, -7.8f, 20.5f, 0f, 28.3f)
                curveToRelative(7.8f, 7.8f, 20.5f, 7.8f, 28.3f, 0f)
                lineToRelative(17.8f, -17.8f)
                lineToRelative(17.8f, 17.8f)
                curveToRelative(7.9f, 7.7f, 20.5f, 7.7f, 28.4f, -0.2f)
                close()
                moveToRelative(160f, -92.2f)
                curveToRelative(-7.8f, -7.8f, -20.5f, -7.8f, -28.3f, 0f)
                lineTo(328f, 163.7f)
                lineToRelative(-17.8f, -17.8f)
                curveToRelative(-7.8f, -7.8f, -20.5f, -7.8f, -28.3f, 0f)
                curveToRelative(-7.8f, 7.8f, -7.8f, 20.5f, 0f, 28.3f)
                lineToRelative(17.9f, 17.9f)
                lineToRelative(-17.9f, 17.9f)
                curveToRelative(-7.8f, 7.8f, -7.8f, 20.5f, 0f, 28.3f)
                curveToRelative(7.8f, 7.8f, 20.5f, 7.8f, 28.3f, 0f)
                lineToRelative(17.8f, -17.8f)
                lineToRelative(17.8f, 17.8f)
                curveToRelative(7.8f, 7.8f, 20.5f, 7.8f, 28.3f, 0f)
                curveToRelative(7.8f, -7.8f, 7.8f, -20.5f, 0f, -28.3f)
                lineToRelative(-17.8f, -18f)
                lineToRelative(17.9f, -17.9f)
                curveToRelative(7.7f, -7.8f, 7.7f, -20.4f, 0f, -28.2f)
                close()
                moveTo(248f, 272f)
                curveToRelative(-35.3f, 0f, -64f, 28.7f, -64f, 64f)
                reflectiveCurveToRelative(28.7f, 64f, 64f, 64f)
                reflectiveCurveToRelative(64f, -28.7f, 64f, -64f)
                reflectiveCurveToRelative(-28.7f, -64f, -64f, -64f)
                close()
            }
        }.build()
        
        return _Dizzy!!
    }

private var _Dizzy: ImageVector? = null

