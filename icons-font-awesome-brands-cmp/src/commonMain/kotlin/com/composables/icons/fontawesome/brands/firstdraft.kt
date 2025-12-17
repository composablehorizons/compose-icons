package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Firstdraft: ImageVector
    get() {
        if (_Firstdraft != null) return _Firstdraft!!
        
        _Firstdraft = ImageVector.Builder(
            name = "firstdraft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(384f, 192f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(128f)
                horizontalLineTo(192f)
                verticalLineToRelative(128f)
                horizontalLineTo(0f)
                verticalLineToRelative(-25.6f)
                horizontalLineToRelative(166.4f)
                verticalLineToRelative(-128f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(-128f)
                horizontalLineTo(384f)
                verticalLineTo(192f)
                close()
                moveToRelative(-25.6f, 38.4f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(-128f)
                verticalLineToRelative(128f)
                horizontalLineTo(64f)
                verticalLineTo(512f)
                horizontalLineToRelative(192f)
                verticalLineTo(384f)
                horizontalLineToRelative(128f)
                verticalLineTo(230.4f)
                horizontalLineToRelative(-25.6f)
                close()
                moveToRelative(25.6f, 192f)
                horizontalLineToRelative(-89.6f)
                verticalLineTo(512f)
                horizontalLineTo(320f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(-25.6f)
                close()
                moveTo(0f, 0f)
                verticalLineToRelative(384f)
                horizontalLineToRelative(128f)
                verticalLineTo(256f)
                horizontalLineToRelative(128f)
                verticalLineTo(128f)
                horizontalLineToRelative(128f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }.build()
        
        return _Firstdraft!!
    }

private var _Firstdraft: ImageVector? = null

