package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.`123`: ImageVector
    get() {
        if (_123 != null) return _123!!
        
        _123 = ImageVector.Builder(
            name = "123",
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
                    moveTo(7f, 15f)
                    horizontalLineTo(5.5f)
                    verticalLineToRelative(-4.5f)
                    horizontalLineTo(4f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(15f)
                    close()
                    moveTo(13.5f, 13.5f)
                    horizontalLineToRelative(-3f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineTo(10f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(1.5f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-2f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineTo(15f)
                    horizontalLineToRelative(4.5f)
                    verticalLineTo(13.5f)
                    close()
                    moveTo(19.5f, 14f)
                    verticalLineToRelative(-4f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(15f)
                    verticalLineToRelative(1.5f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(15f)
                    horizontalLineToRelative(3.5f)
                    curveTo(19.05f, 15f, 19.5f, 14.55f, 19.5f, 14f)
                    close()
                }
            }
        }.build()
        
        return _123!!
    }

private var _123: ImageVector? = null

