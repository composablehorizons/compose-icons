package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Restore_from_trash: ImageVector
    get() {
        if (_Restore_from_trash != null) return _Restore_from_trash!!
        
        _Restore_from_trash = ImageVector.Builder(
            name = "restore_from_trash",
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
                moveTo(6f, 21f)
                horizontalLineToRelative(12f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(6f, -11f)
                lineToRelative(4f, 4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineTo(8f)
                lineToRelative(4f, -4f)
                close()
                moveToRelative(3.5f, -6f)
                lineToRelative(-1f, -1f)
                horizontalLineToRelative(-5f)
                lineToRelative(-1f, 1f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(14f)
                verticalLineTo(4f)
                close()
            }
        }.build()
        
        return _Restore_from_trash!!
    }

private var _Restore_from_trash: ImageVector? = null

