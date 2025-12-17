package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.App_registration: ImageVector
    get() {
        if (_App_registration != null) return _App_registration!!
        
        _App_registration = ImageVector.Builder(
            name = "app_registration",
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
                        moveTo(10f, 4f)
                        horizontalLineTo(14f)
                        verticalLineTo(8f)
                        horizontalLineTo(10f)
                        verticalLineTo(4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(4f, 16f)
                        horizontalLineTo(8f)
                        verticalLineTo(20f)
                        horizontalLineTo(4f)
                        verticalLineTo(16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(4f, 10f)
                        horizontalLineTo(8f)
                        verticalLineTo(14f)
                        horizontalLineTo(4f)
                        verticalLineTo(10f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(4f, 4f)
                        horizontalLineTo(8f)
                        verticalLineTo(8f)
                        horizontalLineTo(4f)
                        verticalLineTo(4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 4f)
                        horizontalLineTo(20f)
                        verticalLineTo(8f)
                        horizontalLineTo(16f)
                        verticalLineTo(4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 17.86f)
                        lineTo(11f, 20f)
                        lineTo(13.1f, 20f)
                        lineTo(19.08f, 14.03f)
                        lineTo(16.96f, 11.91f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 12.03f)
                        lineTo(14f, 10f)
                        lineTo(10f, 10f)
                        lineTo(10f, 14f)
                        lineTo(12.03f, 14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.671352f, 11.205703f)
                        lineTo(19.085552f, 9.791503f)
                        lineTo(21.206852f, 11.912803f)
                        lineTo(19.792652f, 13.327003f)
                        close()
                    }
                }
            }
        }.build()
        
        return _App_registration!!
    }

private var _App_registration: ImageVector? = null

