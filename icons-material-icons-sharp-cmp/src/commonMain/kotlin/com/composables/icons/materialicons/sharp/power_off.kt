package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Power_off: ImageVector
    get() {
        if (_Power_off != null) return _Power_off!!
        
        _Power_off = ImageVector.Builder(
            name = "power_off",
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
                moveTo(18f, 14.49f)
                verticalLineTo(9f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                verticalLineTo(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3.88f)
                lineToRelative(7.69f, 7.69f)
                lineToRelative(0.19f, -0.2f)
                close()
                moveTo(10f, 3f)
                horizontalLineTo(8f)
                verticalLineToRelative(1.88f)
                lineToRelative(2f, 2f)
                close()
                moveToRelative(-5.88f, 0.84f)
                lineTo(2.71f, 5.25f)
                lineToRelative(3.34f, 3.34f)
                curveToRelative(-0.03f, 0.13f, -0.05f, 0.27f, -0.05f, 0.4f)
                verticalLineToRelative(5.51f)
                lineTo(9.5f, 18f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                lineToRelative(0.48f, -0.48f)
                lineToRelative(4.47f, 4.47f)
                lineToRelative(1.41f, -1.41f)
                lineTo(4.12f, 3.84f)
                close()
            }
        }.build()
        
        return _Power_off!!
    }

private var _Power_off: ImageVector? = null

