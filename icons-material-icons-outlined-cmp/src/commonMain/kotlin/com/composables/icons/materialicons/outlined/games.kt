package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Games: ImageVector
    get() {
        if (_Games != null) return _Games!!
        
        _Games = ImageVector.Builder(
            name = "games",
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
                moveTo(13f, 4f)
                verticalLineToRelative(2.67f)
                lineToRelative(-1f, 1f)
                lineToRelative(-1f, -1f)
                verticalLineTo(4f)
                horizontalLineToRelative(2f)
                moveToRelative(7f, 7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.67f)
                lineToRelative(-1f, -1f)
                lineToRelative(1f, -1f)
                horizontalLineTo(20f)
                moveTo(6.67f, 11f)
                lineToRelative(1f, 1f)
                lineToRelative(-1f, 1f)
                horizontalLineTo(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.67f)
                moveTo(12f, 16.33f)
                lineToRelative(1f, 1f)
                verticalLineTo(20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.67f)
                lineToRelative(1f, -1f)
                moveTo(15f, 2f)
                horizontalLineTo(9f)
                verticalLineToRelative(5.5f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
                verticalLineTo(2f)
                close()
                moveToRelative(7f, 7f)
                horizontalLineToRelative(-5.5f)
                lineToRelative(-3f, 3f)
                lineToRelative(3f, 3f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                close()
                moveTo(7.5f, 9f)
                horizontalLineTo(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(5.5f)
                lineToRelative(3f, -3f)
                lineToRelative(-3f, -3f)
                close()
                moveToRelative(4.5f, 4.5f)
                lineToRelative(-3f, 3f)
                verticalLineTo(22f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-5.5f)
                lineToRelative(-3f, -3f)
                close()
            }
        }.build()
        
        return _Games!!
    }

private var _Games: ImageVector? = null

