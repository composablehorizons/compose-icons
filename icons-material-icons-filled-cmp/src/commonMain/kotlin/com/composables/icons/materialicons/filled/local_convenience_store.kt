package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Local_convenience_store: ImageVector
    get() {
        if (_Local_convenience_store != null) return _Local_convenience_store!!
        
        _Local_convenience_store = ImageVector.Builder(
            name = "local_convenience_store",
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
                moveTo(19f, 7f)
                verticalLineTo(4f)
                horizontalLineTo(5f)
                verticalLineToRelative(3f)
                horizontalLineTo(2f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(8f)
                verticalLineTo(7f)
                horizontalLineToRelative(-3f)
                close()
                moveToRelative(-8f, 3f)
                horizontalLineTo(9f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineToRelative(2f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
                moveToRelative(5f, 2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineTo(7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineTo(7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(5f)
                close()
            }
        }.build()
        
        return _Local_convenience_store!!
    }

private var _Local_convenience_store: ImageVector? = null

