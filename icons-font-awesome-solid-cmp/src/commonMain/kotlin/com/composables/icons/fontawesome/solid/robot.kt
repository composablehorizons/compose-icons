package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Robot: ImageVector
    get() {
        if (_Robot != null) return _Robot!!
        
        _Robot = ImageVector.Builder(
            name = "robot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(32f, 224f)
                horizontalLineTo(64f)
                verticalLineTo(416f)
                horizontalLineTo(32f)
                arcTo(31.96166f, 31.96166f, 0f, false, true, 0f, 384f)
                verticalLineTo(256f)
                arcTo(31.96166f, 31.96166f, 0f, false, true, 32f, 224f)
                close()
                moveToRelative(512f, -48f)
                verticalLineTo(448f)
                arcToRelative(64.06328f, 64.06328f, 0f, false, true, -64f, 64f)
                horizontalLineTo(160f)
                arcToRelative(64.06328f, 64.06328f, 0f, false, true, -64f, -64f)
                verticalLineTo(176f)
                arcToRelative(79.974f, 79.974f, 0f, false, true, 80f, -80f)
                horizontalLineTo(288f)
                verticalLineTo(32f)
                arcToRelative(32f, 32f, 0f, false, true, 64f, 0f)
                verticalLineTo(96f)
                horizontalLineTo(464f)
                arcTo(79.974f, 79.974f, 0f, false, true, 544f, 176f)
                close()
                moveTo(264f, 256f)
                arcToRelative(40f, 40f, 0f, true, false, -40f, 40f)
                arcTo(39.997f, 39.997f, 0f, false, false, 264f, 256f)
                close()
                moveToRelative(-8f, 128f)
                horizontalLineTo(192f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(64f)
                close()
                moveToRelative(96f, 0f)
                horizontalLineTo(288f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(64f)
                close()
                moveTo(456f, 256f)
                arcToRelative(40f, 40f, 0f, true, false, -40f, 40f)
                arcTo(39.997f, 39.997f, 0f, false, false, 456f, 256f)
                close()
                moveToRelative(-8f, 128f)
                horizontalLineTo(384f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(64f)
                close()
                moveTo(640f, 256f)
                verticalLineTo(384f)
                arcToRelative(31.96166f, 31.96166f, 0f, false, true, -32f, 32f)
                horizontalLineTo(576f)
                verticalLineTo(224f)
                horizontalLineToRelative(32f)
                arcTo(31.96166f, 31.96166f, 0f, false, true, 640f, 256f)
                close()
            }
        }.build()
        
        return _Robot!!
    }

private var _Robot: ImageVector? = null

