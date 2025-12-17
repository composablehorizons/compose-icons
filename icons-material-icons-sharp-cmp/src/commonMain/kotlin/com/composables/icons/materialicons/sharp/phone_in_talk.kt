package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Phone_in_talk: ImageVector
    get() {
        if (_Phone_in_talk != null) return _Phone_in_talk!!
        
        _Phone_in_talk = ImageVector.Builder(
            name = "phone_in_talk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 12f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -4.97f, -4.03f, -9f, -9f, -9f)
                verticalLineToRelative(2f)
                curveToRelative(3.87f, 0f, 7f, 3.13f, 7f, 7f)
                close()
                moveToRelative(-4f, 0f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                verticalLineToRelative(2f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                close()
                moveToRelative(-1.79f, 5.37f)
                curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f)
                lineToRelative(2.53f, -2.53f)
                lineTo(8.54f, 3f)
                horizontalLineTo(3.03f)
                curveTo(2.45f, 13.18f, 10.82f, 21.55f, 21f, 20.97f)
                verticalLineToRelative(-5.51f)
                lineToRelative(-5.27f, -0.61f)
                lineToRelative(-2.52f, 2.52f)
                close()
            }
        }.build()
        
        return _Phone_in_talk!!
    }

private var _Phone_in_talk: ImageVector? = null

