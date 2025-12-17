package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Flash_auto: ImageVector
    get() {
        if (_Flash_auto != null) return _Flash_auto!!
        
        _Flash_auto = ImageVector.Builder(
            name = "flash_auto",
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
                moveTo(3f, 3f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7.15f)
                curveToRelative(0f, 0.51f, 0.67f, 0.69f, 0.93f, 0.25f)
                lineToRelative(5.19f, -8.9f)
                curveToRelative(0.39f, -0.67f, -0.09f, -1.5f, -0.86f, -1.5f)
                horizontalLineTo(9f)
                lineToRelative(3.38f, -7.59f)
                curveToRelative(0.29f, -0.67f, -0.2f, -1.41f, -0.92f, -1.41f)
                horizontalLineTo(4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveToRelative(15f, -1f)
                curveToRelative(-0.6f, 0f, -1.13f, 0.38f, -1.34f, 0.94f)
                lineTo(14.22f, 9.8f)
                curveToRelative(-0.2f, 0.59f, 0.23f, 1.2f, 0.85f, 1.2f)
                curveToRelative(0.38f, 0f, 0.72f, -0.24f, 0.84f, -0.6f)
                lineTo(16.4f, 9f)
                horizontalLineToRelative(3.2f)
                lineToRelative(0.49f, 1.4f)
                curveToRelative(0.13f, 0.36f, 0.46f, 0.6f, 0.84f, 0.6f)
                curveToRelative(0.62f, 0f, 1.05f, -0.61f, 0.84f, -1.19f)
                lineToRelative(-2.44f, -6.86f)
                curveTo(19.13f, 2.38f, 18.6f, 2f, 18f, 2f)
                close()
                moveToRelative(-1.15f, 5.65f)
                lineTo(18f, 4f)
                lineToRelative(1.15f, 3.65f)
                horizontalLineToRelative(-2.3f)
                close()
            }
        }.build()
        
        return _Flash_auto!!
    }

private var _Flash_auto: ImageVector? = null

