package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Space_dashboard: ImageVector
    get() {
        if (_Space_dashboard != null) return _Space_dashboard!!
        
        _Space_dashboard = ImageVector.Builder(
            name = "space_dashboard",
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
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                close()
                moveTo(5f, 19f)
                verticalLineTo(5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(14f)
                horizontalLineTo(5f)
                close()
                moveTo(19f, 19f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(6f)
                verticalLineTo(19f)
                close()
                moveTo(19f, 10f)
                horizontalLineToRelative(-6f)
                verticalLineTo(5f)
                horizontalLineToRelative(6f)
                verticalLineTo(10f)
                close()
            }
        }.build()
        
        return _Space_dashboard!!
    }

private var _Space_dashboard: ImageVector? = null

