package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Backpack: ImageVector
    get() {
        if (_Backpack != null) return _Backpack!!
        
        _Backpack = ImageVector.Builder(
            name = "backpack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
                    moveTo(18f, 20f)
                    horizontalLineTo(6f)
                    verticalLineTo(8f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineToRelative(8f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    verticalLineTo(20f)
                    close()
                    moveTo(7.5f, 12f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-4f)
                    horizontalLineTo(7.5f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(17f, 4.14f)
                    verticalLineTo(2f)
                    horizontalLineToRelative(-3f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-4f)
                    verticalLineTo(2f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(2.14f)
                    curveTo(5.28f, 4.59f, 4f, 6.14f, 4f, 8f)
                    verticalLineToRelative(12f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(12f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(8f)
                    curveTo(20f, 6.14f, 18.72f, 4.59f, 17f, 4.14f)
                    close()
                    moveTo(18f, 20f)
                    horizontalLineTo(6f)
                    verticalLineTo(8f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineToRelative(8f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    verticalLineTo(20f)
                    close()
                    moveTo(7.5f, 12f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-4f)
                    horizontalLineTo(7.5f)
                    close()
                }
            }
        }.build()
        
        return _Backpack!!
    }

private var _Backpack: ImageVector? = null

