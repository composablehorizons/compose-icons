package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Flash_auto: ImageVector
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
                moveTo(3f, 2f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(9f)
                lineToRelative(7f, -12f)
                horizontalLineTo(9f)
                lineToRelative(4f, -9f)
                horizontalLineTo(3f)
                close()
                moveToRelative(16f, 0f)
                horizontalLineToRelative(-2f)
                lineToRelative(-3.2f, 9f)
                horizontalLineToRelative(1.9f)
                lineToRelative(0.7f, -2f)
                horizontalLineToRelative(3.2f)
                lineToRelative(0.7f, 2f)
                horizontalLineToRelative(1.9f)
                lineTo(19f, 2f)
                close()
                moveToRelative(-2.15f, 5.65f)
                lineTo(18f, 4f)
                lineToRelative(1.15f, 3.65f)
                horizontalLineToRelative(-2.3f)
                close()
            }
        }.build()
        
        return _Flash_auto!!
    }

private var _Flash_auto: ImageVector? = null

