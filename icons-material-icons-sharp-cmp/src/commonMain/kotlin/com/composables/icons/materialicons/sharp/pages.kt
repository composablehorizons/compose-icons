package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Pages: ImageVector
    get() {
        if (_Pages != null) return _Pages!!
        
        _Pages = ImageVector.Builder(
            name = "pages",
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
                moveTo(3f, 3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(5f)
                lineTo(7f, 7f)
                lineToRelative(4f, 1f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                close()
                moveToRelative(5f, 10f)
                horizontalLineTo(3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-5f)
                lineToRelative(-4f, 1f)
                lineToRelative(1f, -4f)
                close()
                moveToRelative(9f, 4f)
                lineToRelative(-4f, -1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-5f)
                lineToRelative(1f, 4f)
                close()
                moveToRelative(4f, -14f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(5f)
                lineToRelative(4f, -1f)
                lineToRelative(-1f, 4f)
                horizontalLineToRelative(5f)
                verticalLineTo(3f)
                close()
            }
        }.build()
        
        return _Pages!!
    }

private var _Pages: ImageVector? = null

