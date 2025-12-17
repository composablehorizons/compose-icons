package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Email: ImageVector
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
                moveTo(22f, 6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(6f)
                close()
                moveToRelative(-2f, 0f)
                lineToRelative(-8f, 5f)
                lineToRelative(-8f, -5f)
                horizontalLineToRelative(16f)
                close()
                moveToRelative(0f, 12f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                lineToRelative(8f, 5f)
                lineToRelative(8f, -5f)
                verticalLineToRelative(10f)
                close()
            }
        }.build()
        
        return _Email!!
    }

private var _Email: ImageVector? = null

