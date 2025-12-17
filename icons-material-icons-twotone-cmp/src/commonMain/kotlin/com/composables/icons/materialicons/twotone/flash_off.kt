package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Flash_off: ImageVector
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
                moveTo(17f, 10f)
                horizontalLineToRelative(-3.61f)
                lineToRelative(2.28f, 2.28f)
                close()
                moveToRelative(0f, -8f)
                horizontalLineTo(7f)
                verticalLineToRelative(1.61f)
                lineToRelative(6.13f, 6.13f)
                close()
                moveToRelative(-13.59f, 0.86f)
                lineTo(2f, 4.27f)
                lineToRelative(5f, 5f)
                verticalLineTo(13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(9f)
                lineToRelative(3.58f, -6.15f)
                lineTo(17.73f, 20f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }.build()
        
        return _Flash_off!!
    }

private var _Flash_off: ImageVector? = null

