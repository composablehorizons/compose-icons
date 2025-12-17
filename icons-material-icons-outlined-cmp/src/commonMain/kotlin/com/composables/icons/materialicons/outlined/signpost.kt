package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Signpost: ImageVector
    get() {
        if (_Signpost != null) return _Signpost!!
        
        _Signpost = ImageVector.Builder(
            name = "signpost",
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
                    moveTo(13f, 10f)
                    horizontalLineToRelative(5f)
                    lineToRelative(3f, -3f)
                    lineToRelative(-3f, -3f)
                    horizontalLineToRelative(-5f)
                    verticalLineTo(2f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(6f)
                    lineToRelative(-3f, 3f)
                    lineToRelative(3f, 3f)
                    horizontalLineToRelative(5f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(-6f)
                    horizontalLineToRelative(-7f)
                    verticalLineTo(10f)
                    close()
                    moveTo(6f, 6f)
                    horizontalLineToRelative(11.17f)
                    lineToRelative(1f, 1f)
                    lineToRelative(-1f, 1f)
                    horizontalLineTo(6f)
                    verticalLineTo(6f)
                    close()
                    moveTo(18f, 16f)
                    horizontalLineTo(6.83f)
                    lineToRelative(-1f, -1f)
                    lineToRelative(1f, -1f)
                    horizontalLineTo(18f)
                    verticalLineTo(16f)
                    close()
                }
            }
        }.build()
        
        return _Signpost!!
    }

private var _Signpost: ImageVector? = null

