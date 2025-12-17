package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Meeting_room: ImageVector
    get() {
        if (_Meeting_room != null) return _Meeting_room!!
        
        _Meeting_room = ImageVector.Builder(
            name = "meeting_room",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
            }
            group {
                group {
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(20f, 19f)
                            horizontalLineToRelative(-1f)
                            verticalLineTo(5f)
                            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                            horizontalLineToRelative(-4f)
                            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                            horizontalLineTo(6f)
                            curveTo(5.45f, 3f, 5f, 3.45f, 5f, 4f)
                            verticalLineToRelative(15f)
                            horizontalLineTo(4f)
                            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                            reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                            horizontalLineToRelative(9f)
                            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                            verticalLineTo(6f)
                            horizontalLineToRelative(3f)
                            verticalLineToRelative(14f)
                            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                            horizontalLineToRelative(2f)
                            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                            reflectiveCurveTo(20.55f, 19f, 20f, 19f)
                            close()
                            moveTo(11f, 13f)
                            lineTo(11f, 13f)
                            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                            verticalLineToRelative(0f)
                            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                            horizontalLineToRelative(0f)
                            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                            verticalLineToRelative(0f)
                            curveTo(12f, 12.55f, 11.55f, 13f, 11f, 13f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Meeting_room!!
    }

private var _Meeting_room: ImageVector? = null

