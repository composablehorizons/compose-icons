package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Text_rotate_up: ImageVector
    get() {
        if (_Text_rotate_up != null) return _Text_rotate_up!!
        
        _Text_rotate_up = ImageVector.Builder(
            name = "text_rotate_up",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 12f)
                verticalLineToRelative(1.5f)
                lineToRelative(11f, 4.75f)
                verticalLineToRelative(-2.1f)
                lineToRelative(-2.2f, -0.9f)
                verticalLineToRelative(-5f)
                lineToRelative(2.2f, -0.9f)
                verticalLineToRelative(-2.1f)
                lineTo(3f, 12f)
                close()
                moveToRelative(7f, 2.62f)
                lineToRelative(-5.02f, -1.87f)
                lineTo(10f, 10.88f)
                verticalLineToRelative(3.74f)
                close()
                moveToRelative(8f, -10.37f)
                lineToRelative(-3f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(2f)
                verticalLineTo(7.25f)
                horizontalLineToRelative(2f)
                lineToRelative(-3f, -3f)
                close()
            }
        }.build()
        
        return _Text_rotate_up!!
    }

private var _Text_rotate_up: ImageVector? = null

