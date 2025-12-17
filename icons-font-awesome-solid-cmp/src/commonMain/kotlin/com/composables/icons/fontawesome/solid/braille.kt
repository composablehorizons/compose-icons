package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Braille: ImageVector
    get() {
        if (_Braille != null) return _Braille!!
        
        _Braille = ImageVector.Builder(
            name = "braille",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(128f, 256f)
                curveToRelative(0f, 35.346f, -28.654f, 64f, -64f, 64f)
                reflectiveCurveTo(0f, 291.346f, 0f, 256f)
                reflectiveCurveToRelative(28.654f, -64f, 64f, -64f)
                reflectiveCurveToRelative(64f, 28.654f, 64f, 64f)
                close()
                moveTo(64f, 384f)
                curveToRelative(-17.673f, 0f, -32f, 14.327f, -32f, 32f)
                reflectiveCurveToRelative(14.327f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.327f, 32f, -32f)
                reflectiveCurveToRelative(-14.327f, -32f, -32f, -32f)
                close()
                moveToRelative(0f, -352f)
                curveTo(28.654f, 32f, 0f, 60.654f, 0f, 96f)
                reflectiveCurveToRelative(28.654f, 64f, 64f, 64f)
                reflectiveCurveToRelative(64f, -28.654f, 64f, -64f)
                reflectiveCurveToRelative(-28.654f, -64f, -64f, -64f)
                close()
                moveToRelative(160f, 192f)
                curveToRelative(-17.673f, 0f, -32f, 14.327f, -32f, 32f)
                reflectiveCurveToRelative(14.327f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.327f, 32f, -32f)
                reflectiveCurveToRelative(-14.327f, -32f, -32f, -32f)
                close()
                moveToRelative(0f, 160f)
                curveToRelative(-17.673f, 0f, -32f, 14.327f, -32f, 32f)
                reflectiveCurveToRelative(14.327f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.327f, 32f, -32f)
                reflectiveCurveToRelative(-14.327f, -32f, -32f, -32f)
                close()
                moveToRelative(0f, -352f)
                curveToRelative(-35.346f, 0f, -64f, 28.654f, -64f, 64f)
                reflectiveCurveToRelative(28.654f, 64f, 64f, 64f)
                reflectiveCurveToRelative(64f, -28.654f, 64f, -64f)
                reflectiveCurveToRelative(-28.654f, -64f, -64f, -64f)
                close()
                moveToRelative(224f, 192f)
                curveToRelative(-17.673f, 0f, -32f, 14.327f, -32f, 32f)
                reflectiveCurveToRelative(14.327f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.327f, 32f, -32f)
                reflectiveCurveToRelative(-14.327f, -32f, -32f, -32f)
                close()
                moveToRelative(0f, 160f)
                curveToRelative(-17.673f, 0f, -32f, 14.327f, -32f, 32f)
                reflectiveCurveToRelative(14.327f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.327f, 32f, -32f)
                reflectiveCurveToRelative(-14.327f, -32f, -32f, -32f)
                close()
                moveToRelative(0f, -352f)
                curveToRelative(-35.346f, 0f, -64f, 28.654f, -64f, 64f)
                reflectiveCurveToRelative(28.654f, 64f, 64f, 64f)
                reflectiveCurveToRelative(64f, -28.654f, 64f, -64f)
                reflectiveCurveToRelative(-28.654f, -64f, -64f, -64f)
                close()
                moveToRelative(160f, 192f)
                curveToRelative(-17.673f, 0f, -32f, 14.327f, -32f, 32f)
                reflectiveCurveToRelative(14.327f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.327f, 32f, -32f)
                reflectiveCurveToRelative(-14.327f, -32f, -32f, -32f)
                close()
                moveToRelative(0f, 160f)
                curveToRelative(-17.673f, 0f, -32f, 14.327f, -32f, 32f)
                reflectiveCurveToRelative(14.327f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.327f, 32f, -32f)
                reflectiveCurveToRelative(-14.327f, -32f, -32f, -32f)
                close()
                moveToRelative(0f, -320f)
                curveToRelative(-17.673f, 0f, -32f, 14.327f, -32f, 32f)
                reflectiveCurveToRelative(14.327f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.327f, 32f, -32f)
                reflectiveCurveToRelative(-14.327f, -32f, -32f, -32f)
                close()
            }
        }.build()
        
        return _Braille!!
    }

private var _Braille: ImageVector? = null

