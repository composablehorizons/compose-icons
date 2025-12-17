package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Tag: ImageVector
    get() {
        if (_Tag != null) return _Tag!!
        
        _Tag = ImageVector.Builder(
            name = "tag",
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
                    moveTo(20f, 10f)
                    verticalLineTo(8f)
                    horizontalLineToRelative(-4f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(-4f)
                    verticalLineTo(4f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(-4f)
                    horizontalLineTo(20f)
                    close()
                    moveTo(14f, 14f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(4f)
                    verticalLineTo(14f)
                    close()
                }
            }
        }.build()
        
        return _Tag!!
    }

private var _Tag: ImageVector? = null

