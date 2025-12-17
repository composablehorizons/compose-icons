package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Desktop_access_disabled: ImageVector
    get() {
        if (_Desktop_access_disabled != null) return _Desktop_access_disabled!!
        
        _Desktop_access_disabled = ImageVector.Builder(
            name = "desktop_access_disabled",
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
                moveTo(23f, 16f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-1f)
                lineToRelative(-2f, -2f)
                horizontalLineToRelative(3f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                lineTo(4f, 2f)
                horizontalLineToRelative(17f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(12f)
                close()
                moveToRelative(-5.5f, 2f)
                lineToRelative(-2f, -2f)
                close()
                moveToRelative(-2.6f, 0f)
                lineToRelative(6f, 6f)
                lineToRelative(1.3f, -1.3f)
                lineToRelative(-4.7f, -4.7f)
                lineToRelative(-2f, -2f)
                lineTo(1.2f, 1.8f)
                lineTo(0f, 3.1f)
                lineToRelative(1f, 1f)
                verticalLineTo(16f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineTo(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(0.9f)
                close()
                moveTo(3f, 16f)
                verticalLineTo(6.1f)
                lineToRelative(9.9f, 9.9f)
                horizontalLineTo(3f)
                close()
            }
        }.build()
        
        return _Desktop_access_disabled!!
    }

private var _Desktop_access_disabled: ImageVector? = null

