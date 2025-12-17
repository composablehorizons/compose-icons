package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Npm: ImageVector
    get() {
        if (_Npm != null) return _Npm!!
        
        _Npm = ImageVector.Builder(
            name = "npm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(288f, 288f)
                horizontalLineToRelative(-32f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(64f)
                close()
                moveToRelative(288f, -128f)
                verticalLineToRelative(192f)
                horizontalLineTo(288f)
                verticalLineToRelative(32f)
                horizontalLineTo(160f)
                verticalLineToRelative(-32f)
                horizontalLineTo(0f)
                verticalLineTo(160f)
                horizontalLineToRelative(576f)
                close()
                moveToRelative(-416f, 32f)
                horizontalLineTo(32f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(-96f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(32f)
                verticalLineTo(192f)
                close()
                moveToRelative(160f, 0f)
                horizontalLineTo(192f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(-32f)
                horizontalLineToRelative(64f)
                verticalLineTo(192f)
                close()
                moveToRelative(224f, 0f)
                horizontalLineTo(352f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(-96f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(-96f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(32f)
                verticalLineTo(192f)
                close()
            }
        }.build()
        
        return _Npm!!
    }

private var _Npm: ImageVector? = null

