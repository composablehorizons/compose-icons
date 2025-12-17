package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Book_online: ImageVector
    get() {
        if (_Book_online != null) return _Book_online!!
        
        _Book_online = ImageVector.Builder(
            name = "book_online",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(19f, 1f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(22f)
                    horizontalLineToRelative(14f)
                    verticalLineTo(1f)
                    close()
                    moveTo(7f, 18f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(10f)
                    verticalLineToRelative(12f)
                    horizontalLineTo(7f)
                    close()
                    moveTo(16f, 11f)
                    lineToRelative(0f, -3f)
                    horizontalLineTo(8f)
                    lineToRelative(0f, 3.1f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    lineTo(8f, 16f)
                    horizontalLineToRelative(8f)
                    verticalLineToRelative(-3f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    curveTo(15f, 11.45f, 15.45f, 11f, 16f, 11f)
                    close()
                    moveTo(12.5f, 14.5f)
                    horizontalLineToRelative(-1f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(14.5f)
                    close()
                    moveTo(12.5f, 12.5f)
                    horizontalLineToRelative(-1f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(12.5f)
                    close()
                    moveTo(12.5f, 10.5f)
                    horizontalLineToRelative(-1f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(10.5f)
                    close()
                }
            }
        }.build()
        
        return _Book_online!!
    }

private var _Book_online: ImageVector? = null

