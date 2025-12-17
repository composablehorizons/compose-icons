package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Display_settings: ImageVector
    get() {
        if (_Display_settings != null) return _Display_settings!!
        
        _Display_settings = ImageVector.Builder(
            name = "display_settings",
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
                        moveTo(22f, 3f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(16f)
                        horizontalLineToRelative(6f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(6f)
                        verticalLineTo(3f)
                        close()
                        moveTo(20f, 17f)
                        horizontalLineTo(4f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6f, 8.25f)
                        horizontalLineTo(14f)
                        verticalLineTo(9.75f)
                        horizontalLineTo(6f)
                        verticalLineTo(8.25f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.5f, 9.75f)
                        lineTo(18f, 9.75f)
                        lineTo(18f, 8.25f)
                        lineTo(16.5f, 8.25f)
                        lineTo(16.5f, 7f)
                        lineTo(15f, 7f)
                        lineTo(15f, 11f)
                        lineTo(16.5f, 11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10f, 12.25f)
                        horizontalLineTo(18f)
                        verticalLineTo(13.75f)
                        horizontalLineTo(10f)
                        verticalLineTo(12.25f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7.5f, 15f)
                        lineTo(9f, 15f)
                        lineTo(9f, 11f)
                        lineTo(7.5f, 11f)
                        lineTo(7.5f, 12.25f)
                        lineTo(6f, 12.25f)
                        lineTo(6f, 13.75f)
                        lineTo(7.5f, 13.75f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Display_settings!!
    }

private var _Display_settings: ImageVector? = null

