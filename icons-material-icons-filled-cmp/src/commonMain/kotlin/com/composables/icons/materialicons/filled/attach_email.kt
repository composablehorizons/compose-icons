package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Attach_email: ImageVector
    get() {
        if (_Attach_email != null) return _Attach_email!!
        
        _Attach_email = ImageVector.Builder(
            name = "attach_email",
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
                        moveTo(21f, 10f)
                        verticalLineTo(4f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(3f)
                        curveTo(1.9f, 2f, 1.01f, 2.9f, 1.01f, 4f)
                        lineTo(1f, 16f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(11f)
                        verticalLineToRelative(-5f)
                        curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                        horizontalLineTo(21f)
                        close()
                        moveTo(11f, 11f)
                        lineTo(3f, 6f)
                        verticalLineTo(4f)
                        lineToRelative(8f, 5f)
                        lineToRelative(8f, -5f)
                        verticalLineToRelative(2f)
                        lineTo(11f, 11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21f, 14f)
                        verticalLineToRelative(4f)
                        curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                        reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                        verticalLineToRelative(-4.5f)
                        curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                        reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                        verticalLineTo(18f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-4.5f)
                        curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                        reflectiveCurveTo(15f, 12.12f, 15f, 13.5f)
                        verticalLineTo(18f)
                        curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                        reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                        verticalLineToRelative(-4f)
                        horizontalLineTo(21f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Attach_email!!
    }

private var _Attach_email: ImageVector? = null

