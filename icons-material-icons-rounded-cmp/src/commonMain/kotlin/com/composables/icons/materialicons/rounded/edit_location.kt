package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Edit_location: ImageVector
    get() {
        if (_Edit_location != null) return _Edit_location!!
        
        _Edit_location = ImageVector.Builder(
            name = "edit_location",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 2f)
                    curveToRelative(-4.2f, 0f, -8f, 3.22f, -8f, 8.2f)
                    curveToRelative(0f, 3.18f, 2.45f, 6.92f, 7.34f, 11.23f)
                    curveToRelative(0.38f, 0.33f, 0.95f, 0.33f, 1.33f, 0f)
                    curveTo(17.55f, 17.12f, 20f, 13.38f, 20f, 10.2f)
                    curveTo(20f, 5.22f, 16.2f, 2f, 12f, 2f)
                    close()
                    moveTo(9.73f, 13.5f)
                    horizontalLineTo(8.5f)
                    verticalLineToRelative(-1.44f)
                    lineToRelative(3.93f, -3.92f)
                    lineToRelative(1.43f, 1.43f)
                    lineToRelative(-3.77f, 3.78f)
                    curveTo(9.99f, 13.45f, 9.87f, 13.5f, 9.73f, 13.5f)
                    close()
                    moveTo(15.28f, 8.16f)
                    lineToRelative(-0.7f, 0.7f)
                    lineToRelative(-1.44f, -1.44f)
                    lineToRelative(0.7f, -0.7f)
                    curveToRelative(0.15f, -0.15f, 0.39f, -0.15f, 0.54f, 0f)
                    lineToRelative(0.9f, 0.9f)
                    curveTo(15.43f, 7.77f, 15.43f, 8.01f, 15.28f, 8.16f)
                    close()
                }
            }
        }.build()
        
        return _Edit_location!!
    }

private var _Edit_location: ImageVector? = null

