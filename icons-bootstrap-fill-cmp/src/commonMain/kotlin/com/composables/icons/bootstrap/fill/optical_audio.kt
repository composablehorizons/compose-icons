package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.OpticalAudio: ImageVector
    get() {
        if (_OpticalAudio != null) return _OpticalAudio!!
        
        _OpticalAudio = ImageVector.Builder(
            name = "optical-audio",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 6f)
                arcToRelative(3f, 3f, 0f, true, true, 0f, 6f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, -6f)
                moveToRelative(1f, 3f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 15f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-3.05f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 0f, -4.9f)
                verticalLineTo(4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.146f, -0.354f)
                lineToRelative(2f, -2f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4.5f, 2f)
                horizontalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.354f, 0.146f)
                lineToRelative(2f, 2f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14f, 4.5f)
                verticalLineToRelative(2.05f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 0f, 4.9f)
                verticalLineToRelative(3.05f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                close()
                moveTo(8f, 5f)
                arcToRelative(4f, 4f, 0f, true, false, 0f, 8f)
                arcToRelative(4f, 4f, 0f, false, false, 0f, -8f)
            }
        }.build()
        
        return _OpticalAudio!!
    }

private var _OpticalAudio: ImageVector? = null

