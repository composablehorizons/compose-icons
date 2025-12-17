package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.TypeH4: ImageVector
    get() {
        if (_TypeH4 != null) return _TypeH4!!
        
        _TypeH4 = ImageVector.Builder(
            name = "type-h4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.007f, 3f)
                horizontalLineTo(15f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-1.29f)
                verticalLineToRelative(-2.051f)
                horizontalLineTo(8.854f)
                verticalLineToRelative(-1.18f)
                curveTo(10.1f, 7.513f, 11.586f, 5.256f, 13.007f, 3f)
                moveToRelative(-2.82f, 6.777f)
                horizontalLineToRelative(3.524f)
                verticalLineToRelative(-5.62f)
                horizontalLineToRelative(-0.074f)
                arcToRelative(95f, 95f, 0f, false, false, -3.45f, 5.554f)
                close()
                moveTo(7.495f, 13f)
                verticalLineTo(3.201f)
                horizontalLineTo(6.174f)
                verticalLineToRelative(4.15f)
                horizontalLineTo(1.32f)
                verticalLineTo(3.2f)
                horizontalLineTo(0f)
                verticalLineTo(13f)
                horizontalLineToRelative(1.32f)
                verticalLineTo(8.513f)
                horizontalLineToRelative(4.854f)
                verticalLineTo(13f)
                close()
            }
        }.build()
        
        return _TypeH4!!
    }

private var _TypeH4: ImageVector? = null

