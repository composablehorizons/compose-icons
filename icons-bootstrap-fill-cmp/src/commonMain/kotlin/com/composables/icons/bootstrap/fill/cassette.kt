package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Cassette: ImageVector
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
                moveTo(1.5f, 2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 0f, 3.5f)
                verticalLineToRelative(9f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1.5f, 14f)
                horizontalLineToRelative(0.191f)
                lineToRelative(1.862f, -3.724f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4f, 10f)
                horizontalLineToRelative(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.447f, 0.276f)
                lineTo(14.31f, 14f)
                horizontalLineToRelative(0.191f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-9f)
                arcTo(1.5f, 1.5f, 0f, false, false, 14.5f, 2f)
                close()
                moveTo(4f, 7f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                moveToRelative(8f, 0f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                moveTo(6f, 6f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.191f, 14f)
                lineToRelative(-1.5f, -3f)
                horizontalLineTo(4.309f)
                lineToRelative(-1.5f, 3f)
                close()
            }
        }.build()
        
        return _Cassette!!
    }

private var _Cassette: ImageVector? = null

