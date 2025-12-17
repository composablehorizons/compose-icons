package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.View_stream: ImageVector
    get() {
        if (_View_stream != null) return _View_stream!!
        
        _View_stream = ImageVector.Builder(
            name = "view_stream",
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
                moveTo(3f, 7f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(7f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(5f)
                curveTo(3.9f, 5f, 3f, 5.9f, 3f, 7f)
                close()
                moveTo(19f, 17f)
                horizontalLineTo(5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(14f)
                verticalLineTo(17f)
                close()
                moveTo(5f, 11f)
                verticalLineTo(7f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(4f)
                horizontalLineTo(5f)
                close()
            }
        }.build()
        
        return _View_stream!!
    }

private var _View_stream: ImageVector? = null

