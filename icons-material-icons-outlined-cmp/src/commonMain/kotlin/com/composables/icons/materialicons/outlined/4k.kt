package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.`4k`: ImageVector
    get() {
        if (_4k != null) return _4k!!
        
        _4k = ImageVector.Builder(
            name = "4k",
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
                curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.89f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 16f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(-9.5f, -4f)
                horizontalLineTo(11f)
                verticalLineToRelative(-1.49f)
                horizontalLineToRelative(1f)
                verticalLineTo(12f)
                horizontalLineToRelative(-1f)
                verticalLineTo(9f)
                horizontalLineTo(9.5f)
                verticalLineToRelative(3f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(6.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(3f)
                close()
                moveToRelative(8.7f, 0f)
                lineToRelative(-2f, -3f)
                lineToRelative(2f, -3f)
                horizontalLineToRelative(-1.7f)
                lineToRelative(-2f, 3f)
                lineToRelative(2f, 3f)
                close()
                moveToRelative(-3.7f, -3f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.5f)
                close()
            }
        }.build()
        
        return _4k!!
    }

private var _4k: ImageVector? = null

