package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Settings_ethernet: ImageVector
    get() {
        if (_Settings_ethernet != null) return _Settings_ethernet!!
        
        _Settings_ethernet = ImageVector.Builder(
            name = "settings_ethernet",
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
                moveTo(7.77f, 6.76f)
                lineTo(6.23f, 5.48f)
                lineTo(0.82f, 12f)
                lineToRelative(5.41f, 6.52f)
                lineToRelative(1.54f, -1.28f)
                lineTo(3.42f, 12f)
                lineToRelative(4.35f, -5.24f)
                close()
                moveTo(7f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(7f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(10f, -2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(-6f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(6.77f, -7.52f)
                lineToRelative(-1.54f, 1.28f)
                lineTo(20.58f, 12f)
                lineToRelative(-4.35f, 5.24f)
                lineToRelative(1.54f, 1.28f)
                lineTo(23.18f, 12f)
                lineToRelative(-5.41f, -6.52f)
                close()
            }
        }.build()
        
        return _Settings_ethernet!!
    }

private var _Settings_ethernet: ImageVector? = null

