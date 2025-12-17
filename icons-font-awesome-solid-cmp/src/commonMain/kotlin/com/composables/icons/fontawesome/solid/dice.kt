package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Dice: ImageVector
    get() {
        if (_Dice != null) return _Dice!!
        
        _Dice = ImageVector.Builder(
            name = "dice",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(592f, 192f)
                horizontalLineTo(473.26f)
                curveToRelative(12.69f, 29.59f, 7.12f, 65.2f, -17f, 89.32f)
                lineTo(320f, 417.58f)
                verticalLineTo(464f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(224f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                verticalLineTo(240f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                close()
                moveTo(480f, 376f)
                curveToRelative(-13.25f, 0f, -24f, -10.75f, -24f, -24f)
                curveToRelative(0f, -13.26f, 10.75f, -24f, 24f, -24f)
                reflectiveCurveToRelative(24f, 10.74f, 24f, 24f)
                curveToRelative(0f, 13.25f, -10.75f, 24f, -24f, 24f)
                close()
                moveToRelative(-46.37f, -186.7f)
                lineTo(258.7f, 14.37f)
                curveToRelative(-19.16f, -19.16f, -50.23f, -19.16f, -69.39f, 0f)
                lineTo(14.37f, 189.3f)
                curveToRelative(-19.16f, 19.16f, -19.16f, 50.23f, 0f, 69.39f)
                lineTo(189.3f, 433.63f)
                curveToRelative(19.16f, 19.16f, 50.23f, 19.16f, 69.39f, 0f)
                lineTo(433.63f, 258.7f)
                curveToRelative(19.16f, -19.17f, 19.16f, -50.24f, 0f, -69.4f)
                close()
                moveTo(96f, 248f)
                curveToRelative(-13.25f, 0f, -24f, -10.75f, -24f, -24f)
                curveToRelative(0f, -13.26f, 10.75f, -24f, 24f, -24f)
                reflectiveCurveToRelative(24f, 10.74f, 24f, 24f)
                curveToRelative(0f, 13.25f, -10.75f, 24f, -24f, 24f)
                close()
                moveToRelative(128f, 128f)
                curveToRelative(-13.25f, 0f, -24f, -10.75f, -24f, -24f)
                curveToRelative(0f, -13.26f, 10.75f, -24f, 24f, -24f)
                reflectiveCurveToRelative(24f, 10.74f, 24f, 24f)
                curveToRelative(0f, 13.25f, -10.75f, 24f, -24f, 24f)
                close()
                moveToRelative(0f, -128f)
                curveToRelative(-13.25f, 0f, -24f, -10.75f, -24f, -24f)
                curveToRelative(0f, -13.26f, 10.75f, -24f, 24f, -24f)
                reflectiveCurveToRelative(24f, 10.74f, 24f, 24f)
                curveToRelative(0f, 13.25f, -10.75f, 24f, -24f, 24f)
                close()
                moveToRelative(0f, -128f)
                curveToRelative(-13.25f, 0f, -24f, -10.75f, -24f, -24f)
                curveToRelative(0f, -13.26f, 10.75f, -24f, 24f, -24f)
                reflectiveCurveToRelative(24f, 10.74f, 24f, 24f)
                curveToRelative(0f, 13.25f, -10.75f, 24f, -24f, 24f)
                close()
                moveToRelative(128f, 128f)
                curveToRelative(-13.25f, 0f, -24f, -10.75f, -24f, -24f)
                curveToRelative(0f, -13.26f, 10.75f, -24f, 24f, -24f)
                reflectiveCurveToRelative(24f, 10.74f, 24f, 24f)
                curveToRelative(0f, 13.25f, -10.75f, 24f, -24f, 24f)
                close()
            }
        }.build()
        
        return _Dice!!
    }

private var _Dice: ImageVector? = null

