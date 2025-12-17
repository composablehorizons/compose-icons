package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Polyline: ImageVector
    get() {
        if (_Polyline != null) return _Polyline!!
        
        _Polyline = ImageVector.Builder(
            name = "polyline",
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
                    moveTo(15f, 16f)
                    verticalLineToRelative(1.26f)
                    lineToRelative(-6f, -3f)
                    verticalLineToRelative(-3.17f)
                    lineTo(11.7f, 8f)
                    horizontalLineTo(16f)
                    verticalLineTo(2f)
                    horizontalLineToRelative(-6f)
                    verticalLineToRelative(4.9f)
                    lineTo(7.3f, 10f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(5f)
                    lineToRelative(7f, 3.5f)
                    verticalLineTo(22f)
                    horizontalLineToRelative(6f)
                    verticalLineToRelative(-6f)
                    horizontalLineTo(15f)
                    close()
                    moveTo(12f, 4f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(4f)
                    close()
                    moveTo(7f, 14f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(14f)
                    close()
                    moveTo(19f, 20f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(20f)
                    close()
                }
            }
        }.build()
        
        return _Polyline!!
    }

private var _Polyline: ImageVector? = null

