package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Power_off: ImageVector
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
                curveToRelative(0f, -1f, -1.01f, -2.01f, -2f, -2f)
                verticalLineTo(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                verticalLineToRelative(2.48f)
                lineToRelative(9.51f, 9.5f)
                lineToRelative(0.49f, -0.49f)
                close()
                moveToRelative(-1.76f, 1.77f)
                lineTo(7.2f, 7.2f)
                lineToRelative(-0.01f, 0.01f)
                lineTo(3.98f, 4f)
                lineTo(2.71f, 5.25f)
                lineToRelative(3.36f, 3.36f)
                curveTo(6.04f, 8.74f, 6f, 8.87f, 6f, 9f)
                verticalLineToRelative(5.48f)
                lineTo(9.5f, 18f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                lineToRelative(0.48f, -0.48f)
                lineTo(19.45f, 22f)
                lineToRelative(1.26f, -1.28f)
                lineToRelative(-4.47f, -4.46f)
                close()
            }
        }.build()
        
        return _Power_off!!
    }

private var _Power_off: ImageVector? = null

