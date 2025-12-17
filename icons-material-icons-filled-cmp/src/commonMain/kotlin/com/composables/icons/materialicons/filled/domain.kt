package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Domain: ImageVector
    get() {
        if (_Domain != null) return _Domain!!
        
        _Domain = ImageVector.Builder(
            name = "domain",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 7f)
                    verticalLineTo(3f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(18f)
                    horizontalLineToRelative(20f)
                    verticalLineTo(7f)
                    horizontalLineTo(12f)
                    close()
                    moveTo(6f, 19f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(19f)
                    close()
                    moveTo(6f, 15f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(15f)
                    close()
                    moveTo(6f, 11f)
                    horizontalLineTo(4f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(11f)
                    close()
                    moveTo(6f, 7f)
                    horizontalLineTo(4f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7f)
                    close()
                    moveTo(10f, 19f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(19f)
                    close()
                    moveTo(10f, 15f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(15f)
                    close()
                    moveTo(10f, 11f)
                    horizontalLineTo(8f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(11f)
                    close()
                    moveTo(10f, 7f)
                    horizontalLineTo(8f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7f)
                    close()
                    moveTo(20f, 19f)
                    horizontalLineToRelative(-8f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(8f)
                    verticalLineTo(19f)
                    close()
                    moveTo(18f, 11f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(11f)
                    close()
                    moveTo(18f, 15f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(15f)
                    close()
                }
            }
        }.build()
        
        return _Domain!!
    }

private var _Domain: ImageVector? = null

