package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Edit_notifications: ImageVector
    get() {
        if (_Edit_notifications != null) return _Edit_notifications!!
        
        _Edit_notifications = ImageVector.Builder(
            name = "edit_notifications",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(17.58f, 6.25f)
                    lineToRelative(1.77f, 1.77f)
                    lineTo(14.37f, 13f)
                    horizontalLineTo(12.6f)
                    verticalLineToRelative(-1.77f)
                    lineTo(17.58f, 6.25f)
                    close()
                    moveTo(20.85f, 5.81f)
                    lineToRelative(-1.06f, -1.06f)
                    curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                    lineToRelative(-0.85f, 0.85f)
                    lineToRelative(1.77f, 1.77f)
                    lineToRelative(0.85f, -0.85f)
                    curveTo(21.05f, 6.32f, 21.05f, 6f, 20.85f, 5.81f)
                    close()
                    moveTo(18f, 12.2f)
                    verticalLineTo(17f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-7f)
                    curveToRelative(0f, -2.79f, 1.91f, -5.14f, 4.5f, -5.8f)
                    verticalLineTo(3.5f)
                    curveTo(10.5f, 2.67f, 11.17f, 2f, 12f, 2f)
                    reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                    verticalLineToRelative(0.7f)
                    curveToRelative(0.82f, 0.21f, 1.57f, 0.59f, 2.21f, 1.09f)
                    lineTo(10.6f, 10.4f)
                    verticalLineTo(15f)
                    horizontalLineToRelative(4.6f)
                    lineTo(18f, 12.2f)
                    close()
                    moveTo(10f, 20f)
                    horizontalLineToRelative(4f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    reflectiveCurveTo(10f, 21.1f, 10f, 20f)
                    close()
                }
            }
        }.build()
        
        return _Edit_notifications!!
    }

private var _Edit_notifications: ImageVector? = null

