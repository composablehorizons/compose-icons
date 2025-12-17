package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Pass: ImageVector
    get() {
        if (_Pass != null) return _Pass!!
        
        _Pass = ImageVector.Builder(
            name = "pass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveToRelative(0f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                horizontalLineToRelative(2.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14f, 1.5f)
                verticalLineToRelative(13f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-9f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2f, 14.5f)
                verticalLineToRelative(-13f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3.5f, 0f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                moveToRelative(0f, 1f)
                arcToRelative(3f, 3f, 0f, false, true, -2.83f, -2f)
                horizontalLineTo(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(13f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-13f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-1.67f)
                arcTo(3f, 3f, 0f, false, true, 8f, 3f)
            }
        }.build()
        
        return _Pass!!
    }

private var _Pass: ImageVector? = null

