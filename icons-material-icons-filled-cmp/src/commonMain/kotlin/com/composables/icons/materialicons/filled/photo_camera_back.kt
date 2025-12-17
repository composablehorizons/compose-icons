package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Photo_camera_back: ImageVector
    get() {
        if (_Photo_camera_back != null) return _Photo_camera_back!!
        
        _Photo_camera_back = ImageVector.Builder(
            name = "photo_camera_back",
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
                moveTo(20f, 5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(7f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(3.17f)
                lineTo(9f, 3f)
                horizontalLineToRelative(6f)
                lineToRelative(1.83f, 2f)
                horizontalLineTo(20f)
                close()
                moveToRelative(0f, 14f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(16f)
                close()
                moveToRelative(-6f, -7f)
                lineToRelative(-3f, 3.72f)
                lineTo(9f, 13f)
                lineToRelative(-3f, 4f)
                horizontalLineToRelative(12f)
                lineToRelative(-4f, -5f)
                close()
            }
        }.build()
        
        return _Photo_camera_back!!
    }

private var _Photo_camera_back: ImageVector? = null

