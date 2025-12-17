package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Plus_one: ImageVector
    get() {
        if (_Plus_one != null) return _Plus_one!!
        
        _Plus_one = ImageVector.Builder(
            name = "plus_one",
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
                moveTo(10f, 8f)
                horizontalLineTo(8f)
                verticalLineToRelative(4f)
                horizontalLineTo(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineTo(8f)
                close()
                moveToRelative(4.5f, -1.92f)
                verticalLineTo(7.9f)
                lineToRelative(2.5f, -0.5f)
                verticalLineTo(18f)
                horizontalLineToRelative(2f)
                verticalLineTo(5f)
                lineToRelative(-4.5f, 1.08f)
                close()
            }
        }.build()
        
        return _Plus_one!!
    }

private var _Plus_one: ImageVector? = null

