package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Pass: ImageVector
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
                moveTo(10f, 0f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
                horizontalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2f, 1.5f)
                verticalLineToRelative(13f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.5f, 16f)
                horizontalLineToRelative(9f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-13f)
                arcTo(1.5f, 1.5f, 0f, false, false, 12.5f, 0f)
                close()
                moveTo(4.5f, 5f)
                horizontalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                moveToRelative(0f, 2f)
                horizontalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
            }
        }.build()
        
        return _Pass!!
    }

private var _Pass: ImageVector? = null

