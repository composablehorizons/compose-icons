package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Approval: ImageVector
    get() {
        if (_Approval != null) return _Approval!!
        
        _Approval = ImageVector.Builder(
            name = "approval",
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
                        moveTo(6f, 16f)
                        horizontalLineTo(18f)
                        verticalLineTo(18f)
                        horizontalLineTo(6f)
                        verticalLineTo(16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 4f)
                        curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                        lineToRelative(3f, 4f)
                        lineToRelative(3f, -4f)
                        curveTo(15f, 5.34f, 13.66f, 4f, 12f, 4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 2f)
                        curveTo(9.24f, 2f, 7f, 4.24f, 7f, 7f)
                        lineToRelative(5f, 7f)
                        lineToRelative(5f, -7f)
                        curveTo(17f, 4.24f, 14.76f, 2f, 12f, 2f)
                        close()
                        moveTo(12f, 11f)
                        lineTo(9f, 7f)
                        curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                        reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                        lineTo(12f, 11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18f, 14f)
                        horizontalLineToRelative(-6f)
                        horizontalLineTo(6f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(16f)
                        verticalLineToRelative(-6f)
                        curveTo(20f, 14.9f, 19.1f, 14f, 18f, 14f)
                        close()
                        moveTo(18f, 18f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(12f)
                        verticalLineTo(18f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Approval!!
    }

private var _Approval: ImageVector? = null

