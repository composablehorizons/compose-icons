package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Control_camera: ImageVector
    get() {
        if (_Control_camera != null) return _Control_camera!!
        
        _Control_camera = ImageVector.Builder(
            name = "control_camera",
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
                moveTo(5.54f, 8.46f)
                lineTo(2f, 12f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(1.76f, -1.77f)
                lineTo(5.54f, 12f)
                lineToRelative(1.76f, -1.77f)
                close()
                moveToRelative(12.92f, 0f)
                lineToRelative(-1.76f, 1.77f)
                lineTo(18.46f, 12f)
                lineToRelative(-1.76f, 1.77f)
                lineToRelative(1.76f, 1.77f)
                lineTo(22f, 12f)
                close()
                moveToRelative(-6.46f, 10f)
                lineToRelative(-1.77f, -1.76f)
                lineToRelative(-1.77f, 1.76f)
                lineTo(12f, 22f)
                lineToRelative(3.54f, -3.54f)
                lineToRelative(-1.77f, -1.76f)
                close()
                moveTo(8.46f, 5.54f)
                lineToRelative(1.77f, 1.76f)
                lineTo(12f, 5.54f)
                lineToRelative(1.77f, 1.76f)
                lineToRelative(1.77f, -1.76f)
                lineTo(12f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 12f)
                arcTo(3f, 3f, 0f, false, true, 12f, 15f)
                arcTo(3f, 3f, 0f, false, true, 9f, 12f)
                arcTo(3f, 3f, 0f, false, true, 15f, 12f)
                close()
            }
        }.build()
        
        return _Control_camera!!
    }

private var _Control_camera: ImageVector? = null

