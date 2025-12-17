package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Cast: ImageVector
    get() {
        if (_Cast != null) return _Cast!!
        
        _Cast = ImageVector.Builder(
            name = "cast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.646f, 9.354f)
                lineToRelative(-3.792f, 3.792f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.353f, 0.854f)
                horizontalLineToRelative(7.586f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.354f, -0.854f)
                lineTo(8.354f, 9.354f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.414f, 11f)
                horizontalLineTo(14.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-13f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(3.086f)
                lineToRelative(-1f, 1f)
                horizontalLineTo(1.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 0f, 10.5f)
                verticalLineToRelative(-7f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1.5f, 2f)
                horizontalLineToRelative(13f)
                arcTo(1.5f, 1.5f, 0f, false, true, 16f, 3.5f)
                verticalLineToRelative(7f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-2.086f)
                close()
            }
        }.build()
        
        return _Cast!!
    }

private var _Cast: ImageVector? = null

