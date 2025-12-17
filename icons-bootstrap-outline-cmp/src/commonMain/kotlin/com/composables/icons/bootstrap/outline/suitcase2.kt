package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Suitcase2: ImageVector
    get() {
        if (_Suitcase2 != null) return _Suitcase2!!
        
        _Suitcase2 = ImageVector.Builder(
            name = "suitcase2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 1.031f, 1.75f)
                arcTo(1.003f, 1.003f, 0f, false, false, 5f, 16f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, true, false, 1.969f, -0.25f)
                arcTo(2f, 2f, 0f, false, false, 13f, 13f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-1f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(9f, 3f)
                horizontalLineTo(7f)
                verticalLineTo(1f)
                horizontalLineToRelative(2f)
                close()
                moveToRelative(3f, 10f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(7f)
                horizontalLineToRelative(8f)
                close()
                moveTo(5f, 4f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
            }
        }.build()
        
        return _Suitcase2!!
    }

private var _Suitcase2: ImageVector? = null

