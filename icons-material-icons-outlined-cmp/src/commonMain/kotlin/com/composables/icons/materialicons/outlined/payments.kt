package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Payments: ImageVector
    get() {
        if (_Payments != null) return _Payments!!
        
        _Payments = ImageVector.Builder(
            name = "payments",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(19f, 14f)
                    verticalLineTo(6f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineTo(3f)
                    curveTo(1.9f, 4f, 1f, 4.9f, 1f, 6f)
                    verticalLineToRelative(8f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(14f)
                    curveTo(18.1f, 16f, 19f, 15.1f, 19f, 14f)
                    close()
                    moveTo(17f, 14f)
                    horizontalLineTo(3f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(14f)
                    verticalLineTo(14f)
                    close()
                    moveTo(10f, 7f)
                    curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                    reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                    reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                    reflectiveCurveTo(11.66f, 7f, 10f, 7f)
                    close()
                    moveTo(23f, 7f)
                    verticalLineToRelative(11f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    horizontalLineTo(4f)
                    curveToRelative(0f, -1f, 0f, -0.9f, 0f, -2f)
                    horizontalLineToRelative(17f)
                    verticalLineTo(7f)
                    curveTo(22.1f, 7f, 22f, 7f, 23f, 7f)
                    close()
                }
            }
        }.build()
        
        return _Payments!!
    }

private var _Payments: ImageVector? = null

