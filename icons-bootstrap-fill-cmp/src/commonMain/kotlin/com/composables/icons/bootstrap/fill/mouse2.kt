package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Mouse2: ImageVector
    get() {
        if (_Mouse2 != null) return _Mouse2!!
        
        _Mouse2 = ImageVector.Builder(
            name = "mouse2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 0.026f)
                curveTo(4.958f, 0.286f, 3f, 2.515f, 3f, 5.188f)
                verticalLineTo(5.5f)
                horizontalLineToRelative(4.5f)
                close()
                moveToRelative(1f, 0f)
                verticalLineTo(5.5f)
                horizontalLineTo(13f)
                verticalLineToRelative(-0.312f)
                curveTo(13f, 2.515f, 11.042f, 0.286f, 8.5f, 0.026f)
                moveTo(13f, 6.5f)
                horizontalLineTo(3f)
                verticalLineToRelative(4.313f)
                curveTo(3f, 13.658f, 5.22f, 16f, 8f, 16f)
                reflectiveCurveToRelative(5f, -2.342f, 5f, -5.188f)
                close()
            }
        }.build()
        
        return _Mouse2!!
    }

private var _Mouse2: ImageVector? = null

