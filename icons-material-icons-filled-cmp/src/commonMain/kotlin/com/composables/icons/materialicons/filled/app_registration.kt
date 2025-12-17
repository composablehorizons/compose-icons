package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.App_registration: ImageVector
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
                        moveTo(14f, 12.42f)
                        lineTo(14f, 10f)
                        lineTo(10f, 10f)
                        lineTo(10f, 14f)
                        lineTo(12.42f, 14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.88f, 11.29f)
                        lineToRelative(-1.17f, -1.17f)
                        curveToRelative(-0.16f, -0.16f, -0.42f, -0.16f, -0.58f, 0f)
                        lineTo(18.25f, 11f)
                        lineTo(20f, 12.75f)
                        lineToRelative(0.88f, -0.88f)
                        curveTo(21.04f, 11.71f, 21.04f, 11.45f, 20.88f, 11.29f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 18.25f)
                        lineTo(11f, 20f)
                        lineTo(12.75f, 20f)
                        lineTo(19.42f, 13.33f)
                        lineTo(17.67f, 11.58f)
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
                }
            }
        }.build()
        
        return _App_registration!!
    }

private var _App_registration: ImageVector? = null

