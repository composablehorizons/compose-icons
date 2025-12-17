package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.System_update_alt: ImageVector
    get() {
        if (_System_update_alt != null) return _System_update_alt!!
        
        _System_update_alt = ImageVector.Builder(
            name = "system_update_alt",
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
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 16f)
                lineToRelative(4f, -4f)
                horizontalLineToRelative(-3f)
                verticalLineTo(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(9f)
                horizontalLineTo(8f)
                lineToRelative(4f, 4f)
                close()
                moveToRelative(9f, -13f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1.99f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(14.03f)
                horizontalLineTo(3f)
                verticalLineTo(4.99f)
                horizontalLineToRelative(6f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(18f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-9f, 13f)
                lineToRelative(4f, -4f)
                horizontalLineToRelative(-3f)
                verticalLineTo(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(9f)
                horizontalLineTo(8f)
                lineToRelative(4f, 4f)
                close()
                moveToRelative(9f, -13f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1.99f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(14.03f)
                horizontalLineTo(3f)
                verticalLineTo(4.99f)
                horizontalLineToRelative(6f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(18f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
            }
        }.build()
        
        return _System_update_alt!!
    }

private var _System_update_alt: ImageVector? = null

