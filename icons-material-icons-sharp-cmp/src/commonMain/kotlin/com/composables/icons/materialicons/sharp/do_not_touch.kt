package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Do_not_touch: ImageVector
    get() {
        if (_Do_not_touch != null) return _Do_not_touch!!
        
        _Do_not_touch = ImageVector.Builder(
            name = "do_not_touch",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(13f, 10.17f)
                    lineToRelative(-2.5f, -2.5f)
                    verticalLineTo(1f)
                    horizontalLineTo(13f)
                    verticalLineTo(10.17f)
                    close()
                    moveTo(20f, 4f)
                    horizontalLineToRelative(-2.5f)
                    verticalLineToRelative(7f)
                    horizontalLineToRelative(-1f)
                    verticalLineTo(2f)
                    horizontalLineTo(14f)
                    verticalLineToRelative(9.17f)
                    lineToRelative(6f, 6f)
                    verticalLineTo(4f)
                    close()
                    moveTo(9.5f, 3f)
                    horizontalLineTo(7.01f)
                    verticalLineToRelative(1.18f)
                    lineTo(9.5f, 6.67f)
                    verticalLineTo(3f)
                    close()
                    moveTo(21.19f, 21.19f)
                    lineTo(2.81f, 2.81f)
                    lineTo(1.39f, 4.22f)
                    lineTo(7f, 9.83f)
                    verticalLineToRelative(4.3f)
                    lineToRelative(-3.32f, -1.9f)
                    lineTo(2f, 13.88f)
                    lineTo(9.68f, 22f)
                    horizontalLineToRelative(9.54f)
                    lineToRelative(0.56f, 0.61f)
                    lineTo(21.19f, 21.19f)
                    close()
                }
            }
        }.build()
        
        return _Do_not_touch!!
    }

private var _Do_not_touch: ImageVector? = null

