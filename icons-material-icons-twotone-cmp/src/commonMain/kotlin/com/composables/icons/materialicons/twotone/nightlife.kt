package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Nightlife: ImageVector
    get() {
        if (_Nightlife != null) return _Nightlife!!
        
        _Nightlife = ImageVector.Builder(
            name = "nightlife",
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
                            moveTo(1f, 5f)
                            horizontalLineToRelative(14f)
                            lineToRelative(-6f, 9f)
                            verticalLineToRelative(4f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(2f)
                            horizontalLineTo(5f)
                            verticalLineToRelative(-2f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(-4f)
                            lineTo(1f, 5f)
                            close()
                            moveTo(10.1f, 9f)
                            lineToRelative(1.4f, -2f)
                            horizontalLineTo(4.49f)
                            lineToRelative(1.4f, 2f)
                            horizontalLineTo(10.1f)
                            close()
                            moveTo(17f, 5f)
                            horizontalLineToRelative(5f)
                            verticalLineToRelative(3f)
                            horizontalLineToRelative(-3f)
                            verticalLineToRelative(9f)
                            lineToRelative(0f, 0f)
                            curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                            reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                            reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                            curveToRelative(0.35f, 0f, 0.69f, 0.06f, 1f, 0.17f)
                            verticalLineTo(5f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Nightlife!!
    }

private var _Nightlife: ImageVector? = null

