package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Games: ImageVector
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
                moveTo(11f, 17.33f)
                verticalLineTo(20f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.67f)
                lineToRelative(-1f, -1f)
                close()
                moveToRelative(2f, -10.66f)
                verticalLineTo(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.67f)
                lineToRelative(1f, 1f)
                close()
                moveTo(16.33f, 12f)
                lineToRelative(1f, 1f)
                horizontalLineTo(20f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.67f)
                close()
                moveTo(4f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.67f)
                lineToRelative(1f, -1f)
                lineToRelative(-1f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(5.5f)
                lineToRelative(3f, -3f)
                lineToRelative(-3f, -3f)
                horizontalLineTo(2f)
                close()
                moveToRelative(4.67f, 4f)
                horizontalLineTo(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.67f)
                lineToRelative(1f, 1f)
                lineToRelative(-1f, 1f)
                close()
                moveTo(22f, 9f)
                horizontalLineToRelative(-5.5f)
                lineToRelative(-3f, 3f)
                lineToRelative(3f, 3f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                close()
                moveToRelative(-2f, 4f)
                horizontalLineToRelative(-2.67f)
                lineToRelative(-1f, -1f)
                lineToRelative(1f, -1f)
                horizontalLineTo(20f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(-5f, 3.5f)
                lineToRelative(-3f, -3f)
                lineToRelative(-3f, 3f)
                verticalLineTo(22f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(13f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.67f)
                lineToRelative(1f, -1f)
                lineToRelative(1f, 1f)
                verticalLineTo(20f)
                close()
                moveTo(9f, 7.5f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                verticalLineToRelative(5.5f)
                close()
                moveTo(11f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.67f)
                lineToRelative(-1f, 1f)
                lineToRelative(-1f, -1f)
                verticalLineTo(4f)
                close()
            }
        }.build()
        
        return _Games!!
    }

private var _Games: ImageVector? = null

