package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Password: ImageVector
    get() {
        if (_Password != null) return _Password!!
        
        _Password = ImageVector.Builder(
            name = "password",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2f, 17f)
                        horizontalLineToRelative(20f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(2f)
                        verticalLineTo(17f)
                        close()
                        moveTo(3.15f, 12.95f)
                        lineTo(4f, 11.47f)
                        lineToRelative(0.85f, 1.48f)
                        lineToRelative(1.3f, -0.75f)
                        lineTo(5.3f, 10.72f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(-1.5f)
                        horizontalLineTo(5.3f)
                        lineToRelative(0.85f, -1.47f)
                        lineTo(4.85f, 7f)
                        lineTo(4f, 8.47f)
                        lineTo(3.15f, 7f)
                        lineToRelative(-1.3f, 0.75f)
                        lineTo(2.7f, 9.22f)
                        horizontalLineTo(1f)
                        verticalLineToRelative(1.5f)
                        horizontalLineToRelative(1.7f)
                        lineTo(1.85f, 12.2f)
                        lineTo(3.15f, 12.95f)
                        close()
                        moveTo(9.85f, 12.2f)
                        lineToRelative(1.3f, 0.75f)
                        lineTo(12f, 11.47f)
                        lineToRelative(0.85f, 1.48f)
                        lineToRelative(1.3f, -0.75f)
                        lineToRelative(-0.85f, -1.48f)
                        horizontalLineTo(15f)
                        verticalLineToRelative(-1.5f)
                        horizontalLineToRelative(-1.7f)
                        lineToRelative(0.85f, -1.47f)
                        lineTo(12.85f, 7f)
                        lineTo(12f, 8.47f)
                        lineTo(11.15f, 7f)
                        lineToRelative(-1.3f, 0.75f)
                        lineToRelative(0.85f, 1.47f)
                        horizontalLineTo(9f)
                        verticalLineToRelative(1.5f)
                        horizontalLineToRelative(1.7f)
                        lineTo(9.85f, 12.2f)
                        close()
                        moveTo(23f, 9.22f)
                        horizontalLineToRelative(-1.7f)
                        lineToRelative(0.85f, -1.47f)
                        lineTo(20.85f, 7f)
                        lineTo(20f, 8.47f)
                        lineTo(19.15f, 7f)
                        lineToRelative(-1.3f, 0.75f)
                        lineToRelative(0.85f, 1.47f)
                        horizontalLineTo(17f)
                        verticalLineToRelative(1.5f)
                        horizontalLineToRelative(1.7f)
                        lineToRelative(-0.85f, 1.48f)
                        lineToRelative(1.3f, 0.75f)
                        lineTo(20f, 11.47f)
                        lineToRelative(0.85f, 1.48f)
                        lineToRelative(1.3f, -0.75f)
                        lineToRelative(-0.85f, -1.48f)
                        horizontalLineTo(23f)
                        verticalLineTo(9.22f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Password!!
    }

private var _Password: ImageVector? = null

