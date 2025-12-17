package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Repeat1: ImageVector
    get() {
        if (_Repeat1 != null) return _Repeat1!!
        
        _Repeat1 = ImageVector.Builder(
            name = "repeat-1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 4f)
                verticalLineToRelative(1.466f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.41f, 0.192f)
                lineToRelative(2.36f, -1.966f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0f, -0.384f)
                lineToRelative(-2.36f, -1.966f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.41f, 0.192f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                arcToRelative(5f, 5f, 0f, false, false, -4.48f, 7.223f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.896f, -0.446f)
                arcTo(4f, 4f, 0f, false, true, 5f, 4f)
                close()
                moveToRelative(4.48f, 1.777f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.896f, 0.446f)
                arcTo(4f, 4f, 0f, false, true, 11f, 12f)
                horizontalLineTo(5.001f)
                verticalLineToRelative(-1.466f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.41f, -0.192f)
                lineToRelative(-2.36f, 1.966f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0f, 0.384f)
                lineToRelative(2.36f, 1.966f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.41f, -0.192f)
                verticalLineTo(13f)
                horizontalLineToRelative(6f)
                arcToRelative(5f, 5f, 0f, false, false, 4.48f, -7.223f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.854f, -0.354f)
                lineToRelative(-1.75f, 1.75f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.708f, 0.708f)
                lineTo(8f, 6.707f)
                verticalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                close()
            }
        }.build()
        
        return _Repeat1!!
    }

private var _Repeat1: ImageVector? = null

