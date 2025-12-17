package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Photo_album: ImageVector
    get() {
        if (_Photo_album != null) return _Photo_album!!
        
        _Photo_album = ImageVector.Builder(
            name = "photo_album",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(18f, 2f)
                    horizontalLineTo(6f)
                    curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                    verticalLineToRelative(16f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(12f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(4f)
                    curveTo(20f, 2.9f, 19.1f, 2f, 18f, 2f)
                    close()
                    moveTo(15.24f, 10.55f)
                    lineTo(13.5f, 9.5f)
                    lineToRelative(-1.74f, 1.05f)
                    curveToRelative(-0.33f, 0.2f, -0.76f, -0.04f, -0.76f, -0.43f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(6.12f)
                    curveTo(16f, 10.51f, 15.58f, 10.75f, 15.24f, 10.55f)
                    close()
                    moveTo(7.6f, 17.2f)
                    lineToRelative(1.38f, -1.83f)
                    curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0f)
                    lineTo(11f, 17f)
                    lineToRelative(2.23f, -2.97f)
                    curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0f)
                    lineToRelative(2.38f, 3.17f)
                    curveToRelative(0.25f, 0.33f, 0.01f, 0.8f, -0.4f, 0.8f)
                    horizontalLineTo(8f)
                    curveTo(7.59f, 18f, 7.35f, 17.53f, 7.6f, 17.2f)
                    close()
                }
            }
        }.build()
        
        return _Photo_album!!
    }

private var _Photo_album: ImageVector? = null

