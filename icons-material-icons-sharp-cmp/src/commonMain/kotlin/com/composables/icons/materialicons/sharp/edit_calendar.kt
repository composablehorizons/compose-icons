package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Edit_calendar: ImageVector
    get() {
        if (_Edit_calendar != null) return _Edit_calendar!!
        
        _Edit_calendar = ImageVector.Builder(
            name = "edit_calendar",
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
                    moveTo(12f, 22f)
                    horizontalLineTo(3f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(8f)
                    verticalLineTo(2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(8f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(10f)
                    horizontalLineToRelative(7f)
                    verticalLineTo(22f)
                    close()
                    moveTo(22.13f, 16.99f)
                    lineToRelative(1.41f, -1.41f)
                    lineToRelative(-2.12f, -2.12f)
                    lineToRelative(-1.41f, 1.41f)
                    lineTo(22.13f, 16.99f)
                    close()
                    moveTo(21.42f, 17.7f)
                    lineToRelative(-5.3f, 5.3f)
                    horizontalLineTo(14f)
                    verticalLineToRelative(-2.12f)
                    lineToRelative(5.3f, -5.3f)
                    lineTo(21.42f, 17.7f)
                    close()
                }
            }
        }.build()
        
        return _Edit_calendar!!
    }

private var _Edit_calendar: ImageVector? = null

