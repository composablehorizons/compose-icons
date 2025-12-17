package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Switch_camera: ImageVector
    get() {
        if (_Switch_camera != null) return _Switch_camera!!
        
        _Switch_camera = ImageVector.Builder(
            name = "switch_camera",
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
                moveTo(14.12f, 4f)
                horizontalLineTo(9.88f)
                lineTo(8.05f, 6f)
                horizontalLineTo(4f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(16f)
                verticalLineTo(6f)
                horizontalLineToRelative(-4.05f)
                lineToRelative(-1.83f, -2f)
                close()
                moveTo(15f, 15.5f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineToRelative(2.5f)
                lineTo(5.5f, 12f)
                lineTo(9f, 8.5f)
                verticalLineTo(11f)
                horizontalLineToRelative(6f)
                verticalLineTo(8.5f)
                lineToRelative(3.5f, 3.5f)
                lineToRelative(-3.5f, 3.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 4f)
                horizontalLineToRelative(-3.17f)
                lineTo(15f, 2f)
                horizontalLineTo(9f)
                lineTo(7.17f, 4f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 14f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineToRelative(4.05f)
                lineToRelative(1.83f, -2f)
                horizontalLineToRelative(4.24f)
                lineToRelative(1.83f, 2f)
                horizontalLineTo(20f)
                verticalLineToRelative(12f)
                close()
                moveToRelative(-5f, -7f)
                horizontalLineTo(9f)
                verticalLineTo(8.5f)
                lineTo(5.5f, 12f)
                lineTo(9f, 15.5f)
                verticalLineTo(13f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2.5f)
                lineToRelative(3.5f, -3.5f)
                lineTo(15f, 8.5f)
                close()
            }
        }.build()
        
        return _Switch_camera!!
    }

private var _Switch_camera: ImageVector? = null

