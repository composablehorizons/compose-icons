package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Toggles: ImageVector
    get() {
        if (_Toggles != null) return _Toggles!!
        
        _Toggles = ImageVector.Builder(
            name = "toggles",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 9f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, 0f, 7f)
                horizontalLineToRelative(7f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, 0f, -7f)
                close()
                moveToRelative(7f, 6f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, 0f, -5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 0f, 5f)
                moveToRelative(-7f, -14f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 0f, 5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0f, -5f)
                moveToRelative(2.45f, 0f)
                arcTo(3.5f, 3.5f, 0f, false, true, 8f, 3.5f)
                arcTo(3.5f, 3.5f, 0f, false, true, 6.95f, 6f)
                horizontalLineToRelative(4.55f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0f, -5f)
                close()
                moveTo(4.5f, 0f)
                horizontalLineToRelative(7f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, 0f, 7f)
                horizontalLineToRelative(-7f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, 0f, -7f)
            }
        }.build()
        
        return _Toggles!!
    }

private var _Toggles: ImageVector? = null

