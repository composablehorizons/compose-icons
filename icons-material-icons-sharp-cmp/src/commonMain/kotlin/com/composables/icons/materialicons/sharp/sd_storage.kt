package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Sd_storage: ImageVector
    get() {
        if (_Sd_storage != null) return _Sd_storage!!
        
        _Sd_storage = ImageVector.Builder(
            name = "sd_storage",
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
                moveTo(20f, 2f)
                horizontalLineTo(10f)
                lineTo(4f, 8f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(16f)
                verticalLineTo(2f)
                close()
                moveToRelative(-8f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineTo(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(3f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineTo(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(3f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineTo(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
            }
        }.build()
        
        return _Sd_storage!!
    }

private var _Sd_storage: ImageVector? = null

