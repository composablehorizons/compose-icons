package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Stop_screen_share: ImageVector
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
                moveTo(10.67f, 12.54f)
                curveTo(9.13f, 12.92f, 7.96f, 13.71f, 7f, 15f)
                curveToRelative(0.31f, -1.48f, 0.94f, -2.93f, 2.08f, -4.05f)
                lineTo(4.13f, 6.02f)
                horizontalLineTo(4f)
                verticalLineToRelative(10.01f)
                horizontalLineToRelative(10.14f)
                lineToRelative(-3.47f, -3.49f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21.79f, 18f)
                lineToRelative(2f, 2f)
                horizontalLineTo(24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.21f)
                close()
                moveTo(1.11f, 2.98f)
                lineToRelative(1.55f, 1.56f)
                curveToRelative(-0.41f, 0.37f, -0.66f, 0.89f, -0.66f, 1.48f)
                verticalLineTo(16f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2.01f, 2f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(18.13f)
                lineToRelative(2.71f, 2.71f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.52f, 1.57f)
                lineTo(1.11f, 2.98f)
                close()
                moveTo(4f, 6.02f)
                horizontalLineToRelative(0.13f)
                lineToRelative(4.95f, 4.93f)
                curveTo(7.94f, 12.07f, 7.31f, 13.52f, 7f, 15f)
                curveToRelative(0.96f, -1.29f, 2.13f, -2.08f, 3.67f, -2.46f)
                lineToRelative(3.46f, 3.48f)
                horizontalLineTo(4f)
                verticalLineToRelative(-10f)
                close()
                moveToRelative(16f, 0f)
                verticalLineToRelative(10.19f)
                lineToRelative(1.3f, 1.3f)
                curveToRelative(0.42f, -0.37f, 0.7f, -0.89f, 0.7f, -1.49f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -1.11f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(7.8f)
                lineToRelative(2f, 2f)
                horizontalLineTo(20f)
                close()
                moveToRelative(-7.07f, 3.13f)
                lineToRelative(2.79f, 2.78f)
                lineToRelative(1.28f, -1.2f)
                lineTo(13f, 7f)
                verticalLineToRelative(2.13f)
                lineToRelative(-0.07f, 0.02f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 6.02f)
                horizontalLineTo(9.8f)
                lineToRelative(3.13f, 3.13f)
                curveToRelative(0.02f, 0f, 0.04f, -0.01f, 0.07f, -0.02f)
                verticalLineTo(7f)
                lineToRelative(4f, 3.73f)
                lineToRelative(-1.28f, 1.2f)
                lineTo(20f, 16.21f)
                verticalLineTo(6.02f)
                close()
            }
        }.build()
        
        return _Stop_screen_share!!
    }

private var _Stop_screen_share: ImageVector? = null

