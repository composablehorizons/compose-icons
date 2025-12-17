package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Thunderbolt: ImageVector
    get() {
        if (_Thunderbolt != null) return _Thunderbolt!!
        
        _Thunderbolt = ImageVector.Builder(
            name = "thunderbolt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(7.293f)
                arcTo(1f, 1f, 0f, false, false, 0.293f, 12f)
                lineTo(2f, 13.707f)
                arcToRelative(1f, 1f, 0f, false, false, 0.707f, 0.293f)
                horizontalLineToRelative(10.586f)
                arcToRelative(1f, 1f, 0f, false, false, 0.707f, -0.293f)
                lineTo(15.707f, 12f)
                arcToRelative(1f, 1f, 0f, false, false, 0.293f, -0.707f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
                moveToRelative(2.5f, 3f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
            }
        }.build()
        
        return _Thunderbolt!!
    }

private var _Thunderbolt: ImageVector? = null

