package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.`4k`: ImageVector
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
                moveTo(19f, 5f)
                horizontalLineTo(5f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(14f)
                verticalLineTo(5f)
                close()
                moveToRelative(-7f, 8.51f)
                horizontalLineToRelative(-1f)
                verticalLineTo(15f)
                horizontalLineTo(9.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-3f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1.51f)
                close()
                moveTo(18.2f, 15f)
                horizontalLineToRelative(-1.7f)
                lineToRelative(-2f, -3f)
                verticalLineToRelative(3f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3f)
                lineToRelative(2f, -3f)
                horizontalLineToRelative(1.7f)
                lineToRelative(-2f, 3f)
                lineToRelative(2f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 21f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.89f, -2f, -2f, -2f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                close()
                moveTo(5f, 5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(14f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                close()
                moveToRelative(6f, 4f)
                horizontalLineTo(9.5f)
                verticalLineToRelative(3f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(6.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(3f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineToRelative(-1.49f)
                horizontalLineToRelative(1f)
                verticalLineTo(12f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(5.5f, 0f)
                lineToRelative(-2f, 3f)
                lineToRelative(2f, 3f)
                horizontalLineToRelative(1.7f)
                lineToRelative(-2f, -3f)
                lineToRelative(2f, -3f)
                close()
                moveTo(13f, 9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(9f)
                close()
            }
        }.build()
        
        return _4k!!
    }

private var _4k: ImageVector? = null

