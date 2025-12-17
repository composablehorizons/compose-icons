package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Flashlight_on: ImageVector
    get() {
        if (_Flashlight_on != null) return _Flashlight_on!!
        
        _Flashlight_on = ImageVector.Builder(
            name = "flashlight_on",
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
                        moveTo(18f, 2f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(6f)
                        lineToRelative(2f, 3f)
                        verticalLineToRelative(11f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(11f)
                        lineToRelative(2f, -3f)
                        verticalLineTo(2f)
                        close()
                        moveTo(16f, 4f)
                        verticalLineToRelative(1f)
                        horizontalLineTo(8f)
                        verticalLineTo(4f)
                        horizontalLineTo(16f)
                        close()
                        moveTo(14f, 10.4f)
                        verticalLineTo(20f)
                        horizontalLineToRelative(-4f)
                        verticalLineToRelative(-9.61f)
                        lineToRelative(-2f, -3f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(0.39f)
                        lineTo(14f, 10.4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13.5f, 14f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 12f, 15.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 10.5f, 14f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 13.5f, 14f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Flashlight_on!!
    }

private var _Flashlight_on: ImageVector? = null

