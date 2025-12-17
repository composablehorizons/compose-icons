package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Tablet_android: ImageVector
    get() {
        if (_Tablet_android != null) return _Tablet_android!!
        
        _Tablet_android = ImageVector.Builder(
            name = "tablet_android",
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
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 0f)
                horizontalLineTo(3f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(18f)
                verticalLineTo(0f)
                close()
                moveToRelative(-7f, 22f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(5.25f, -3f)
                horizontalLineTo(4.75f)
                verticalLineTo(3f)
                horizontalLineToRelative(14.5f)
                verticalLineToRelative(16f)
                close()
            }
        }.build()
        
        return _Tablet_android!!
    }

private var _Tablet_android: ImageVector? = null

