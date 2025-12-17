package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.`14mp`: ImageVector
    get() {
        if (_14mp != null) return _14mp!!
        
        _14mp = ImageVector.Builder(
            name = "14mp",
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
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-7f, 15.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(14f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineTo(8f)
                verticalLineToRelative(-3f)
                horizontalLineTo(7f)
                verticalLineToRelative(4.5f)
                horizontalLineTo(5.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineTo(11f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5f)
                close()
                moveToRelative(3.5f, 0f)
                horizontalLineTo(14f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineTo(16f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(10f, 5.5f)
                verticalLineToRelative(6f)
                horizontalLineTo(8.5f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(5.5f)
                horizontalLineToRelative(3f)
                close()
                moveToRelative(7.5f, 4.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineToRelative(-3f)
                verticalLineTo(5.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3f)
                horizontalLineTo(15f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineTo(10f)
                close()
                moveToRelative(-2f, 4f)
                horizontalLineTo(17f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.5f)
                close()
            }
        }.build()
        
        return _14mp!!
    }

private var _14mp: ImageVector? = null

