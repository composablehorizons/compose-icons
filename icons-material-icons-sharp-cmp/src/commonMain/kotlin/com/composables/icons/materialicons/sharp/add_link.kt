package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Add_link: ImageVector
    get() {
        if (_Add_link != null) return _Add_link!!
        
        _Add_link = ImageVector.Builder(
            name = "add_link",
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(8f, 11f)
                    horizontalLineToRelative(8f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(8f)
                    verticalLineTo(11f)
                    close()
                    moveTo(20.1f, 12f)
                    horizontalLineTo(22f)
                    curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(1.9f)
                    horizontalLineToRelative(4f)
                    curveTo(18.71f, 8.9f, 20.1f, 10.29f, 20.1f, 12f)
                    close()
                    moveTo(3.9f, 12f)
                    curveToRelative(0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f)
                    horizontalLineToRelative(4f)
                    verticalLineTo(7f)
                    horizontalLineTo(7f)
                    curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                    reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(-1.9f)
                    horizontalLineTo(7f)
                    curveTo(5.29f, 15.1f, 3.9f, 13.71f, 3.9f, 12f)
                    close()
                    moveTo(19f, 12f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(-3f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-3f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(12f)
                    close()
                }
            }
        }.build()
        
        return _Add_link!!
    }

private var _Add_link: ImageVector? = null

