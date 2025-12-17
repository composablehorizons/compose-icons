package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Temple_hindu: ImageVector
    get() {
        if (_Temple_hindu != null) return _Temple_hindu!!
        
        _Temple_hindu = ImageVector.Builder(
            name = "temple_hindu",
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
                    moveTo(20f, 11f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-2f)
                    lineTo(15f, 3f)
                    verticalLineTo(1f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-2.03f)
                    verticalLineTo(1f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2.12f)
                    lineTo(6f, 13f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(11f)
                    horizontalLineToRelative(9f)
                    verticalLineToRelative(-5f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(5f)
                    horizontalLineToRelative(9f)
                    verticalLineTo(11f)
                    horizontalLineTo(20f)
                    close()
                    moveTo(15.31f, 11f)
                    horizontalLineTo(8.69f)
                    lineToRelative(0.6f, -2f)
                    horizontalLineToRelative(5.42f)
                    lineTo(15.31f, 11f)
                    close()
                    moveTo(14.11f, 7f)
                    horizontalLineTo(9.89f)
                    lineToRelative(0.6f, -2f)
                    horizontalLineToRelative(3.02f)
                    lineTo(14.11f, 7f)
                    close()
                    moveTo(20f, 20f)
                    horizontalLineToRelative(-5f)
                    verticalLineToRelative(-5f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(5f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(-5f)
                    horizontalLineToRelative(3.49f)
                    lineToRelative(0.6f, -2f)
                    horizontalLineToRelative(7.82f)
                    lineToRelative(0.6f, 2f)
                    horizontalLineTo(20f)
                    verticalLineTo(20f)
                    close()
                }
            }
        }.build()
        
        return _Temple_hindu!!
    }

private var _Temple_hindu: ImageVector? = null

