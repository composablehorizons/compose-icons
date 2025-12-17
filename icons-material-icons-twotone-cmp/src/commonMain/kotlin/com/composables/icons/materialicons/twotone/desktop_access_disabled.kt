package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Desktop_access_disabled: ImageVector
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
                moveTo(1.41f, 1.69f)
                lineTo(0f, 3.1f)
                lineToRelative(1f, 0.99f)
                verticalLineTo(16f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 1.99f, 2f)
                horizontalLineTo(10f)
                verticalLineToRelative(2f)
                horizontalLineTo(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(0.9f)
                lineToRelative(6f, 6f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-20.9f, -20.9f)
                close()
                moveTo(2.99f, 16f)
                verticalLineTo(6.09f)
                lineTo(12.9f, 16f)
                horizontalLineTo(2.99f)
                close()
                moveTo(4.55f, 2f)
                lineToRelative(2f, 2f)
                horizontalLineTo(21f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-2.45f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(0.44f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(4.55f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.99f, 6.09f)
                verticalLineTo(16f)
                horizontalLineToRelative(9.91f)
                close()
                moveTo(6.55f, 4f)
                lineToRelative(12f, 12f)
                horizontalLineTo(21f)
                verticalLineTo(4f)
                close()
            }
        }.build()
        
        return _Desktop_access_disabled!!
    }

private var _Desktop_access_disabled: ImageVector? = null

