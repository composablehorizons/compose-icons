package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Local_printshop: ImageVector
    get() {
        if (_Local_printshop != null) return _Local_printshop!!
        
        _Local_printshop = ImageVector.Builder(
            name = "local_printshop",
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
                        moveTo(18f, 7f)
                        verticalLineTo(4f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineTo(7f)
                        curveTo(6.45f, 3f, 6f, 3.45f, 6f, 4f)
                        verticalLineToRelative(3f)
                        horizontalLineTo(18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 8f)
                        horizontalLineTo(5f)
                        curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                        verticalLineToRelative(5f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(2f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(8f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(3f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-5f)
                        curveTo(22f, 9.34f, 20.66f, 8f, 19f, 8f)
                        close()
                        moveTo(16f, 19f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(-4f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(19f)
                        close()
                        moveTo(18f, 12.5f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        reflectiveCurveTo(18.55f, 12.5f, 18f, 12.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Local_printshop!!
    }

private var _Local_printshop: ImageVector? = null

