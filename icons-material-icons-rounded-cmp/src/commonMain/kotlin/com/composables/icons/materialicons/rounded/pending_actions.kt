package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Pending_actions: ImageVector
    get() {
        if (_Pending_actions != null) return _Pending_actions!!
        
        _Pending_actions = ImageVector.Builder(
            name = "pending_actions",
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
                    moveTo(18f, 3f)
                    horizontalLineToRelative(-3.18f)
                    curveTo(14.4f, 1.84f, 13.3f, 1f, 12f, 1f)
                    reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3f)
                    horizontalLineTo(6f)
                    curveTo(4.9f, 3f, 4f, 3.9f, 4f, 5f)
                    verticalLineToRelative(15f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(6.11f)
                    curveToRelative(-0.59f, -0.57f, -1.07f, -1.25f, -1.42f, -2f)
                    horizontalLineTo(6f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(4f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(5.08f)
                    curveToRelative(0.71f, 0.1f, 1.38f, 0.31f, 2f, 0.6f)
                    verticalLineTo(5f)
                    curveTo(20f, 3.9f, 19.1f, 3f, 18f, 3f)
                    close()
                    moveTo(12f, 5f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    curveTo(13f, 4.55f, 12.55f, 5f, 12f, 5f)
                    close()
                    moveTo(17f, 12f)
                    curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                    reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                    curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                    reflectiveCurveTo(19.76f, 12f, 17f, 12f)
                    close()
                    moveTo(18.29f, 19f)
                    lineToRelative(-1.65f, -1.65f)
                    curveToRelative(-0.09f, -0.09f, -0.15f, -0.22f, -0.15f, -0.35f)
                    lineToRelative(0f, -2.49f)
                    curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                    lineToRelative(0f, 2.29f)
                    lineToRelative(1.5f, 1.5f)
                    curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                    verticalLineToRelative(0f)
                    curveTo(18.8f, 19.2f, 18.49f, 19.2f, 18.29f, 19f)
                    close()
                }
            }
        }.build()
        
        return _Pending_actions!!
    }

private var _Pending_actions: ImageVector? = null

