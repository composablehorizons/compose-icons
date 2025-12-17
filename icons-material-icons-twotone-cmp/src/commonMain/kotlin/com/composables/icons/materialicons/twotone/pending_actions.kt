package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Pending_actions: ImageVector
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
                    moveTo(18.65f, 19.35f)
                    lineToRelative(-2.15f, -2.15f)
                    verticalLineTo(14f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(2.79f)
                    lineToRelative(1.85f, 1.85f)
                    lineTo(18.65f, 19.35f)
                    close()
                    moveTo(17f, 10f)
                    curveToRelative(0.34f, 0f, 0.67f, 0.03f, 1f, 0.08f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(8f)
                    verticalLineTo(5f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(15f)
                    horizontalLineToRelative(4.68f)
                    curveTo(10.25f, 19.09f, 10f, 18.08f, 10f, 17f)
                    curveTo(10f, 13.13f, 13.13f, 10f, 17f, 10f)
                    close()
                    moveTo(12f, 5f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    curveTo(13f, 4.55f, 12.55f, 5f, 12f, 5f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(17f, 12f)
                    curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                    reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                    curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                    reflectiveCurveTo(19.76f, 12f, 17f, 12f)
                    close()
                    moveTo(18.65f, 19.35f)
                    lineToRelative(-2.15f, -2.15f)
                    verticalLineTo(14f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(2.79f)
                    lineToRelative(1.85f, 1.85f)
                    lineTo(18.65f, 19.35f)
                    close()
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
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(8f)
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
                }
            }
        }.build()
        
        return _Pending_actions!!
    }

private var _Pending_actions: ImageVector? = null

