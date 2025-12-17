package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Menu_open: ImageVector
    get() {
        if (_Menu_open != null) return _Menu_open!!
        
        _Menu_open = ImageVector.Builder(
            name = "menu_open",
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
                moveTo(3f, 18f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(13f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                close()
                moveToRelative(18f, 9.59f)
                lineTo(17.42f, 12f)
                lineTo(21f, 8.41f)
                lineTo(19.59f, 7f)
                lineToRelative(-5f, 5f)
                lineToRelative(5f, 5f)
                lineTo(21f, 15.59f)
                close()
            }
        }.build()
        
        return _Menu_open!!
    }

private var _Menu_open: ImageVector? = null

