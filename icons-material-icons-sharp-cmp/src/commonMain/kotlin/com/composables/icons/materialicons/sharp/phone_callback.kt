package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Phone_callback: ImageVector
    get() {
        if (_Phone_callback != null) return _Phone_callback!!
        
        _Phone_callback = ImageVector.Builder(
            name = "phone_callback",
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
                moveTo(15.73f, 14.85f)
                lineToRelative(-2.52f, 2.52f)
                curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f)
                lineToRelative(2.53f, -2.53f)
                lineTo(8.54f, 3f)
                horizontalLineTo(3.03f)
                curveTo(2.45f, 13.18f, 10.82f, 21.55f, 21f, 20.97f)
                verticalLineToRelative(-5.51f)
                lineToRelative(-5.27f, -0.61f)
                close()
                moveTo(18f, 9f)
                horizontalLineToRelative(-2.59f)
                lineToRelative(5.02f, -5.02f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(14f, 7.59f)
                verticalLineTo(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                close()
            }
        }.build()
        
        return _Phone_callback!!
    }

private var _Phone_callback: ImageVector? = null

