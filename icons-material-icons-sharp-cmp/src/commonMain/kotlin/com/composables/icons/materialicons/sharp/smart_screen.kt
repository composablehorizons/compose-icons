package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Smart_screen: ImageVector
    get() {
        if (_Smart_screen != null) return _Smart_screen!!
        
        _Smart_screen = ImageVector.Builder(
            name = "smart_screen",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(1f, 5f)
                        verticalLineToRelative(14f)
                        horizontalLineToRelative(22f)
                        verticalLineTo(5f)
                        horizontalLineTo(1f)
                        close()
                        moveTo(18f, 17f)
                        horizontalLineTo(6f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(12f)
                        verticalLineTo(17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12.5f, 11.25f)
                        horizontalLineTo(14f)
                        verticalLineTo(12.75f)
                        horizontalLineTo(12.5f)
                        verticalLineTo(11.25f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 11.25f)
                        horizontalLineTo(16.5f)
                        verticalLineTo(12.75f)
                        horizontalLineTo(15f)
                        verticalLineTo(11.25f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 11.25f)
                        horizontalLineTo(11.5f)
                        verticalLineTo(12.75f)
                        horizontalLineTo(10f)
                        verticalLineTo(11.25f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7.5f, 11.25f)
                        horizontalLineTo(9f)
                        verticalLineTo(12.75f)
                        horizontalLineTo(7.5f)
                        verticalLineTo(11.25f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Smart_screen!!
    }

private var _Smart_screen: ImageVector? = null

