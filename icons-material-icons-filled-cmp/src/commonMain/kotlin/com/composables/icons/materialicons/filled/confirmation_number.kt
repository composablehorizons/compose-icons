package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Confirmation_number: ImageVector
    get() {
        if (_Confirmation_number != null) return _Confirmation_number!!
        
        _Confirmation_number = ImageVector.Builder(
            name = "confirmation_number",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(22f, 10f)
                            verticalLineTo(6f)
                            curveToRelative(0f, -1.11f, -0.9f, -2f, -2f, -2f)
                            horizontalLineTo(4f)
                            curveTo(2.9f, 4f, 2.01f, 4.89f, 2.01f, 6f)
                            verticalLineToRelative(4f)
                            curveTo(3.11f, 10f, 4f, 10.9f, 4f, 12f)
                            reflectiveCurveToRelative(-0.89f, 2f, -2f, 2f)
                            verticalLineToRelative(4f)
                            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                            horizontalLineToRelative(16f)
                            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                            verticalLineToRelative(-4f)
                            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                            reflectiveCurveTo(20.9f, 10f, 22f, 10f)
                            close()
                            moveTo(13f, 17.5f)
                            horizontalLineToRelative(-2f)
                            verticalLineToRelative(-2f)
                            horizontalLineToRelative(2f)
                            verticalLineTo(17.5f)
                            close()
                            moveTo(13f, 13f)
                            horizontalLineToRelative(-2f)
                            verticalLineToRelative(-2f)
                            horizontalLineToRelative(2f)
                            verticalLineTo(13f)
                            close()
                            moveTo(13f, 8.5f)
                            horizontalLineToRelative(-2f)
                            verticalLineToRelative(-2f)
                            horizontalLineToRelative(2f)
                            verticalLineTo(8.5f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Confirmation_number!!
    }

private var _Confirmation_number: ImageVector? = null

