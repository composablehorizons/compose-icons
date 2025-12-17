package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Phonelink: ImageVector
    get() {
        if (_Phonelink != null) return _Phonelink!!
        
        _Phonelink = ImageVector.Builder(
            name = "phonelink",
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
                moveTo(4f, 6f)
                horizontalLineToRelative(18f)
                verticalLineTo(4f)
                horizontalLineTo(2f)
                verticalLineToRelative(13f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-3f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                close()
                moveToRelative(20f, 2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(8f)
                verticalLineTo(8f)
                close()
                moveToRelative(-2f, 9f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(7f)
                close()
            }
        }.build()
        
        return _Phonelink!!
    }

private var _Phonelink: ImageVector? = null

