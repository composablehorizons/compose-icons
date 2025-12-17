package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Mp: ImageVector
    get() {
        if (_Mp != null) return _Mp!!
        
        _Mp = ImageVector.Builder(
            name = "mp",
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
                moveTo(6.5f, 9f)
                horizontalLineTo(11f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineTo(8f)
                verticalLineToRelative(-3f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(5.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveToRelative(9f, 6f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineTo(15f)
                close()
                moveToRelative(0f, -3f)
                horizontalLineTo(17f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(12f)
                close()
            }
        }.build()
        
        return _Mp!!
    }

private var _Mp: ImageVector? = null

