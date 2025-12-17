package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Email: ImageVector
    get() {
        if (_Email != null) return _Email!!
        
        _Email = ImageVector.Builder(
            name = "email",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 8f)
                lineToRelative(-8f, 5f)
                lineToRelative(-8f, -5f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(16f)
                close()
                moveToRelative(0f, -2f)
                horizontalLineTo(4f)
                lineToRelative(8f, 4.99f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 20f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                close()
                moveTo(20f, 6f)
                lineToRelative(-8f, 4.99f)
                lineTo(4f, 6f)
                horizontalLineToRelative(16f)
                close()
                moveTo(4f, 8f)
                lineToRelative(8f, 5f)
                lineToRelative(8f, -5f)
                verticalLineToRelative(10f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                close()
            }
        }.build()
        
        return _Email!!
    }

private var _Email: ImageVector? = null

