package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Perm_phone_msg: ImageVector
    get() {
        if (_Perm_phone_msg != null) return _Perm_phone_msg!!
        
        _Perm_phone_msg = ImageVector.Builder(
            name = "perm_phone_msg",
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
                moveTo(12f, 3f)
                verticalLineToRelative(10f)
                lineToRelative(3f, -3f)
                horizontalLineToRelative(6f)
                verticalLineTo(3f)
                close()
                moveToRelative(1.21f, 14.37f)
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
        
        return _Perm_phone_msg!!
    }

private var _Perm_phone_msg: ImageVector? = null

