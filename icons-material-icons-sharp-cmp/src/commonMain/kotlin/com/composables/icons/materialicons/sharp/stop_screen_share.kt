package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Stop_screen_share: ImageVector
    get() {
        if (_Stop_screen_share != null) return _Stop_screen_share!!
        
        _Stop_screen_share = ImageVector.Builder(
            name = "stop_screen_share",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21.79f, 18f)
                lineToRelative(2f, 2f)
                horizontalLineTo(24f)
                verticalLineToRelative(-2f)
                close()
                moveTo(13f, 9.13f)
                verticalLineTo(7f)
                lineToRelative(4f, 3.74f)
                lineToRelative(-1.28f, 1.19f)
                lineToRelative(5.18f, 5.18f)
                lineTo(22f, 16f)
                verticalLineTo(4.02f)
                horizontalLineTo(7.8f)
                lineToRelative(5.13f, 5.13f)
                curveToRelative(0.03f, -0.01f, 0.05f, -0.02f, 0.07f, -0.02f)
                close()
                moveTo(1.11f, 2.98f)
                lineToRelative(0.89f, 0.9f)
                verticalLineToRelative(12.14f)
                lineToRelative(2f, 1.99f)
                lineTo(0f, 18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(18.13f)
                lineToRelative(2.71f, 2.71f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.52f, 1.57f)
                lineTo(1.11f, 2.98f)
                close()
                moveToRelative(7.97f, 7.97f)
                lineToRelative(1.59f, 1.59f)
                curveTo(9.13f, 12.92f, 7.96f, 13.71f, 7f, 15f)
                curveToRelative(0.31f, -1.48f, 0.94f, -2.93f, 2.08f, -4.05f)
                close()
            }
        }.build()
        
        return _Stop_screen_share!!
    }

private var _Stop_screen_share: ImageVector? = null

