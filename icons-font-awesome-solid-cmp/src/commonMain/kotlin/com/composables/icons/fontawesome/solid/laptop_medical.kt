package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.LaptopMedical: ImageVector
    get() {
        if (_LaptopMedical != null) return _LaptopMedical!!
        
        _LaptopMedical = ImageVector.Builder(
            name = "laptop-medical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(232f, 224f)
                horizontalLineToRelative(56f)
                verticalLineToRelative(56f)
                arcToRelative(8f, 8f, 0f, false, false, 8f, 8f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, false, false, 8f, -8f)
                verticalLineToRelative(-56f)
                horizontalLineToRelative(56f)
                arcToRelative(8f, 8f, 0f, false, false, 8f, -8f)
                verticalLineToRelative(-48f)
                arcToRelative(8f, 8f, 0f, false, false, -8f, -8f)
                horizontalLineToRelative(-56f)
                verticalLineToRelative(-56f)
                arcToRelative(8f, 8f, 0f, false, false, -8f, -8f)
                horizontalLineToRelative(-48f)
                arcToRelative(8f, 8f, 0f, false, false, -8f, 8f)
                verticalLineToRelative(56f)
                horizontalLineToRelative(-56f)
                arcToRelative(8f, 8f, 0f, false, false, -8f, 8f)
                verticalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, false, false, 8f, 8f)
                close()
                moveTo(576f, 48f)
                arcToRelative(48.14f, 48.14f, 0f, false, false, -48f, -48f)
                horizontalLineTo(112f)
                arcToRelative(48.14f, 48.14f, 0f, false, false, -48f, 48f)
                verticalLineToRelative(336f)
                horizontalLineToRelative(512f)
                close()
                moveToRelative(-64f, 272f)
                horizontalLineTo(128f)
                verticalLineTo(64f)
                horizontalLineToRelative(384f)
                close()
                moveToRelative(112f, 96f)
                horizontalLineTo(381.54f)
                curveToRelative(-0.74f, 19.81f, -14.71f, 32f, -32.74f, 32f)
                horizontalLineTo(288f)
                curveToRelative(-18.69f, 0f, -33f, -17.47f, -32.77f, -32f)
                horizontalLineTo(16f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(16f)
                arcToRelative(64.19f, 64.19f, 0f, false, false, 64f, 64f)
                horizontalLineToRelative(512f)
                arcToRelative(64.19f, 64.19f, 0f, false, false, 64f, -64f)
                verticalLineToRelative(-16f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
            }
        }.build()
        
        return _LaptopMedical!!
    }

private var _LaptopMedical: ImageVector? = null

