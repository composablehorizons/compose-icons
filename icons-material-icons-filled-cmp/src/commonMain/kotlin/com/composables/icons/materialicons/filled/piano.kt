package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Piano: ImageVector
    get() {
        if (_Piano != null) return _Piano!!
        
        _Piano = ImageVector.Builder(
            name = "piano",
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
                moveTo(14f, 14.5f)
                horizontalLineToRelative(0.25f)
                verticalLineTo(19f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineTo(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8.5f)
                curveTo(13f, 14.05f, 13.45f, 14.5f, 14f, 14.5f)
                close()
                moveTo(5f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.25f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                close()
                moveTo(19f, 19f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(-4.5f)
                horizontalLineTo(16f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(5f)
                horizontalLineToRelative(2f)
                verticalLineTo(19f)
                close()
            }
        }.build()
        
        return _Piano!!
    }

private var _Piano: ImageVector? = null

