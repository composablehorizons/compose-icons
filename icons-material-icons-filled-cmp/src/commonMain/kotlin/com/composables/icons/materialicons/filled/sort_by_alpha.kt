package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Sort_by_alpha: ImageVector
    get() {
        if (_Sort_by_alpha != null) return _Sort_by_alpha!!
        
        _Sort_by_alpha = ImageVector.Builder(
            name = "sort_by_alpha",
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
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
                moveToRelative(0.75f, 0.75f)
                horizontalLineToRelative(22.5f)
                verticalLineToRelative(22.5f)
                horizontalLineTo(0.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.94f, 4.66f)
                horizontalLineToRelative(-4.72f)
                lineToRelative(2.36f, -2.36f)
                close()
                moveToRelative(-4.69f, 14.71f)
                horizontalLineToRelative(4.66f)
                lineToRelative(-2.33f, 2.33f)
                close()
                moveTo(6.1f, 6.27f)
                lineTo(1.6f, 17.73f)
                horizontalLineToRelative(1.84f)
                lineToRelative(0.92f, -2.45f)
                horizontalLineToRelative(5.11f)
                lineToRelative(0.92f, 2.45f)
                horizontalLineToRelative(1.84f)
                lineTo(7.74f, 6.27f)
                horizontalLineTo(6.1f)
                close()
                moveToRelative(-1.13f, 7.37f)
                lineToRelative(1.94f, -5.18f)
                lineToRelative(1.94f, 5.18f)
                horizontalLineTo(4.97f)
                close()
                moveToRelative(10.76f, 2.5f)
                horizontalLineToRelative(6.12f)
                verticalLineToRelative(1.59f)
                horizontalLineToRelative(-8.53f)
                verticalLineToRelative(-1.29f)
                lineToRelative(5.92f, -8.56f)
                horizontalLineToRelative(-5.88f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(8.3f)
                verticalLineToRelative(1.26f)
                lineToRelative(-5.93f, 8.6f)
                close()
            }
        }.build()
        
        return _Sort_by_alpha!!
    }

private var _Sort_by_alpha: ImageVector? = null

