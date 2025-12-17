package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Flash_off: ImageVector
    get() {
        if (_Flash_off != null) return _Flash_off!!
        
        _Flash_off = ImageVector.Builder(
            name = "flash_off",
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
                moveTo(16.12f, 11.5f)
                curveToRelative(0.39f, -0.67f, -0.09f, -1.5f, -0.86f, -1.5f)
                horizontalLineToRelative(-1.87f)
                lineToRelative(2.28f, 2.28f)
                lineToRelative(0.45f, -0.78f)
                close()
                moveToRelative(0.16f, -8.05f)
                curveToRelative(0.33f, -0.67f, -0.15f, -1.45f, -0.9f, -1.45f)
                horizontalLineTo(8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0.61f)
                lineToRelative(6.13f, 6.13f)
                lineToRelative(3.15f, -6.29f)
                close()
                moveToRelative(2.16f, 14.43f)
                lineTo(4.12f, 3.56f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineTo(7f, 9.27f)
                verticalLineTo(12f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7.15f)
                curveToRelative(0f, 0.51f, 0.67f, 0.69f, 0.93f, 0.25f)
                lineToRelative(2.65f, -4.55f)
                lineToRelative(3.44f, 3.44f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                curveToRelative(0.4f, -0.39f, 0.4f, -1.02f, 0.01f, -1.41f)
                close()
            }
        }.build()
        
        return _Flash_off!!
    }

private var _Flash_off: ImageVector? = null

