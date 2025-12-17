package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Cassette: ImageVector
    get() {
        if (_Cassette != null) return _Cassette!!
        
        _Cassette = ImageVector.Builder(
            name = "cassette",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 8f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                moveToRelative(9f, -1f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                moveTo(7f, 6f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 0f, 3.5f)
                verticalLineToRelative(9f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1.5f, 14f)
                horizontalLineToRelative(13f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-9f)
                arcTo(1.5f, 1.5f, 0f, false, false, 14.5f, 2f)
                close()
                moveTo(1f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(13f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-0.691f)
                lineToRelative(-1.362f, -2.724f)
                arcTo(0.5f, 0.5f, 0f, false, false, 12f, 10f)
                horizontalLineTo(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.447f, 0.276f)
                lineTo(2.19f, 13f)
                horizontalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                close()
                moveTo(11.691f, 11f)
                lineToRelative(1f, 2f)
                horizontalLineTo(3.309f)
                lineToRelative(1f, -2f)
                close()
            }
        }.build()
        
        return _Cassette!!
    }

private var _Cassette: ImageVector? = null

