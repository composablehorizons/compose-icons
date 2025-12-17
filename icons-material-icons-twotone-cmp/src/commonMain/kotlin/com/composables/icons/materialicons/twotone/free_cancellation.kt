package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Free_cancellation: ImageVector
    get() {
        if (_Free_cancellation != null) return _Free_cancellation!!
        
        _Free_cancellation = ImageVector.Builder(
            name = "free_cancellation",
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 6f)
                horizontalLineTo(19f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.21f, 20f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(4.38f)
                lineToRelative(2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-1f)
                verticalLineTo(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineTo(8f)
                verticalLineTo(2f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                curveTo(3.89f, 4f, 3.01f, 4.9f, 3.01f, 6f)
                lineTo(3f, 20f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(8.21f)
                lineTo(11.21f, 20f)
                close()
                moveTo(5f, 6f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                close()
                moveTo(16.54f, 22.5f)
                lineTo(13f, 18.96f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.24f, -4.24f)
                lineToRelative(1.41f, 1.41f)
                lineTo(16.54f, 22.5f)
                close()
                moveTo(10.41f, 14f)
                lineTo(12f, 15.59f)
                lineTo(10.59f, 17f)
                lineTo(9f, 15.41f)
                lineTo(7.41f, 17f)
                lineTo(6f, 15.59f)
                lineTo(7.59f, 14f)
                lineTo(6f, 12.41f)
                lineTo(7.41f, 11f)
                lineTo(9f, 12.59f)
                lineTo(10.59f, 11f)
                lineTo(12f, 12.41f)
                lineTo(10.41f, 14f)
                close()
            }
        }.build()
        
        return _Free_cancellation!!
    }

private var _Free_cancellation: ImageVector? = null

