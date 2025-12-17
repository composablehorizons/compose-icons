package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Live_tv: ImageVector
    get() {
        if (_Live_tv != null) return _Live_tv!!
        
        _Live_tv = ImageVector.Builder(
            name = "live_tv",
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
                moveTo(23f, 6f)
                horizontalLineToRelative(-9.59f)
                lineToRelative(3.29f, -3.29f)
                lineTo(16f, 2f)
                lineToRelative(-4f, 4f)
                lineToRelative(-4f, -4f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(10.59f, 6f)
                horizontalLineTo(1f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(22f)
                verticalLineTo(6f)
                close()
                moveToRelative(-2f, 14f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(12f)
                close()
                moveTo(9f, 10f)
                verticalLineToRelative(8f)
                lineToRelative(7f, -4f)
                lineToRelative(-7f, -4f)
                close()
            }
        }.build()
        
        return _Live_tv!!
    }

private var _Live_tv: ImageVector? = null

